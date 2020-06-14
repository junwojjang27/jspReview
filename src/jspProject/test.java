package jspProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test123")
public class test extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("sdf");
		System.out.println("do !");
		resp.setContentType("text/html; charset=UTF-8");	//한글지원
		PrintWriter out = resp.getWriter();
		
		out.print("<html><head><title>get</title></head>");
		out.print("<body>");
		out.print("<h1>DATABASE 데이터베이스</h1>");
		out.println("</body></html>");
		out.close();
		
//		super.doGet(req, resp);
	}
}
