import java.util.Objects;

public class Kitob {
    private String name;
    private String author;

    Kitob(String name, String author){
        this.author = author;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kitoblar{" +
                "Avtor =' " + author + '\'' +
                ", Kitob nomi = '" + name + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // If the same object, return true
        if (obj == null || getClass() != obj.getClass()) return false; // If not the same class, return false
        Kitob kitob = (Kitob) obj;
        return name.equals(kitob.name) && author.equals(kitob.author); // Compare by name and author
    }
}
