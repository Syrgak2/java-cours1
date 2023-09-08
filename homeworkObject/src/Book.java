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

    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result += publicationYear;
        return result;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return false;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;
        return this.name.equals(book.name) && this.publicationYear == book.publicationYear &&
                this.author.equals(((Book) o).author);

    }

    public String toString() {
        return  "name: " + this.name + ", Publication Year: " + this.publicationYear + ", /n- " + this.author.toString();
    }
}
