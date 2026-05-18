AWT Multithreading Program

Project Name:
AWTThread

File Name:
Main.java

Aim:
To construct a Java application using AWT and multithreading concepts.

Software Requirements:
Java JDK
Any Java IDE or Command Prompt

Concepts Used:
Java AWT
Frame
Label
Multithreading
Runnable Interface
Thread Class
WindowAdapter

Program Description:
This program demonstrates the use of multithreading in Java with AWT components. A window is created using AWT Frame. A separate thread continuously updates a counter every second and displays it on the screen using a Label component.

How the Program Works:
1. A Frame window is created.
2. A Label is added to display counter values.
3. A Thread object is created.
4. The thread runs continuously using the run() method.
5. The counter value increases every second.
6. The updated value is displayed on the window.

Compilation Command:
javac AWTThreadDemo.java

Run Command:
java AWTThreadDemo

Expected Output:
A window opens displaying:

Counter : 1
Counter : 2
Counter : 3

The counter increases every second automatically.

Learning Outcome:
Understand the use of:
AWT components
Java multithreading
Runnable interface
Thread execution
GUI application development
