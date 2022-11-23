import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.*;

public class ReadXml {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        DocumentBuilderFactory dBfactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dBfactory.newDocumentBuilder();
        // Fetch XML File
        Document document = builder.parse(new File("students.xml"));
        document.getDocumentElement().normalize();
        // Get root node
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
        // Get all students
        NodeList nList = document.getElementsByTagName("student");
        System.out.println(".................................");

        for (int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            System.out.println();
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Student id : " + element.getAttribute("id"));
                System.out.println("Name : " + element.getElementsByTagName("Name").item(0).getTextContent());
                System.out.println("Roll No : " + element.getElementsByTagName("id").item(0).getTextContent());
                System.out.println("Location : " + element.getElementsByTagName("location").item(0).getTextContent());
            }
        }
    }
}
