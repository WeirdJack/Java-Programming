# CSX42: File Metrics Calculator

```
Author: Bhargav Choudhury
e-mail: bchoudh4@binghamton.edu
```

-----------------------------------------------------------------------
## Description: 

A simple Java program to reverse the contents of a text file and calculate its metrics.

-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in wordPlay/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile <absolute-path>/build.xml clean
  
Note: Provide absolute path for the build.xml file

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile <absolute-path>/build.xml all

Note: Provide absolute path for the build.xml file

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile <absolute-path>/build.xml run -Darg0="<absolute-path>/input.txt" -Darg1="output.txt" -Darg2="metrics.txt"

Note: Argument "args0" accept the absolute path for input file, also provide absolute path for the build.xml file


-----------------------------------------------------------------------

## Data Structures

```
List<String>, HashMap<K,V>

Used List<~> to print the results to the console in an ordered manner

Used HashMap<K, V> for the key-value semantics so that I could store the value according to the key and retrieve it at a later point using the key.

```

-----------------------------------------------------------------------
## Sample Output

```
bchoudh4@remote03:~/Downloads/csx42-spring-2020-assign1-WeirdJack/wordPlay/src$ ant -Darg0="/home/bchoudh4/Downloads/csx42-spring-2020-assign1-WeirdJack/wordPlay/src/input.txt" -Darg1="output.txt" -Darg2="metrics.txt"  run
Buildfile: /import/linux/home1/bchoudh4/Downloads/csx42-spring-2020-assign1-WeirdJack/wordPlay/src/build.xml

jar:


run:
     [java] Hello World! Lets get started with the assignment
     [java] output.txt file is created
     [java] metrics.txt file is created
     [java] Printing output to console
     [java]
     [java] A wen tneduts sah deretsiger rof ngised snrettap ni eht gnirps fo 0202. gniruD eht retsemes eht stneduts
     [java] era gniog ot nrael doog ngised selpicnirp dna ngised senilediug ot eb dewollof nehw gnipoleved snoitacilppa.
     [java] llA gnimmargorp stnemngissa era ot eb enod ni avaJ.
     [java]
     [java] AVG_NUMBER_WORDS_PER_SENTENCE = 14.33
     [java] AVG_NUMBER_CHARS_PER_SENTENCE = 87.67
     [java] MAX_FREQ_WORD = design
     [java] LONGEST_WORD = applications
     [java]
     [java]  Contents of input.txt
     [java]
     [java] A new student has registered for design patterns in the spring of 2020. During the semester the students
     [java] are going to learn good design principles and design guidelines to be followed when developing applications.
     [java] All programming assignments are to be done in Java.
     [java]
     [java]  Contents of output.txt
     [java]
     [java] A wen tneduts sah deretsiger rof ngised snrettap ni eht gnirps fo 0202. gniruD eht retsemes eht stneduts
     [java] era gniog ot nrael doog ngised selpicnirp dna ngised senilediug ot eb dewollof nehw gnipoleved snoitacilppa.
     [java] llA gnimmargorp stnemngissa era ot eb enod ni avaJ.
     [java]
     [java]  Contents of metrics.txt
     [java]
     [java] AVG_NUMBER_WORDS_PER_SENTENCE = 14.33
     [java] AVG_NUMBER_CHARS_PER_SENTENCE = 87.67
     [java] MAX_FREQ_WORD = design
     [java] LONGEST_WORD = applications

BUILD SUCCESSFUL
Total time: 0 seconds

```

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken. "

Date: [02/06/2020]


