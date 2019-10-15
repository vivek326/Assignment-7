import java.util.*;

public class Main {
   public static void main(String args[]) {
      String[] Arr1 = {"Hello", "World", "Whats","up"};
      int size = Arr1.length;

      for(int i = 0; i<size-1; i++) {
         for (int j = i+1; j<Arr1.length; j++) {
            if(Arr1[i].compareTo(Arr1[j])>0) {
               String temp = Arr1[i];
               Arr1[i] = Arr1[j];
               Arr1[j] = temp;
            }
         }
      }
      System.out.println(Arrays.toString(Arr1));
   }
}