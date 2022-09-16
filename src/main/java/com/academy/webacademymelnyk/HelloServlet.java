package com.academy.webacademymelnyk;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello,";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        HttpSession session = request.getSession();
        session.setAttribute("name", request.getParameter("name"));
        System.out.println("HelloServlet.doGet");
        System.out.println(request.getParameter("name"));
        System.out.println(request.getParameter("surname"));
        System.out.println("Name attribute: " + session.getAttribute("name"));


        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + " " + session.getAttribute("name") + " " + surname + "!" + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}