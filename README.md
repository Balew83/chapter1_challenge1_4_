

This Java program demonstrates robust exception handling by safely reading and validating a configuration file named config.txt.
The file must contain two lines:

A configuration version number (integer).

A file path to another file on your computer.

The program ensures that both pieces of information are valid before proceeding, catching and reporting any errors that may occur.

⚙️ Program Functionality

Opens the config.txt file using a BufferedReader.

Reads the first line as the configuration version number.

If it’s not a number → NumberFormatException is caught.

Validates the version number — it must be 2 or higher.

If not → a custom Exception is thrown.

Reads the second line as a file path.

Checks if the file actually exists.

If not → an IOException is thrown.

Displays the version and file path if all checks pass.

Closes the file safely in a finally block to avoid resource leaks.

📁 Example of config.txt
3
C:\Users\Admin\Documents\data.txt

✅ Sample Successful Output
Config read successfully!
Version: 3
File path: C:\Users\Admin\Documents\data.txt
Config read attempt finished.

⚠️ Sample Error Messages

1. When config.txt is missing

Error: config.txt not found!
Config read attempt finished.


2. When first line is not a number

Error: First line is not a valid number!
Config read attempt finished.


3. When version is too old

Error: Config version too old!
Config read attempt finished.


4. When file path does not exist

Error reading file: File at path C:\invalid\path.txt does not exist.
Config read attempt finished.

🧠 Key Java Concepts Used

File Handling (File, FileReader, BufferedReader)

Exception Handling (try, catch, finally)

Specific Exception Types:

FileNotFoundException

IOException

NumberFormatException

General Exception (custom validation)

Resource Management (closing files properly in finally)

🎯 Learning Objectives

Understand how to safely read files using Java I/O.

Learn to handle multiple types of runtime errors.

Practice writing cleaner and more reliable code with proper exception handling.

Ensure resources are released correctly even if an error occurs.

✨ Conclusion

This project demonstrates the importance of robust exception handling in real-world Java applications.
It teaches how to:

Validate input properly,

Detect and manage common runtime issues, and

Maintain code reliability through structured error control.

With this approach, your programs become more professional, safer, and user-friendly.
