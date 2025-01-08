import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Zia on 3/10/17.
 */
public class WriteJsonToFile {

    public static void main(String[] args) throws IOException {

        String filepath = "test.json";

        Student student = new Student(1, "Md. habibur rahaman", "it-08045", "2007-2008");
        Student student1 = new Student(1, "Ziaur rahaman", "it-08001", "2007-2008");
        JSONArray tt= new JSONArray();
        tt.add(student);
        tt.add(student1);

//      Way-01:
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(filepath), tt);
        //mapper.writeValue(new File(filepath), student1);
        //mapper.writer(student1);


        // Way-02:
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            String studentString = mapper.writeValueAsString(student);
//            Util.writeToFile(filepath,studentString);
//        } catch (IOException e) {
//            System.out.println("ERROR:: "+e.getMessage());
//        }
   }




}
