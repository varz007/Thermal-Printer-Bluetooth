import java.io.*;
public class Printtest{
    public static void main (String[] argv) {
        try {
            FileOutputStream os = new FileOutputStream("COM3");
            //wrap stream in "friendly" PrintStream
            PrintStream ps = new PrintStream(os);
 
            //print text here
            ps.println("\n \n YE \n HAI \n  APNA \n DETAILS \n \n");
 
            //form feed -- this is important
            //Without the form feed, the text will simply sit
            // in print buffer until something else gets printed.
            ps.print("\f");
            //flush buffer and close
            ps.close();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
