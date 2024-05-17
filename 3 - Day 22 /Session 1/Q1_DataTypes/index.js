var name = "demo";
console.log(name);
 
var num1=10, num2=5;
var sum = num1 + num2;
console.log(sum);
 
var isStudent = true;
console.log(isStudent);
 
function calculateArea(radius){
    return Math.PI * radius * radius;
}
console.log(calculateArea(10));
 
module.exports = { calculateArea, sum, name, isStudent };
