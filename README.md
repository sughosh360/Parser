# Parser
This is a string parser and an integer parser written in java.

The Integer to String parser logic:
    The given number can be negative or positive.For negative numbers,we need to take care of the negative sign.If negative we multiply it by -1 and make it positive and we set a flag (here isNegative to false).We use a buffer to store the digits from last from first and use a StringBuilder to store the digits in the buffer in reverse order.The reason forusing StringBuilder over String is that while concatenating two strings, a new string is created and two strings are copied to this new string but in the case of StringBuffer,an array of strings to be copied is maintained and a toString() method can be used whenever we want to convert it to a string.

The String to Integer parser logic:
    First check the first character of the string if it is negative and if it is set a flag to true and move to next character.Now we consider the string as an array of character where each character represents a digit.Now we initialize a variable say number to zero.Considering each digit from left to right,we subtract '0'(ascii value) from  each character and add to number.Each time after addition we multiply it with 10 and run the loop for all the digits in the string.If the negative flage is set,we multiply the number with -1 and return the number else we return the number as it is.
