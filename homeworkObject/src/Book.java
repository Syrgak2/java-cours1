public class Book {
    private String name;
    private int publicationYear;
    private Author author;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.publicationYear = year;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public String getAuthor() {
        return this.author.getFullName();
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


}
