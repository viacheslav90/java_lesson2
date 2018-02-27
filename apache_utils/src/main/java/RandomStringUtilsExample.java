import static org.apache.commons.lang3.RandomStringUtils.random;

public class RandomStringUtilsExample {

    public static void main(String args[]) {

        String randomStringTenChar = random(10);

        String randomStringFromNumbers = random(10, false, true);

        String randomString = random(10, "abcdefg");

        System.out.println("Random string from 10 any letters: " + randomStringTenChar);
        System.out.println("Random string from 10 numbers: " + randomStringFromNumbers);
        System.out.println("Random string from 10 letters from 'a' to 'g': " + randomString);
    }
}
