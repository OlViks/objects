public class Objects {
    public static void main(String[] args) {
        System.out.println("Объекты и классы!");
        System.out.println();

        Author schildt = new Author("Schildt", "Herbert");
        System.out.println("First name: " + schildt.getFirstName());
        System.out.println("Last name: " + schildt.getLastName());
        System.out.println();

        Author joanne = new Author("Joanne", "Rowling");
        System.out.println("First name: " + joanne.getFirstName());
        System.out.println("Last name: " + joanne.getLastName());
        System.out.println();

        Book java_8 = new Book("Java 8 ", schildt, 2014);
        java_8.setPublicationYear(2015);
        System.out.println("Название: " + java_8.getTitle() + "\nАвтор: " + java_8.getAuthor().getFullName()
                + "\nДата: " + java_8.getPublicationYear());
        System.out.println();
        Book harryPotter = new Book("Harry Potter ", joanne, 2001);
        System.out.println("Название: " + harryPotter.getTitle() + "\nАвтор: " + harryPotter.getAuthor().getFullName()
                + "\nДата: " + harryPotter.getPublicationYear());
        System.out.println();

        System.out.println(harryPotter);
        System.out.println();
        System.out.println(joanne);
        System.out.println();
        Author schildt2 = new Author("Schildt", "Herbert");
        Author schildt3 = new Author("Schi", "Herbert");
        System.out.println(schildt.equals(schildt2));
        System.out.println(schildt.equals(schildt3));

    }
}