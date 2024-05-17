function shoppingList(){
    this.groceries = [];
    this.totalPrice = 0;
 
    this.addItem = function(item, price){
        this.groceries.push({item:item , price:price});
    }
 
    this.calculateTotalPrice = function(){
        this.totalPrice = this.groceries.reduce((sum,g) => sum+g.price, 0);
        return this.totalPrice;
       
        /*for(x of this.groceries){
            this.totalPrice += x.price;
        }
        return this.totalPrice;*/
 
        /*this.groceries.forEach(g => this.totalPrice += g.price);
        return this.totalPrice;*/
    }
}
 
    let shop = new shoppingList();
    shop.addItem("HideAndSeek",30);
    shop.addItem("DarkFantasy",40);
   
    console.log(shop.calculateTotalPrice());
 
    module.exports = shop;
