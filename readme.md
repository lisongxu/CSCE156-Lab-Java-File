# Computer Science II
## Lab 4.0 - Strings & File I/O

An introduction to strings and file input/output in the Java programming
language.  

This is a lab used in Computer Science II (CSCE 156) for Fall 2023 
in the [School of Computing](https://computing.unl.edu) 
at the [University of Nebraska-Lincoln](https://unl.edu).

## Overview

### Resources

* Java String tutorial   
http://download.oracle.com/javase/tutorial/java/data/strings.html
* Java File I/O tutorial  
http://download.oracle.com/javase/tutorial/essential/io/file.html
* Java tutorial on the `System.out.format` method  
https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

### Lab Objectives & Topics

Following the lab, you should be able to:
* Use Strings and do basic file I/O in Java

Note that the lab may involve some concepts, classes, or methods not covered (yet) in the class. You should be able to complete the lab without fully understanding them. If you have any questions about them, please feel free to ask our LAs. 

### Peer Programming Pair-Up

At the start of
each lab, you may find a team member by yourself or may be randomly paired up with another student by
a lab instructor.  One of you will be designated the *driver* 
and the other the *navigator*. If you prefer to work on this lab by yourself, that is fine too.  Each week you should try to alternate: if you were a driver 
last week, be a navigator next, etc. 

***Note that, each student must submit the code to CodePost for grading.***


## 1. Getting Started

Clone this project code for this lab from GitHub in Eclipse using the
URL: `https://github.com/lisongxu/CSCE156-Lab-Java-File`


## 2. Strings & File I/O

The program involves processing a file containing formatted data.
Specifically, you will process a file containing the win/loss records of
National League baseball Teams from the 2011 season. The file is
formatted as follows: each line contains the win/loss record of a single
team (16 teams total). Each line contains the team name, the number of
wins, and the number of losses. Your program will read in the file,
process the data and sort the teams in the order of their win percentage
(wins divided by total games) and output the sorted and reformatted team
list into a new file.

## 2.1 Processing CSV Data

Comma separated value (CSV) data is a common *flat file* data representation.
In it, records are represented one per line in a file with individual data 
fields separated by commas.  It is easy enough to process such data if you 
already have them stored in a `String`: you can use Java's `split()` method
to *tokenize* the data into an array of string *tokens*.  Example:

```java
String data = "Hello,World,How,Are,You?";
String tokens[] = data.split(",");
for(int i=0; i<tokens.length; i++) {
  System.out.println(tokens[i]);
}
```

which would result in the output: 
```text
Hello
World
How
Are
You?
```

## 2.2 Formatted Output

In Java you can use `String.format()` to format a `String` and save it
to a variable or you can use `printf()` of `PrintWriter` to output the result
to a file.

Both methods take a *variable* number of arguments.  The first
argument is a string that specifies a *format* in which to print the 
subsequent arguments.  Various flags can be used to print different types of 
variable values in a specific format. Some of the major flags
supported:

* `%Ns` - print the argument as a string, right-justified with at least `N`
    characters. If the string value is less than `N`, it will be padded
    out with spaces. Variations on this flag can be used to change the
    padding character and to left-justify (negative `N`) instead.

* `%Nd` - print the argument as an integer with at least `N` spaces.

* `N.Mf` - print the argument as a floating point number with at least `N`
    characters (including the decimal) and at most `M` decimals of
    precision.

A full example of both, where `output` is a `PrintWriter`

```java
String a = "hello"; 
int b = 42;
double c = 3.1418;
String result = String.format("%10s, %5d\t%5.2f\n", a, b, c);
output.println(result);

//alternatively:
output.printf("%10s, %5d\t%5.2f\n", a, b, c);
```

This code snippet would result in the following output (dots
have been added to highlight *added* the spaces)

```text
.....hello, ...42     .3.14
```


## 3. Activities 

    
### 3.1 File Processing

1.  Open `Baseball.java` and `Team.java` source files. 
    The `Team` class has already been implemented for you.  You can create an instance of an object by using the `new` keyword to
    call the class's constructor.  For example:  
    ```java
    //Huskers had 8 wins, 4 losses:
    Team t = new Team("Huskers", 8, 4);
    ```

2.  Much of the code has been provided for you, including code to sort 
    the teams by win percentage and print them out (study this code as
    it may be useful in future assignments).

3.  Finish implementing the `loadData()` method by adding code to open
    the `mlb_nl_2011.csv` data file (in the `data` directory), process
    it line-by-line and create individual `Team` instances.

#### 3.2 File Output

In this activity, you will write a method to output the sorted team list
to a *file* rather than the standard output.  To output to a file, use 
 class `PrintWriter` which supports easy output to files. A full example:

```java
try {
  PrintWriter pw = new PrintWriter("path/to/filename.txt");
  pw.write("you can output a string directly using this method!");
  pw.printf("Or you can use printf!\n");
  pw.close();
} catch (FileNotFoundException fnfe) {
  throw new RuntimeException(fnfe);
}
```
Add the following method to the `Baseball.java` source file that 
takes a list of teams and an output file name and outputs
the team data to that file.  

`public static void persistData(List<Team> teams, String outputFileName)`
- The format is up to you
- The filename is up to you
- Call your method from the `main`
- After running your program, please manually check whether the file is created with the sorted teams

### 4. Testing, Submitting & Grading

* Test your programs locally on your computer using the provided JUnit test suite (only one).  Fix any
errors and completely debug your programs.
* Submit the following file to CodePost:
  * `Baseball.java`
* Make sure that your program passes  the test (Only one) on CodePost. For this lab, as long as your program passes  the test on Codepost, you will get full points for the lab.

