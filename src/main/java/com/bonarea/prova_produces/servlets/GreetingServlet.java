/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.prova_produces.servlets;

import com.bonarea.prova_produces.GreetingCard;
import com.bonarea.prova_produces.GreetingType;
import com.bonarea.prova_produces.Greetings;
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

@WebServlet(name = "greetingServlet", urlPatterns = {"/sayHello"})
public class GreetingServlet extends HttpServlet {
     
    @Inject
    @Greetings(GreetingType.HELLO)
    private GreetingCard greetingCard;
 
    @Inject
    @Greetings(GreetingType.HI)
    private GreetingCard anotherGreetingCard;
 
    @Override
      public void init() throws ServletException {
      }
 
    @Override
      public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          out.println("<h1>" + greetingCard.sayHello() + "</h1>");
          out.println("<h1>" + anotherGreetingCard.sayHello() + "</h1>");
      }
       
    @Override
      public void destroy(){
      }
 
}
