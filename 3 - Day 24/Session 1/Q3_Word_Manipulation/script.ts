function word(){
    let word = (<HTMLInputElement>document.getElementById("sentenceInput")).value;

    if(word.length === 0){
        document.getElementById("ln1").innerHTML="Please enter a sentence!";
        return;
    }

    document.getElementById("ln1").innerHTML="Original: "+word;
    document.getElementById("ln2").innerHTML="Uppercase: "+word.toUpperCase();
    document.getElementById("ln3").innerHTML="Lowercase: "+word.toLowerCase();
    document.getElementById("ln4").innerHTML="Reversed: "+word.split('').reverse().join('');
}
