# Parser
This is a string parser and an integer parser written in java.

The Integer to String parser logic:
    The given number can be negative or positive.For negative numbers,we need to take care of the negative sign.If negative we multiply it by -1 and make it positive and we set a flag (here isNegative to false).We use a buffer to store the digits from last from first and use a StringBuilder to store the digits in the buffer in reverse order.The reason forusing StringBuilder over String is that while concatenating two strings, a new string is created and two strings are copied to this new string but in the case of StringBuffer,an array of strings to be copied is maintained and a toString() method can be used whenever we want to convert it to a string.

The String to Integer parser logic:
    First check the first character of the string if it is negative and if it is set a flag to true and move to next character.
