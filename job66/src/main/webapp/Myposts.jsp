	<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.ArrayList" %>
	<%@ page import="registration.model.search" %>
	 <%@ page import="registration.model.successstories" %>
	    <%@ page import="registration.dao.successstoriesdao" %>
      <%@ page import="registration.dao.searchdao" %>
  <%@ page import="registration.model.search" %>
<% ArrayList result1=(ArrayList)successstoriesdao.feedback(); %>
<% ArrayList result=(ArrayList)request.getAttribute("searchresult"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Jobs</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
</head>
<body>

<%
if(session.getAttribute("username")!=null)
{%>
<%@include file ="usernavbar.jsp" %>
 
  
  	<%for (int i =0 ; i< result.size(); i++) {%>
   <% successstories job = (successstories)result.get(i); %>
    <div class="card" style="width: 25rem;">
  <div class="card-body">
					<img src="./images/logo.png">
					<h5><i class="bi bi-person-bounding-box" style="color:#77d1b1"></i> 
					&nbsp Fname:<%= job.getFname() %>
					</h5>
					 
					<h5><i class="bi bi-person-bounding-box" style="color:#77d1b1"></i>&nbsp Lname:<%= job.getLname() %></h5>
					<h5><i class="bi bi-building" style="color:#77d1b1" ></i>&nbsp Cname: <%= job.getCname() %></h5>
					<h5><i class="bi bi-envelope-fill" style="color:#77d1b1"></i>&nbsp Email : <%= job.getEmail() %></h5>
					<h5><i class="bi bi-chat-left-quote" style="color:#77d1b1"></i>&nbsp
						Message : <%= job.getSubject() %>
						</h5>
					
					</div>
	</div>
	<br><br>
					<%} %>
	
				
<%} 
else if(session.getAttribute("employeename")!=null)
{%>
	<%@include file ="employeenavbar.jsp" %>
	<section id="jobdetails">
<br>
<br>
<h3 style="background-image:linear-gradient(to right, #aff6cf 0%, #9f98e8 74%)"> Your Posts :</h3>
</section>

<%for (int i =0 ; i< result.size(); i++) {%>
   <% search job = (search)result.get(i); %>
   <div class="card-deck" >

<div class="card" style="width: 25rem;">
  <div class="card-body">
    <h5 class="card-title" ><i class="bi bi-person-fill" style="color:#77d1b1"></i> &nbsp Role: <%= job.getRole() %></h5>
    <h5 class="card-title"><i class="bi bi-clock-fill" style="color:#77d1b1"></i>&nbsp Experience:<%= job.getExperience() %></h5>
	<h5 class="card-title"><i class="bi bi-currency-dollar" style="color:#77d1b1"></i>&nbsp Package:<%= job.getSalary() %></h5>
	<h5 class="card-title"><i class="bi bi-clock-history" style="color:#77d1b1"></i>&nbsp Shift:<%= job.getShift() %></h5>
	<h5 class="card-title"><i class="bi bi-briefcase-fill" style="color:#77d1b1"></i>&nbsp Skills : <%= job.getSkills() %></h5>
	<h5 class="card-title"><i class="bi bi-building" style="color:#77d1b1"></i>&nbsp Company : <%= job.getCname() %></h5>
	<h5 class="card-title"><i class="bi bi-geo-alt-fill" style="color:#77d1b1"></i>&nbsp Location : <%= job.getLocation() %></h5>
	<h5 class="card-title"><i class="bi bi-inbox-fill" style="color:#77d1b1"></i>&nbsp Email:<%= job.getEmail() %></h5>
    <h5 class="card-title"><i class="bi bi-info-circle-fill" style="color:#77d1b1"></i>&nbsp Description: <%= job.getDetails() %> <br> <a href="#">Read more</a></h5>
    <button type="button" class="btn btn-outline-primary"><a href="<%= job.getLinks() %>">Apply</a></button>
  </div>
</div>
</div>
   
<%} %>
<%}
else
{%>
	
	<%@include file ="Navbar.jsp" %>
<%}
%>

<section id="footer" class="text-center">
	<%@ include file="footer.jsp" %>  
 </section>
</body>
</html>