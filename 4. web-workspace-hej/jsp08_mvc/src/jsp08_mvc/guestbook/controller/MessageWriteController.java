package jsp08_mvc.guestbook.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp08_mvc.guestbook.model.MessageDto;
import jsp08_mvc.guestbook.model.MessageWriteService;

public class MessageWriteController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 전달 받은 방명록 데이터 인코딩
		req.setCharacterEncoding("utf-8");
		
		// 클라이언트로부터 넘어온 파라미터를 객체에 담는다.
		String guestName = req.getParameter("guestName");
		String message = req.getParameter("message");
		
		MessageDto messageDto = new MessageDto(0, guestName, message, LocalDateTime.now(), LocalDateTime.now());
		
		// 서비스를 통해 메시지를 쓴다
		MessageWriteService service = new MessageWriteService();
		boolean result = service.writeMessage(messageDto);
		
		
		// 리스트 페이지로 전환시켜준다
		if(result) {
			req.setAttribute("wr", true);
		} else {
			req.setAttribute("wr", false);
		}
		req.getRequestDispatcher("/WEB-INF/view/writeResult.jsp").forward(req, resp);;
	}
}
