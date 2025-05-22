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

// Name: Chea Rithea Vatey
// Neptun: E7AJB5

/*
    exercise 2: True or false
    a. true
    b. true
    c. true
    d. true
    e. false
    f. false 
    g. false
    h. true
    i. false
    j. true


    exercise 3: 
    paradigm that detailed instruction is given so it will be executed in the given order is "imperative"

    exercise 4:
    By making it an abstract class

    exercise 5: String

    exercise 6: 
    - Array: is a non-primitive data type that are used to store multiple values in a single variable. 
            To declare an array, define the variable type with square brackets. 
            Place the values in a comma-separated list, inside curly braces. 
            Arrays have fixed size and items cannot be added or removed after creation.

    - ArrayLists: is a class of collection which can contain many objects of the same type. 
                It is a resizable array, which can be found in the java.util package. 
    
    exercise 7: 
    limitation for overriding a method is: The access modifier for an overriding method can allow more, but not less access 
    than the overridden method from the parent class. and and static methods cannot be overridden

    exercise 8: 
    The Java programming language is statically-typed, which means that all 
    variables must first be declared before they can be used/

    exercise 9: 
    Encapsulation can be achieved by declaring all the variables in the class as private and  
    writing public methods in the class to set and get the values of variables; mostly known 
    as setter and getter methods. 
 
    By using get method user should be able to access the value of the variable. 
    By using set method user should be able to set or change the value of the variable.

    exercise 10: 
    - Override: is a feature that allows a subclass or child class to provide a specific
                implementation of a method that is already provided by one of its super-classes.
                Runtime Polymorphism is Method Overriding 
                
    - Overload: is a feature that have different return type, same name and can have different parameters 
            Compile-time Polymorphism is Method Overloading

    exercise 11:
    it means that you do not need to do typecasting as generics allow you to abstract over types. 
    and enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods

    exercise 12:
    - throw: The exception is always thrown with a throw statement. 
    	    The throw statement requires a single argument: a throwable object. 
            example, throw new Exception("error message");

    - throws: Throwable objects are instances of any subclass of the Throwable class. 
            example, public void file throws Exeception {}

    exercise 13:
    - Constructor is a special method that is used to initialize objects. 

    The constructor is called when an object of a class is created. 
    The constructor name must match the class name, and it cannot have a return type. 
    All classes have a constructor by default which you are not able to set initial values for object attributes

    exercise 14:
    if we want to define an attribute which suppose to be accessed directly from the class we can use static.
    static:  The  entity  to  which  it  is  applied  is  available  outside  any  particular instance of the class.

    exercise 15: 
    - OOP is fast and easy to execute 
    - OOP provides a clear structure for the programs 
    - OOP helps to keep the Java code DRY "Don't Repeat Yourself" 
    - OOP makes the code easier to maintain, modify and debug

    exercise 16: 
    wrapper class is used to provide a way to use primitive data types as objects. 
    primitive types and their equivalent wrapper classes
    example char to Character, int to Integer

*/
public class FinalExam {
    public static void createXML() {
        // exercise 1: create xml file
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document d = db.newDocument();

            // create a root element and append to the document
            Element root = d.createElement("library");
            d.appendChild(root);

            // create a book tag and append to root
            Element book = d.createElement("book");
            book.setAttribute("id", "1");
            root.appendChild(book);

            // create a name tag and append to book
            Element name = d.createElement("name");
            name.setTextContent("Demian");
            book.appendChild(name);

            // create an author tag and append to book
            Element author = d.createElement("author");
            author.setTextContent("Hermann Hesse");
            book.appendChild(author);

            // create a year tag and append to book
            Element year = d.createElement("year");
            year.setTextContent("1919");
            book.appendChild(year);

            // put it into file
            TransformerFactory tff = TransformerFactory.newInstance();
            Transformer tf = tff.newTransformer();

            DOMSource source = new DOMSource(d);
            StreamResult target = new StreamResult(new File("createXML.xml"));

            // make the file pretty
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.transform(source, target);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        createXML();


    }
    
}
