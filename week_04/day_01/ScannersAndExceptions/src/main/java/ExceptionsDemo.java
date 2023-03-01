public class ExceptionsDemo {

    public static void main(String[] args) {

//        if (doSomethingWithThisInput(2)) {
//            System.out.println("input is valid");
//        } else {
//            System.out.println("invalid input");
//        }
        try {
            doSomethingWithThisInput(20);
            System.out.println("successful");
        } catch (Exception exception) {
            System.out.println("something went wrong");
        }

    }

    public static boolean doSomethingWithThisInput(int input) throws Exception {
        if (input > 10) {
            return true;
        }
        throw new Exception("invalid input");
    }
}
