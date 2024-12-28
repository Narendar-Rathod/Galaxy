package dayOne;

public class Person {

    private String name;

    // Getter method for name
    public String getName() {
        if (name == null) {
            return "Name is not set!";
        }
        if (name.length() > 16) {
            return "Name is too large!";
        }
        return name;
    }

    // Setter method for name
    public void setName(String n) {
        if (n != null && n.length() > 2) { // Validates the input name
            name = n;
        } else {
            System.out.println("Name must be at least 3 characters long!");
        }
    }

    // Main method
    public static void main(String[] args) {
        Person p = new Person();

        // Try setting a valid name
        p.setName("Huviksh");
        System.out.println("Person's Name: " + p.getName());

        // Try setting an invalid name
        p.setName("Hu");
        System.out.println("Person's Name: " + p.getName());

        // Try a name that's too long
        p.setName("ThisNameIsTooLongToBeValid");
        System.out.println("Person's Name: " + p.getName());
    }
}

