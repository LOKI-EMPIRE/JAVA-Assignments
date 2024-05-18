class Movie{
    constructor(title,director,year,genre){
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.isPlaying = false;
    }
}

Movie.prototype.play = function(){
    return this.isPlaying = true;
}

Movie.prototype.stop = function(){
    return this.isPlaying = false;
}

movies = [];
m1 = new Movie("Loki","Lokeshwar",2002,"Action");
m2 = new Movie("Sekar","ChandraSekar",2001,"Chapri");
movies.push(m1);
movies.push(m2);
m1.play();
m2.stop();

console.log(movies);

module.exports = Movie;
