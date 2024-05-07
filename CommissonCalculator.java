package ComissonCalculator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;


public class CommissonCalculator implements ActionListener{
  public static void main(String[] args) {

    CommissonCalculator calculator = new CommissonCalculator();

    calculator.CommissonGui();

  }

  JFrame frame;
  JLabel pricelabel;
  JLabel price_item;
  JTextField price_field;
  JLabel commission;
  JTextField commisson_field;
  JButton button;
  JLabel total;
  JTextField total_field;


  public void CommissonGui() {

    frame = new JFrame();
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setSize(420,420);
    frame.setVisible(true);
    frame.setLayout(null);
    frame.setResizable(false);
    frame.setTitle("Calculate Your Commisson");

    pricelabel = new JLabel("Calculate Your Commisson");
    pricelabel.setFont(new Font(null,Font.BOLD,13));
    pricelabel.setBounds(120,55,175,25);

    price_item = new JLabel("Item Price:");
    price_item.setBounds(50,100,75,25);

    price_field = new JTextField();
    price_field.setBounds(125,100,170,25);
    price_field.addActionListener(this);

    commission = new JLabel("Percentage:");
    commission.setBounds(40,150,75,25);

    commisson_field = new JTextField();
    commisson_field.setBounds(125,150,170,25);
    commisson_field.addActionListener(this);
    
    button = new JButton("Calculate");
    button.setBounds(125,200,170,55);
    button.setFocusable(false);
    button.addActionListener(this);


    total = new JLabel("Earnings:");
    total.setBounds(50,275,75,25);

    total_field = new JTextField();
    total_field.setBounds(125,275,175,25);
    total_field.addActionListener(this);


    frame.add(pricelabel);
    frame.add(price_item);
    frame.add(price_field);
    frame.add(commission);
    frame.add(commisson_field);
    frame.add(button);
    frame.add(total);
    frame.add(total_field);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button){
      
      int price_value = Integer.parseInt(price_field.getText());

      double percentage = Double.parseDouble(commisson_field.getText().replaceAll("[^\\d.]", "")) / 100;

      double result = price_value * percentage;

      String display = Double.toString(result);

      total_field.setText(display);

    }
  }

}
