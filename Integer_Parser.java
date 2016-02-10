import java.util.*;
import java.lang.*;
import java.io.*;

class Integer_Parser{
      
        public stringToInt(String s){
          boolean isNegative = false;
          if(s.charAt(0) == '-'){
            isNegative = true;
          }
          int answer = 0;
          for(int i = 0;i<s.length();i++){
            answer += s.charAt(i) - '0';
            answer *= 10;
          }
          if(isNegative){
            answer *= -1;
          }
          return answer;
        }

}
