<%-- 
© 2015 Maddie Chili, Davis Rumley, Zane Laughery
--%>
<%@ include file="/includes/header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1>Future Value Calculator</h1>

<form id="email-form" name="email-form" action="calculate2" method="post">
    <input type="hidden" name="action" value="add">        
    <label for="investment">Investment Amount</label>
    <input type="number" id="investment" name="investment" min="0" required><br>
    <label for="rate">Yearly Interest Rate</label>
    <input type="number" id="rate" name="rate" min="0" required><br>
    <label for="years">Number of Years</label>
    <input type="number" id="years" name="years" min="0" placeholder="Integer number of years" required><br> 
    
    <input type="submit" id="calculate" value="Calculate">
</form>
    
<%@include file="/includes/footer.jsp" %>
