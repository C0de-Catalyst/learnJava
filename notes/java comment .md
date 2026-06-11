# 📘 Java Comments

## 🔹 Introduction
- **Comments** are notes written inside the code that are ignored by the compiler.  
- They are used to explain code, make it easier to understand, or temporarily disable parts of code.  
- Comments do not affect the program’s output.

---

## 🔹 Types of Comments in Java

### 1. Single-line Comment
- Starts with `//` and continues until the end of the line.
- Used for short explanations or notes.
```java
public class SingleLineComment {
    public static void main(String[] args) {
        // This prints Hello World
        System.out.println("Hello World");
    }
}
```

## 🔹 Output

```java
Hello World
```

### 2. Multi-line Comment
- Starts with `/*` and ends with `*/`.

- Can span multiple lines.

- Useful for longer explanations or documentation.

```java
public class MultiLineComment {
    public static void main(String[] args) {
        /* This program prints
           a welcome message */
        System.out.println("Welcome to Java");
    }
}

```
## 🔹 Output 
```java
Welcome to Java
```

### 3. Documentation Comment

- Starts with `/**` and ends with `*/`.

- Used to create *API documentation* with tools like Javadoc.

- Placed above classes, methods, or variables.

```java
/**
 * This class demonstrates documentation comments.
 * Author: Jhon
 * Date: June 2026
 */
public class DocComment {
    /**
     * This method prints a message.
     */
    public static void main(String[] args) {
        System.out.println("Documentation Comment Example");
    }
}
```

## 🔹 Why Use Comments?

- To explain *logic* behind code.

- To make code easier for others (or future you) to  understand.

- To *debug* by disabling certain lines temporarily.

- To generate *documentation* using Javadoc.


## Key Points

- `//` → single-line comment.

- `/* ... */` → multi-line comment.

- `/** ... */` → documentation comment (for Javadoc).

- Comments are ignored by the compiler, they are only for humans.

- Good comments *make code readable and maintainable*