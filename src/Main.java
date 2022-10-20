import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        while(size <= 0) {
            System.out.println("Array size cannot be less than or equal to 0");
            System.out.println("Enter the size of the array: ");
            size = in.nextInt();
        }
        int[] arr = new int[size];
        int max = arr[0], min = arr[0], nMax = 0, nMin = 0;

        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 1; i < arr.length; i++) { //here we are looking for the index and value of the first maximum element
            if (arr[i] > arr[nMax]) {
                max = arr[i];
                nMax = i;
            }
        }

        for (int i = 0; i < arr.length; i++) { //and here we are looking for the remaining maximum elements
            if (arr[i] == arr[nMax]) {
                System.out.println("Maximum element in array: " + arr[i]);
            }
        }

        for (int i = 1; i < arr.length; i++) { //here we are looking for the index and value of the first minimum element
            if (arr[i] < arr[nMin]) {
                min = arr[i];
                nMin = i;
            }
        }

        for (int i = 0; i < arr.length; i++) { //and here we are looking for the remaining minimal elements
            if (arr[i] == arr[nMin]) {
                System.out.println("Minimum element in array:: " + arr[i]);
            }
        }

        int temp = arr[nMin]; //rearrange the elements
        arr[nMin] = arr[nMax];
        arr[nMax] = temp;

        for (int i = 0; i < arr.length; i++) { //result
            System.out.println(arr[i]);
        }
    }
}