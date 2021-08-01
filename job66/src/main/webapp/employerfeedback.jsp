<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employerfeedback</title>
<link rel="stylesheet" href="./css/employeerfeedback.css">
</head>
<body> 
	<%@ include file="employeenavbar.jsp" %>   
<h2>FEEDBACK FORM</h2>    
<div class="container">    
  <form action="employerfeedbackservlet" method="post">    
    <div class="row">    
      <div class="col-25">    
        <label for="Cname">Company Name</label>    
      </div>    
      <div class="col-75">    
        <input type="text" id="Cname" name="Cname" placeholder="Enter your Comapny name"required>    
      </div>    
    </div>    
    <div class="row">    
        <div class="col-25">    
          <label for="email">Email Id</label>    
        </div>    
        <div class="col-75">    
          <input type="email" id="email" name="email" placeholder="Enter your Email"required>    
        </div>    
      </div>    
    
    <div class="row">    
      <div class="col-25">    
        <label for="feed_back">Review</label>    
      </div>    
      <div class="col-75">    
        <textarea id="subject" name="subject" placeholder="Write here..." style="height:200px"required></textarea>    
      </div>    
    </div>    
    <div class="row">    
      <input type="submit" value="Submit">    
    </div>    
  </form>    
</div>    
    <section id="footer" class="text-center">
	<%@ include file="footer.jsp" %>  
	</section>
</body>
</html>