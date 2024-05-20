function wordCount(){
    let data = (<HTMLInputElement>document.getElementById("wordInput")).value;
    if(!data){
        document.getElementById("ln1").innerHTML="Please enter a sentence!";
        return;
    }

    let counter = 0;
    for(let i=0;i<data.length;i++){
        if(data[i] != " "){
            counter++;
        }
    }
    let firstL = data[0];
    let lastL = data[data.length-1];

    document.getElementById("ln1").innerHTML="Original: "+data;
    document.getElementById("ln2").innerHTML="Word Length (Exculding Spaces): "+counter;
    document.getElementById("ln3").innerHTML="First Character: "+firstL;
    document.getElementById("ln4").innerHTML="Last Character: "+lastL;
}
