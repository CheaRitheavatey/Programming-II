# Programming-II

java code (.java file) --> complier (can be assembly) --> byte code (.class file) --> JVM --> machine code

# week 1: variable and data type

- System is a class that is why it start with capital letter.
    - example System.out.print()

- all java variable must have unique name and begin with letter
- case sensitive

- final variable can not be changed and read-only;
- example, final int NUM = 10;

- String firstname = "John";

- use var keyword to declare a variable that you dont know what type
- example, var name = "John";

- primitive: specifies the size and type of variable value and it has no additional methods, they are predefined in java
    - example, boolean, char, number

- reference: they refer to objects and they all have the same methods and properties
    - example, String, ArrayList, class interface


- some methods for string
    - .length()
    - .concat()
    - .substring()
    - .toUpperCase()
    - .toLowerCase()
    - .trim()
    - .replace()
    - .split()
    - .contains()
    - .charAt()
    - .indexOf(argument)
    - .indexOf(argument, startFromIndex)
    - .lastIndexOf(argument)
    - .trim() // remove whitespace

- escape character
\'
\"
\\
\t is for tab
\n is for new line

- String is immutable

- StringBuilder is mutable

- reference type example using two methods

- array: used to store mulitple values in a single variable.
    array have fixed size and items cannot be added or removed after creation

    two ways to create array:
    
    int[] array = new int[10];

    int[] array = {1,2,3,4,5,6,7,8,9,10};


widening casting: when going from small to larger
    ex. byte > short > char > int > float > long
narrowing casting: when going form larger to smaller
    ex long > float

- wrapper class: way to use primitive type as object
- wrapper class: start with a capital letter
    ex. Integer, Long, Float, Double, Character, Boolean

    ex. String str = "168";
        int string = Integer.parseInt(str);


- math class:
    - Math.abs()
    - Math.max()
    - Math.min()
    - Math.random()
    - Math.round()
    - Math.ceil()
    - Math.floor()
    - Math.sqrt()


- ternary operator
variable = (condition) ? valueIfTrue : valueIfFalse;
example int x = 10;

x > 5 ? System.out.println("x is greater than 5") : System.out.println("x is less than 5");


- switch case block
example,

switch (variable) { 
    case 1:
        System.out.println("case 1");
        break;
    case 2:
        System.out.println("case 2");
        break;
    default:
        System.out.println("default");
        break;
}

- method:
    - method have modifier (static) , return type, method name, pair of parenteness() and a body {}
        - static = it belong to class not the object of the class
    - method with the can have the same name can have different parameters
    - method with the can have the same name can have different return type
    - expression: is a construct make up of variable, operators, and method invocation
    - block: group of 0 or more statement
    - statement: for example, int a =10;
    

- collection = move object into a single unit
    - Set -> SortSet: (HashSet) cannot contain duplicate
    - List: from ArrayList can contain duplicate
   
    - Queue: hold element piror to processing (using use linked list)
    - Deque: (double ended queue) which can be modify from begining to the end (use linked list)
    
    - Map -> SortMap (have key and value)

    - to use: specify the type that going to contain in the collection 
    

    - ArrayList:
        - resizeable
        - method: 
            .add() - add new element
            .remove() - remove element
            .get() - access element
            .set() - change the specidied index's value
            .size() - return the number of element
            
    - LinkedList:
        method:
            .add() - add new element
            .remove() - remove element
            .get() - access element
            .set() - change the specidied index's value
            .size() - return the number of element
            .addFirst() - add new element at the begining
            .addLast() - add new element at the end
            .removeFirst() - remove element at the begining
            .removeLast() - remove element at the end
    
    - HashMap: (key, value)
        method:
            .put() - add new element
            .get() - access element
            .remove() - remove element
            .size() - return the number of element
            .clear() - remove all element
            .containsKey() - check if the key exist
            .containsValue() - check if the value exist
            .keySet() - access all the key
            .values() - access all the value
        

    - HashSet:
        method:
            .add() - add new element
            .remove() - remove element
            .size() - return the number of element
            .clear() - remove all element
            .contains() - check if the element exist
            .isEmpty() - check if the set is empty
    
    - Collection class:
        method:
            .toArray() - convert collection to array
            .contains() - check if the element exist
            .isEmpty() - check if the collection is empty
            .sort() - sort the collection
            .shuffle() - shuffle the collection
            .subList() - return a sublist of the collection
            .copy() - copy the collection
    

