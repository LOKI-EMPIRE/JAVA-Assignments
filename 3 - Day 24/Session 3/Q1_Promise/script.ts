function submitForm() {
    let name = (<HTMLInputElement>document.getElementById("name")).value;
    let email = (<HTMLInputElement>document.getElementById("email")).value;
    let password = (<HTMLInputElement>document.getElementById("password")).value;
    let country = (<HTMLInputElement>document.getElementById("country")).value;

    let ob: User = new User(name, email, password, country);
    ob.validateData().then((s) => {
        document.getElementById("successMessage").innerHTML = "" + s;
    }).catch((r) => {
        document.getElementById("errorMessage").innerHTML = "" + r;
    });
}

class User {
    constructor(public name: string, public email: string, public password: string, public country: string) {
    }

    validateData() {
        let pro = new Promise((resolve, reject) => {
            let emailexpr = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
            if (!this.name) {
                reject("Name must not be empty.");
                return;
            } else if (!emailexpr.test(this.email)) {
                reject("Email must be a valid email address.");
                return;
            } else if (this.password.length < 8) {
                reject("Password must be at least 8 characters long.");
                return;
            } else if (this.country === "none") {
                reject("Country must be selected from the predefined list.");
                return;
            }
            resolve("Success! Registration is complete.");
        });
        return pro;
    }
}
