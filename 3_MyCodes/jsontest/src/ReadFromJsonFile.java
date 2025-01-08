import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;

/**
 * Created by Md. Zia on 3/10/17.
 */
public class ReadFromJsonFile {

    public static void main(String[] args){
        String filePath = "test.json";
        try {

            // Way-01: direct file to java object
//            ObjectMapper mapper = new ObjectMapper();
//            Student student = mapper.readValue(new File(filePath), Student.class);
//            System.out.println("way-01:"+student.getId());
//            System.out.println("way-01:"+student.getName());
//            System.out.println("way-01:"+student.getRole());


            // Way-02: direct file to java object
            ObjectMapper mapper = new ObjectMapper();
            JSONObject jsonObject = Util.readFromFile(filePath);
            // Now convert this JSONObject to java Student object
            Student student = mapper.readValue(jsonObject.toString(), Student.class);
            //Way 2
            System.out.println("SL:"+student.getId());
            System.out.println("Name:"+student.getName());
            System.out.println("Student ID:"+student.getRole());
            System.out.println("Session:"+student.getSession());
            //System.out.println("way-02:"+jsonObject.toString());


        } catch (Exception e) {
            System.out.println("ERROR:: error occurred when reading json from file."+e.getMessage());
        }
    }
}