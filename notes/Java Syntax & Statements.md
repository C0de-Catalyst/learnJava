# 📘 Java Syntax & Statements

## 🔹 What is Syntax?
- **Syntax** in Java means the set of rules that define how code must be written so the compiler can understand it.  
- If you break these rules (like missing a semicolon or using wrong keywords), the program won’t run and you’ll get a **compile-time error**.  
- Think of syntax as the **grammar of Java** — just like English has grammar rules, Java has coding rules.

---

## 🔹 Basic Structure of a Java Program
Every Java program follows a standard structure:

```java
public class Main {          // Class declaration
    public static void main(String[] args) {   // Main method
        System.out.println("Hello World");     // Statement
    }
} 
```
---

## 📖 Explanation

➡️ *Class Declaration* →``` public class Main```

  - Every program must be inside a class.
  
  - The class name should match the file name (```Main.java```).

➡️ *Main Method* →``` public static void main(String[] args)```

  - This is the entry point of the program.
  
  - The JVM (Java Virtual Machine) starts execution from here.

➡️ *Statements* → Instructions written inside the main method.

  - Example: ```System.out.println("Hello World");```
  
---
## 🧾 Statements in Java

  - A statement is a single instruction that ends with a semicolon``` ;```.

  - Java executes statements top to bottom inside the main method.

➡️ Types of Statements:

  - Declaration Statement → Defines a variable.
    
    ```java
    int age = 18;
    ```
  - Expression Statement → Performs an action.
    
    ```java 
    System.out.println(age);
    ```
  - Control Statement → Controls flow (like `if`, `for`, `while`).

    (You’ll learn these later, but they are also part of syntax.)

---

##  🔧 Rules of Java Syntax
  
  - Case-sensitive → `Age` and `age` are different.

  - Curly Braces `{}` → Define blocks of code (class, method, loops).

  - Semicolon `;` → Must end every statement.

  - Indentation → Not required by compiler, but makes code readable.

  - Keywords → Reserved words like `class`, `public`, `static`, `void` cannot be used as variable names. 


---

## 🔹 Example Program

  ```java
  public class SyntaxDemo {
     public static void main(String[] args) {
         int x = 10;                   // declaration statement
         int y = 20;                   // declaration statement
         int sum = x + y;              // expression statement
         System.out.println(sum);      // output statement
     }
 }
```

## Output
```java
30
```
---

## 🔹 Real-Life Analogy

- Syntax = Grammar rules in English.

- Statements = Sentences you write.

 

















