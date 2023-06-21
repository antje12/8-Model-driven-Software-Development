# Assignment 2

This time around we'll be trying to create an external DSL, more specifically a math interpreter.

This repository contains an Xtext project. Should you have any issues compiling from this repository, you can create a new Xtext project and add this files afterwards. You may then rewrite this git repository using the `git push --force` flag, as this repository functions as your hand-in, like in assignment 1. Note: if the package names don’t match, you can fix this by making sure to use what Xtext generated for you, i.e., keeping the header of the files and only replacing the “body”.

The project contains files for:

- Xtext Grammer
- Xtext Generator (interpreter)
- Unit-tests

## What do do


1. Fix the broken implementation sketch by removing the use of left recursion and updating the corresponding generator accordingly. 
    - When updated correctly, the runtime eclipse will display a dialog box with the hardcoded result **87** (note: takes a short while to build the first time you run it) and will print part of the structure of your expression on standard out (which is visible in the "parent eclipse"). 
2. Complete the implementation sketch to compute the actual value of the mathematical expression and to print the complete expression. <span color="color:blue">Bettini Chapter 8 should be very helpful</span>. 

Use the JUnit test to check how well your implementation works, and report on whether it passes all JUnit tests in a given test class. 

- Optionally extend the parser and interpreter. 
- Optionally replace the dialog box with a hovering box, as shown in Bettini.

## Handing-in

The last commit before the deadline function as your hand-in. After hand-in a survey will become available, that we'd like for you to fill :).

If you have any questions you may reach out to me at niean15@student.sdu.dk.

Unfortunately, due to the nature of how eclipse runs the Xtext environment, we are unable to run your tests headless in GitLab, as such <span style="color:red">**please include a screenshots of your tests and place this screenshot in the root of your repository**</span>, such that we may validate your submission.
