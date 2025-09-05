import java.util.*;
public class Task1 {
   public static void main(String[] args) {


/// Task 1a
       sqrt(new Scanner(System.in));
/// Task 1b
       System.out.println(UglyNo(new Scanner(System.in)));
/// Task 1c
       int [] arr = {1,2,3,4,5};
       System.out.println(Arrays.toString(prod(arr)));




   }


   //Task 1a
   public static void sqrt(Scanner sc) {
       System.out.println("Task 1a");
       System.out.println("Enter number to find sqrt : ");
       int n = sc.nextInt();
       System.out.println((int)(Math.sqrt(n)));
   }


   //Task 1b
   public static boolean UglyNo(Scanner sc) {
       System.out.println("Task 1b");
       System.out.println("Enter a number to find if its Ugly or not");


       int n = sc.nextInt();
       if (n <= 0) {
           return false;
       }
       int[] primes = {2, 3, 5};
       for (int i : primes) {
           while (n % i == 0) {
               n = n / i;
           }
       }


       if (n == 1) return true;


       return false;
   }
   //Task 1c
   public static int [] prod (int [] arr){
       System.out.println("task 1c");
       int [] res = new int [arr.length];


       for (int i = 0; i < res.length; i++) {
           int prod = 1;
           for (int j = 0; j < res.length; j++) {
               if (i != j)
                   prod *= arr[j];
           }
           res[i] = prod;
       }
       return res;
   }
}
