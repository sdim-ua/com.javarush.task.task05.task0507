/* 
Среднее арифметическое
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 1 ;
        int count = -1;
        
         while (true){
             
          int numb1 = Integer.parseInt(reader.readLine());
          sum = sum + numb1;
          count ++;
          if (numb1 == -1){
              break;
          }
        } 
        
    System.out.println((double)(sum ) / (count));     
    }
   
}
