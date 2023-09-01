import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args){
        //declaration and instantiation
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n Enter number of Integer elements to be sorted: ");
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        //populate the array
        for(int i = 0; i <= (n - 1); i++){
            System.out.printf("\n\n Enter integer value for element no.%d : ",i+1);
            arr[i] = sc.nextInt();
        }

        bubble(arr,n);
        System.out.println("\n\nFinally sorted array is: ");
        printArray(arr,n);
    }

    private static void bubble(int arr[], int n){

        int temp;
        for(int i = n - 2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                //bubbleSort swap 
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[], int n){

        System.out.printf("[");
        for(int i = 0; i < n; i++){
            System.out.printf("%d",arr[i]);
            if(i < n - 1)
                System.out.printf(",");
        }
        System.out.println("]");
    }
}

