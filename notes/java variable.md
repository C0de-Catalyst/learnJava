# 📘 Java Variables

## 🔹 Introduction
- A **variable** is a container that stores data values in Java.  
- Variables allow us to reuse values, perform calculations, and make programs dynamic.  
- Each variable has:
  - **Type** → defines what kind of data it holds (e.g., int, String).  
  - **Name (identifier)** → unique label to access the variable.  
  - **Value** → the actual data stored.

---

## 🔹 Declaring and Printing Variables
- To declare a variable, specify the **data type** and **name**.
- Example:
  ```java
  public class PrintVariable {
      public static void main(String[] args) {
          int age = 18; // declaration + initialization
          System.out.println(age); // prints variable value
      }
  }
  ```

## 🔹 Output:
``` java
18
```
---

## 🔹 Multiple Variables

- You can declare and initialize multiple variables of the same type in one line.
```java
public class MultipleVariables {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;
        System.out.println(x + y + z); // prints 30
    }
}

```
## 🔹 Output:
```java
30
```
---

## 🔹 Identifiers

- Identifiers are names given to variables, classes, methods, etc.

- Rules for identifiers:

  - Must start with a letter, underscore `_`, or dollar sign `$`.

  - Cannot start with a number.

  - Cannot contain spaces.

  - Case-sensitive (`age` ≠ `Age`).

  - Cannot use Java keywords (like `class`, `public`).

- Examples:
```java
int studentAge = 18;   // valid
int _marks = 95;       // valid
int $salary = 5000;    // valid
// int 1value = 100;   // invalid (cannot start with number)

``` 
---

## 🔹 Constants (final)

- A constant is a variable whose value cannot be changed once assigned.

- Declared using the `final` keyword.'

```java
public class ConstantsExample {
    public static void main(String[] args) {
        final int MAX_SCORE = 100;
        System.out.println(MAX_SCORE);
        // MAX_SCORE = 90; // ❌ Error: cannot change value
    }
}
```

## 🔹 Real-Life Example

```java
public class StudentInfo {
    public static void main(String[] args) {
        String studentName = "Rohit";   // variable for name
        int studentAge = 18;            // variable for age
        final String exam = "NDA";      // constant for exam name

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Exam: " + exam);
    }
}

```
## 🔹 Output:
```java
Name: Rohit
Age: 18
Exam: NDA
```

