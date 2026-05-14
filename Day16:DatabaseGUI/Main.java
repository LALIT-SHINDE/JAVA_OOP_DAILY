import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Main extends JFrame implements ActionListener{

    JLabel l1;
    JTextArea ta;
    JButton b1;

    Connection con;
    Statement st;

    DatabaseGUI(){

        l1 = new JLabel("Enter SQL Query");
        ta = new JTextArea();
        b1 = new JButton("Execute");

        l1.setBounds(30,20,200,30);
        ta.setBounds(30,60,420,180);
        b1.setBounds(180,260,100,30);

        add(l1);
        add(ta);
        add(b1);

        b1.addActionListener(this);

        setTitle("Database GUI");
        setSize(500,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root"
            );

            st = con.createStatement();

            JOptionPane.showMessageDialog(this,
                    "Database Connected");

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(this,e);

        }
    }

    public void actionPerformed(ActionEvent ae){

        try{

            String query = ta.getText();

            if(query.toLowerCase().startsWith("select")){

                ResultSet rs = st.executeQuery(query);

                String result = "";

                while(rs.next()){

                    result += rs.getInt(1) + " ";
                    result += rs.getString(2) + " ";
                    result += rs.getInt(3) + "\n";
                }

                JOptionPane.showMessageDialog(this,result);
            }

            else{

                int x = st.executeUpdate(query);

                JOptionPane.showMessageDialog(this,
                        x + " Record Updated");
            }

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(this,e);

        }
    }
  
    public static void main(String args[]){

        new DatabaseGUI();
    }
}
