<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<meta charset="UTF-8">
    <link rel="stylesheet" href="./css/register.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<script type="text/javascript" src="./js/register1.js" >
	
	</script>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div class="container">
    <div class="title">Registration</div>
    <div class="content">
      <form method= "post" action="registrationservlet" onsubmit="return validation()">
        <div class="user-details">
          <div class="input-box">
          
            <span class="details">First Name</span>
            <input type="text" id="fname" name="fname" placeholder="Enter your First name" required>
                  <span id="fnameerror" class="text-danger font-weight-bold"> </span>
          </div>
          <div class="input-box">
            <span class="details">Last Name</span>
            <input type="text" id="lname" name="lname"placeholder="Enter your Last name" required>
            <span id="lnameerror" class="text-danger font-weight-bold"> </span>
          </div>
          <div class="input-box">
            <span class="details">Username</span>
            <input type="text" id="username"  name="username" placeholder="Enter your username" required>
          	<span style="color:red;"> ${error }</span>
          	   <span id="usererror" class="text-danger font-weight-bold"> </span>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="text" id="email" name="email" placeholder="Enter your email" required>
           <span id="emailerror" class="text-danger font-weight-bold"> </span>
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="text" id="phoneno"  name="phoneno" placeholder="Enter your number" required>
           <span id="phoneerror" class="text-danger font-weight-bold"> </span>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
			
         		 <input type="password"  placeholder="Enter your password" id="password" name="password" autocomplete="off" required onkeyup="test_str(); " >
                   
                     <span id="t2" class="confirm-message"></span>         
		 <i class="fa fa-eye"  onclick="myFunction()"  ></i>
		  <span id="passworderror" class="text-danger font-weight-bold"> </span>
		    
		 </div>
		 
          <div class="input-box">
            <span class="details">Confirm Password</span>
            <input type="password"  placeholder="Confirm your password" id="cnfpass"   autocomplete="off"  onkeyup="checkPass();" required>
			    <span id="confirm-message2" class="confirm-message"></span>
				 <span  class="p-viewer">
			<i class="fa fa-eye"  onclick="myFunction1()"  ></i>
			</span>
			<span id="cpassworderror" class="text-danger font-weight-bold"> </span>
		  </div>
		  
          <div class="input-box">
            <span class="details">Country/Region</span>
            <input type="text" name="country" placeholder="Enter your Country" required>
          </div>
          <div class="input-box">
            <span class="details">City/District</span>
            <input type="text" name="city" placeholder="Enter your City" required>
          </div>
          <div class="input-box">
            <span class="details">Recent job title</span>
            <input type="text" name="jobtitle" placeholder="Enter your job title" required>
          </div>
		  
		<div class="input-box">
		<span class="details">Education Details </span>
        <input type="text" name="collegename" placeholder="Enter your College Name" style="max-width: 250px ;" required>
		</div>
		<div class="input-box">
		<span class="details">Percentage</span>
        <input type="text" name="percentage" placeholder="Enter your Percentage" required>
        </div>
		<div class="input-box">
		<label for="Qualification">Choose your Qualification:</label>
		<select id="Qualification" name="qualification">
		<option  disabled selected > -- select an option -- </option>
		<option value="Intermediate">Intermediate</option>
		<option value="Degree">Degree</option>
		<option value="BTECH">BTECH</option>
		<option value="Diploma">Diploma</option>
		<option value="Others">Others</option>
		</select>
		</div>
		<div class="input-box">
		<label for="Domain">Choose your Specialization:</label>
		<select id="Domain" name="specilization">
		<option  disabled selected > -- select an option -- </option>
		<option value="CSE">CSE</option>
		<option value="ECE">ECE</option>
		<option value="IT">IT</option>
		<option value="CIVIL">CIVIL</option>
		<option value="MECH">MECH</option>
		<option value="Others">Others</option>
		</select>
		</div>
		<div class="input-box">
         <span class="details">Skills</span>
           <input type="text" name="skills" placeholder="Enter your Skills" required>
          </div>
		<div class="input-box">
         <span class="details">Experience</span>
           <input type="text" name="experience" placeholder="Experience years" required>
         </div>
         </div>
        <div class="gender-details">
          <input type="radio" name="gender" id="dot-1" value="Male">
          <input type="radio" name="gender" id="dot-2" value="Female">
          <input type="radio" name="gender" id="dot-3" value="others">
          <span class="gender-title">Gender</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender"  >Male</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">Female</span>
          </label>
          <label for="dot-3">
            <span class="dot three"></span>
            <span class="gender">Prefer not to say</span>
            </label>
          </div>
        </div>
        <div class="button">
          <input type="submit" value="Register">
        </div>
      </form>
    </div>
  </div>
</body>
</html>