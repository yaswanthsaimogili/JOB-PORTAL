<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
  <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/register.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <script type="text/javascript" src="./js/register2.js" >
     </script>
</head>
<body>
<div class="container">
    <div class="title">Employer Registration</div>
    <div class="content">
      <form method= "post" action="employeregistrationservlet" onsubmit="return validation()">
       <div class="user-details">
          <div class="input-box">
            <span class="details" >Company Name</span>
            <input type="text" id="companyname" name="companyname" placeholder="Enter your Company name" required>
             <span id="companynameerror" class="text-danger font-weight-bold"> </span>
          </div>
          <div class="input-box">
            <span class="details">Country</span>
            <input type="text" name="country" placeholder="Enter your Country" required>
          </div>
          <div class="input-box">
            <span class="details">State</span>
            <input type="text" name="state" placeholder="Enter your State" required>
          </div>
          <div class="input-box">
            <span class="details">City</span>
            <input type="text"name="city"  placeholder="Enter your City" required>
          </div>
          <div class="input-box">
            <span class="details">Area</span>
            <input type="text" name="area" placeholder="Enter your Area" required>
          </div>
          <div class="input-box">
            <span class="details">Domain</span>
            <input type="text" name="domain" placeholder="Enter your Domain" required>
          </div>
          <div class="input-box">
            <span class="details">Company Email</span>
            <input type="text" id="email" name="email" placeholder="Enter your Company's Email" required>
                   <span id="emailerror" class="text-danger font-weight-bold"> </span>
          </div>
          <div class="input-box">
            <span class="details">Social media</span>
            <input type="text" name="website" placeholder="Enter your Website link/Social media link" required>
  
          </div>
		<div class="input-box">
		<span class="details">Representative name</span>
        <input type="text" name="representativename" placeholder="Enter your Name" required>
		</div>
		<div class="input-box">
		<span class="details">Representative email</span>
        <input type="text" id="repemail" name="representativeemail" placeholder="Enter your Email" required>
               <span id="repemailerror" class="text-danger font-weight-bold"> </span>
        </div>
		<div class="input-box">
         <span class="details">Representative Position</span>
           <input type="text" name="representativeposition" placeholder="Enter your Position" required>
          </div>
		<div class="input-box">
         <span class="details">Representative Phone number</span>
           <input type="text" id="phoneno" name="phoneno" placeholder="Enter your Phone number" required>
                  <span id="phonenoerror" class="text-danger font-weight-bold"> </span>
         </div>
         <div class="input-box">
            <span class="details">Company Description</span>
              <input type="text"name="description" placeholder="Enter your Company Description" required>
        </div>
        <div class="input-box">
            <span class="details">Password</span>
             <input type="password"  placeholder="Enter your password" id="password" name="password" autocomplete="off" required  >
                    
		  <span id="passworderror" class="text-danger font-weight-bold"> </span>
        </div>
        <div class="input-box">
            <span class="details">Confirm password</span> 
<input type="password"  placeholder="Confirm your password" id="cnfpass"   autocomplete="off"  required>
			<span id="cpassworderror" class="text-danger font-weight-bold"> </span>
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