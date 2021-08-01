<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Postjobform</title>
 <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/postjobform.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<%@include file ="employeenavbar.jsp" %>
 
<div class="container">
    <div class="title">Post job</div>
    <div class="content">
      <form action="postjobservlet" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Company Name</span>
            <input type="text" name="cname" placeholder="Enter your Company name" required>
          </div>

          <div class="input-box">
            <span class="details">Location</span>
            <input type="text" name="location" placeholder="Enter Job Location" required>
          </div>
          <div class="input-box">
            <span class="details"> role </span>
            <input type="text" name="role" placeholder="Enter role" required>
          </div>
          <div class="input-box">
            <span class="details">Experience</span>
            <input type="text" name="experience" placeholder="Enter required Experience" required>
          </div>
          <div class="input-box">
            <span class="details">Salary</span>
            <input type="text" name="salary" placeholder="Enter approx Salary" required>
          </div>
          <div class="input-box">
            <span class="details">Required Skills</span>
            <input type="text" name="skills" placeholder="Enter Required Skills" required>
          </div>
         <div class="input-box">
            <span class="details">Shift</span>
            <input type="text" name="shift" placeholder="Enter Shift Day/Night" required>
          </div>
          <div class="input-box">
            <span class="details">Company Email</span>
            <input type="text" name="email" placeholder="Enter your Company's Email" required>
          </div>
           <div class="input-box">
            <span class="details">Enter Registration Link</span>
            <input type="text" name="link" placeholder="Enter Registration Link" required>
          </div>
          <div class="input-box">
            <span class="details">Job Description</span>
            <input type="textarea"  name= "details"  placeholder="Enter your Job Description"   required>
          </div>
         </div>
   
		
        <div class="button">
          <input type="submit" value="Register">
        </div>
      </form>
    </div>
  </div>
  <section id="footer" class="text-center">
<%@ include file="footer.jsp" %>  

 </section>
</body>
</html>