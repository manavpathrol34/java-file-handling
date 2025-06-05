# java-file-handling
Company - Codtech IT Solutions
Name - Manav Pathrol
Inter Id - CT04DL1071
Domain - Java Programming
Duration - 4 Weeks
Mentor -  Mr. Muzammil Ahmed


# 📄 Java File Handling Operations: Read, Write, Modify

## 📌 Project Overview

This project is a demonstration of **basic file handling operations in Java** — including reading from, writing to, and modifying plain text files. It offers a practical example of how Java interacts with the file system, emphasizing **I/O stream classes** such as `FileReader`, `BufferedReader`, `FileWriter`, and `BufferedWriter`.

The program showcases fundamental skills every Java developer should master, especially when working with configuration files, logs, or flat-file databases. The application runs from the command line and performs a series of operations on user-specified or default files.

---

## 🔧 Functionalities

* 📂 **Read** content from a specified `.txt` file
* 📝 **Write** new content into a file, overwriting or appending based on user choice
* 🔁 **Modify** specific lines or replace words/content in the file
* 💬 User prompts for operation selection and input
* 🚫 Basic exception handling for file errors (e.g., not found, permission issues)

---

## 🛠️ Technologies Used

* Java SE 8+
* java.io (File, FileReader, FileWriter, BufferedReader, BufferedWriter)
* Exception handling (`try-catch`)
* Basic string manipulation

---

## 🗂️ Project Structure

```
JavaFileOperations/
│
├── src/
│   └── FileOperations.java         # Main logic for reading, writing, modifying
│
├── test/
│   └── sample.txt                  # Sample file for testing operations
│
├── README.md
└── .gitignore
```

---

## ▶️ How to Use

1. **Clone the Repository**

   ```bash
   git clone https://github.com/yourusername/JavaFileOperations.git
   cd JavaFileOperations
   ```

2. **Compile the Java File**

   ```bash
   javac src/FileOperations.java
   ```

3. **Run the Program**

   ```bash
   java src.FileOperations
   ```

4. **Follow the Console Prompts**

   * Choose to read, write, or modify a file.
   * Enter file path or accept the default file.
   * Provide content or keywords as needed.

---

## 🧪 Sample Output

### Read Operation

```
Enter path of the file to read:
> test/sample.txt

File Contents:
---------------
Welcome to the Java File Handler.
This is a sample text file.
---------------
```

### Write Operation

```
Enter text to write to the file:
> This is a new line added.

File written successfully!
```

### Modify Operation

```
Enter word to be replaced:
> sample
Enter new word:
> example

Modification successful!
```

---

## 💡 Learning Objectives

By completing or studying this project, you will:

* Understand the **core I/O API** in Java.
* Learn to safely open, read, and write files using streams.
* Practice **string replacement and line-by-line processing**.
* Handle common **exceptions and edge cases**.
* Gain confidence in **file manipulation**, a crucial skill for real-world development tasks.

---

## 🧠 Key Concepts Covered

* File path navigation and validation
* Buffered I/O vs direct stream usage
* Character vs byte streams
* Append vs overwrite modes
* Content transformation logic

---

## 🚀 Possible Extensions

* Implement a GUI using JavaFX or Swing for file operations
* Support batch processing of multiple files
* Add search functionality within files
* Include JSON/XML support with formatting
* Create a command-line flag system for automation

