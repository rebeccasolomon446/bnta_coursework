public class Runner {         //classes should be singular and capitalised

    public static void main(String[] args) {
        //object instansiation:
        Person person1 = new Person("Colin", "Bathgate",35);
        Person anna = new Person("Anna", "Glasgow", 35);


        System.out.println(person1.getName()); //"Colin"
        System.out.println(anna.getName()); // "Anna"
        System.out.println(anna.getTown()); // "Glasgow"
        System.out.println(anna.getAge()); // 35

        anna.greet("evening");
        person1.greet("afternoon");

        System.out.println("---bio generation---");
        System.out.println(anna.generateBio());

        //colin.name = "zsolt" actually changes the input name. This is because the properties are public. Known as Risk factor.
        //java allows data hiding (encapsulating) using access modifier. Good practice in java for all properties should have a private access modifier
        // getters and setters are useful for this

        //setter allow changes to be made to property inputs:
        System.out.println("----using setter to change anna object age input----");
        anna.setAge(43);
        System.out.println(anna.getAge());


    }
}