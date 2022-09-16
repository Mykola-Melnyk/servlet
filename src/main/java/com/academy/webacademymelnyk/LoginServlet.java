package com.academy.webacademymelnyk;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(true);
        session.setAttribute("name", request.getParameter("name"));
        System.out.println("LOGIN");


        System.out.println(request.getParameter("name"));
        System.out.println(request.getParameter("surname"));
        System.out.println("Name attribute: " + session.getAttribute("name"));


        String surname = request.getParameter("surname");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Success</h1>");
        out.println("</body></html>");
    }


}