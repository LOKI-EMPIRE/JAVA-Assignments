function validateLogin(){
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    if(username==="" || password===""){
        document.getElementById("result").innerHTML="Please enter both username and password.";
        return;
    }

    if(username.length<=6){
        document.getElementById("result").innerHTML="Username must be more than 6 characters.";
        return;
    }

    let upper = /[A-Z]+/.test(password);
    let lower = /[a-z]+/.test(password);
    let number = /[0-9]+/.test(password);
    let special = /[@!#$]+/.test(password);

    if(upper && lower && number && special){
        document.getElementById("result").innerHTML="Login successful.";
    }else{
        document.getElementById("result").innerHTML="Invalid password.";
    }
}
