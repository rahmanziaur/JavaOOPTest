import java.util.List;

/**
 * Created by User PC on 11/1/16.
 */
public class ReadStudentAll {

    public static void main(String[] args)
    {
        ServiceClass serviceClass = new ServiceClass();

        List<Student> students = serviceClass.ReadFromDB();

        if (students!=null){
            for(int i=0; i<students.size(); i++){
            Student std = students.get(i);
             System.out.println(std.getId()+" "+std.getName());
        }
        }



    }
}
