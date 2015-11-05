/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Currency;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.IOException;
import java.util.ArrayList;
import java.text.NumberFormat;
import Calculator.Calc;

/**
 *
 * @author bfobert
 */
public class currencyTag extends BodyTagSupport {
/*
    private ArrayList<Calc> calcs;
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private int count = 0;
    private Calc calc;

    @Override
    public int doStartTag() {
        calcs = (ArrayList<Calc>) pageContext.findAttribute("products");
        System.out.println(calcs + "");
        if (calcs.size() <= 0) {
            return SKIP_BODY;
        } else {
            return EVAL_BODY_BUFFERED;
        }
    }

    // Evaluate the body and add the data for the first vector element
    // to the bodyContent object.

    @Override
    public void doInitBody() {
        count = 0;
        calc = (Calc) calcs.get(count);
        pageContext.setAttribute("Investment", calc.getInvestment());
        pageContext.setAttribute("Rate", calc.getRate());
        double future = calc.getFuture();
        String priceAsString = currency.format(future);
        pageContext.setAttribute("price", priceAsString);
        count++;
    }
    private void setCalcAttributes(Calc calc) {
        pageContext.setAttribute(
                "InvestmentAmt", calc.getInvestment());
        pageContext.setAttribute(
                "InterestRate", calc.getRate());
        pageContext.setAttribute(
                "productPrice", calc.getPriceCurrencyFormat());
        pageContext.setAttribute(
                "quantity",calc.getYears());
        pageContext.setAttribute(
                "total", calc.getPriceCurrencyFormat());
                /*Was originally item.getTotalCurrencyFormat -- changed to fit Calc Bean format*/
/*    }
    @Override
    public int doAfterBody() throws JspException {
        try {
            if (count < calcs.size()) {
                calc = (Calc) calcs.get(count);
                pageContext.setAttribute("Investment", calc.getInvestment());
                pageContext.setAttribute("Rate", calc.getRate());
                pageContext.setAttribute("price", currency.format(calc.getFuture()));
                count++;
                return EVAL_BODY_AGAIN;
            } else {
                JspWriter out = bodyContent.getEnclosingWriter();
                bodyContent.writeOut(out);
                return SKIP_BODY;
            }
        } catch (IOException ioe) {
            System.err.println("IOException doAfterBody: " + ioe);
            return SKIP_BODY;
        }
    } */
}
