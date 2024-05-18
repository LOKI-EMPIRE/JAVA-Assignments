function calculateBMI(){

    let weight = parseInt(document.getElementById("weight").value);
    let height = parseInt(document.getElementById("height").value);

    if(weight>640){
        document.getElementById("InvalidWeight").innerHTML="Invalid weight";
        return;
    }

    if(height>280){
        document.getElementById("InvalidHeight").innerHTML="Invalid height";
        return;
    }

    height = height/100;
    let bmi = weight / (height * height);
    bmi = bmi.toFixed(2);
    document.getElementById("result").innerHTML="BMI: "+bmi;
    str = "";
    if(bmi<18.5){
        str="Under Weight";
    }else if(bmi>=18.5 && bmi<=24.9){
        str="Healthy Weight";
    }else if(bmi>=25.0 && bmi<=29.9){
        str="Over Weight";
    }else{
        str="Obesity";
    }

    document.getElementById("weightStatus").innerHTML="Weight Status: "+str;

}
