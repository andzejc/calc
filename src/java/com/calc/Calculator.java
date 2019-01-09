/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "Calculator", urlPatterns = {"/calculator"})
public class Calculator extends HttpServlet {

    private static Integer sum;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Integer a = Integer.parseInt(request.getParameter("numberA"));
        Integer b = Integer.parseInt(request.getParameter("numberB"));
        String action = request.getParameter("submit");
        if (action.equals("sum")) {
            sum = a + b;
        } else {
            sum = a * b;
        }
        response.getWriter().write("<html>"
                + "<head></head>"
                + "<body>"
                + "<form action = 'calculator' method='get'>"
                + "<input type='number' name='numberA' />"
                + "<input type='number' name='numberB' />"
                + "<input type='submit' name='submit' value='sum' />"
                + "<input type='submit' name='submit' value='mult' />"
                + "</form>"
                + action + " " + a + " and " + b + " = " + sum
                + "</body>"
                + "</html>"
        );
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
