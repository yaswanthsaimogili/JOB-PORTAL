<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.ArrayList" %>
  <%@ page import="registration.model.search" %>
  <%@ page import="java.util.*" %>
<% ArrayList result=(ArrayList)request.getAttribute("searchresult"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/findjob.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
	 <link rel="stylesheet" href="C:\Users\yaswa\Desktop\AJWT lab\AJWT_Project\webpages\fontawesome-free-5.15.3-web\css\all.css">
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
     <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
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


<div class="search">

<div class="container">
    <div class="title">Job Search</div>
    <div class="content">
      <form method= "post" action="searchservlet">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Search By Role :</span>
            <input type="text" name="role" id="fname" placeholder="Search By Role" >
			 <span id="fnameerror" class="text-danger font-weight-bold"> </span>
          </div>
          <div class="input-box">
            <span class="details">Search By Comapny :</span>
            <input type="text" name="company" id="lname" placeholder="Search By Company">
			 <span id="lnameerror" class="text-danger font-weight-bold"> </span>
          </div>
          <div class="input-box">
            <span class="details">Search By L;ocation : </span>
            <input type="text" id="location" name="location" placeholder="Search By Location">
            <span id="usererror" class="text-danger font-weight-bold"> </span>
          </div>
		 <div class="button">
          <input type="submit" value="Search"> 
        </div>
</div>

</form>
</div>
</div>
</div>
<section id="jobdetails">
<h3 > Search Results :</h3>
<%
try
{%>
<% 
if(result==null || result.size()==0)
 {%>

 <h2> No Results Found </h2>
<%} 
else
{%>

<%for (int i =0 ; i< result.size(); i++) {%>
   <% search job = (search)result.get(i); %>
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
<%} %>
<%}
catch(Exception e)
{
%>
		<%e.printStackTrace();
		  }
%>


</section>


<section id="footer" class="text-center">
	<%@ include file="footer.jsp" %>  


 </section>



<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
 

</body>
</html>