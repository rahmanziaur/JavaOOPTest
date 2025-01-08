import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 3/16/15.
 */
public class Calculator implements ActionListener {
   JFrame jFrame;
   JPanel flow;
   JTextField jTextField;
   JButton one, two, three, four, five, six, seven, eight, nine, ten, zero, equal, add, sub, mul, div, clear;
   String textFieldValue="";
    double sum=0, sum1=0;
    int sign;

    public Calculator()
    {
        jFrame = new JFrame("Calculator");


        flow = new JPanel(new FlowLayout(FlowLayout.LEFT, 4,2));


        jTextField = new JTextField(32);
        one = new JButton("1");
        one.addActionListener(this);
        two = new JButton("2");
        two.addActionListener(this);
        three = new JButton("3");
        three.addActionListener(this);
        four = new JButton("4");
        four.addActionListener(this);
        five = new JButton("5");
        five.addActionListener(this);
        six = new JButton("6");
        six.addActionListener(this);
        seven = new JButton("7");
        seven.addActionListener(this);
        eight = new JButton("8");
        eight.addActionListener(this);
        nine = new JButton("9");
        nine.addActionListener(this);
        zero = new JButton("0");
        zero.addActionListener(this);
        equal = new JButton("=");
        equal.addActionListener(this);
        add = new JButton("+");
        add.addActionListener(this);
        sub = new JButton("-");
        sub.addActionListener(this);
        mul = new JButton("X");
        mul.addActionListener(this);
        div = new JButton("/");
        div.addActionListener(this);
        clear = new JButton("C");
        clear.addActionListener(this);

        flow.add(jTextField);
        flow.add(one);
        flow.add(two);
        flow.add(three);
        flow.add(four);
        flow.add(five);
        flow.add(six);
        flow.add(seven);
        flow.add(eight);
        flow.add(nine);
        flow.add(zero);
        flow.add(equal);
        flow.add(add);
        flow.add(sub);
        flow.add(mul);
        flow.add(div);
        flow.add(clear);




        jFrame.add(flow);

        jFrame.setSize(380, 120);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException{
        if(e.getSource()==one)
        {
            textFieldValue = textFieldValue+"1";
            jTextField.setText(textFieldValue);
        }
        if(e.getSource()==two)
        {
            textFieldValue = textFieldValue+"2";
            jTextField.setText(textFieldValue);
        }
        if(e.getSource()==three)
        {
            textFieldValue = textFieldValue+"3";
            jTextField.setText(textFieldValue);
        }
        if(e.getSource()==four)
        {
            textFieldValue = textFieldValue+"4";
            jTextField.setText(textFieldValue);
        }
        if(e.getSource()==five)
        {
            textFieldValue = textFieldValue+"5";
            jTextField.setText(textFieldValue);
        }
        if(e.getSource()==six)
        {
            textFieldValue = textFieldValue+"6";
            jTextField.setText(textFieldValue);
        }
        if(e.getSource()==seven)
        {
            textFieldValue = textFieldValue+"7";
            jTextField.setText(textFieldValue);
        }
        if(e.getSource()==eight)
        {
            textFieldValue = textFieldValue+"8";
            jTextField.setText(textFieldValue);
        }
        if(e.getSource()==nine)
        {
            textFieldValue = textFieldValue+"9";
            jTextField.setText(textFieldValue);
        }
        if(e.getSource()==zero)
        {
            textFieldValue = textFieldValue+"0";
            jTextField.setText(textFieldValue);
        }
        if(e.getSource()==clear)
        {
            textFieldValue="";
            jTextField.setText(textFieldValue);
        }
        if (e.getSource()==add)
        {
            sign = 1;
             sum = sum + Double.parseDouble(textFieldValue);
            textFieldValue="";
            jTextField.setText(textFieldValue);

        }
        if (e.getSource()==sub)
        {
            sign = 2;
            if (sum!=0)
            {
            sum = sum - Double.parseDouble(textFieldValue);
                textFieldValue="";
                jTextField.setText(textFieldValue);
            }
            if (sum==0)
            {
            sum = Double.parseDouble(textFieldValue);
                textFieldValue="";
                jTextField.setText(textFieldValue);
            }

        }

        if(e.getSource()== mul)
        {
            sign = 3;
            if(sum==0)
            {
                sum = Double.parseDouble(textFieldValue);
                textFieldValue="";
                jTextField.setText(textFieldValue);
            }
            else
            {
            sum = sum * Double.parseDouble(textFieldValue);
            textFieldValue="";
            jTextField.setText(textFieldValue);
            }
        }
        if(e.getSource() == div)
        {
            sign = 4;
            if(sum==0)
            {
                sum = Double.parseDouble(textFieldValue);
                textFieldValue="";
                jTextField.setText(textFieldValue);
            }
            else
            {
                sum = sum/Double.parseDouble(textFieldValue);
                textFieldValue="";
                jTextField.setText(textFieldValue);
            }
        }

        if(e.getSource()==equal)
        {
            sum1 = Double.parseDouble(textFieldValue);

            if(sign==1)
            {
            sum =  sum + sum1;
            textFieldValue = Double.toString(sum);
            jTextField.setText(textFieldValue);
            textFieldValue = "";
            sum = 0;
            sum1 = 0;
            }
            if(sign==2)
            {
                sum = sum - sum1;
                textFieldValue = Double.toString(sum);
                jTextField.setText(textFieldValue);
                textFieldValue = "";
                sum = 0;
                sum1 = 0;
            }
            if(sign==3)
            {
                sum = sum * sum1;
                textFieldValue = Double.toString(sum);
                jTextField.setText(textFieldValue);
                textFieldValue = "";
                sum = 0;
                sum1 = 0;
            }
            if(sign==4)
            {
                if(sum1==0)
                {
                    jTextField.setText("~");
                    textFieldValue = "";
                    sum = 0;
                    sum1 = 0;
                }
                else
                {
                 sum = sum / sum1;
                    textFieldValue = Double.toString(sum);
                    jTextField.setText(textFieldValue);
                    textFieldValue = "";
                    sum = 0;
                    sum1 = 0;
                }
            }
        }
    }

    public static void main(String[] arg)
    {
        new Calculator();

    }

}
