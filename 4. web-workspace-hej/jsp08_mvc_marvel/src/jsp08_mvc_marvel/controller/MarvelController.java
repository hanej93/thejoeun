package jsp08_mvc_marvel.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp08_mvc_marvel.model.MarvelListService;
import jsp08_mvc_marvel.model.MarvelListView;

public class MarvelController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String currentPageNumberStr = req.getParameter("page");
		
		int currentPageNumber = 1;
		
		if(currentPageNumberStr != null) {
			currentPageNumber = Integer.parseInt(currentPageNumberStr);
		}
		MarvelListService service = new MarvelListService();
		MarvelListView viewData = service.getMarvelListView(currentPageNumber);
		req.setAttribute("viewData", viewData);
		
		req.getRequestDispatcher("/WEB-INF/view/listview.jsp").forward(req, resp);
		
	}
}
