<!-- 
© 2015 Davis Rumley & Ben Fobert
-->
<!DOCTYPE html>
<head>
    <title>Calculator Results</title>
    
</head>
<%@ include file="/includes/header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/calculation.tld" prefix="elon" %>
<section id="calc_input">
<h1>Future Value Calculator</h1>

<label>Investment Amount:</label>
<span>${calculation.investment}</span><br>
<label>Yearly Interest Rate:</label>
<span>${calculation.rate}</span><br>
<label>Number of Years:</label>
<span>${calculation.years}</span><br>
</section>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table style="width:100%" id="table">
    <tr>
        <th>Year</th>
        <th>Future Value</th>
    </tr>
    <c:set var="year" value="0" scope="page" />
     <c:forEach items="${calculation.future}" var="calcs">
    <tr>
        <c:set var="year" value="${year + 1}" scope="page"/>
        <td>${year}</td>
        <td>${calcs}</td>
    </tr>
    </c:forEach>

<tr>
    <td><elon:currency>${price}</elon:currency></td> 
</tr>

</table>
   

<a href="index.jsp">Back to Calculator</a>

<%@include file="/includes/footer.jsp" %>
