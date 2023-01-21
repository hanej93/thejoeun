package jsp08_mvc.guestbook.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp08_mvc.guestbook.model.MessageListService;
import jsp08_mvc.guestbook.model.MessageListView;

// 서블릿으로 등록할 클래스 
// HttpServlet을 상속하여 서블릿 클래스로 만들어 준다
public class MessageController extends HttpServlet{
	// 서블릿을 이용해서 컨트롤러 역할을 하는 클래스 구현
	// 서블릿에는 주로 사용하는 메서드가 있음
	// doGet, doPost, service
	// - doGet은 get으로 요청이 왔을 때 실행
	// - doPost는 post로 요청이 왔을 때 실행
	// - service는 get이든 post든 실행됨

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 콘솔에 찍음
		// System.out.println("doGet() 호출");
		/*
		 * PrintWriter out = resp.getWriter(); // 화면에 보내줌 out.write("hello do get");
		 */
		
		// 방명록 리스트, 몇번쨰 페이지, 현재 페이지, 전체 페이지 개수 의 데이터들이 필요함
		
		
		// 현재 페이지 번호 클라이언트로부터 받는다.
		String pageNumberStr = req.getParameter("page");
		int pageNumber = 1;
		if(pageNumberStr != null) {
			pageNumber = Integer.parseInt(pageNumberStr);
		}
		
		// 리스트로 보여줄 데이터를 찾아올 것임
		// -> 서비스 객체를 이용
		MessageListService service = new MessageListService();
		
		// 서비스를 이용하여 데이터를 받아옴
		MessageListView viewData = service.getMessageListView(pageNumber);
		
		// 화면에 보내줄 데이터를 request에 담는다.
		req.setAttribute("viewData", viewData);
		
		// 리스트를 어떤 화면에 보내줄지 정해서 보내줌
		req.getRequestDispatcher("/WEB-INF/view/listview.jsp").forward(req, resp);
		
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * System.out.println("doPost() 호출"); PrintWriter out = resp.getWriter();
		 * out.write("hello do post"); super.doPost(req, resp);
		 */	
		
	
	}
}
