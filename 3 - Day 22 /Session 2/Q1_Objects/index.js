function Caculator(){
    this.add = function(num1, num2){
        return num1 + num2;
    }
    this.subtract = function(num1, num2){
        return num1 - num2;
    }
    this.multiply = function(num1, num2){
        return num1 * num2;
    }
    this.divide = function(num1, num2){
        if(num2 != 0){
            return num1 / num2;
        }else{
            return "Cannot divide by zero";
        }
    }
}
 
var c1 = new Caculator();
console.log(c1.add(2,5));
console.log(c1.subtract(7,9));
console.log(c1.multiply(4,3));
console.log(c1.divide(8,0));
 
module.exports = c1;
