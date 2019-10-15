import java.util.*;
public class Main {

    public static void main(String[] args)  {
        String[] Arr1 = { "Hello","World","Whats","up" };
        int size = Arr1.length;
        int i;
        int j = 0;
        for (i = 0; i < size; i++) {
            if (Arr1[i] == "Hello") {
                j = i;
                break;
            }
            
        }
        System.out.printf("The searched element is at index %d", j);
    }
}
