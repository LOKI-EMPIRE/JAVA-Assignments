var fruits = ["apple","banana","orange","grape","watermelon"];
 
function addFruit(fruit){
    fruits.push(fruit);
}
 
function removeFruit(fruit){
    let x = fruits.indexOf(fruit);
    fruits.splice(x,1);
}
 
addFruit("Mango");
removeFruit("orange");
console.log(fruits);
 
module.exports = {addFruit,removeFruit,fruits};
