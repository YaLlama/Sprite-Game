import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {

  public static final int width = 100;
  public static final int height = 50;
  public static String[][] display = new String[width][height];
  private static String userInput;
  private static boolean running = true;
  private static File file;
  private static Scanner inputTXT;
  private static String fileName = "Input.txt";
  //"C:\\Users\\jkcca\\IdeaProjects\\SpriteGame\\src\\Input.txt"

  public static void main(String args[]) {

    //initializing sprites

    //Sprite man = new Sprite("Sprites.txt");






    //mainLoop

    file = new File(fileName);

    int fileLength = (int)file.length();

    while (running) {
      if(fileLength < file.length()){
        fileLength = (int)file.length();
        try{
          inputTXT = new Scanner(file);
          if (inputTXT.hasNextLine()) {
            userInput = inputTXT.nextLine();
            userInput = userInput.substring(userInput.length()-1);
            mainLoop();
          }
        }catch(FileNotFoundException ex){
          System.out.println("*** Cannot Read " + fileName + " ***");
          System.exit(1);  // quit the program
        }
      }
    }
    try{
      PrintWriter output = new PrintWriter(file);
      output.print("");
      output.close();
    }catch(FileNotFoundException ex){
      System.out.println("*** Cannot Modify " + fileName + " ***");
      System.exit(1);  // quit the program
    }












  }

  private static void mainLoop(){
    if(userInput == "q"){
      running = false;
    }





    System.out.println("Input = " + userInput);

  }


}




