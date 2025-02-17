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