package jsp08_mvc_ex.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MessageController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HashSet<Integer> lottoNumSet = new HashSet<Integer>();
		
		while(lottoNumSet.size() < 6) {
			int lottoNum = (int)(Math.random() * 45 + 1);
			lottoNumSet.add(lottoNum);
		}
		
		
		req.setAttribute("lottoNums", lottoNumSet);
		
		req.getRequestDispatcher("/view.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/view.jsp").forward(req, resp);
		
	}
}
