package jsp08_mvc_marvel.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp08_mvc_marvel.model.MarvelDto;
import jsp08_mvc_marvel.model.MarvelSelectService;
import jsp08_mvc_marvel.model.MarvelUpdateService;

public class MarvelUpdateController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String marvelIdStr = req.getParameter("marvel_id");
		int marvelId = Integer.parseInt(marvelIdStr);
		
		MarvelSelectService service = new MarvelSelectService();
		
		// 아이디로 조회한 셀렉트 결과 반환
		MarvelDto marvel = service.getMarvel(marvelId);
		
		
		// 조회한 결과를 보내줌
		req.setAttribute("marvel", marvel);
		
		req.getRequestDispatcher("/WEB-INF/view/updateForm.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		int marvelId = Integer.parseInt(req.getParameter("marvelId"));
		LocalDateTime writeDate = LocalDateTime.parse(req.getParameter("writeDate"));
		String title = req.getParameter("title");
		String titleEng = req.getParameter("titleEng");
		LocalDate releaseDate = LocalDate.parse(req.getParameter("releaseDate"));
		long worldBoxOffice = Long.parseLong(req.getParameter("worldBoxOffice"));
		
		MarvelDto marvelDto = new MarvelDto(marvelId, title, titleEng, releaseDate, worldBoxOffice, writeDate, LocalDateTime.now());
		
		MarvelUpdateService service = new MarvelUpdateService();
		service.updateMarvel(marvelDto);
		
		resp.sendRedirect("/jsp08_mvc_marvel/marvel_list");
	
	}
}
