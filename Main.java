import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {

	public int width = 100;
	public int height = 50;
	public String[][] display = new String[width][height];
  private static char input;
  private static boolean running = true;

	public static void main(String args[]){
		//Sprite man = new Sprite("Sprites.txt");

		checkwasd();
	}



  public static void checkwasd(){
    File file= new File("Input.txt");
    Scanner inputted = new Scanner(System.in);

    try
    {
      inputted = new Scanner(file);
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("*** Cannot open " + "pathname" + " ***");
      System.exit(1);  // quit the program
    }


    try{
      PrintWriter output = new PrintWriter(file);
      while(running){
        if(inputted.hasNext()){
          input = inputted.next().charAt(0);
          mainLoop();
          output.print("");
        }
      }
      output.close();
    }catch (FileNotFoundException ex){
      System.out.println(" Cannot create " + "pathname" + " ");
      System.exit(1);  // quit the program
    }
  }


  public static void mainLoop(){
    if(input == 'q'){
      running = false;
    }

    System.out.println("Input = " + input);
  
  }












}




