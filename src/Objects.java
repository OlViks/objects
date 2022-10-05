public class Objects {
    public static void main(String[] args) {
        System.out.println("Объекты и классы!");
        System.out.println();

        Author schildt = new Author("Schildt", "Herbert");
        System.out.println("First name " + schildt.getFirstName());
        System.out.println("Last name " + schildt.getLastName());
        System.out.println();

        Book java_8 = new Book(Book.getName(), 2015);
        System.out.println("Author " + Book.getName());
        System.out.println("Publication year " + java_8.getYear());
        java_8.setYear(2016);
        System.out.println("Publication year  " + java_8.getYear());
        System.out.println();

        Author joanne = new Author("Joanne", "Rowling");
        System.out.println("First name " + joanne.getFirstName());
        System.out.println("Last name " + joanne.getLastName());
        System.out.println();


        Book harryPotter = new Book(Book.getName(), 2001);
        System.out.println("Author " + Book.getName());
        System.out.println("Publication year " + harryPotter.getYear());
        System.out.println();





    }
}