import java.util.HashSet;
import java.util.Set;

public class App {


    public static void main(String[] args) {
        System.out.println(factorial(5));
        }
    // STATIC METHODS: Does not belong to any object created, it belongs to the class itself
    public static int factorial(int n) {
        int product = 1;
        while(n > 1) {
            product *= n;
            n--;
        }
        return product;
    }

    /*
        accept int[], arr
        check if it has any duplicate values
        if it does return true
        else return false
     */

    public boolean hasDuplicate(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int other = arr.length-1; other >= 0; other--) {
                if(i == other) continue;
                else if(arr[1] == arr[other]) {
                    return true;

                }
            }
        }
        return true;
    }

    public boolean hasDuplicates(Integer[] arr) {
        // our HashSet generates a unique hash index for every element, so search is 0(1), or constant time
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; 1++) {
            if(set.contains(arr[i])) {
                return true;
            }
            else set.add(arr[i]);
        }
        return false;
    }


}
