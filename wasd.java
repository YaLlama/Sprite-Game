import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
class wasd{
  private static Scanner input;
  public static void main(String[] args) {
    long length = 0;
    while(true){
      File file= new File("Input.txt");
      if(file.length() != length){
        System.out.print(checkwasd('w'));
        length = file.length();
      }
    }
  }
  public static String checkwasd(char type){
    String pathname = "Input.txt";
    File file= new File(pathname);
    try
    {
      input = new Scanner(file);
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("*** Cannot open " + pathname + " ***");
      System.exit(1);  // quit the program
    } 
    while(input.hasNextLine()){
      String word = input.next();
      return word.substring(word.length()-1);
    }
    return null;
  }
}
