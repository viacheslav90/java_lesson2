public class IntegerExample {

    public static void main(String[] args) {

        Integer integerObject1 = 10;
        Integer integerObject2 = 10;

        int i1 = 10;
        int i2 = 10;

        System.out.println("\nChecking that links to objects are different: " +
                (integerObject1 == integerObject2));
        System.out.println("\nChecking that values of Integer objects are the same: "
                + (integerObject1.intValue() == integerObject2.intValue()));
        System.out.println("\nChecking that values of int are the same: " + (i1 == i2));
        System.out.println("\nCheck that value of integerObject1 and i1 are the same: " +
                (integerObject1.intValue() == i1));

    }
}