- OOP: the main aim of oop is to bind tgt the data and the functions that operate.
        advantage:
            - reusability
            - maintainability
            - extensibility
            - fast
            - clear structure
    
- object: instance of a class. object has 2 characteristic state and behavior (or we can say that object has data field and actions)
- class: blue print from which individual objects are created. 

- when object are created, it inherit all the variables and mthod from the class.

- constructor: is a special method that is called when object is created. it is used to initialize the object's state.

- this keyword: refer to the current object

- modifier: ACCESS MODIFIER
    - public: can be access from anywhere
    - private: can be access from the same class
    - protected: can be access from the same class and subclass
    - default: can be access from the same package 

    NON-ACCESS MODIFIER
    - static: it belong to the class and not the object that will later inheirt the class thing. the entity to which it is applied is available outside any particular instance of class
    - final: the final keyword indicates that the specific class cannot be entened or a mthod cannot be overridden
    - abstract: used to declare a class as partially implemented, meaning an object cannot be created directly form that class. any subclass of an abstract class must implement the abstract methods of the abstract class.

    - method and data field all modifier can be used
    - constructor can not be access modifier
    - class can be use all modifier


- encapsulation: (set data field to private and add getter and setter) prevent data from being access by other class. it can be access by getter and setter, declare data field as private and pulic the getter and setter to access. 

- inheritance: when a class inherit from another class, it can access all the data and method from the parent class. it can reuse the method and field in that class.
    
    - we cannot do multiple inheritance. meaning child class can only inherit from only 1 parents.

    - type of inheritance:
        - single inhertitance: one child inhert from one parent.
        - multiple inhertitance: one child inhert from parent and that child class also a parent and got inherit by other class.
        - hierachical inheritance: one parent class got inherit by many child class
        - hybrid inheritance: combination of multiple and hierachical inheritance

    - constructor is not a memeber of the class so it does not inherit

    - subclass inherit all the member which include: field, mehtod and nested class.

    - in order for a subclass without a constructor, we need an empty constructor in the parent classgiv

- polymorphism: it is ability of an object to take on many forms. it can be done by method overriding (runtime) and method overloading (compile time or static polymorphism). when we are using the same method to perform different thing it mean polymorphism.


- abstraction: process of hinding certain detail and showing only essential information to the user.
- abstraction can be achieve with either abstract classes or interface
- we use abstraction when we want to create a superclass that only defines a geralization form that will be shared by all of its subclasses, leaving it to each subclass to fill in the detail.

- abstract keyword is a non-access modifier, used for classes and method.
- abtract method have no implementation and abstract method can only take abstract class


- Enum type: specifically listed. the enum declaration defines an enum type, which is a special data type and consist of a set of predeine constants separated by comma.
- enum neither inherit other classes nor can get extended.
- enum is a class type. altho we dont need to instantiate an enum.
- can also access element of enum by using enumName.elementName and by index.
    .ordinal() -- return index of the constant inside the enum class
- cannot access enum constructor cuz its private by default

week 8: error handling
- exception: an event which occur during execution of a program. when eception is not handle the runtime system and the program will terminate.
- try-catch block: used to handle exception
    - can use many catch block but have to put the specific one in the begining and the general in the end
    - Throwable class is the parent class of all exception
- throw: used to throw exception
- finally: used to execute code after the try-catch block
    - try doesnt need to have catch as long as it have finally clause


- file:
    - FileReader f = new FileReader("filename.txt");

    - to read a file: 
    f.read();

    - to close a file:
    f.close();

    - to write a file:
    FileWriter f = new FileWriter("filename.txt");
    f.write("hello world");

    - autocloseable is not a class but an interface (like in example4)
    - if use exception no need to use try-catch block

- how to read 1 line in file?
    - BufferedReader b = new BufferedReader(new FileReader("filename.txt"));
    - b.readLine();

- how to read everything in file?
    - BufferedReader b = new BufferedReader(new FileReader("filename.txt"));
    - String line = b.readLine();
    - while (line != null) {
        System.out.println(line);
        line = b.readLine();
    }
    - b.close();

- how to continue write into a file?
    - FileWriter f = new FileWriter("filename.txt", true);
    - f.write("hello world");
    - f.close();

