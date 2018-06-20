package tictactoe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class LoadSave {
   int i,j;
   String FileName;
   int user_score = 0;
   int computer_score = 0;
   //�뙆�씪�깮�꽦
   
   LoadSave() {
      FileName = null;
   }
   
   
   public void run(int WHO, String FileName)  {
	   calculate(WHO);
	   try {
		   saveResult(FileName);
	   } catch (FileNotFoundException e) {
		  e.printStackTrace();
	   }
	   printResult(FileName); 
   }
   
   // score 
   public void calculate(int WHO) {
      switch(WHO) {
      case 1:
         user_score++;
         break;
      case 2:
         computer_score++;
         break;
   }
      }
   
   public void saveResult(String FileName) throws FileNotFoundException {
	   	   
       PrintWriter output = new PrintWriter(FileName);
  
       output.print("User : Computer  " + user_score +" : "  + computer_score);
     
       output.close();
   }
   //출력
   public void showResult(String FileName) throws FileNotFoundException {
   	   
       PrintWriter output = new PrintWriter(FileName);

       System.out.println("");
       System.out.println("<<Total Score>>");
       output.println("User : Computer ");
       output.println(user_score + " : " + computer_score);

       
      
      
       if( user_score == computer_score ) {
          output.println("DRAW!!");
          System.out.println("DRAW!!");
       }
       else if(user_score < computer_score ) {
          output.println("COMPUTER WIN!!");
          System.out.println("COMPUTER WIN!!");
       }
       else if(user_score > computer_score ) {
          output.println("USER WIN!!");
          System.out.println("USER WIN!!");
       }
       output.close();
   }
   
   public void printResult(String fileName) {
      Scanner inputStream = null;
      
      try {
         inputStream = new Scanner(new File(fileName));
      }
      catch (FileNotFoundException e){
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
      }
      
      while(inputStream.hasNext()) {
         String line = inputStream.nextLine();
         System.out.println(line);
      }
      inputStream.close();
   }
}

