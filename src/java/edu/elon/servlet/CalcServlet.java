/**
 *
 * @(C)2015 Zane, Madeline, Davis Elon University
 */
package edu.elon.servlet;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Calculator.Calc;
import javax.servlet.annotation.WebServlet;

class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.jsp";

        String action = request.getParameter("action");

        if (action != null && action.equals("add")) {
            url = "/index.jsp";

            String investment = request.getParameter("investment");
            String rate = request.getParameter("rate");
            String years = request.getParameter("years");

            Calc calculation = new Calc();
            calculation.setInvestment(Double.parseDouble(investment));
            calculation.setRate(Double.parseDouble(rate));
            calculation.setYears(Double.parseDouble(years));
            /*calculation.setFuture(Double.parseDouble(investment),
                    Double.parseDouble(intRate),
                    Double.parseDouble(years));*/

            request.setAttribute("calculation", calculation);
            url = "/calculate.jsp";

        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

}
