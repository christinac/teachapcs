import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ValidateForm
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               TextComponentFrame frame = new TextComponentFrame();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}

/**
 * A frame with sample text components.
 */
class TextComponentFrame extends JFrame
{
   public TextComponentFrame()
   {
      setTitle("Subscription Form");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      final JTextField personName = new JTextField();
      final JTextField emailField = new JTextField();
      final JTextField zipCode = new JTextField();
      final JTextField birthDate = new JTextField();
      final JTextField phone= new JTextField();
      final JPasswordField passwordField = new JPasswordField();
      
      
      JPanel northPanel = new JPanel();
      northPanel.setLayout(new GridLayout(6, 6)); //dimensons of layout
      northPanel.add(new JLabel("Name :  ", SwingConstants.RIGHT));
      northPanel.add(personName);
      
      northPanel.add(new JLabel("Password :  ", SwingConstants.RIGHT));
      northPanel.add(passwordField);
      
      
      northPanel.add(new JLabel("Email : ", SwingConstants.RIGHT));
      northPanel.add(emailField);
      northPanel.add(new JLabel("Zip Code : ", SwingConstants.RIGHT));
      northPanel.add(zipCode);
      northPanel.add(new JLabel("Year of Birth: ", SwingConstants.RIGHT));
      northPanel.add(birthDate);
      northPanel.add(new JLabel("Phone Number: ", SwingConstants.RIGHT));
      northPanel.add(phone);
      phone.setText("XXX-XXX-XXX");       

      add(northPanel, BorderLayout.NORTH);

      final JTextArea textArea = new JTextArea(8, 40);
      JScrollPane scrollPane = new JScrollPane(textArea);

      add(scrollPane, BorderLayout.CENTER);

      // add button to append text into the text area

      JPanel southPanel = new JPanel();

      JButton insertButton = new JButton("Insert");
      southPanel.add(insertButton);
      insertButton.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
                char[] cPssword  = passwordField.getPassword();

       
            
   //    ****************************   CHANGE CODE ABOVE   AT OWN RISK           ******************************* 
                
    //*********************  Here is where the action is performed!!!!              
                
        
                String candidateName = personName.getText() ;
                String candidateEmail = emailField.getText();
                String candidateZipCode = zipCode.getText();
                String candidatebirthDate = birthDate.getText();
                String candidatePhone = phone.getText(); 
                String candidatePassWord = new String(cPssword);
                
            
                
                textArea.append("here is where you append text to display");
               
               
              //
//********************************************************************************
   //    ****************************       CHANGE CODE BELOW AT OWN RISK    ******************************* 
               
            
            }
            
         });

      add(southPanel, BorderLayout.SOUTH);

      // add a text area with scroll bars

   }

   public static final int DEFAULT_WIDTH = 300;
   public static final int DEFAULT_HEIGHT = 300;
}