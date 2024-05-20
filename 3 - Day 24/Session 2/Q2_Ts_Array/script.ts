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
    let maximum = arr1.reduce((max, num) => (num > max ? num : max),arr1[0]);
    //let maximum = Math.max(...arr1);
    let minimum = arr1.reduce((min,num) => (num < min ? num : min),arr1[0]);
    //let minimum = Math.min(...arr1);
    let sum = arr1.reduce((sum,num) => sum+num,0);
    
    document.getElementById("maximumNo").innerHTML="Maximum number: "+maximum;
    document.getElementById("minimumNo").innerHTML="Minimum number: "+minimum;
    document.getElementById("sumOfAllNumbers").innerHTML="Sum of all numbers: "+sum;
}
