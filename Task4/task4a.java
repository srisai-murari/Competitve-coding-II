import  java.util.*;
public class StackUsingQueues {
   Queue<Integer> q1 = new LinkedList<>();
   Queue<Integer> q2 = new LinkedList<>();


   private int peek;
   public StackUsingQueues() {}


   public boolean push (int val){
       q2.offer(val);


       int n = q1.size();
       for (int i = 0; i < n; i++) {
           q2.offer(q1.poll());
       }


       var q3 = q1;
       q1 = q2;
       q2 = q3;


       return true;
   }


   public int pop(){
       int val = q1.poll();
       return val;
   }


   public int top(){
       return q1.peek();
   }


   public static void main(String[] args) {
       StackUsingQueues st = new StackUsingQueues();
       st.push(1);
       st.push(2);
       st.push(3);




       System.out.println(st.pop());


       System.out.println("top is "  + st.top());


       System.out.println(st.pop());
       System.out.println(st.pop());
   }
}
