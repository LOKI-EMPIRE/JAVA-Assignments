function submitForm(){
    let title:string = (<HTMLInputElement>document.getElementById("title")).value;
    let description:string = (<HTMLInputElement>document.getElementById("description")).value;
    let priority:string = (<HTMLInputElement>document.getElementById("priority")).value;
    let date:string = (<HTMLInputElement>document.getElementById("dueDate")).value;

    let obj = new Task(title,description,priority,date);
    obj.validateData().then((s) => {
        document.getElementById("successMessage").innerHTML=""+s;
    }).catch((r) => {
        document.getElementById("errorMessage").innerHTML=""+r;
    })
}

class Task{
    constructor(public title:string, public description:string, public priority:string, public date:string){
    }

    validateData(){
        let pro = new Promise((resolve,reject) => {
            if(!this.title){
                reject("Title must not be empty.");
                return;
            }else if(!this.description){
                reject("Description must not be empty.");
                return;
            }else if(this.priority === "none"){
                reject("Priority must be selected from the predefined list.");
                return;
            }else if(!this.date){
                reject("Due date must not be empty.");
                return;
            }
        resolve("Added the task successfully.");
        });
        return pro;
    }
}
