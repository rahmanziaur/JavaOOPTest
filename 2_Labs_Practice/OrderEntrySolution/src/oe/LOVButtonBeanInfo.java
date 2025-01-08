package oe;
import java.beans.SimpleBeanInfo;
import java.beans.BeanDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.IntrospectionException;

public class LOVButtonBeanInfo extends SimpleBeanInfo 
{
  public PropertyDescriptor[] getPropertyDescriptors()
  {
    try
    {
      PropertyDescriptor _text = new PropertyDescriptor("text", LOVButton.class, "getText", "setText");
      _text.setDisplayName("text");
      _text.setShortDescription("text");
      PropertyDescriptor _name = new PropertyDescriptor("name", LOVButton.class, "getName", "setName");
      _name.setDisplayName("name");
      _name.setShortDescription("name");
      PropertyDescriptor _values = new PropertyDescriptor("values", LOVButton.class, "getValues", "setValues");
      _values.setDisplayName("values");
      _values.setShortDescription("values");
      PropertyDescriptor _title = new PropertyDescriptor("title", LOVButton.class, "getTitle", "setTitle");
      _title.setDisplayName("title");
      _title.setShortDescription("title");
      PropertyDescriptor _message = new PropertyDescriptor("message", LOVButton.class, "getMessage", "setMessage");
      _message.setDisplayName("message");
      _message.setShortDescription("message");
      PropertyDescriptor[] pds = new PropertyDescriptor[] {_message, _title, _values, _name, _text};
      return pds;
    }
    catch(IntrospectionException e)
    {
      e.printStackTrace();
      return null;
    }

  }
}