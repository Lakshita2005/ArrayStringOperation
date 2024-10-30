public class StaticArray {
    private int[] array;
    private int size;
    private int count; // Tracks the number of elements in the array

    // Constructor to initialize the static array with a fixed size
    public StaticArray(int size) {
        this.size = size;
        this.array = new int[size];
        this.count = 0;
    }

    // Method to insert an element at a specified index
    public void insert(int index, int value) {
        if (index >= 0 && index < size && count < size) {
            // Shift elements to make space at the given index
            for (int i = count; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            count++;
        } else {
            System.out.println("Insertion failed: Invalid index or array is full.");
        }
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

    // Method to traverse and print the elements of the array
    public void traverse() {
        System.out.print("StaticArray elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
