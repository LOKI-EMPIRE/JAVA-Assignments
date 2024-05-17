class Employee{
    constructor(id,name,role){
        this.id = id;
        this.name = name;
        this.role = role;
 
        this.getEmployeeInfo = function(){
            return "ID: "+this.id+", Name: "+this.name+", Role: "+this.role;
        }
    }
}
 
employeeList = [];
function createEmployee(id,name,role){
    return new Employee(id,name,role);
}
 
function addEmployee(id,name,role){
    employeeList.push(createEmployee(id,name,role));
}
 
function displayEmployeesList(){
    employeeList.forEach(e => console.log(e.getEmployeeInfo()));
}
 
function calculateTotalEmployees(){
    return employeeList.length;
}
 
module.exports = {Employee,addEmployee,displayEmployeesList,calculateTotalEmployees,createEmployee,employeeList};
