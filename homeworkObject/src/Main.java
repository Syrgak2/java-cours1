public class Main {
    public static void main(String[] args) {
        Author john = new Author("John London");
        Book martinEden = new Book("Martin Eden", 1908, john);

        System.out.println("martinEden.getAuthor() = " + martinEden.getAuthor());
        System.out.println("Martin Eden " + martinEden.getPublicationYear());

        martinEden.setPublicationYear(1909);
        System.out.println("Martin Eden " +martinEden.getPublicationYear());

        Author daniel = new Author("Daniel Keyes");
        Book flowersForAlgernon = new Book("Flowers for Algernon", 1959, daniel);
    }
}