# ProjectEuler-2022
This repo contains runnable code for solving Project Euler problems in Java.
https://projecteuler.net/ 


These solutions are provided using Maven build tools and Junit unit test framework. 
All of the sources here can also be run from command line java commands. As code editor I have used VS Code.

## JAVA solutions
#### Maven build tool
Full Installation Guide here: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

If you have Maven installed, follow these steps:
Once in the ProjectEuler-2020 folder, we have to build Maven.
Let build it with 

    > mvn package

It builds, run unit test and package the project into a jar file and puts it into the project/target folder.
Then to compile the project tun:

    > java -cp target/project_euler-1.0-SNAPSHOT.jar src/main/java/com/depaoli/euler/p003.java 


Alternatively, Java source files can be find in ProjectEuler-2022/src/main/java/com/depaoli/euler.
Without using build tools and unit test frameworks single source file java code can also be very easy to work with. Just install java environment and:

    > java .\p003_euler.java

    Euler problem #001 solution
    result from algorithm: 6857


### Problem #003
Source: https://github.com/AlessioDP123/ProjectEuler-2022/blob/main/src/main/java/com/depaoli/euler/p003.java

My solution to problem #003 is a while loop that every time it finds a smallest factor divides n by that number and continues until n is equal to l(smallest factor). Thus is the largest factor

### Problem #021
Source: https://github.com/AlessioDP123/ProjectEuler-2022/blob/main/src/main/java/com/depaoli/euler/p021.java

My solution to problem #021 consists of a for loop which checks all numbers under 1000 if the number is amicable and if so sums it.
The main function is the one that checks whether the number is amicable according to theory: Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
DivisorSum allows us to add the divisors of a number.

### Problem #067
Source: https://github.com/AlessioDP123/ProjectEuler-2022/blob/main/src/main/java/com/depaoli/euler/p067.java

My solution to problem #067 is to start from the penultimate row and add the maximum between the two numbers that are touched below to the number taken into consideration. In this way at the end of the cycle the maxpath will be at the position triangle[0][0].
