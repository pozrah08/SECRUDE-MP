
package View;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Security {
    
    public Security(){
        
    }
    
    public static String cleanString(String input){
        //remove the ff characters ', <, >, #, \, ;
        input = input.replaceAll("['<>#\\\\;]", "");
        System.out.println(input);
        return input;
    }
    
    public static void updateLog(String info) throws IOException{        
            FileWriter fileWriter = new FileWriter("logs/Logs.txt", true);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println(info);
            writer.close();        
    }
    
}
