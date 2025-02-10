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