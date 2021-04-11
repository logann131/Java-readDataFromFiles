/* Nam Phu Nguyen (Logan)
   CS141 
   Programing Assignment#1, 9/30/2018
   This program helps calculate and print out the working information that is given in a file.
   */

import java.io.*; // io.* pakage 
import java.util.*; //util.* package
class draft{

   
   public static void main(String[] args)
      throws FileNotFoundException{ //throw Exception
      
         Scanner input = new Scanner (new File ("CS141Assign14.txt")); //Scanner object
         while (input.hasNextLine()){ //test if there is another line 
         
     
            String line = input.nextLine(); // store new line into line
            
            
            if ((line.length() == 0)){ //if there is an empty line, skip it and continue
               continue; 
            } else { // otherwise make the calculation
            
            
            
            Scanner lineScan = new Scanner (line); //lineScan is allowed to read the token in each line 
            String name = lineScan.next(); //string token
            double hourlySal = lineScan.nextDouble(); // double token
            int sum = 0; // sum of the hours
            while (lineScan.hasNext()){ //if there is another token
            
               sum += lineScan.nextInt(); //sum the hours up
               
            
            }
            double grossPay = (double) hourlySal*sum; //calculate the gross Pay
            System.out.printf("%s worked for a total of: %d hours. At %.2f dollar/hour an hour for a gross pay of $%.2f. %n", name, sum, hourlySal,grossPay); //print out the information

            if (grossPay >= 400){ // whoes gross Pay are over 400, they gotta pay 33% taxes
            
               grossPay = (double) grossPay - (grossPay * 33/100);
               System.out.printf("After 33%% taxes their total net pay should be $%.2f %n", grossPay);
            } else { // whoes gross Pay are less than 400, they gotta pay 33% taxes
               grossPay = (double) grossPay - (grossPay * 25/100);
               System.out.printf("After 25%% taxes their total net pay should be $%.2f%n", grossPay);
               
            
            }
            System.out.println();
            
                        
            
         
         
         }
         }
         
      
      }


} //end here 