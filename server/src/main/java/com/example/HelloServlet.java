package com.example;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloservlet")
public class HelloServlet extends HttpServlet {
    private static final long serrialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String yourName = request.getParameter("yourName");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello " + yourName + "</h1>");
        writer.close();
    }

}

