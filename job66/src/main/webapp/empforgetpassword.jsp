<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<meta charset="utf-8">
   <title>ForgetPassword</title>

    <link rel="stylesheet" href="./css/log.css" >
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	 <script type="text/javascript" src="./js/register1.js" >
</script>
</head>
<body>
<div class="wrapper">
      <div class="title">
ForgetPassword</div>

 
<form action="empforgetpasswordservlet" method="post">
        <div class="field">
          <input type="text" name="uname" required>
          <label>Email Address</label>
        </div>
<div class="field">
          <input type="password"  id="pass" name="password" required>
          <label>Password</label>
           <span  class="p-viewer">
			<i class="fa fa-eye"  onclick="myFunction2()"  ></i>
			</span>
        </div>
<div class="field">
          <input type="password"  id="cnfpass" name="password" required>
          <label>ConfirmPassword</label>
           <span  class="p-viewer">
			<i class="fa fa-eye"  onclick="myFunction2()"  ></i>
			</span>
        </div>
        <br>
         <span style="color:red;"> ${error }</span><br/>
<div class="field">
		          
       
          <input type="submit" value="submit">
        </div>

</form>
</div>
<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" ></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>