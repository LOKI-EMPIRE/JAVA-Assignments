class Car{
    constructor(name,model,year,specs){
        this.name = name;
        this.model = model;
        this.year = year;
        this.specs = specs;
    }

    getCarInfo =  function(){
        return "Name: "+this.name+", Model: "+this.model+", Year: "+this.year+", Specs: "+this.specs;
    }
}

cars = [];

c1 = new Car("Benz","XS",2020,"Top");
cars.push(c1);

c2 = new Car("Audi","AX",2021,"Top");
cars.push(c2);

cars.forEach(c => console.log(c.getCarInfo()));

module.exports = Car;
