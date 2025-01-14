public class Book implements Packable{

    private String author;
    private String nameOfBook;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.nameOfBook = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return author +": "+ nameOfBook;
    }

    @Override
    public double weight() {
        return weight;


    }
}
