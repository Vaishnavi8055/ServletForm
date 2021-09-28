package com.servlet;/*
 * Created by Vaishnavi Chaurasia
 * 28-Sep-21
 * 8:23 PM
 * ServletFormTest
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<h2>WELCOME TO Servlet </h2>");


    }
}
