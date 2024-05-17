function checkNumberSign(number){
    if(number>0){
        return "The number is positive.";
    }else if(number<0){
        return "The number is negative.";
    }else{
        return "The number is zero.";
    }
}
 
function countDownFromTen(){
    for(let i=10; i>=1; i--){
        console.log(i);
    }
}
 
module.exports = {checkNumberSign , countDownFromTen};
