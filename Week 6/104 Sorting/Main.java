
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        
        for(int value : array){
            if(smallest > value){
                smallest = value;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int smallestIndex = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] < array[smallestIndex]){
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestIndex = index;
        
        for(int i = index; i < array.length; i++){
            if(array[i] < array[smallestIndex]){
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array,i,smallestIndex);
        }
    }
    
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
  

}
