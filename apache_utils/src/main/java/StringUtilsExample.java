import org.apache.commons.lang3.StringUtils;
import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.apache.commons.lang3.StringUtils.strip;
import static org.apache.commons.lang3.StringUtils.upperCase;
import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

public class StringUtilsExample {

    public static void main(String args[]){

        String loremIpsum = "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an " +
                "unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of " +
                "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum.";

        String loremIpsumWithSpaces= "       Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an " +
                "unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of " +
                "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum.               ";

        String empptyString = "";

        if (isEmpty(empptyString))
            System.out.println("\nThis string is empty");

        String loremIpsumWithStrip = strip(loremIpsumWithSpaces);

        if (StringUtils.equals(loremIpsum, loremIpsumWithStrip))
            System.out.println("\nString loremIpsum loremIpsumWithTrim and are equals");

        String loremIpsumUpperCase = upperCase(loremIpsum);

        if (StringUtils.equals(loremIpsum, loremIpsumUpperCase))
            System.out.println("\nStrings loremIpsum and loremIpsumUpperCase are equals");
        else
            System.out.println("\nStrings loremIpsum and loremIpsumUpperCase are equals");

        if (equalsIgnoreCase(loremIpsum, loremIpsumUpperCase))
            System.out.println("\nStrings loremIpsum and loremIpsumUpperCase are not equals ignored case");

    }
}
