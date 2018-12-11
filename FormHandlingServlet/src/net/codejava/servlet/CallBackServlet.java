package net.codejava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class CallBackServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		// read form fields
		String perfiosTransactionId = request.getParameter("perfiosTransactionId");
		String clientTransactionId = request.getParameter("clientTransactionId");
		String status = request.getParameter("status");
		String errorCode = request.getParameter("errorCode");
		String errorMessage = request.getParameter("errorMessage");
		
		System.out.println("perfiosTransactionId: " + perfiosTransactionId);
		System.out.println("clientTransactionId: " + clientTransactionId);
		System.out.println("status: " + status);
		System.out.println("errorCode: " + errorCode);
		System.out.println("errorMessage: " + errorMessage);

		// do some processing here...
		
		// get response writer
		PrintWriter writer = response.getWriter();
		
		// build HTML code
		String htmlRespone = "<html>";
		htmlRespone += "<h2>The transaction landed on state of : " + status + "<br/>";		
		htmlRespone += "with error code: " + errorCode + "</h2>";		
		htmlRespone += "</html>";
		
		// return response
		writer.println(htmlRespone);
		
	}

}