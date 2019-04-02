/**
 * 
 */

function res(){
var x=document.getElementById("register-form");
var y=document.getElementById("login-form");
document.getElementById("register-form-link").setAttribute('class','active');
document.getElementById("login-form-link").setAttribute('class',' ');
x.style.display="block";
y.style.display="none";
}
function login(){
var x=document.getElementById("login-form");
var y=document.getElementById("register-form");
document.getElementById("login-form-link").setAttribute('class','active');
document.getElementById("register-form-link").setAttribute('class',' ');
x.style.display="block";
y.style.display="none";
}