import java.util.Arrays;
public class Task2 {
   public static void main(String[] args) {
       int [] arr = {1,2,3,4,6,8,9};
       int [] res = findPair(arr, 10);
       System.out.println(arr[res[0]] + " " + arr[res[1]]);
//task 2a

       int [][] arrr = {
               {1,3},
               {5,6},
               {7,9}
       };
       int [][] arrr2 = {
               {2,5},
               {7,8}
       };


       intersection(arrr, arrr2);

//task 2b
        int [] arr = {-4, -1, -1, 0 , 1, 2};
        System.out.println(threeSum(arr));  
 
//Task 2c

       int [] arr1 = {1,3,5,6,7};
       int [] arr2 = {1,3,5,8,12,65};

       System.out.println(Arrays.toString(merge(arr1, arr2)));
   }

public static void intersection (int [][] arr, int [][] arr2){
       int i = 0, j = 0;
       while (i < arr.length && j < arr2.length) {
           int s = Math.max(arr[i][0], arr2[j][0]);
           int e = Math.min(arr[i][1], arr2[j][1]);
           if(s <= e)
               System.out.println("[" + s + " ," + e + "]");
           if(arr[i][1] < arr2[j][1])
               I++;  j++;}  }}
   public static int [] merge (int [] arr1, int [] arr2) {
       int i = 0, j = 0, ptr = 0;
       int [] res = new int[arr1.length + arr2.length];
       while (i < arr1.length && j < arr2.length) {
           if(arr1[i] < arr2[j])
               res[ptr++] = arr1[i++];
           else
               res[ptr++] = arr2[j++];
       }
       while (i < arr1.length) {
           res[ptr++] = arr1[i++];
       }
       while (j < arr2.length) {
           res[ptr++] = arr2[j++];
       }
       return res;
   }   


   public static List<List<Integer>> threeSum (int [] arr){
        List<List<Integer>> outer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int j = i + 1;
            int k = arr.length - 1;

                if(i > 0 && arr[i - 1] == arr[i]) continue;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    List<Integer> inner = new ArrayList<>();
                    inner.add(arr[i]);
                    inner.add(arr[j]);
                    inner.add(arr[k]);

                    outer.add(inner);
                    j++;
                    while(j < k && arr[j] == arr[j - 1]) j++;
                }
                else if(sum > 0) k--;
                else j++;
            }
        }
        return outer;
     }
}
