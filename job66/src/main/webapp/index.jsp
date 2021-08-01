<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="registration.model.successstories" %>
<%@ page import="registration.dao.successstoriesdao" %>
<%@ page import="registration.dao.searchdao" %>
<%@ page import="registration.model.search" %>
<% ArrayList result=(ArrayList)successstoriesdao.feedback(); %>
<% ArrayList searchresult=(ArrayList)searchdao.recentjobs(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=yes">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">

<!---css----->
<link rel="stylesheet" href="./css/style2.css">
<title>DreamJob</title>
</head>
<body>


<%
if(session.getAttribute("username")!=null)
 {%>
  <%@include file ="usernavbar.jsp" %>
<%} 
else if(session.getAttribute("employeename")!=null)
{%>
	<%@include file ="employeenavbar.jsp" %>
<%}
else
{%>
	
	<%@include file ="Navbar.jsp" %>
<%}
%>
	

	<!-----------------------Intro ----------------------->

	<div class="banner text-center">
		<h1>JOBS AROUND YOU </h1>
	</div>


	<!--------------------search area ------------------->





	<!--------------top recuters ---------------------------------->



	<div class="container text-center" id=top>
		<h1 class="recruiters">Top recruiters</h1>
		<div class="list">
		<img src= "https://www.exceptnothing.com/wp-content/uploads/2012/11/Company-logos.png" width="450" height="500" >
	   </div>
	</div>

	<!----------------- job details------------------------------------->


	<section id="jobdetails">
		<div class="container">
			<h1>RecentJobs :</h1>
 
<%for (int i =0 ; i < searchresult.size(); i++) {
%>
   <% search job = (search)searchresult.get(i); %>
   
   <div class="card-deck" >

<div class="card" style="width: 25rem;">
  <div class="card-body">
    <h5 class="card-title"><i class="bi bi-person-fill"></i> &nbsp Role: <%= job.getRole() %></h5>
    <h5 class="card-title"><i class="bi bi-clock-fill"></i> &nbsp Experience:<%= job.getExperience() %></h5>
	<h5 class="card-title"><i class="bi bi-currency-dollar"></i> &nbsp Package:<%= job.getSalary() %></h5>
	<h5 class="card-title"><i class="bi bi-clock-history"></i> &nbsp Shift:<%= job.getShift() %></h5>
	<h5 class="card-title"><i class="bi bi-briefcase-fill"></i> &nbsp Skills : <%= job.getSkills() %></h5>
	<h5 class="card-title"><i class="bi bi-building"></i> &nbsp Company : <%= job.getCname() %></h5>
	<h5 class="card-title"><i class="bi bi-geo-alt-fill"></i> &nbsp Location : <%= job.getLocation() %></h5>
	<h5 class="card-title"><i class="bi bi-inbox-fill"></i> &nbsp Email:<%= job.getEmail() %></h5>
    <h5 class="card-title"><i class="bi bi-info-circle-fill"></i> &nbsp Description: <%= job.getDetails() %> <br> <a href="#">Read more</a></h5>
    <button type="button" class="btn btn-outline-primary"><a href="<%= job.getLinks() %>">Apply</a></button>
  </div>
</div>

</div>
   
<%} %>



			
			<div>
				<ul class="page-link text-center">
					<li class="left-arrow">&#8592;</li>
					<li class="actuve">1</li>
					<li>2</li>
					<li>3</li>
					<li>4</li>
					<li>5</li>
					<li class="right-arrow">&#8594;</li>
				</ul>
			</div>
		</div>

	</section>




	<!---------------------Success story ----------------------->




	<section id="reviews">
		<div class="text-center">
			<h1>
				<b>Success Stories :</b>
			</h1>
		</div>
		<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
			<div class="carousel-inner">
	    <%for (int i =0 ; i< result.size(); i++) {%>
   <% successstories job = (successstories)result.get(i); %>
		<% if(i==0) 
			{%>
				
			<div class="carousel-item active">
					<img src="./images/logo.png">
					<h5 ><i class="bi bi-person-bounding-box"></i>
						 &nbsp Fname:<%= job.getFname() %>
					</h5> 
					<h5><i class="bi bi-person-bounding-box"></i> &nbsp Lname:<%= job.getLname() %></h5>
					<h5><i class="bi bi-building"></i> &nbsp Cname: <%= job.getCname() %></h5>
					<h5> <i class="bi bi-envelope-fill"></i> &nbsp  Email : <%= job.getEmail() %></h5>
					<h5><i class="bi bi-chat-left-quote"></i> &nbsp 
						Message : <%= job.getSubject() %>
						</h5>
				</div>
		<%} 
		else{
			
		%>
		<div class="carousel-item ">
					<img src="./images/logo.png">
					<h5><i class="bi bi-person-bounding-box"></i> 
					&nbsp Fname:<%= job.getFname() %>
					</h5>
					<h5><i class="bi bi-person-bounding-box"></i>&nbsp Lname:<%= job.getLname() %></h5>
					<h5><i class="bi bi-building"></i>&nbsp Cname: <%= job.getCname() %></h5>
					<h5><i class="bi bi-envelope-fill"></i>&nbsp Email : <%= job.getEmail() %></h5>
					<h5><i class="bi bi-chat-left-quote"></i>&nbsp
						Message : <%= job.getSubject() %>
						</h5>
					
				</div>
		<% }%>
		<%} %>
		
		</div>
		<a class="carousel-control-prev" href="#carouselExampleControls"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleControls"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> 
				<span class="sr-only" >Next</span>
			</a>
			
		</div>
		
	</section>




	<!-------------------Footer---------------------------->




	<section id="footer" class="text-center">
	<%@ include file="footer.jsp" %>  
	</section>
		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" ></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>