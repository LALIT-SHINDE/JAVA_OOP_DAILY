Async Processing in Spring Boot

Project Name
AsyncProcess

Description
This project demonstrates how to process tasks asynchronously in a Spring Boot application using @Async annotation.

Technologies Used
Java
Spring Boot
Maven

Features
Processes tasks asynchronously
Uses separate thread execution
Returns response immediately
Demonstrates Spring Boot async support

How It Works
@EnableAsync enables asynchronous execution in Spring Boot.

@Async annotation executes the method in a separate thread.

When user accesses:
http://localhost:8080/start

The task starts in background and response is returned immediately.

How to Run

Step 1
Open terminal in project folder.

Step 2
Run the following command:

mvn spring-boot:run

Step 3
Open browser and visit:

http://localhost:8080/start

Expected Output in Browser

Task is processing asynchronously...

Expected Console Output

Task Started: task-1
Task Completed: task-1

Explanation of Output

Task Started message appears when background task begins execution.

Thread.sleep(5000) creates a delay of 5 seconds.

Task Completed message appears after processing finishes.

The browser receives response immediately without waiting for task completion.

Conclusion

This project demonstrates asynchronous task execution in Spring Boot using @Async and @EnableAsync annotations.
