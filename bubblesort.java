import java.util.Scanner;
public class bubblesort { 
    public static void main(String[] args)
     { Scanner sr=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sr.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
          for(int i=0; i < n; i++)
         arr[i]=sr.nextInt();
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++)
        {  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++)
        {  
                System.out.print(arr[i] + " ");  
        }  
}  

        static void bubbleSort(int[] arr) 
        {  
            int n = arr.length;  
            int temp = 0;  
             for(int i=0; i < n; i++)
             {  
                     for(int j=1; j < (n-i); j++)
                     {  
                              if(arr[j-1] > arr[j])
                              {  
                                     //swap elements  
                                     temp = arr[j-1];  
                                     arr[j-1] = arr[j];  
                                     arr[j] = temp;  
                             }     
                     }  
             }  
        }  
    }  