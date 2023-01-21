package jsp08_mvc.guestbook.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp08_mvc.guestbook.model.MessageDeleteService;

public class MessageDeleteController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String messageIdStr = req.getParameter("message_id");
		int messageId = Integer.parseInt(messageIdStr);
		
		MessageDeleteService service = new MessageDeleteService();
		
		boolean result = service.messageDelete(messageId);
		
		req.setAttribute("result", result);
		
		req.getRequestDispatcher("/WEB-INF/view/deleteResult.jsp").forward(req, resp);
		
	}
}
