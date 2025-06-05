package Methodology;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Homework10 {
    // write into the xml file
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();


            // root element: departments
            Element root = doc.createElement("departments");
            doc.appendChild(root);

            // department which is the child of departments
            Element department1 = doc.createElement("department");
            root.appendChild(department1);

            // name child of department
            Element name = doc.createElement("name");
            department1.appendChild(name);
            name.setTextContent("HR");
            
            // empoyees child of department
            Element employees = doc.createElement("employees");
            department1.appendChild(employees);

            
            // empoyee child of employees
            Element employee1 = doc.createElement("employee");
            employees.appendChild(employee1);
            employee1.setAttribute("id", "123456");
            
            // firstname child of employee
            Element johnny = doc.createElement("firstname");
            employee1.appendChild(johnny);
            johnny.setTextContent("Johny");
            
            // lastname child of employee
            Element lum = doc.createElement("lastname");
            employee1.appendChild(lum);
            lum.setTextContent("Lum");

            // employee2 child of employees
            Element employee2 = doc.createElement("employee");
            employees.appendChild(employee2);
            employee2.setAttribute("id", "567891");
            
            // firstname2 child of employee2
            Element rick = doc.createElement("firstname");
            employee2.appendChild(rick);
            rick.setTextContent("Rick");
            
            // firstname2 child of employee2
            Element forbis = doc.createElement("lastname");
            employee2.appendChild(forbis);
            forbis.setTextContent("Forbis");

            // department 2 child of departments/root
            Element department2 = doc.createElement("department");
            root.appendChild(department2);

            // name child of department2
            Element name2 = doc.createElement("name");
            name2.setTextContent("Marketing");
            department2.appendChild(name2);

            // empoyees child of department
            Element employees2 = doc.createElement("employees");
            department2.appendChild(employees2);

            
            // empoyee child of employees
            Element employee3 = doc.createElement("employee");
            employees2.appendChild(employee3);
            employee3.setAttribute("id", "159987");
            
            // firstname child of employee
            Element margaret = doc.createElement("firstname");
            employee3.appendChild(margaret);
            margaret.setTextContent("Margaret");
            
            // lastname child of employee
            Element brown = doc.createElement("lastname");
            employee3.appendChild(brown);
            brown.setTextContent("Brown");

            // output
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer tf = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(doc);
            StreamResult target = new StreamResult(new File("Homework10.xml"));

            // make it pretty
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.transform(source, target);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}