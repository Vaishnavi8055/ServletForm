package com.servlet;/*
 * Created by Vaishnavi Chaurasia
 * 28-Sep-21
 * 8:24 PM
 * ServletFormTest
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<h2>WELCOME TO REGISTRATION FORM </h2>");

        String name = req.getParameter("user_name");
        String email = req.getParameter("user_email");
        String password = req.getParameter("user_pass");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String cond = req.getParameter("terms");

        if(cond.equals("checked")){

            out.println("<h2>Name - " + name + "</h2>");
            out.println("<h2>Password - " + password + "</h2>");
            out.println("<h2>Email - " + email + "</h2>");
            out.println("<h2>Gender - " + gender + "</h2>");
            out.println("<h2>Course - " + course + "</h2>");
            out.println("<h2>Condition - " + cond + "</h2>");

        }
        else {
            out.println("<h2> You have not accepted the terms and condition </h2>");
        }
    }
}
