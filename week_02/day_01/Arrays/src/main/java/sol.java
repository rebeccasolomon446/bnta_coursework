import java.util.Arrays;

public class sol {
        public static int dups(int[] arr) {
                int positionA = 0;
                int positionB = 0;
                for(int i = 0; i < arr.length; i++) {
                        for(int j = i + 1; j < arr.length; j++ ) {
                                if(arr[i] == arr[j]) {
                                        positionA += i;
                                        positionB += j;
                                }
                        }
                }
                return arr[1];
        }

        public static void main(String[] args) {
                System.out.println(dups(new int[]{2, 3, 5, 5}));
        }



}
