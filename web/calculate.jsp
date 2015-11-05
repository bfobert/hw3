<%-- 
© 2015 Maddie Chili, Davis Rumley, Zane Laughery
--%>
<%@ include file="/includes/header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/calculation.tld" prefix="elon" %>

<h1>Future Value Calculator</h1>

<label>Investment Amount:</label>
<span>${calculation.investment}</span><br>
<label>Yearly Interest Rate:</label>
<span>${calculation.rate}</span><br>
<label>Number of Years:</label>
<span>${calculation.years}</span><br>
<label>Future Value:</label>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table style="width:100%" id="table">
    <tr>
        <th>Year</th>
        <th>Future Value</th>
    </tr>
    
     <c:forEach items="${calculation.future}" var="calcs">
    <tr>
        <td>years</td>
        <td>${calcs}</td>
    </tr>
    </c:forEach> 
    <!--These are just place-holder values. Not sure if we need the math in this page or not-->

<tr>
    <td><elon:currency>${price}</elon:currency></td>
    <td>Smith</td> 
</tr>
<tr>
    <td>Eve</td>
    <td>Jackson</td> 
</tr>
</table>
   
<button onclick="goBack1()">Return to Calculator</button>
<script>
    function goBack1() {
        window.history.back();
    }
    function goBack2() {
        window.open("/index.jsp");
    }
</script>
    

<%@include file="/includes/footer.jsp" %>
