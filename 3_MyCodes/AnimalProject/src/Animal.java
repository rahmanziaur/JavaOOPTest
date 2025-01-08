import java.util.Date;

/**
 * Created by Monir on 8/23/16.
 */
public class Animal {

    private Date dateOfBirth;
    private String color;
    private boolean horned;

    public Animal()
    {
     dateOfBirth = new Date();
    }

    public Animal(String color, boolean horned)
    {
        this.color = color;
        this.horned = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHorned() {
        return horned;
    }

    public void setHorned(boolean horned) {
        this.horned = horned;
    }

    public String toString()
    {
        return "\nDate of Birth:"+dateOfBirth+"\nThe Color:"+getColor()+"\nHas it horn:"+isHorned();
    }

}
