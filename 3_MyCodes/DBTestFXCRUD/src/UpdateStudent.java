import java.util.List;
import java.util.Scanner;
/**
 * Created by User PC on 11/1/16.
 */
public class UpdateStudent {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to which Name you want to Edit:");
        int studentSerial = sc.nextInt();

        System.out.print("Enter the Name you prefer instead of:");
        String newName = sc.next();

        ServiceClass serviceClass = new ServiceClass();
        serviceClass.UpdateStudent(studentSerial, newName);

        List<Student> students = serviceClass.ReadFromDB();

        if (students!=null){
            for(int i=0; i<students.size(); i++){
                Student std = students.get(i);
                System.out.println(std.getId()+" "+std.getName());
            }
        }
    }

}
