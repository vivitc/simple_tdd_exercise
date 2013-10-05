simple_tdd_exercise
===================

simple tdd exercise with JUnit
Steps
- Install java jdk > 1.6
- For mac http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html

> vi ~/.bash_profile
In case of mac
Add export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_25.jdk/Contents/Home
Check if that is the jdk version, otherwise modify it

Check if you have install JUnit -> /usr/share/java/junit-4.10
Otherwise you can download from:
http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22junit%22%20AND%20a%3A%22junit%22

> vi ~/.bash_profile
export JUNIT_HOME=/usr/share/java/junit-4.10
export CLASSPATH="$CLASSPATH:$JUNIT_HOME/junit.jar:$JUNIT_HOME"
Check if that is the junit version, otherwise modify it

- source ~/.bash_profile
Choose  a folder where you want to keep the project
git clone or fork this repository

In order to compile the test
> javac CalculatorTest.java
> java org.junit.runner.JUnitCore CalculatorTest

