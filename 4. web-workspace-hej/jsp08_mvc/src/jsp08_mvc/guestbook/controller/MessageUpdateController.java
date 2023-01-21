package jsp08_mvc.guestbook.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp08_mvc.guestbook.model.MessageDto;
import jsp08_mvc.guestbook.model.MessageListService;
import jsp08_mvc.guestbook.model.MessageSelectService;
import jsp08_mvc.guestbook.model.MessageUpdateService;

public class MessageUpdateController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String messageIdStr= req.getParameter("message_id");
		int messageId = Integer.parseInt(messageIdStr);
		
		// 화면에 수정할 데이터를 보내야 하는데 그 정보를 서비스에서 가져온다.
		MessageSelectService service = new MessageSelectService();
		MessageDto messageDto = service.getMessage(messageId);
		
		// 리퀘스트에 데이터를 담아준다.
		req.setAttribute("message", messageDto);
		
		// 보여줄 화면으로 보낸다.
		req.getRequestDispatcher("/WEB-INF/view/updateForm.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String messageIdStr = req.getParameter("messageId");
		int messageId = Integer.parseInt(messageIdStr);
		String guestName = req.getParameter("guestName");
		String message = req.getParameter("message");
		LocalDateTime writeDate = LocalDateTime.parse(req.getParameter("writeDate"));
		LocalDateTime updateDate = LocalDateTime.now();
		
		MessageDto messageDto = new MessageDto(
				messageId,
				guestName,
				message,
				writeDate,
				updateDate);
		
		// 서비스를 통해서 수정된 데이터를 DB에 수정하도록 함
		
		MessageUpdateService service = new MessageUpdateService();
		boolean result = service.messageUpdate(messageDto);
		
		req.setAttribute("result", result);
		
		req.getRequestDispatcher("/WEB-INF/view/updateResult.jsp").forward(req, resp);
		
		
		
	}
}
