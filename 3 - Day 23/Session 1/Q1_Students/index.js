class Student{
    constructor(name,age){
        this.name = name;
        this.age = age;
        this.grades = [];
    }
}
Student.prototype.addGrade = function(grade){
    this.grades.push(grade);
}
Student.prototype.getAverageGrade = function(){
    var total = 0;
    this.grades.forEach(grd => total += grd);
    return total/this.grades.length;
}

student = [];
s1 = new Student("Loki",21);
s1.addGrade(90);
s1.addGrade(92);
student.push(s1);

console.log(student);
console.log(s1.getAverageGrade());

module.exports = Student;
