function calculate(){
    let num1 = parseInt((<HTMLInputElement>document.getElementById("num1")).value);
    let num2 = parseInt((<HTMLInputElement>document.getElementById("num2")).value);
    let num3 = parseInt((<HTMLInputElement>document.getElementById("num3")).value);
    let num4 = parseInt((<HTMLInputElement>document.getElementById("num4")).value);
    let num5 = parseInt((<HTMLInputElement>document.getElementById("num5")).value);

    if(isNaN(num1) || isNaN(num2)  || isNaN(num3) || isNaN(num4) || isNaN(num5)){
        document.getElementById("errorMessage").innerHTML="Enter all the numbers";
        return;
    }

    let arr1 : number[] = [num1, num2, num3, num4, num5];
    let sumOfEven = arr1.filter((x) => x%2==0).reduce((sum,num) => sum+num);
    let greaterThan5 = arr1.filter((x) => x>5);
    let strgreaterThan5 = greaterThan5.join(",");

    document.getElementById("sumOfEven").innerHTML="Sum of even numbers: "+sumOfEven;
    document.getElementById("numbersGreaterThan5").innerHTML="Number greater than 5: "+strgreaterThan5;

}
