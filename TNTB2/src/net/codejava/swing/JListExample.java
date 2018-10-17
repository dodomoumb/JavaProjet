package net.codejava.swing;
 
import javax.swing.*;
 
public class JListExample extends JFrame {
    private JList<String> countryList;
   
    public JListExample() {
    	
   //create the Model and add elements
        DefaultListModel<String> listModel = new DefaultListModel<>();
        
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
 
   // create the list  (countryList)
        countryList = new JList<>(listModel);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // One selection. Default is  multi line selection 
        
        
  //  THE JFRAME
        
   // add list(component) in JFrame
      //  add(countryList); // list fixe
          add(new JScrollPane(countryList)); // Liste avec scroll
          
         
  //  set style of  JFrame        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JList Example");       
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JListExample(); // call of frame to display
            }
        });
    }       
}