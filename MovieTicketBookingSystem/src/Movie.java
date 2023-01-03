

public class Movie {

    private String name;
    private double lengthinhours;

    private String genre;

    public Movie(String name, double lengthinhours, String genre){
        this.name=name;
        this.lengthinhours=lengthinhours;

        this.genre=genre;

    }


    public String getName() {
        return name;
    }



    public double getLengthinhours() {
        return lengthinhours;
    }



    public String getGenre() {
        return genre;
    }


}
