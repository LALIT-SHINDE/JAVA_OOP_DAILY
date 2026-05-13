TCP Echo

Objective

To implement a client-server communication program using TCP sockets where the server echoes the message sent by the client.
Software Requirements
Java
JDK 8 or above
Command Prompt / Terminal

Theory
TCP (Transmission Control Protocol) is a connection-oriented protocol used for reliable communication between client and server systems. In this program, the client sends a message to the server and the server sends the same message back to the client, known as an echo message.

Classes Used
ServerSocket → Creates the server
Socket → Establishes connection
DataInputStream → Receives data
DataOutputStream → Sends data
Procedure


Create the server using ServerSocket.


Wait for client connection using accept().


Create the client using Socket.


Send message from client to server.


Receive message on server side.


Echo the same message back to the client.


Display the echoed message on client side.


Compilation
javac Server.javajavac Client.java
Execution
Run Server:
java Server
Run Client:
java Client
Sample Output
Server Side
Server is waiting for client...Client connectedClient says: HelloMessage echoed back
Client Side
Enter message: HelloEcho from server: Hello
Result
The TCP client-server echo program was implemented successfully using Java sockets.
