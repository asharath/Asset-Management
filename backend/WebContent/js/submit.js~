function submitfunc()
{
  var x=document.forms["myForm"]["userName"].value;
  var y=document.forms["myForm"]["userPassword"].value;
  if(x==null ||x=="" ||y==null ||y=="")
  {
    alert("Both fields cannot be emplty.");
  }
  else {
    if (x=="admin" && y== "admin")
    {
      alert("You are now logged in! Redirecting to the Admin page");
        window.location = "admin2.html";
    }
    else {
      alert("Username or password is incorrect");
    }
  }
}
