
public class Main {
    public static void main(String[] args) {
        Author john = new Author("john", "London");
        Book martinEden = new Book("Martin Eden", 1908, john);

//        Object for test method equals
        Book martinEden1 = new Book("Martin Eden", 1908, john);

        System.out.println("martinEden.getAuthor() = " + martinEden.getAuthor());
        System.out.println("Martin Eden " + martinEden.getPublicationYear());

//        martinEden.setPublicationYear(1909);
        System.out.println("Martin Eden " +martinEden.getPublicationYear());

        Author daniel = new Author("Daniel","Keyes");
        Book flowersForAlgernon = new Book("Flowers for Algernon", 1959, daniel);


        System.out.println(flowersForAlgernon);
//      Method equals
        System.out.println(daniel.equals(john));
        System.out.println(martinEden.equals(martinEden1));
//      Method hashCode
        System.out.println(daniel.hashCode());
        System.out.println(martinEden.hashCode());
        System.out.println(flowersForAlgernon.hashCode());

    }
}