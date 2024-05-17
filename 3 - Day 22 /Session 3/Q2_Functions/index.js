class Student{
    constructor(name,rollNo,department){
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
 
        this.getStudentInfo = function(){
            return "Name: "+this.name+", Roll No: "+this.rollNo+", Department: "+this.department;
        }
    }
}
 
studentList = [];
 
function createStudent(name,rollNo,department){
    return new Student(name,rollNo,department);
}
 
function addStudent(name,rollNo,department){
    studentList.push(createStudent(name,rollNo,department));
}
 
function displayStudentsList(){
    studentList.forEach(s => console.log(s.getStudentInfo()));
}
 
function calculateTotalStudents(){
  return studentList.length;
}
 
module.exports = {Student,addStudent,displayStudentsList,calculateTotalStudents,createStudent,studentList};
