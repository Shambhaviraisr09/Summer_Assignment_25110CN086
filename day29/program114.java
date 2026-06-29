import java.util.Scanner;

public class program114 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[] arr = new int[10];
        int size = 0;
        int choice;

        do {
            System.out.println("\t \t \t <<< Menu Driven Array Operations >>>");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Array");
            System.out.println("3. Find Maximum");
            System.out.println("4. Find Minimum");
            System.out.println("5. Search Element");
            System.out.println("6. Sort Array");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scnr.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("How many elements? ");
                    size = scnr.nextInt();

                    if (size > arr.length) {
                        System.out.println("Maximum size is 10.");
                        size = 0;
                        break;
                    }

                    for (int i = 0; i < size; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        arr[i] = scnr.nextInt();
                    }
                    break;

                case 2:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Array Elements: ");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        int max = arr[0];
                        for (int i = 1; i < size; i++) {
                            if (arr[i] > max)
                                max = arr[i];
                        }
                        System.out.println("Maximum Element: " + max);
                    }
                    break;

                case 4:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        int min = arr[0];
                        for (int i = 1; i < size; i++) {
                            if (arr[i] < min)
                                min = arr[i];
                        }
                        System.out.println("Minimum Element: " + min);
                    }
                    break;

                case 5:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Enter element to search: ");
                        int key = scnr.nextInt();
                        boolean found = false;

                        for (int i = 0; i < size; i++) {
                            if (arr[i] == key) {
                                System.out.println("Element found at index " + i);
                                found = true;
                                break;
                            }
                        }

                        if (!found)
                            System.out.println("Element not found.");
                    }
                    break;

                case 6:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        for (int i = 0; i < size - 1; i++) {
                            for (int j = i + 1; j < size; j++) {
                                if (arr[i] > arr[j]) {
                                    int temp = arr[i];
                                    arr[i] = arr[j];
                                    arr[j] = temp;
                                }
                            }
                        }
                        System.out.println("Array sorted successfully.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting Array Operations System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        scnr.close();
    }
}
