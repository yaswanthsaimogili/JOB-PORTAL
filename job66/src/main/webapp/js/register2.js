 function validation()
	{
	
	var fname=document.getElementById('companyname').value;
	 var email=document.getElementById('email').value;
	 var repemail=document.getElementById('repemail').value;
    var number=document.getElementById('phoneno').value;
    var password1=document.getElementById('password').value;
    var cpassword=document.getElementById('cnfpass').value;
	 var name=/^[a-zA-Z][a-zA-Z]+$/;
    var emailcheck= /^([a-zA-Z0-9\.-]+)@([a-zA-Z0-9]+).([a-zA-Z]{2,8})(.[a-zA-Z]{2,8})?$/;
    var phonecheck=/^[0-9]{10}$/;
	if(name.test(fname))
	{
	  document.getElementById('companyname').style.border="";
	  document.getElementById('companynameerror').innerHTML=" ";
    }
    else
    {
	  document.getElementById('companyname').style.border="3px solid red";
	  document.getElementById('companynameerror').style.color="red";
      document.getElementById('companynameerror').innerHTML="** Companyname is Invalid ";
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
    if(emailcheck.test(repemail))
	{
	  document.getElementById('repemail').style.border="";
      document.getElementById('repemailerror').innerHTML=" ";
    }
    else
    {
	  document.getElementById('repemail').style.border="3px solid red";
	  document.getElementById('repemailerror').style.color="red";
      document.getElementById('repemailerror').innerHTML="** Email is Invalid ";
      return false;
    }

    if(phonecheck.test(number))
	{
	  document.getElementById('phoneno').style.border="";
      document.getElementById('phonenoerror').innerHTML=" ";
    }
	else
    {
	  document.getElementById('phoneno').style.border="3px solid red";
	  document.getElementById('phonenoerror').style.color="red";
      document.getElementById('phonenoerror').innerHTML="** Phone no is Invalid ";
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
