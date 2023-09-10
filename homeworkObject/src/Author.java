public class Author {
    private String name;
    private String surname;

    private String fullName;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFullName() {
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        surname = surname.substring(0,1).toUpperCase() + surname.substring(1);
        return this.fullName = name + " " + surname;
    }

//  Нашел такое решение в других источниках
//  Можете дать оценку, хорошее решение или нет?
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result += surname == null ? 0 : surname.hashCode();
        return result;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        };
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return this.name.equals(author.name) && this.surname.equals(author.surname);
    }

    public String toString() {
        return "author's name: " + this.name + ", author's surname: " + this.surname;

    }
}
