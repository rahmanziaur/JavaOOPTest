import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by habib on 3/10/17.
 */
public class Util {
    public static void writeToFile(String filePath, String jsonString){
        try {
            FileWriter file = new FileWriter(filePath);
            file.write(jsonString);
            file.flush();
            System.out.println("---------- successfull ------------");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR:: File write error."+e.getMessage());
        }
    }

    public static JSONObject readFromFile(String filePath) throws Exception{
        JSONParser parser = new JSONParser();
        return (JSONObject)parser.parse(new FileReader(filePath));
    }
}
