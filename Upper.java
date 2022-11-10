import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

///import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;
public class Upper {
    public static void main(String[] args) throws IOException{
        //Create a new File
        File myfile = new File("Sample.txt");
        myfile.createNewFile();
        //Write in new File
        FileWriter fw = new FileWriter("Sample.txt");
        fw.write("This is new File");
        fw.close();
        //Reading a File 
        String Up,Up1;
        Scanner sc = new Scanner(myfile);
        while(sc.hasNextLine())
        {
            StringBuilder ch = new StringBuilder();

            Up = sc.next();
            Up1 = Up.toUpperCase();
            ch.append(Up1);
            ch.reverse();

            System.out.print(ch);
        }
        sc.close();
        
    }    
}
