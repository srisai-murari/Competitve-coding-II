public class task3 {
   public static void main(String[] args) {
       //task 3a
       pattern(5);
       //task 3b
       palindrome("1221");
       //task 3c
       password("Th!i1sisapass");
      
   }


   private static void pattern (int n){
       System.out.println("Task 3a");
       for (int i = 1; i <= n; i++) {
           for (int j = i; j > 0; j--) {
               System.out.print(j + " ");
           }
           System.out.println();


       }
   }


   private static void palindrome (String s){
       System.out.println("Task 3b");


       int i = 0, n = s.length();


       while (i++ < n / 2) {
           if(s.charAt(i) != s.charAt(s.length() - i - 1)){
               System.out.println(s + " Not a palindrome");
               return;
           }
       }
       System.out.println(s + " is a palindrome");
   }




   private static void password(String s) {
       System.out.println("Task 3c");
       if(s.length() < 8){
           System.out.println("smoll size");
           return;
       }
       //check uppercase
       boolean UC = false, LC = false, digit = false, special = false;
       for (int i = 0; i < s.length(); i++) {
           char ch = s.charAt(i);
           if(!UC && Character.isUpperCase(ch)) UC = true;
           if (!LC && Character.isLowerCase(ch)) LC = true;
           if(!digit && Character.isDigit(ch)) digit = true;
           if(!special && !Character.isLetterOrDigit(ch)) special = true;
           if(LC && UC && digit && special) break;
       }
       if (!UC)
           System.out.println("Doesnt contain an uppercase");
       else if (!LC)
           System.out.println("Doesnt contain Lower case");
       else if (!digit)
           System.out.println("Doesnt contain digit");
       else if(!special)
           System.out.println("Doesnt contain specials");
       else System.out.println("Valid pass");
  
   }
  
  
  
}
