function userMethod(){
    let name:string = (<HTMLInputElement> document.getElementById("nameInput")).value;
    let age:number = parseInt((<HTMLInputElement> document.getElementById("ageInput")).value);
    let hobbies:string = (<HTMLInputElement> document.getElementById("arrayInput")).value;
    let isStudent:boolean = JSON.parse((<HTMLSelectElement> document.getElementById("isStudentSelect")).value);

    let array:string[] = hobbies.split(",");
    for(let i=0; i<array.length; i++){
        array[i] = array[i].trim();
    }
    
    document.getElementById("ln1").innerHTML="Name: "+name+", Type: "+typeof name;
    document.getElementById("ln2").innerHTML="Age: "+age+", Type: "+typeof age;
    document.getElementById("ln3").innerHTML="Hobbies: "+array+", Type: "+typeof array;
    document.getElementById("ln4").innerHTML="Student: "+isStudent+", Type: "+typeof isStudent;
}
