<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employer</title>
 <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/navbar.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
 
</head>
<body>
<div class="menu-bar" >
<nav class="navbar navbar-expand-lg navbar-light">
 <a href="index.jsp">
  <img src="./images/logo.png "width="50",height="70"><a class="navbar-brand" href="#">DreamJob.Com<br><h5>--A path to your Dream</h5></a><br>
  </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
         <ul class="navbar-nav ml-auto"  class="nav nav-pills">
	<li class="nav-item">
        <a class="nav-link" href="index.jsp">Home</a>
      </li>
	  <li class="nav-item">
        <a class="nav-link" href="#footer">About</a>
      </li>
    <ul class="navbar-nav ml-auto"  class="nav nav-pills">
	<li class="nav-item">
        <a class="nav-link" href="postjobform.jsp">PostJob</a>
      </li>
	 <li class="nav-item">
	  <form action="searchservlet" method="post">
        <a class="nav-link" href="findjob.jsp">FindJob</a>
        </form>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/job66/myposts">MyJobs</a>
      </li>
	  <li class="nav-item">
        <a class="nav-link" href="#footer">ContactUs</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="employerfeedback.jsp">Feedback</a>
      </li>
       <%
response.setHeader("Cache-Control" , "no-cache,no-store,must-revalidate");
if(session.getAttribute("employeename")==null)
{
	response.sendRedirect("index.jsp");
}
 	%>
 <li class="nav-item">
 		 <a class="nav-link" href="index.jsp">	${employeename } </a>
    </li>
      <li class="nav-item">
        <!--  <a class="nav-link" href="index.jsp">SignOut</a>  -->
        <form action="logoutservlet" method="post">
			<input type="submit" class="btn btn-primary btn-sm active" role="button" aria-pressed="true" value="logout">
			</form>
      </li>
    </ul>
	
  </div>
</nav>
</div>
</body>
</html>