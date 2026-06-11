# 📘 Java Output (Print Text & Numbers)

## 🔹 Introduction
- In Java, **output** means showing information to the user.  
- The most common way is using `System.out.print()` and `System.out.println()`.  
- These methods display text or numbers on the console.

---

## 🔹 Printing Text
- To print text, always enclose it in **double quotes (" ")**.
- Example:
  ```java
  public class OutputText {
      public static void main(String[] args) {
          System.out.println("Hello Jhon  // prints with a new line
          System.out.print("Welcome to Java"); // prints without new line
      }
  }
   

## 🔹 Output:
   ```java
   Hello Jhon
   Welcome to Java
   ```

---

## 🔹 Explanation:



- `System.out.println() `→ prints text and moves to the next line.

- `System.out.print()` → prints text but stays on the same line.


## 🔹 Printing Numbers

Numbers can be printed directly without quotes.

Example:
```java
public class OutputNumbers {
    public static void main(String[] args) {
        System.out.println(100);       // prints integer
        System.out.println(10 + 20);   // prints result of addition
        System.out.println(3.14);      // prints decimal number
    }
}
```
## 🔹 Output

```java
100
30
3.14
```

## Explanation:

- If you write numbers directly, Java treats them as values.

- You can also perform calculations inside `System.out.println()`.

## 🔹 Combining Text and Numbers

You can join text and numbers using the + operator.

Example:
```java
public class OutputMix {
    public static void main(String[] args) {
        int age = 18;
        System.out.println("My age is " + age);
        System.out.println("10 + 20 = " + (10 + 20));
    }
}

```

## 🔹 Output

```java
My age is 18
10 + 20 = 30
```

## 🔹 Key Points
- Use quotes (" ") for text, no quotes for numbers.

- `println` → prints and goes to new line.

- `print `→ prints but stays on same line.

- You can combine text + numbers using `+`.

- Java automatically converts numbers to string when combined with text.

## Real Life Example

```java
public class RealLifeOutput {
    public static void main(String[] args) {
        String studentName = "Jhon";
        int marks = 95;
        System.out.println("Student: " + studentName);
        System.out.println("Marks: " + marks);
    }
}
```

## Output
```java
Student: Jhon
Marks: 95
```
