function submitForm(){
    let name = (<HTMLInputElement>document.getElementById("name")).value;
    let email = (<HTMLInputElement>document.getElementById("email")).value;
    let phoneNumber = parseInt((<HTMLInputElement>document.getElementById("phoneNumber")).value);
    let event = (<HTMLInputElement>document.getElementById("event")).value;

    let obj:Attendee = new Attendee(name,email,phoneNumber,event);
    obj.validateData().then((s) => {
        document.getElementById("successMessage").innerHTML=""+s;
    }).catch((r) => {
        document.getElementById("errorMessage").innerHTML=""+r;
    });

}

class Attendee{
    constructor(public name:string, public email:string, public phoneNumber:number, public event:string){
    }

    validateData(){
        let pro = new Promise((resolve , reject) => {
            let emailexpr = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
            if(!this.name){
                reject("Name must not be empty.");
                return;
            }else if(!emailexpr.test(this.email)){
                reject("Email must be a valid email address.");
                return;
            }else if(!(this.phoneNumber.toString().length === 10)){
                reject("Phone number must be a 10-digit number.");
                return;
            }else if(this.event === "none"){
                reject("Event must be selected from the predefined list.");
                return;
            }
            resolve("Success! Registration is complete.");
        });
        return pro;
    }
}
