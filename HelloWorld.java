/**
 * This class implements HWInterface
 */
public class HelloWorld implements HWInterface {
    /**
     * This function prints hello world when called
     */
    public void printHelloWorld() {
        System.out.print("Hello World!");
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.printHelloWorld();
    }
}