- how to continue write but in a new line?
    - FileWriter f = new FileWriter("filename.txt", true);
    - f.write("\nhello world");

- how to copy content from one file to another?
    - BufferedReader b = new BufferedReader(new FileReader("filename.txt"));
    - FileWriter f = new FileWriter("filename2.txt");
    - String line = b.readLine();
    - while (line != null) {
        f.write(line);
        line = b.readLine();
    }

- how to copy content from one file to another but in a new line?
    - BufferedReader b = new BufferedReader(new FileReader("filename.txt"));
    - FileWriter f = new FileWriter("filename2.txt");
    - String line = b.readLine();
    - while (line != null) {
        f.write(line + "\n");
        line = b.readLine();
    }

- how to delete a file?
    - File file = new File("filename.txt");
    - file.delete();

- throw vs throws:
    - exception is alwas thrown with a throw statement
        example,
        throw new Exception("error message");
        - and we can handle it like this:
        try {
            throw new Exception("error message");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    - throwable object are instances of any subclass of the throwable class

    - check exception: 
- collection have some method like
    - add() to add element
    - remove() to remove element
    - get() to get element
    - size() to get size
    - addAll() to add all element
    - shuffle() to shuffle element
    - sort() to sort element

    for example,
    ArrayList<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");

    list.remove(2);
    list.shuffle();
    list.sort();

- Basic I/O
    - read and write data by using java.io.package class
    - input stream = read data from a source, on item at a time
    - output stream = write data to destination, one item at a time

    - Example, 
    read and write bytes
    FileInputStream f = new FileInputStream("filename.txt");
    FileOutputStream f = new FileOutputStream("filename.txt");

    read and write unicode character
    BufferedInputStream f = new BufferedInputStream(new FileInputStream("filename.txt"));
    BufferedOutputStream f = new BufferedOutputStream(new FileOutputStream("filename.txt"));

    - if file not exist create it
    FileOutputStream f = new FileOutputStream("filename.txt");


- File
    - Description: The File class is used to represent file and directory pathnames in an abstract manner. It does not directly handle file content.
    - Use Cases:
        - Check if a file exists.
        - Get file metadata (size, path, etc.).
        - Create, delete, or rename files.

    - operator: 
        - exists(): Checks if the file exists.
        - createNewFile(): Creates a new file if it does not exist.
        - delete(): Deletes the file or directory.
        - getName(): Returns the name of the file or directory.
        - length(): Returns the size of the file in bytes.
        - readAllLines(): Reads all lines of a file into a list of strings.



- FileReader
    - Description: when you need to manipulate files and directories (check existence, get metadata, etc.).
    
    A FileReader is a bridge from byte streams to character streams, allowing you to read text files easily.
    - Use Cases:
        - Reading character data from a text file.
        - Useful when you need to read text files in a character encoding (like UTF-8).

    - operator:
        - read(): Reads a single character from the file.
        - read(char[] cbuf): Reads characters into a buffer.
        - write(int c): Writes a single character to the file.
        - write(char[] cbuf): Writes a character array to the file.
        - flush(): Flushes the stream, ensuring all data is written out.
        - close(): Closes the stream.


- FileWriter
    - Description: A FileWriter is used to write character data to a file.
    - Use Cases:
        - Writing text data to a file.
        - Can append to existing files or create new ones.


- FileInputStream
    - Description: A FileInputStream is used to read raw byte data from a file.
    - Use Cases:
        - Reading binary files (like images, audio files, etc.).
        - Useful when you need to process non-text data.

- FileOutputStream
    - Description: A FileOutputStream is used to write raw byte data to a file.
    - Use Cases:
        - Writing binary data to a file.
        - Useful for saving files that are not text-based.


- .canRead() and .canWrite() check if the file can be read or write
- .readable() and .writable() check if the file can be read or write
- file.lastModified() to get the last modified time


- xml: processing
    extensible markup language
    is tag based similar to html
    can define your own tags
    element are case sensitive
    reserve word "XML" in all case
    xml name must start with letter or underscore and cannot contain white space


- JAXP is for processing xml 
- xml parser give way to access or modfiy data: commonly use are DOM, SAX, JDOM StAX, JAXB


- group layout: align component horizontally or verticaly, making it easier to create a visually appealing layout

- create a group layout instance
GroupLayout layout = new GroupLayout(getContentPane());

.getConentPane() is a method that returns the content pane of the frame

# Generic 
generic allow you to abstarct over types
in a nutshall generic eneable types (classes and interfaces) to be parameters when defining classes, interfaces and methods

much like the more famililar parameters used in medthod declaration, type parameters provide a way for you to reuse the smae code with different inputs. 

the difference is that the input to formal parameter are vales while the input to type parameter are types

advantage of code with generic
stronger type check at compile time
elimiation of csat
enable programmer to implement generic interfaces

type parameter nameing convention
- E - element
- K - key
- N - number
- T - type
- V - value
- S,U,V - 2nd, 3rd and 4th type parameters

# Layout GUI
when to use each layout?
- borderlayout: 
    - best for: dividing a window into 5 main regions: North, South, East, West, and Center
    - when to use: You want to create a layout with a top/bottom bar, side panels, and a main central area.
    - automatically reize componenet to fill the assign region

- gridlayout:
    - best for: laying out componenet in a uniform grid (calculator button)
    - when to use: ou want a table-like layout (like buttons on a calculator).
    - all cell are the same size
    
# Methodology Of gramming 
- week 01:
    - area of computer application
    - scientific application (first digital computer..)
    - business application (first successful high-level language was COBOL)
    - AI (first program was LISP)
    - system program (first program was PLIS)
    - web software (first program was HTML)

    - programming paradigms (style of progamming)
    - common paradigm:
        - imperative: most popular programming language called von neuman architecture. where it execute in a fetch execute cycle. ex, C, C++, Java, fortran

        - declarative/logic
        - functional: primary mean of computation is applying function to given parameter. ex, lISP, lisp, R, python, ML, javascript

        - procedural
        - object oriented

        - frontend vs backend

- week02:
    - why use java?
    - java edition
    - JDK (java development kit) = JRE (java runtime environment) (JVM + library classes)+ development tools
    - java is a plateform-independent programming lanuage and doesnt work on the one step compliation.

    - it involve 2 steps
        1. through OS-independent compiler
        2. in virtual machine which is custom bulit for every OS
        or you can say
        1. create java program
        2. complie the program
        3. execute the program (class that contrain main method)

        .java file --> compiler --> .class file --> jvm (java virtual machine) --> machine code

        or 
        byte code --> jvm (java virtual machine) --> machine code

    - primary componenet of computer
    - implementation method: compilation, pure interpretation, hybrid interpretation

    - preprocessor
    - variable
    - data type (primitive, non primitive)

- week03:
    - type conversion: assign a value of one primitive data type to another type. (wideing coversion, narrowing coversion)
    - wrapper class
    - operator: (arithmetic, assignment operator, comparison, logical operator, bitwise operator)
    - control statement: (if, switch, while, for, do while)
    - ternary operator: variable = (condition ? true : false)

- week04:
    - expression: is a construct make up of variable, operators, and method invocation which are constructed according to the syntax of the lanuage that evaluate to a single value
    - statement: equvialent to sentences in natural language. a statement form a complete unit of execution
    - block: group of 0 or more statement
    - scope: the visibility of variable and method (local variable, non local variable)
    - data structure 
    - algorithm
    - method
    - collection
    - arraylist
    - linkedlist
    - hashmap
    - hashset

- week05:
    - oop advantage
    - object: have state and behavior
    - class: blue print from which individual objects are created
    - constructor: is a special method that is called when object is created. it is used to initialize the object's state.
    - modifier: ACCESS MODIFIER
    - pillar of oop (encapsulation, inheritance, polymorphism, abstraction)

- week06:
    - inheritance
    - super keyword
    - polymorphism

- week07:
    - abstraction
    - enum type

- week08:
    - exception
    - try-catch block
    - finally block
    - try with resource statement: try (resource) {}
    - throw
    - exception class mean ey klas
    - create an exception classes

- week09:
    - basic IO
    - byte stream
    - char stream
    - file input and output stream

- week10:
    - xml feature
    - how to read from an existing xml
    - how to write to an existing xml
    - how to create a new xml file

- week13:
    - generic
    - advantage of code with generic
    - type of parameter naming convention


# Question to consider:
1. Explain the difference between JDK, JRE, and JVM. Why is Java considered platform-independent?
