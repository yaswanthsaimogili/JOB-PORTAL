    function validation()
	{
	
	var fname=document.getElementById('fname').value;
	var lname=document.getElementById('lname').value;
    var username=document.getElementById('username').value;
    var email=document.getElementById('email').value;
    var number=document.getElementById('phoneno').value;
    var password1=document.getElementById('password').value;
    var cpassword=document.getElementById('cnfpass').value;
    var name=/^[a-zA-Z][a-zA-Z]+$/;
    var usercheck= /^[A-Za-z]{3,30}[0-9]{1}$/;
    var emailcheck= /^([a-zA-Z0-9\.-]+)@([a-zA-Z0-9]+).([a-zA-Z]{2,8})(.[a-zA-Z]{2,8})?$/;
    var phonecheck=/^[0-9]{10}$/;
	if(name.test(fname))
	{
	  document.getElementById('fname').style.border="";
	  document.getElementById('fnameerror').innerHTML=" ";
    }
    else
    {
	  document.getElementById('fname').style.border="3px solid red";
	  document.getElementById('fnameerror').style.color="red";
      document.getElementById('fnameerror').innerHTML="** Firstname is Invalid ";
      return false;
    }
	if(name.test(lname))
	{
	  document.getElementById('lname').style.border="";
      document.getElementById('lnameerror').innerHTML=" ";
    }
    else
    {
	  document.getElementById('lname').style.border="3px solid red";
	  document.getElementById('lnameerror').style.color="red";
      document.getElementById('lnameerror').innerHTML="** Lastname is Invalid ";
      return false;
    }
    if(usercheck.test(username))
	{
	  document.getElementById('username').style.border="";
      document.getElementById('usererror').innerHTML=" ";
    }
    else
    {
	  document.getElementById('username').style.border="3px solid red";
	  document.getElementById('usererror').style.color="red";
      document.getElementById('usererror').innerHTML="** Username is Invalid ";
      return false;
    }
	if(password1.match(/[a-z]/g) && password1.match(/[A-Z]/g) && password1.match(/[0-9]/g) && password1.match(/[^a-zA-Z\d]/g) && password1.length >= 8)
	{
      document.getElementById('password').style.border="";
	  document.getElementById('passworderror').innerHTML=" ";
    }
    else
    {
      document.getElementById('password').style.border="3px solid red";
	  document.getElementById('passworderror').style.color="red";
      document.getElementById('passworderror').innerHTML="**password must contain atleast 1 uppercase,digit,lowercase,symbol length atleast 8.";;
      return false;
    }
    if(password1.match(cpassword))
	{
	  document.getElementById('cnfpass').style.border="";
      document.getElementById('cpassworderror').innerHTML=" ";
    }
    else
    {
	  document.getElementById('cnfpass').style.border="3px solid red";
	  document.getElementById('cpassworderror').style.color="red";
      document.getElementById('cpassworderror').innerHTML="** Password is not Matching ";
      return false;
    }
    if(emailcheck.test(email))
	{
	  document.getElementById('email').style.border="";
      document.getElementById('emailerror').innerHTML=" ";
    }
    else
    {
	  document.getElementById('email').style.border="3px solid red";
	  document.getElementById('emailerror').style.color="red";
      document.getElementById('emailerror').innerHTML="** Email is Invalid ";
      return false;
    }
    if(phonecheck.test(number))
	{
	  document.getElementById('phoneno').style.border="";
      document.getElementById('phoneeerror').innerHTML=" ";
    }
	else
    {
	  document.getElementById('phoneno').style.border="3px solid red";
	  document.getElementById('phoneerror').style.color="red";
      document.getElementById('phoneerror').innerHTML="** Phone no is Invalid ";
      return false;
    }
	return true;
  }
  
  function myFunction() {
  var x = document.getElementById("password");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";-
	 this.classList.toggle('fa-eye-slash');
  }
}


function myFunction1() {
  var x = document.getElementById("cnfpass");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
	 this.classList.toggle('fa-eye-slash');
  }
}
function myFunction2() {
  var x = document.getElementById("pass");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";-
	 this.classList.toggle('fa-eye-slash');
  }
}



/*function checkPass()
{
    var password = document.getElementById('password');
    var confirm  = document.getElementById('cnfpass');
    var message = document.getElementById('confirm-message2');
    var good_color = "#66cc66";
    var bad_color  = "#ff6666";
    
    if(password.value == confirm.value){
        message.style.color   = good_color;
		message.innerHTML     = 'Passwords Match!';
        
    }else{
        message.style.color   = bad_color;
		message.innerHTML     = 'Passwords Dont Match!';
    }
}  


 function test_str() {
            var res;
            var str =document.getElementById("password").value;
			var message=document.getElementById("t2");
			var good_color = "#66cc66";
			var bad_color  = "#ff6666";
            if (str.match(/[a-z]/g) && str.match(/[A-Z]/g) && str.match(/[0-9]/g) && str.match(/[^a-zA-Z\d]/g) && str.length >= 8)
			{
                res = "**password accepted";
				message.style.color   = good_color;
				message.innerHTML     = res;
			}
            else
			{
                res = "**password must contain atleast 1 uppercase,digit,lowercase,symbol length atleast 8.";
				message.style.color   = bad_color;
				message.innerHTML     = res;
			}
   
        }
	
*/

 