import java.util.Scanner;
public class bubblesort {
        public static void main(String[] args) {
                Scanner sr = new Scanner(System.in);
                System.out.println("enter size of array");
                int a = sr.nextInt();
                int arr[] = new int[a];
                System.out.println("enter array elements");
                for (int i = 0; i < a; i++)
                arr[i] = sr.nextInt();
                int n = arr.length;
                int temp = 0;
                for (int i = 0; i < n; i++) {
                        for (int j = 1; j < (n - i); j++) {
                                if (arr[j - 1] > arr[j]) {
                                        temp = arr[j - 1];
                                        arr[j - 1] = arr[j];
                                        arr[j] = temp;
                                }
                        }
                }
                System.out.println("Array After Bubble Sort");
                for (int i = 0; i < arr.length; i++)
                        System.out.print(arr[i] + " ");
        }
}
