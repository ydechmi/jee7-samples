# jee7-samples 

Project contains examples of using JEE 7 API and consists of the following modules:

## ejb-standalone-sample

This module demonstrates how to use the embedded enterprise bean container to run enterprise bean applications 
in the Java SE environment. 

In this example, we have two classes:
- **AreaCalculatorBean**: exposes a method of calculating the area of rectangular shapes.
- **AreaCalculatorClient**: client of the EJB **'AreaCalculatorBean'**, and has a main method.

To run example, you could use an IDE like Eclipse, Intellij, Netbeans or other. 
As well, it is possible to run the example from the command line with two arguments **(width,height)** after building the module with maven:
**java -jar target/ejb-standalone-sample.jar width height**
