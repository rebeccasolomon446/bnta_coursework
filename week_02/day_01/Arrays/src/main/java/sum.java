public class sum {
    public static double sum(double[] numbers) {

        // declare a variable called sum and assign it a value of 0
        double sum = 0;
        // for loop through the array and add each number to sum
        for(double i = 0; i < numbers.length; i++) {
            sum += numbers[(int)i];
        }
        // return sum
        return sum;
        // (maybe check if array is empty, to return 0)
    }
}
