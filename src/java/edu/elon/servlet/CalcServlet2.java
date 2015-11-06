/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.servlet;

import Calculator.Calc;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author drumley
 */
@WebServlet(name = "CalcServlet2", urlPatterns = {"/calculate2"})
public class CalcServlet2 extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalcServlet2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        HttpSession session = request.getSession();
        String url = "/index.jsp";

        String action = request.getParameter("action");
        
        if (action != null && action.equals("add")) {
            url = "/index.jsp";

            String investment = request.getParameter("investment");
            session.setAttribute("investment", investment);
            String rate = request.getParameter("rate");
            session.setAttribute("rate", rate);
            String years = request.getParameter("years");

            Calc calculation = new Calc();
            calculation.setInvestment(Double.parseDouble(investment));
            calculation.setRate(Double.parseDouble(rate));
            calculation.setYears(Double.parseDouble(years));
            
            calculation.setFuture(Double.parseDouble(investment),
                    Double.parseDouble(rate),
                    Double.parseDouble(years));
            request.setAttribute("calculation", calculation);
            url = "/calculate.jsp";

        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
        //processRequest(request, response);
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
