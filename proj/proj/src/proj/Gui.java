package proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Gui extends JPanel {
    
    public static void main(String[] args) {
    	
    	
        new Gui();
    }

    public Gui()
    {
    	
    	
    	String choice = JOptionPane.showInputDialog("Are you a new user? Enter Y for yes and N for No: ");
		if (choice.equalsIgnoreCase("y")){
			String uName = JOptionPane.showInputDialog("Enter your desired UserName: ");
			String uPass = JOptionPane.showInputDialog("Enter your desired password: ");
	
				System.out.println("Account Created");
			
		}
		if (choice.equalsIgnoreCase("n")){
			
		String fn = JOptionPane.showInputDialog("Enter Your first Name:");
		String ln = JOptionPane.showInputDialog("Enter last Name:");
		}
    	
    	
    	JFrame frame = new JFrame ("Transport Managment Company");
    	JButton b1 = new JButton("Calculate Rent");
    	JButton b2 = new JButton("Charter");
    	JButton b4 = new JButton("Quit");
    	JRadioButton r1,r2;
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
 
        JPanel primary = new JPanel(new BorderLayout());
        primary.setBackground (Color.white);
        primary.setPreferredSize (new Dimension(900,600));
        
        JPanel side = new JPanel();
        side.setBackground(Color.WHITE);
        side.setPreferredSize(new Dimension(200,100));
        
        
        b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String fn = JOptionPane.showInputDialog("Enter car's daily Price:");
				String sn = JOptionPane.showInputDialog("Enter The number of Days it is being rented for:");
				
				double num1=  Double.parseDouble(fn);
				int num2= Integer.parseInt(sn);
				double product= num1*num2;

				JOptionPane.showMessageDialog(null, "The total cost of rental is: "+product, " ", JOptionPane.PLAIN_MESSAGE);
		
			}
		});
		primary.add(b1);
		
		
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			String to = JOptionPane.showInputDialog("Enter Transport Officer's name:");
			String chosenvehicle = JOptionPane.showInputDialog("Enter the car you wish to have:");
			JOptionPane.showMessageDialog(null, to +" will be your driver. \n He/She will be driving the "+ chosenvehicle, " ", JOptionPane.PLAIN_MESSAGE);
		
			}
		});
		primary.add(b2);
        
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				b4.addActionListener(e -> System.exit(0));
			}
		});
		primary.add(b4);
        
        
        
       JTextArea center = new JTextArea("\t ********************CARS********************\n"
       		+ "Totoya Camry: \t $500.30 \n" + "Rolls Royce : \t $1,100.00  \n"  + "Honda Civic : \t $600.00  \n"+ "Porsche 911 : \t $900.00  \n"+ "Suzuki Vitare : \t $50.00  \n"+ "BMW M4 : \t $1900.00  \n"+ "Mercedes c63 : \t $900.00  \n");					
        center.setBorder(BorderFactory.createLineBorder(Color.blue));
        center.setBackground(Color.gray);
        center.setForeground(Color.BLUE);
        center.setPreferredSize(new Dimension(400,200));
      
     
        JPanel selection = new JPanel();
        selection.setBackground(Color.WHITE);
        selection.setPreferredSize(new Dimension(100,50));
        
        
        JPanel sub4 = new JPanel();
        sub4.setBackground(Color.WHITE);
        sub4.setPreferredSize(new Dimension(300,110));
     
        
        JLabel heading = new JLabel("Welcome to TMC ");
        heading.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        heading.setBackground(Color.WHITE);
        heading.setPreferredSize(new Dimension(100,50)); 

    
        
        primary.add (side,BorderLayout.WEST);
        primary.add (center,BorderLayout.CENTER);
        primary.add (selection,BorderLayout.SOUTH);
        primary.add (sub4,BorderLayout.EAST);
        primary.add (heading,BorderLayout.NORTH);

        selection.add(b1);
        selection.add(b2);
        selection.add(b4);
        
        r1 = new JRadioButton("Rent");
        r2 = new JRadioButton("Charter");
        
        
        side.add(r1);
        side.add(r2);
           
        ButtonGroup g1 = new ButtonGroup();
        g1.add(r1);
        g1.add(r2);
        
       
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
        
}
}
