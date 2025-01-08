package oe;
import javax.swing.JButton;
import java.util.List;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class LOVButton extends JButton 
{
  private String title;
  private String message;
  private List values;

  public LOVButton()
  {
    title = "List of Values";
    message = "Select a value from the list";
    values = null;
    setText(getName());
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String newTitle)
  {
    title = newTitle;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String newMessage)
  {
    message = newMessage;
  }

  public List getValues()
  {
    return values;
  }

  public void setValues(List newValues)
  {
    values = newValues;
  }

  public Dimension getPreferredSize()
  {
    return super.getPreferredSize();
  }

  public Object showList()
  {
    Object selectedValue = null;
    Object[] choices = null;

    if (values != null && values.size() > 0)
    {
      choices = values.toArray();
      selectedValue = JOptionPane.showInputDialog(null, message, title,
                          JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
    }
    return selectedValue;
  }
}