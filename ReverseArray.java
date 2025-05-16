import java.util.Scanner;

// ReverseArray (array) ---> array
class Helper{
    // Problem Solve
    int[] reverseArray(int[] arr){
        // Reverse
        int start=0,end=arr.length-1;
        while(start<end){
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++; end--;
        }
        // Return
        return  arr;
    }
}
  
// Driver Class
public class ReverseArray{
    public static void main(String[] args) {
        // Input
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      //Printing the array
      Helper hlp=new Helper();
      arr=hlp.reverseArray(arr);
      System.out.println("Reverse Array::");
      for(int val : arr){
        System.out.println(val+"");
      }
    }
}