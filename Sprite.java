import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Sprite {

    private Scanner file;
    private String[][] sprite;
    private String spriteFolder = "Sprites";
    //C:\Users\jkcca\IdeaProjects\SpriteGame\src\Sprites\Sprites.txt

    public Sprite(String fileName) {

        //File fileFile = new File( spriteFolder + "\\" + fileName);
        File fileFile = new File("C:\\Users\\jkcca\\IdeaProjects\\SpriteGame\\src\\Sprites\\Sprites.txt");

        try {
            file = new Scanner(fileFile);
        }catch (FileNotFoundException ex){
            System.out.println("*** Cannot open " + fileName + " ***");
            System.exit(1);  // quit the program
        }

        sprite = new String[Integer.parseInt(file.next())][Integer.parseInt(file.next())];
        file.nextLine();

        for(int row = 0; row < sprite[0].length; row++){
            String line = file.nextLine();

            for(int col = 0; col < sprite.length; col++){
                if(line.length() < col){
                    sprite[col][row] = String.valueOf(line.charAt(col));
                }else{
                    sprite[col][row] = " ";
                }
            }
        }



    }

    public void printSprite(){
        for(int row = 0; row < sprite[0].length; row++){
            for(int col = 0; col < sprite.length; col++){
                //System.out.print(sprite[col][row]);
                System.out.print("/");
            }
            System.out.println("");
        }
    }

}
