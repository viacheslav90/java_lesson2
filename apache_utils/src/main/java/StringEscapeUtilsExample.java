import org.apache.commons.lang3.StringEscapeUtils;

import static org.apache.commons.lang3.StringEscapeUtils.escapeXml;
import static org.apache.commons.lang3.StringEscapeUtils.unescapeXml;

public class StringEscapeUtilsExample {

    public static void main(String args[]) {

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<project xmlns=\"http://maven.apache.org/POM/4.0.0\"\n" +
                "         xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n" +
                "    <parent>\n" +
                "        <groupId>lesson</groupId>\n" +
                "        <artifactId>lesson2</artifactId>\n" +
                "        <version>1.0-SNAPSHOT</version>\n" +
                "    </parent>\n" +
                "    <modelVersion>4.0.0</modelVersion>\n" +
                "\n" +
                "    <artifactId>http_client</artifactId>\n" +
                "</project>";

        String escapeXmlString = escapeXml(xml);
        System.out.println(escapeXmlString);

        System.out.println("\n\n\n");

        String unescapeXmlString = unescapeXml(escapeXmlString);
        System.out.println(unescapeXmlString);

    }
}
