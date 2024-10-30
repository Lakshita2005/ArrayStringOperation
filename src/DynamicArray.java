import java.util.Arrays;

public class DynamicArray {
    private int[] array;
    private int count; // Tracks the number of elements in the array

    // Constructor to initialize the dynamic array with an initial capacity
    public DynamicArray() {
        this.array = new int[2];
        this.count = 0;
    }

    // Method to insert an element at the end of the array
    public void insert(int value) {
        // If array is full, double its size
        if (count == array.length) {
            resize();
        }
        array[count++] = value;
    }

    // Method to delete an element at a specified index
    public void delete(int index) {
        if (index >= 0 && index < count) {
            // Shift elements to fill the gap at the deleted index
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1];
            }
            array[count - 1] = 0; // Reset the last element
            count--;
        } else {
            System.out.println("Deletion failed: Invalid index.");
        }
    }

    // Method to resize the array when it reaches full capacity
    private void resize() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    // Method to traverse and print the elements of the array
    public void traverse() {
        System.out.print("DynamicArray elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
