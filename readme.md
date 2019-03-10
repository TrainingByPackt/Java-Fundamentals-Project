# Java Fundamentals Practical Exercise

This repository contains all the necessary code and unit tests for the practical part of the
'Java Fundamentals' course ware. Please follow the instructions below to get setup.

## Steps for installation

1. Download the latest java SDK and ensure you add the JAVA_HOME variable to your environment properties
2. Clone this repository (using `git clone ...`)
3. Change directory to the "Java-Fundamentals-Project" and run the following:
   gradlew
4. Try building the project by running: 
```gradlew build -x test```
   This compiles the project files and skips unit tests. The project contains failing unit test that you require to fix as part of the activities in the course.
5. If step 3 or 4 fails because of an error saying “Cannot find System Java Compiler.”, ensure you have correctly setup the JAVA_HOME property.

## Using an IDE

1. Download intellij or eclipse from:
    * https://www.jetbrains.com/idea/
    * https://www.eclipse.org/
2. Open the gradle project using the downloaded IDE.
3. Try running the unit test located in:
    * `com.packt.jamescutajar.AppTest`
4. If the test above fails to run or compile, ensure your JDK and IDE are properly setup.

## Project Package Layout and running Unit tests:

The packages in the project are structured in a package per lesson. Each lesson contains all code necessary in the course and the 
interfaces to implement for the activities. Each activity is also covered by several unit tests to ensure that the 
correct code is implemented. The unit tests can be run directly in the in the IDE, 
by selecting the lesson and activity and executing the unit test. Alternatively the test can be run in a 
terminal/command prompt. This can be done by running:

`gradlew test --tests com.packt.jamescutajar.lesson2.FindShapeAreaTest*`

This will run the unit tests found for the 'Find Shape Area' activity in lesson2.


## About the Creator
James Cutajar is a software developer with an interest in scalable, high-performance computing and 
distributed algorithms. He has worked in the technology field for over 15 years in various industries. 
He is also an author of various video courses on Scala and a book on data structures and algorithms in Java.
Throughout his career, he has been an instructor, open source contributor, blogger, and a tech evangelist. 
When he is not writing software, he is riding his motorbike, surfing, scuba diving or ﬂying light aircraft. 
He was born in Malta, lived in London for almost a decade and is now working in Portugal.
Visit the author's blog at www.cutajarjames.com

