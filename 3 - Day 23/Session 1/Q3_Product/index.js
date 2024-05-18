class Product{
    constructor(name,price,quantityInStock){
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }
}

Product.prototype.buy = function(quantity){
    if(this.quantityInStock >= quantity){
        this.quantityInStock -= quantity;
    }else{
        console.log("Insufficient stock");
    }
}

Product.prototype.restock = function(quantity){
    this.quantityInStock += quantity;
}

product = [];
p1 = new Product("HideAndSeek",30,10);
p1.buy(5);
p2 = new Product("GoodDay",30,5);
p2.restock(5);
product.push(p1);
product.push(p2);

console.log(product);

module.exports = Product ;
