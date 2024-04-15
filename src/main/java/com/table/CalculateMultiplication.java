package com.table;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/table-multiplication")
public class CalculateMultiplication extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int no = Integer.parseInt(req.getParameter("number"));
			int multiplyUpto = Integer.parseInt(req.getParameter("upto"));
			resp.getWriter().println("<h1 style='color:goldenrod' align='center'>Your Output</h1>");
			for (int i = 1; i <= multiplyUpto; i++) {
				resp.getWriter().println("<div align='center'>" + no + " * " + i + " = " + no * i + "</div>");
			}
		} catch (Exception e) {
			resp.getWriter().print("<h1 style='color:red' align='center'>Alert!!! Fill Both The Box</h1>");
			req.getRequestDispatcher("Table.html").include(req, resp);
		}

	}
}
