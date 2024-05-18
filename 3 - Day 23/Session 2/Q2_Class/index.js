class Movie{
    constructor(title,director,year,genre){
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
    }
    getMovieInfo = function(){
        return "Title: "+this.title+", Director: "+this.director+", Year: "+this.year+", Genre: "+this.genre;
    }
}

movie = [];

m1 = new Movie("Loki Empire","Lokesh",2002,"Action");
movie.push(m1);

m2 = new Movie("Chapri","Sekar",2002,"Extreme Comedy");
movie.push(m2);

for(m of movie){
    console.log(m.getMovieInfo());
}

module.exports = Movie;
