
/**
 * Write a description of class Assessment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;
public class StudentScoreStatistics{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the file name: ");//F1:The user will provide the file name.
        String fileName = userInput.nextLine();
    try (Scanner scanner = new Scanner(new File("prog5001_students_grade_2022.csv"))){//F1:reads the unit name and students' marks from a given text file.
            int lineCount = 0;
     while (scanner.hasNextLine()) {//Read file line by line.
        lineCount++;
        String input = scanner.nextLine();
        String[] parts = input.split(",");//Using a comma delimiter to split the data.
    if(lineCount == 1){//F1: reads the unit name.
        String unitName = parts[0]; 
        System.out.println(unitName);
        System.out.println();
    }else if(lineCount >= 3){//Read data starting from the third line and beyond.
        String studentName = parts[0] + " " + parts[1];
        String studentID = parts[2];
        double assignment1 = 0.0;
        double assignment2 = 0.0;
        double assignment3 = 0.0;
        // Check and extract score data. 
        // Fill empty places with default value 0.0.
    if(parts.length >=4 && !parts[3].isEmpty()){
            assignment1 = Double.parseDouble(parts[3]);
        }
    if(parts.length >=5 && !parts[4].isEmpty()){
            assignment2 = Double.parseDouble(parts[4]);
        }
    if(parts.length >=6 && !parts[5].isEmpty()){
            assignment3 = Double.parseDouble(parts[5]);
        }
        double totalMark = assignment1 + assignment2 + assignment3;//F2: calculates the total mark.
        System.out.println("Student " + (lineCount - 2) + "Name: " + studentName);//F2:Print Student Names.
        System.out.println("Student " + (lineCount - 2) + "ID: " + studentID);//F2:Print Student ID.
        System.out.println("Assignment1: " + assignment1 + "  ");
        System.out.println("Assignment2: " + assignment2 + "  ");
        System.out.println("Assignment3: " + assignment3);
        System.out.println("Totals: " + totalMark);//F2:Print Total Marks.
        System.out.println();
      }
   }
  }catch (FileNotFoundException e) {
    System.out.println("File not found: " + "prog5001_students_grade_2022.csv");
  }
 }
}



   
    

