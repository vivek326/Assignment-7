public class Main { 
    
    static void reversal(int arr[], int x) 
    { 
        int[] arr1 = new int[x]; 
        int j = x; 
        for (int i = 0; i < x; i++) { 
            arr1[j - 1] = arr[i]; 
            j = j - 1; 
        } 
  
System.out.println("Array in revered order \n"); 
        for (int l = 0; l < x; l++) { 
            System.out.println(arr1[l]); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int [] array = {1, 2, 3, 4, 5}; 
        reversal(array, array.length); 
    } 
} 