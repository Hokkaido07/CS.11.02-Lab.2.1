 # CS.11.02-Lab.2.1

Your task is to implement all of the methods described below in a class called Main.
You should pass all of the tests in the MainTest class (provided).

When we wish to output a value to the console, we use the statement:

System.out.print(insertValueThatYouWishToPrintHere) to print on the same line.
System.out.println(insertValueThatYouWishToPrintHere) to print on different lines.

In intelliJ, a neat shortcut for the print statement is to type “sout” and press enter.
In intelliJ, a neat shortcut to create a main method is to type “main” and press enter.	

Ensure that your parameter names are meaningful variable names.

Ensure that all the methods that you write in this lab are declared to be static. 

Ensure that all the methods that you write in this lab contain a return statement. That is, none of the methods that you write in this lab will contain print statements. 

1. Write a method called <b>add</b> that takes two integers, adds them together, and returns the result. 
Below is an example of a call to the add method.

add(3,8) → 11	

Call your add method in the main method and see that it works as intended. When you call it, store it into an appropriately named variable and then print out that variable. 

2. Write a method called <b>add</b> that takes four integers, adds them together, and returns the result. Make sure to call the add method that takes two integers (the add method that you wrote in 1.) <b>thrice</b> inside this method.
Below is an example of a call to the add method.

add(3,8,4,9) → 24	

Call your add method in the main method and see that it works as intended. When you call it, store it into an appropriately named variable and then print out that variable. 

3. Write a method called <b>morningGreeting</b>. 
Below is an example of a call to the morningGreeting method.

morningGreeting(“Toby Fox”) → 早上好, Toby Fox!		

Call your morningGreeting method in the main method and see that it works as intended.	 When you call it, store it into an appropriately named variable and then print out that variable. 

4. Write a method called <b>afternoonGreeting</b>
Below is an example of a call to the morningGreeting method.

afternoonGreeting(“Mac Miller”) → 下午好, Mac Miller!	

Call your afternoonGreeting method in the main method and see that it works as intended. When you call it, store it into an appropriately named variable and then print out that variable.

5. Write a method called <b>triple</b>
Below is an example of a call to the triple method.

triple(“oohbaby”) → prints “oohbabyoohbabyoohbaby”	

Call your triple method in the main method and see that it works as intended. When you call it, store it into an appropriately named variable and then print out that variable. 

6. Write a method called <b>half</b> that takes an integer and returns half of its value.  
Below is an example of a call to the half method.

half(8) → 4.0

half(17) → 8.5	

Call your half method in the main method and see that it works as intended. When you call it, store it into an appropriately named variable and then print out that variable.  

7. Write a method called <b>roundPositiveValueToNearestInteger</b> that takes a double that is positive and rounds this value to the nearest integer. 
Below is an example of a call to the half method.

roundPositiveValueToNearestInteger(8.5) → 9

roundPositiveValueToNearestInteger(8.49) → 8	

Call your roundPositiveValueToNearestInteger method in the main method and see that it works as intended. When you call it, store it into an appropriately named variable and then print out that variable. Use casting in your solution to achieve the desired output. 

8. Write a method called <b>roundNegativeValueToNearestInteger</b> that takes a double that is negative and rounds this value to the nearest integer.
Below is an example of a call to the half method.

roundNegativeValueToNearestInteger(-8.5) → -9

roundNegativeValueToNearestInteger(-8.49) → -8	

Call your roundNegativeValueToNearestInteger method in the main method and see that it works as intended. When you call it, store it into an appropriately named variable and then print out that variable. Use casting in your solution to achieve the desired output. 
