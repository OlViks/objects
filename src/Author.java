public class Author {
    static String firstName;
    String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

