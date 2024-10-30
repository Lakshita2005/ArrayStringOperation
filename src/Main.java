public class Main {
    public static void main(String[] args) {
        // Testing StaticArray
        System.out.println("=== StaticArray Operations ===");
        StaticArray staticArray = new StaticArray(5);
        staticArray.insert(0, 10);
        staticArray.insert(1, 20);
        staticArray.insert(2, 30);
        staticArray.traverse();
        staticArray.delete(1);
        staticArray.traverse();

        // Testing DynamicArray
        System.out.println("\n=== DynamicArray Operations ===");
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.insert(40);
        dynamicArray.insert(50);
        dynamicArray.insert(80);
        dynamicArray.traverse();
        dynamicArray.delete(1);
        dynamicArray.traverse();

        // Testing StringOperations
        System.out.println("\n=== StringOperations ===");
        StringOperations stringOps = new StringOperations();
        System.out.println("Concatenation: " + stringOps.concatenate("Hello", "World"));
        System.out.println("Substring: " + stringOps.substring("HelloWorld", 0, 5));
        System.out.println("Comparison: " + stringOps.compare("Hello", "World"));
        System.out.println("Character Frequency: " + stringOps.characterFrequency("Hello there!"));
    }
}
