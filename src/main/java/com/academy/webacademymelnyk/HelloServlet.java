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
        String name = (String) session.getAttribute("name");

        System.out.println(request.getParameter("name"));
        System.out.println("Name attribute: " + session.getAttribute("name"));



        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + " " + name + "!" + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}