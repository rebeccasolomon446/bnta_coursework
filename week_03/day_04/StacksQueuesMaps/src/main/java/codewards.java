public class codewards {



        // Loop through the array of numbers to then calculate the sum of them
        // then an if statement to check if array is empty to return 0.0;
        public static double sum(double[] numbers) {

            double sum = 0.0;
            int i;

            for( i = 0; i < numbers.length; i++ ) {

                sum += numbers[i];
                return sum;




        }

//    public static void main(String[] args) {
//        double[] numbers ={3,3,3,3};
//
//        System.out.println(numbers.sum());
//
//    }
}


