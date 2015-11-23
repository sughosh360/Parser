import java.util.*;
import java.lang.*;
import java.io.*;

class String_Parser
{
	public static final MAX_NO_OF_DIGITS = 10;
	
	public String intToString(int number){
		boolean isNegative = false;
		char[] buffer = new char[MAX_NO_OF_DIGITS+1];
		if(number < 0){
			number = number*-1;
			isNegative = true;
		}
		int i = 0;
		do
		{
			buffer[i++] = number/10 +'0';
			number/=10;
		}
		while(number!=0);
		StringBuffer sb = new StringBuffer();
		if(isNegative){
			sb.append("-");
		}
		while(i>0){
			sb.append(buffer[--i]);
		}
		return sb.toString();
	}
	
}
