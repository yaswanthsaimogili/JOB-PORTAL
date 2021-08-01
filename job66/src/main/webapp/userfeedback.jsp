<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">  
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/feedback.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
</head>
<body>
<%@ include file="usernavbar.jsp" %>
<h2>FEEDBACK FORM</h2>    
<div class="container">    
  <form method="post" action="userfeedbackservlet">    
    <div class="row">    
      <div class="col-25">    
        <label for="fname">First Name</label>    
      </div>    
      <div class="col-75">    
        <input type="text" id="fname" name="fname" placeholder="Enter your First name"required>    
      </div>    
    </div>    
    <div class="row">    
      <div class="col-25">    
        <label for="lname">Last Name</label>    
      </div>    
      <div class="col-75">    
        <input type="text" id="lname" name="lname" placeholder="Enter your Last name"required>    
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
          <label for="Company Name">Company Name</label>    
        </div>    
        <div class="col-75">    
          <input type="text" id="Cname" name="Cname" placeholder="Enter your Company Name"required>    
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
<%@ include file="footer.jsp" %>   
</body>
</html>