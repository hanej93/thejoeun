package jsp08_mvc_marvel.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp08_mvc_marvel.model.MarvelDeleteService;

public class MarvelDeleteController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int marvelId = Integer.parseInt(req.getParameter("marvel_id"));
		
		MarvelDeleteService service = new MarvelDeleteService();
		
		service.deleteMarvel(marvelId);
		
		resp.sendRedirect("/jsp08_mvc_marvel/marvel_list");
		
	}

	
}
