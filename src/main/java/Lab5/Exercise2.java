package Lab5;
import java.util.List;
import java.util.ArrayList;
interface ToBeStored {
    double weight();
}

class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;


    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }


    @Override
    public double weight() {
        return weight;
    }
    public String toString() {
        return "Book - Writer: " + writer + ", Name: " + name + ", Weight: " + weight;
    }

}


class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private final double weight = 0.1;


    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }


    @Override
    public double weight() {
        return weight;
    }
    public String toString() {
        return "CD - Artist: " + artist + ", Title: " + title + ", Publishing Year: " + publishingYear + ", Weight: " + weight;
    }

}

class Box {
    private double maxWeight;
    private List<ToBeStored> things;
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void add(ToBeStored thing) {
        if (weight() + thing.weight() <= maxWeight) {
            things.add(thing);
        }
    }

    public double weight() {
        double totalWeight = 0;
        for (ToBeStored thing : things) {
            totalWeight += thing.weight();
        }
        return totalWeight;
    }
    public String toString() {
        return "Max Weight: " + maxWeight + ", Current Weight: " + weight() + ", Contents: " + things;
    }
}
class Exercise1 {
    public static void main(String[] args) {
        Book book1=new Book("Fedor Dostojevski","Crime and punishment",2);
        Book book2=new Book("Robert Martin","Clean Code",1);
        Book book3=new Book("Kent Beck","Test Driven Development",0.7);

        CD cd1=new CD("Pink Floyd","Dark Side Of the Moon",1973);
        CD cd2=new CD("White Buffalo","House Of the Rising Sun",2008);
        CD cd3=new CD("Shawn James","Losing my Religion - Cover",2015);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        Box box = new Box(5.0);
        box.add(new Book("Fedor Dostojevski","Crime and punishment",2));
        box.add(new Book("Robert Martin","Clean Code",1));
        box.add(new Book("Kent Beck","Test Driven Development",0.7));
        box.add(new CD("Pink Floyd","Dark Side Of the Moon",1973));
        box.add(new CD("White Buffalo","House Of the Rising Sun",2008));
        box.add(new CD("Shawn James","Losing my Religion - Cover",2015));

        System.out.println(box);
    }
}