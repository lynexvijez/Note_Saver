
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Notes2 {

    static File file = new File("Notes.txt");
    static Scanner scanner;              
    

    static void addNotes(String written) {
        try{
        FileWriter writer = new FileWriter(file,true);
        writer.write(written +System.lineSeparator());    //add line separator so that the line skips to the next line
        writer.flush();                                 //note the new shit... makes sure that the data is saved
        writer.close();
            System.out.println("Note added successfully");
        }catch(Exception e){
            System.out.println("An error occured while adding notes");
        }
        }
    

    static void deleteNotes(int delete1) {
        // ill come to this later

    }

    static void readNotes() {
      try {
          scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }} catch (Exception e) {
      }finally{
        scanner.close();
      }
        
    }
}
// always use exception handling to avoid errors while using file handling
// note scanner.flush();

/*Difference Between file and "Notes.txt"
Using new File("Notes.txt") creates a File object, allowing operations like checking existence, deletion, etc.

Using "Notes.txt" directly in FileWriter means treating it as a filename without any additional file properties. */