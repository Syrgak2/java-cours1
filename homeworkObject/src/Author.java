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
}
