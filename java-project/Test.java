import java.util.Properties;

class Test {
    public static void printProperties() {
        System.out.println("Printing system properties using docker!!!");
        Properties props = System.getProperties();
        System.out.println(props);
    }

    public static void main(String args[]) {
        System.out.println("Java Program started!!");
        System.out.println("Hi Developer!!!!");
        printProperties();
    }
}