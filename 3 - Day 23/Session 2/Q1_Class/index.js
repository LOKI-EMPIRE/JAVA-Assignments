class Book{
    constructor(title,author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
}


Book.prototype.checkoutBook = function(){
    if(this.isAvailable){
        this.isAvailable = false;
    }
}

Book.prototype.returnBook = function(){
    if(!this.isAvailable){
        this.isAvailable = true;
    }
}

book = [];
b1 = new Book("Loki Empire","Lokesh");
b1.checkoutBook();
book.push(b1);

b2 = new Book("Sekar","Chapri");
b2.checkoutBook();
b2.returnBook();
book.push(b2);

console.log(book);

module.exports = Book;
