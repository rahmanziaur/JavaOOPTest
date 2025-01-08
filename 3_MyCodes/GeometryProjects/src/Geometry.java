import java.util.Date;

/**
 * Created by Monir on 8/21/16.
 */
public class Geometry {

    private String color;
    private boolean filled;
    private Date dateCreated;

    public Geometry()
    {
        this.dateCreated = new java.util.Date();
    }

    public Geometry(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return this.filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public Date getDateCreated()
    {
        return this.dateCreated;
    }

    public String toString()
    {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

}
