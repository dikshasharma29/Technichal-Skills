//Given an array count num of elements having atleast 1 element greater than itself
// ex: [5, 7, 2, -1, 8, 0, 12], ans: 6
// Observation: For every max element there won't be any element greater than itself 
import java.util.*;
public class NoGtThanItself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");       
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != max){
                count++;
            }
        }
        System.out.println(count);
        

 
 
    }
}   
