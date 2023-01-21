package jsp08_mvc_marvel.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp08_mvc_marvel.model.MarvelDto;
import jsp08_mvc_marvel.model.MarvelWriteService;

public class MarvelWriteController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String title = req.getParameter("title");
		String titleEng = req.getParameter("titleEng");
		String releaseDate = req.getParameter("releaseDate");
		String worldBoxOffice = req.getParameter("worldBoxOffice");
		System.out.println(title);
		System.out.println(titleEng);
		System.out.println(releaseDate);
		System.out.println(worldBoxOffice);
		MarvelDto marvelDto = new MarvelDto(0, title, titleEng, LocalDate.parse(releaseDate), Long.parseLong(worldBoxOffice), LocalDateTime.now(), LocalDateTime.now());
	
		MarvelWriteService service = new MarvelWriteService();
		service.writeMarvel(marvelDto);
		
		resp.sendRedirect("/jsp08_mvc_marvel/marvel_list");
		
	}
	
}
