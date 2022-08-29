import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE;
/**
 *
 * @author wulft
 * 
 * Demonstrates how to use Java NIO, a thread safe File IO library
 * to write a text file
 */
public class NIOWriteTextFile 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       // Test data the lines of the file we will write

        // uses a fixed known path:
       //  Path file = Paths.get("c:\\My Documents\\PersonReader.txt");
        
       // use the toolkit to get the current working directory of the IDE
       // will create the file within the Netbeans project src folder 
       // (may need to adjust for other IDE)
       // Not sure if the toolkit is thread safe...
       File workingDirectory = new File(System.getProperty("user.dir"));
       Path file = Paths.get(workingDirectory.getPath() + "\\src\\PersonReader.txt");
       
       try
       {
           // Typical java pattern of inherited classes
           // we wrap a BufferedWriter around a lower level BufferedOutputStream
           OutputStream out =
                   new BufferedOutputStream(Files.newOutputStream(file, CREATE));
           BufferedWriter writer = 
                   new BufferedWriter(new OutputStreamWriter(out));
           
           // Finally can write the file LOL!

           // stupid syntax for write rec
           // 0 is where to start (1st char) the write
           // rec. length() is how many chars to write (all)
           // adds the new line
           writer.close(); // must close the file to seal it and flush buffer
           System.out.println("Data file written!");
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
       
    }
    
}
