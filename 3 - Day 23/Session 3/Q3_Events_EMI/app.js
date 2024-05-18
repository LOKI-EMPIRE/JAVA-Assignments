function calculateEMI(){
    let loanAmount = parseInt(document.getElementById("loanAmount").value);
    let interestRate = parseInt(document.getElementById("interestRate").value);
    let loanTerm = parseInt(document.getElementById("loanTerm").value);

    let loancheck = /[0-9]+/.test(loanAmount);
    let interestcheck = /[0-9]+/.test(interestRate);
    let Termcheck = /[0-9]+/.test(loanTerm);

    str = "";
    if(!(loancheck && interestcheck && Termcheck)){
        str = "Please enter valid values";
    }else if(loanAmount>10000000){
        str = "Invalid loan amount. Maximum allowed: Rs. 1 Crore";
    }else if(interestRate>40){
        str = "Invalid interest rate. Maximum allowed: 40%";
    }else if(loanTerm>120){
        str = "Invalid loan term. Maximum allowed: 120 months";
    }else{
        mir = interestRate / 100 / 12;
        emi = (loanAmount * mir * Math.pow(1+mir,loanTerm)) / (Math.pow(1+mir,loanTerm)-1);
        emi = emi.toFixed(2);
        str = "EMI: Rs. "+emi;
    }

    document.getElementById("result").innerHTML=str;
}
