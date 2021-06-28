
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of the smallest number: " + indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 0));
        System.out.println(indexOfSmallestFrom(array, 1));
        System.out.println(indexOfSmallestFrom(array, 2));
        swap(array, 1, 0);
        System.out.println(Arrays.toString(array));
    }
    public static int smallest(int[] array) {
        int smallest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
    // write your code here
        int smallest = smallest(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] == smallest){
                return i;
            }
        }
        return -1;
        
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
        // starting index of new subarray
        int startOfNewIndex = startIndex;
        // new subarray
        int[] newArrayFromIndex = new int[table.length - startIndex];
        for(int i = 0; i < newArrayFromIndex.length; i++){
            newArrayFromIndex[i] = table[startOfNewIndex];
            startOfNewIndex++;
        }
        return startIndex + indexOfSmallest(newArrayFromIndex);
   
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
        int valueThatWasAtIndex1 = array[index1];
        array[index1] = array[index2];
        array[index2] = valueThatWasAtIndex1;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++){
            swap(array,i,indexOfSmallestFrom(array,i));    
        }
    }
}
