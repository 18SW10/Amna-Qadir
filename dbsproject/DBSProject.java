import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
public class DBSProject implements ActionListener{
    JFrame hands1=new JFrame("HANDS Management System");
    JFrame hands2=new JFrame("HANDS Management System");
    JFrame reg=new JFrame("HANDS Management System");
    JFrame she=new JFrame("SHELTER PROGRAM");
    JFrame lit=new JFrame("LITERACY AND EDUCATION PROGRAM");
    JFrame hea=new JFrame("HEALTH PROGRAM");
    JFrame liv=new JFrame("LIVELIHOOD PROGRAM");
    JFrame gen=new JFrame("GENDER DEVELOPMENT PROGRAM");
    JFrame she2=new JFrame("SHELTER PROGRAM");
    JFrame lit2=new JFrame("LITERACY AND EDUCATION PROGRAM");
    JFrame hea2=new JFrame("HEALTH PROGRAM");
    JFrame liv2=new JFrame("LIVELIHOOD PROGRAM");
    JFrame gen2=new JFrame("GENDER DEVELOPMENT PROGRAM");
    JFrame inser=new JFrame("HANDS Management System");
    JFrame show=new JFrame("HANDS Management System");
    JButton hand=new JButton(new ImageIcon("F://front.jpeg"));
    JButton registr1=new JButton(new ImageIcon("F://reg.jpg"));
    JButton display=new JButton(new ImageIcon("F://show.jpg"));
    JButton exit=new JButton(new ImageIcon("F://exit.jpg"));
    JButton exit2=new JButton(new ImageIcon("F://exit2.jpg"));
    JButton exit3=new JButton(new ImageIcon("F://exit.jpg"));
    JButton exit4=new JButton(new ImageIcon("F://exit2.jpg"));
    JButton submit=new JButton(new ImageIcon("F://submit.jpg"));
    JButton up=new JButton(new ImageIcon("F://up.jpg"));
    JButton shelter1=new JButton(new ImageIcon("F://sh.jpg"));
    JButton literacy1=new JButton(new ImageIcon("F://li.jpg"));
    JButton health1=new JButton(new ImageIcon("F://he.jpg"));
    JButton livelihood1=new JButton(new ImageIcon("F://lp.jpg"));
    JButton gender1=new JButton(new ImageIcon("F://gd.jpg"));
    JButton shelter2=new JButton(new ImageIcon("F://sh.jpg"));
    JButton literacy2=new JButton(new ImageIcon("F://li.jpg"));
    JButton health2=new JButton(new ImageIcon("F://he.jpg"));
    JButton livelihood2=new JButton(new ImageIcon("F://lp.jpg"));
    JButton gender2=new JButton(new ImageIcon("F://gd.jpg"));
    JButton shelter3=new JButton(new ImageIcon("F://sh.jpg"));
    JButton literacy3=new JButton(new ImageIcon("F://li.jpg"));
    JButton health3=new JButton(new ImageIcon("F://he.jpg"));
    JButton livelihood3=new JButton(new ImageIcon("F://lp.jpg"));
    JButton gender3=new JButton(new ImageIcon("F://gd.jpg"));
    JButton registr2=new JButton(new ImageIcon("F://reg.jpg"));
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JPanel p3=new JPanel();
    JPanel p4=new JPanel();
    JPanel p5=new JPanel();
    JPanel p6=new JPanel();
    JPanel p7=new JPanel();
    JPanel p8=new JPanel();
    JPanel p9=new JPanel();
    JPanel p10=new JPanel();
    JPanel p11=new JPanel();
    JPanel p12=new JPanel();
    JPanel p13=new JPanel();
    JPanel p14=new JPanel();
    JPanel p15=new JPanel();
    JPanel p16=new JPanel();
    JPanel p17=new JPanel();
    JPanel p18=new JPanel();
    JPanel p19=new JPanel();
    JPanel p20=new JPanel();
    JPanel p21=new JPanel();
    JPanel p22=new JPanel();
    JPanel p23=new JPanel();
    JPanel p24=new JPanel();
    JTextField tf1=new JTextField(4);
    JTextField tf2=new JTextField(4);
    JTextField tf3=new JTextField(4);
    JTextField tf4=new JTextField(4);
    JTextField tf5=new JTextField("0");
    JTextField tf6=new JTextField("0");
    JTextField tf7=new JTextField("0");
    JTextField tf8=new JTextField("0");
    JTextField tf9=new JTextField("0");
    JTextField tf10=new JTextField("0");
    JTextField tf11=new JTextField("0");
    JTextField tf12=new JTextField("0");
    JTextField tf13=new JTextField("0");
    JTextField tf14=new JTextField("0");
    JTextField tf15=new JTextField("0");
    JTextField tf16=new JTextField("0");
    JTextField tf17=new JTextField("0");
    JTextField tf18=new JTextField("0");
    JTextField tf19=new JTextField("0");
    JTextField tf20=new JTextField("0");
    JTextField tf21=new JTextField("0");
    JTextField tf22=new JTextField("0");
    JTextField tf23=new JTextField("0");
    JTextField tf24=new JTextField("0");
    JTextField tf25=new JTextField("0");
    JTextField tf26=new JTextField("0");
    JTextField tf27=new JTextField("0");
    JTextField tf28=new JTextField("0");
    JTextField tf29=new JTextField("0");
    JTextField tf30=new JTextField("0");
    JTextField tf31=new JTextField("0");
    JTextField tf32=new JTextField("0");
    JTextField tf33=new JTextField("0");
    JTextField tf34=new JTextField("0");
    JTextField tf35=new JTextField("0");
    JTextField tf36=new JTextField("0");
    JTextField tf37=new JTextField("0");
    JTextField tf38=new JTextField("0");
    JTextField tf39=new JTextField("0");
    JTextField tf40=new JTextField("0");
    JTextField tf41=new JTextField("0");
    JTextField tf42=new JTextField("0");
    JTextField tf43=new JTextField(4);
    JTextField tf44=new JTextField(4);
    JTextField tf45=new JTextField(4);
    JTextArea a=new JTextArea(5,20);
    JLabel  l1=new JLabel("Village :");
    JLabel  l2=new JLabel("District :");
    JLabel  l3=new JLabel("Population :");
    JLabel  l4=new JLabel("Union Council :");
    JLabel  l5=new JLabel("SHELTER PROGRAM");
    JLabel  l6=new JLabel("No of Jetties :");
    JLabel  l7=new JLabel("No of Bridges :");
    JLabel  l8=new JLabel("No of Linked Roads :");
    JLabel  l9=new JLabel("No of HandPumps :");
    JLabel  l10=new JLabel("No of Solar Lights :");
    JLabel  l11=new JLabel("No of Solar Panels :");
    JLabel  l12=new JLabel("LITERACY AND EDUCATION PROGRAM");
    JLabel  l13=new JLabel("No of Schools :");
    JLabel  l14=new JLabel("No of Students :");
    JLabel  l15=new JLabel("No of Teachers :");
    JLabel  l16=new JLabel("No of Teachers Training :");
    JLabel  l17=new JLabel("No of Teaching Material :");
    JLabel  l18=new JLabel("No of ECD(Early Childhood Development) Classes :");
    JLabel  l19=new JLabel("No of ECD Teaching Material :");
    JLabel  l20=new JLabel("No of ALC(Adult literacy Classes) :");
    JLabel  l21=new JLabel("HEALTH PROGRAM");
    JLabel  l22=new JLabel("No of Rural Health Centres :");
    JLabel  l23=new JLabel("No of Dispansaries :");
    JLabel  l24=new JLabel("No of Maternal Child Centres :");
    JLabel  l25=new JLabel("No of Staff :");
    JLabel  l26=new JLabel("No of OPD clients :");
    JLabel  l27=new JLabel("No of TT shots :");
    JLabel  l28=new JLabel("No of Immunized Children :");
    JLabel  l29=new JLabel("No of Antenatal Checkups :");
    JLabel  l30=new JLabel("No of Delivaries :");
    JLabel  l31=new JLabel("No of FP Users :");
    JLabel  l32=new JLabel("No of Postnatal Checkups :");
    JLabel  l33=new JLabel("No of Dignostic Services :");
    JLabel  l34=new JLabel("No of Surgeries :");
    JLabel  l35=new JLabel("No of Indoor Patients :");
    JLabel  l36=new JLabel("No of Ambulances :");
    JLabel  l37=new JLabel("LIVELIHOOD PROGRAM");
    JLabel  l38=new JLabel("No of Carts :");
    JLabel  l39=new JLabel("No of Toolkits :");
    JLabel  l40=new JLabel("No of Shops :");
    JLabel  l41=new JLabel("No of Stitching Machines :");
    JLabel  l42=new JLabel("No of Loan Barrowers :");
    JLabel  l43=new JLabel("GENDER DEVELOPMENT");
    JLabel  l44=new JLabel("No of Sexual Harrasment Communities :");
    JLabel  l45=new JLabel("No of Advocacy Compaign Practices :");
    JLabel  l46=new JLabel("No of Behaviour Change Communications :");
    JLabel  l47=new JLabel("No of Economic Rehability :");
    JLabel  l48=new JLabel("District :");
    JLabel  l49=new JLabel("village :");
    JLabel  l50=new JLabel("Union Council :");
    JLabel l51=new JLabel("VILLAGE          DISTRICT        POPU            UC          JETTY         BRIDGES        ROADS      PUMPS       LIGHTS       PANELS");
    JLabel l52=new JLabel("VILLAGE         DISTRICT        POPU           UC          SCHOOLS       STUDENTS       TEACHERS   TRAIN       MATE      ECD      ECDMATE    ALC");
    JLabel l53=new JLabel("VILLAGE          DISTRICT          POPU            UC              RHC           DISPAN          MCC          STAFF         OPD           TT SHOTS        IMUNIZED       AC       DELIVARY       FP       PC     DS      SURGERY     IP     AMB");
    JLabel l54=new JLabel("VILLAGE          DISTRICT          POPU            UC              CARTS         TOOLS         SHOPS          STITCH          LOAN");
    JLabel l55=new JLabel("VILLAGE          DISTRICT          POPU            UC               SHC            ACP           BCC          ER");
    int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22,n23,n24,n25,n26,n27,n28,n29,n30,n31,n32,n33,n34,n35,n36,n37,n38,n39;
    DBSProject() {
        Connection conn=null;
        try{  
            
        Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@Dell:1524:XE","sw","amna");
       Statement stmt=conn.createStatement();
           p1.add(hand);
    	hands1.add(p1,BorderLayout.CENTER);
    	hands1.setSize(600,630);
    	hands1.setVisible(true);
     hand.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                 hands1.setVisible(false);
                              p2.add(registr1);
                              registr1.setBackground(Color.PINK);
                              p2.add(display);                 
                              display.setBackground(Color.PINK);     
					          p2.add(exit);
                              exit.setBackground(Color.PINK);
			      p2.setLayout(new GridLayout(3,1));
			      hands2.add(p2);
			      hands2.setSize(400,450);
			      hands2.setVisible(true);
                             exit.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                              hands2.setVisible(false);
                                JOptionPane.showMessageDialog(null,"You Pressed Exit Button..........");                   
                            }});
                              display.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                                    hands2.setVisible(false);   
                                                    p19.add(shelter1);
                                                    shelter1.addActionListener(new ActionListener(){
                                                    public void actionPerformed(ActionEvent e){
                                                        show.setVisible(false);
                                                        she2.setLayout(new BorderLayout());
                                                        she2.add(l51,BorderLayout.NORTH);
                                                        p20.add(a);
                                                        she2.add(p20,BorderLayout.CENTER);
                                                        she2.getContentPane().setBackground(Color.PINK);
                                                        she2.setBackground(Color.PINK);
                                                        p20.setBackground(Color.PINK);
                                                        a.setBackground(Color.PINK);
                                                        she2.setSize(660,500);
                                                        she2.setVisible(true);
                                                        try{
                                                        String sql="SELECT * FROM SHELTER";
                                                        ResultSet r9=stmt.executeQuery(sql);
                                                       
                                                        while(r9.next()){
                                                         a.setText(r9.getString(7)+"         "+r9.getString(8)+"            "+r9.getString(9)+"          "+r9.getString(10)+"              "+r9.getString(1)+"              "+r9.getString(2)+"                "+r9.getString(3)+"                    "+r9.getString(4)+"              "+r9.getString(5)+"                "+r9.getString(6));
                                                           
                                                        }
                                                        }
                                                        catch(Exception e9){
                                                            JOptionPane.showMessageDialog(null,"Error!!!!!!!!!!!");  
                                                        }
                                                        }});
                                                    p19.add(literacy1);
                                                    literacy1.addActionListener(new ActionListener(){
                                                    public void actionPerformed(ActionEvent e){
                                                        show.setVisible(false);
                                                        lit2.setLayout(new BorderLayout());
                                                        lit2.add(l52,BorderLayout.NORTH);
                                                        p21.add(a);
                                                        lit2.add(p21,BorderLayout.CENTER);
                                                        lit2.getContentPane().setBackground(Color.PINK);
                                                        lit2.setBackground(Color.PINK);
                                                        p21.setBackground(Color.PINK);
                                                        a.setBackground(Color.PINK);
                                                        lit2.setSize(750,500);
                                                        lit2.setVisible(true);
                                                        try{
                                                        String sql="SELECT * FROM LITERACY";
                                                        ResultSet r9=stmt.executeQuery(sql);
                                                       
                                                        while(r9.next()){
                                                         a.setText(r9.getString(9)+"         "+r9.getString(10)+"            "+r9.getString(11)+"          "+r9.getString(12)+"              "+r9.getString(1)+"              "+r9.getString(2)+"                "+r9.getString(3)+"                    "+r9.getString(4)+"              "+r9.getString(5)+"                "+r9.getString(6)+"           " +r9.getString(7)+"              "+r9.getString(8));
                                                           
                                                        }
                                                        }
                                                        catch(Exception e9){
                                                            JOptionPane.showMessageDialog(null,"Error!!!!!!!!!!!");  
                                                        }
                                                        
                                                        }});
                                                    p19.add(health1);
                                                    health1.addActionListener(new ActionListener(){
                                                    public void actionPerformed(ActionEvent e){
                                                        show.setVisible(false);
                                                        lit2.setLayout(new BorderLayout());
                                                        lit2.add(l53,BorderLayout.NORTH);
                                                        p21.add(a);
                                                        lit2.add(p21,BorderLayout.CENTER);
                                                        lit2.getContentPane().setBackground(Color.PINK);
                                                        lit2.setBackground(Color.PINK);
                                                        p21.setBackground(Color.PINK);
                                                        a.setBackground(Color.PINK);
                                                        lit2.setSize(1100,500);
                                                        lit2.setVisible(true);
                                                        try{
                                                        String sql="SELECT * FROM HEALTH";
                                                        ResultSet r9=stmt.executeQuery(sql);
                                                       
                                                        while(r9.next()){
                                                         a.setText(r9.getString(16)+"         "+r9.getString(17)+"            "+r9.getString(18)+"          "+r9.getString(19)+"              "+r9.getString(1)+"              "+r9.getString(2)+"                "+r9.getString(3)+"                    "+r9.getString(4)+"              "+r9.getString(5)+"                "+r9.getString(6)+"           " +r9.getString(7)+"              "+r9.getString(8)+"              "+r9.getString(9)+"                "+r9.getString(10)+"                    "+r9.getString(11)+"              "+r9.getString(12)+"                "+r9.getString(13)+"           " +r9.getString(14)+"              "+r9.getString(15));
                                                           
                                                        }
                                                        }
                                                        catch(Exception e9){
                                                            JOptionPane.showMessageDialog(null,"Error!!!!!!!!!!!");  
                                                        }
                                                        
                                                        }});
                                                    p19.add(livelihood1);
                                                    livelihood1.addActionListener(new ActionListener(){
                                                    public void actionPerformed(ActionEvent e){
                                                        show.setVisible(false);
                                                        liv2.setLayout(new BorderLayout());
                                                        liv2.add(l54,BorderLayout.NORTH);
                                                        p23.add(a);
                                                        liv2.add(p23,BorderLayout.CENTER);
                                                        liv2.getContentPane().setBackground(Color.PINK);
                                                        liv2.setBackground(Color.PINK);
                                                        p23.setBackground(Color.PINK);
                                                        a.setBackground(Color.PINK);
                                                        liv2.setSize(550,500);
                                                        liv2.setVisible(true);
                                                        try{
                                                        String sql="SELECT * FROM LIVELIHOOD";
                                                        ResultSet r9=stmt.executeQuery(sql);
                                                       
                                                        while(r9.next()){
                                                         a.setText(r9.getString(6)+"         "+r9.getString(7)+"            "+r9.getString(8)+"          "+r9.getString(9)+"              "+r9.getString(1)+"              "+r9.getString(2)+"                "+r9.getString(3)+"                    "+r9.getString(4)+"              "+r9.getString(5));
                                                           
                                                        }
                                                        }
                                                        catch(Exception e9){
                                                            JOptionPane.showMessageDialog(null,"Error!!!!!!!!!!!");  
                                                        }
                                                        
                                                        }});
                                                    p19.add(gender1);
                                                    gender1.addActionListener(new ActionListener(){
                                                    public void actionPerformed(ActionEvent e){
                                                        show.setVisible(false);
                                                        gen2.setLayout(new BorderLayout());
                                                        gen2.add(l55,BorderLayout.NORTH);
                                                        p24.add(a);
                                                        gen2.add(p24,BorderLayout.CENTER);
                                                        gen2.getContentPane().setBackground(Color.PINK);
                                                        gen2.setBackground(Color.PINK);
                                                        p24.setBackground(Color.PINK);
                                                        a.setBackground(Color.PINK);
                                                        gen2.setSize(500,500);
                                                        gen2.setVisible(true);
                                                        try{
                                                        String sql="SELECT * FROM GENDER_DEVELOPMENT";
                                                        ResultSet r9=stmt.executeQuery(sql);
                                                       
                                                        while(r9.next()){
                                                         a.setText(r9.getString(5)+"         "+r9.getString(6)+"            "+r9.getString(7)+"          "+r9.getString(8)+"              "+r9.getString(1)+"              "+r9.getString(2)+"                "+r9.getString(3)+"                    "+r9.getString(4));
                                                           
                                                        }
                                                        }
                                                        catch(Exception e9){
                                                            JOptionPane.showMessageDialog(null,"Error!!!!!!!!!!!");  
                                                        }
                                                        
                                                        }});
                                                    p19.add(exit3);
                                                    p19.setLayout(new GridLayout(3,2));
                                                    show.add(p19,BorderLayout.CENTER);
                                                    show.setSize(800,800);
                                                    show.setVisible(true);
                                                    exit3.setBackground(Color.PINK);
                                                    exit3.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent e) {
                                                    show.setVisible(false);
                                JOptionPane.showMessageDialog(null,"You Pressed Exit Button!!!!!!!!!!!");                   
                            }});
                            }});
				  registr1.addActionListener(new ActionListener(){
				  public void actionPerformed(ActionEvent e) {
                                     hands2.setVisible(false);   
                                     p7.add(shelter2);
                             shelter2.addActionListener(new ActionListener(){
                             public void actionPerformed(ActionEvent e) {
                                    reg.setVisible(false);
                                    p4.add(l5);
                                    p3.add(l1);
                                    p3.add(tf1);
                                    p3.add(l2);
                                    p3.add(tf2); 
                                    p3.add(l3);
                                    p3.add(tf3);
                                    p3.add(l4);
                                    p3.add(tf4);
                                    p3.add(l6);
                                    p3.add(tf5);
                                    p3.add(l7);
                                    p3.add(tf6); 
                                    p3.add(l8);
                                    p3.add(tf7);
                                    p3.add(l9);
                                    p3.add(tf8);
                                    p3.add(l10);
                                    p3.add(tf9);
                                    p3.add(l11);
                                    p3.add(tf10);
                                     p5.add(submit);
                                     p5.add(up);
                                    submit.setBackground(Color.PINK);
                                     submit.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                  String vill=tf1.getText();
                                  String dist=tf2.getText();
                                  String popu=tf3.getText();
                                  String UC=tf4.getText();
                                  String jetty=tf5.getText();
                                  String bridge=tf6.getText();
                                  String roads=tf7.getText();
                                  String pumps=tf8.getText();
                                  String light=tf9.getText();
                                  String panel=tf10.getText();
                                  try{
                                  n1=Integer.parseInt(popu);
                                  n2=Integer.parseInt(jetty);
                                  n3=Integer.parseInt(bridge);
                                  n4=Integer.parseInt(roads);
                                  n5=Integer.parseInt(pumps);
                                  n6=Integer.parseInt(light);
                                  n7=Integer.parseInt(panel);
                             try{ String q1="INSERT INTO SHELTER VALUES("+ n2 + "," + n3 + "," + n4 + "," + n5 + "," + n6 + "," + n7 +",'"+vill+"','" + dist +"',"+n1+",'"+UC +"')";
                                 ResultSet r2=stmt.executeQuery(q1);
                             }
                                        catch(Exception e4){
                                        JOptionPane.showMessageDialog(null,"record already exist !!!!!");
                                        System.out.println(e4);
                                  }
                              JOptionPane.showMessageDialog(null,"Record registered Successfully!!!!!");          
                                  }
                                  catch(Exception e2){
                                  JOptionPane.showMessageDialog(null,"PLEASE ENTER INTEGER VALUE!!!!!!");     
                                  }   
                        }});
                                    p5.add(exit2);
                                    exit2.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                             she.setVisible(false);
                                JOptionPane.showMessageDialog(null,"You Pressed Exit Button!!!!!!!");                   
                            }});
                                    up.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                  String vill=tf1.getText();
                                  String dist=tf2.getText();
                                  String popu=tf3.getText();
                                  String UC=tf4.getText();
                                  String jetty=tf5.getText();
                                  String bridge=tf6.getText();
                                  String roads=tf7.getText();
                                  String pumps=tf8.getText();
                                  String light=tf9.getText();
                                  String panel=tf10.getText();
                                  try{
                                  n1=Integer.parseInt(popu);
                                  n2=Integer.parseInt(jetty);
                                  n3=Integer.parseInt(bridge);
                                  n4=Integer.parseInt(roads);
                                  n5=Integer.parseInt(pumps);
                                  n6=Integer.parseInt(light);
                                  n7=Integer.parseInt(panel);
                             try{ String q1="UPDATE SHELTER SET JETTY="+ n2 + ",BRIDGES=" + n3 + ",ROADS=" + n4 + ",PUMPS=" + n5 + ",LIGHTS=" + n6 + ",PANELS=" + n7 +",DISTRICT='" + dist +"',POPULATION="+n1+",UC='"+UC +"' WHERE VILLAGE='"+vill+"'";
                                 ResultSet r2=stmt.executeQuery(q1);
                             }
                                        catch(Exception e4){
                                        JOptionPane.showMessageDialog(null,"record already exist !!!!!");
                                        System.out.println(e4);
                                  }
                              JOptionPane.showMessageDialog(null,"Record registered Successfully!!!!!");          
                                  }
                                  catch(Exception e2){
                                  JOptionPane.showMessageDialog(null,"PLEASE ENTER INTEGER VALUE!!!!!!");     
                                  }   
                        }});
                                     up.setBackground(Color.PINK);
                                    exit2.setBackground(Color.PINK);
                                    p3.setBackground(Color.PINK);
                                    p4.setBackground(Color.PINK);
                                    p5.setBackground(Color.PINK);
                                    she.getContentPane().setBackground(Color.PINK);
                                    she.setLayout(new BorderLayout());
                                    p3.setLayout(new GridLayout(10,2));
                                    p5.setLayout(new GridLayout(1,3));
                                    she.add(p3,BorderLayout.WEST);
                                    she.add(p4,BorderLayout.NORTH); 
                                    she.add(p5,BorderLayout.SOUTH); 
                                    she.setSize(400,500); 
                                    she.setVisible(true);  
                            }});
                                    p7.add(literacy2);
                            literacy2.addActionListener(new ActionListener(){
                             public void actionPerformed(ActionEvent e) {
                                    reg.setVisible(false);
                                    p6.add(l12);
                                    p8.add(l1);
                                    p8.add(tf1);
                                    p8.add(l2);
                                    p8.add(tf2); 
                                    p8.add(l3);
                                    p8.add(tf3);
                                    p8.add(l4);
                                    p8.add(tf4);
                                    p8.add(l13);
                                    p8.add(tf11);
                                    p8.add(l14);
                                    p8.add(tf12);
                                    p8.add(l15);
                                    p8.add(tf13);
                                    p8.add(l16);
                                    p8.add(tf14); 
                                    p8.add(l17);
                                    p8.add(tf15);
                                    p8.add(l18);
                                    p8.add(tf16);
                                    p8.add(l19);
                                    p8.add(tf17);
                                    p8.add(l20);
                                    p8.add(tf18); 
                                     p9.add(submit);
                                     p9.add(up);
                                    submit.setBackground(Color.PINK);
                                    submit.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                  String vill=tf1.getText();
                                  String dist=tf2.getText();
                                  String popu=tf3.getText();
                                  String UC=tf4.getText();
                                  String school=tf11.getText();
                                  String student=tf12.getText();
                                  String teacher=tf13.getText();
                                  String train=tf14.getText();
                                  String material=tf15.getText();
                                  String ECD=tf16.getText();
                                  String ECDMat=tf17.getText();
                                  String ALC=tf18.getText();
                                 try{ n1=Integer.parseInt(popu);
                                  n8=Integer.parseInt(school);
                                  n9=Integer.parseInt(student);
                                  n10=Integer.parseInt(teacher);
                                  n11=Integer.parseInt(train);
                                  n12=Integer.parseInt(material);
                                  n13=Integer.parseInt(ECD);
                                  n14=Integer.parseInt(ECDMat);
                                  n15=Integer.parseInt(ALC);
                                    try{
                                  String q2="INSERT INTO LITERACY VALUES(" + n8 +"," + n9 +"," + n10 + "," + n11 + "," + n12 + "," + n13 +"," + n14 + "," + n15 + ",'" + vill + "','" + dist +"'," + n1 + ",'" + UC+"')";
                                 ResultSet r3=stmt.executeQuery(q2); 
                                       }
                                        catch(Exception e4){
                                        JOptionPane.showMessageDialog(null,"RECORD ALREADY EXIST!!!!!");
                                        System.out.println(e4);
                                  }
                                   JOptionPane.showMessageDialog(null,"Record registered Successfully!!!!!");          
                                  }
                                  catch(Exception e2){
                                  JOptionPane.showMessageDialog(null,"PLEASE ENTER INTEGER VALUE!!!!!!");     
                                  }   
                        }});
                                    p9.add(exit2);
                                    exit2.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                             lit.setVisible(false);
                                JOptionPane.showMessageDialog(null,"You Pressed Exit Button!!!!!!!");                   
                            }});
                                     up.setBackground(Color.PINK);
                                     up.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                  String vill=tf1.getText();
                                  String dist=tf2.getText();
                                  String popu=tf3.getText();
                                  String UC=tf4.getText();
                                  String school=tf11.getText();
                                  String student=tf12.getText();
                                  String teacher=tf13.getText();
                                  String train=tf14.getText();
                                  String material=tf15.getText();
                                  String ECD=tf16.getText();
                                  String ECDMat=tf17.getText();
                                  String ALC=tf18.getText();
                                 try{ n1=Integer.parseInt(popu);
                                  n8=Integer.parseInt(school);
                                  n9=Integer.parseInt(student);
                                  n10=Integer.parseInt(teacher);
                                  n11=Integer.parseInt(train);
                                  n12=Integer.parseInt(material);
                                  n13=Integer.parseInt(ECD);
                                  n14=Integer.parseInt(ECDMat);
                                  n15=Integer.parseInt(ALC);
                                    try{
                                  String q2="UPDATE LITERACY SET SCHOOLS=" + n8 +",STUDENTS=" + n9 +",TEACHERS=" + n10 + ",TRAIN=" + n11 + ",TEACHMAT=" + n12 + ",ECD=" + n13 +",ECDMAT=" + n14 + ",ALC=" + n15 + ",DISTRICT='" +  dist +"',POPULATION=" + n1 + ",UC='" + UC+"' WHERE VILLAGE='" + vill +"'";
                                 ResultSet r3=stmt.executeQuery(q2); 
                                       }
                                        catch(Exception e4){
                                        JOptionPane.showMessageDialog(null,"RECORD ALREADY EXIST!!!!!");
                                        System.out.println(e4);
                                  }
                                   JOptionPane.showMessageDialog(null,"Record registered Successfully!!!!!");          
                                  }
                                  catch(Exception e2){
                                  JOptionPane.showMessageDialog(null,"PLEASE ENTER INTEGER VALUE!!!!!!");     
                                  }   
                        }});
                                    exit2.setBackground(Color.PINK);
                                    p6.setBackground(Color.PINK);
                                    p8.setBackground(Color.PINK);
                                    p9.setBackground(Color.PINK);
                                    lit.getContentPane().setBackground(Color.PINK);
                                    lit.setLayout(new BorderLayout());
                                    p8.setLayout(new GridLayout(12,2));
                                    p9.setLayout(new GridLayout(1,3));
                                    lit.add(p8,BorderLayout.WEST);
                                    lit.add(p6,BorderLayout.NORTH); 
                                    lit.add(p9,BorderLayout.SOUTH); 
                                    lit.setSize(400,600); 
                                    lit.setVisible(true);  
                            }});
                            p7.add(health2);
                            health2.addActionListener(new ActionListener(){
                             public void actionPerformed(ActionEvent e) {
                                    reg.setVisible(false);
                                    p10.add(l21);
                                    p11.add(l1);
                                    p11.add(tf1);
                                    p11.add(l2);
                                    p11.add(tf2); 
                                    p11.add(l3);
                                    p11.add(tf3);
                                    p11.add(l4);
                                    p11.add(tf4);
                                    p11.add(l22);
                                    p11.add(tf19);
                                    p11.add(l23);
                                    p11.add(tf20);
                                    p11.add(l24);
                                    p11.add(tf21);
                                    p11.add(l25);
                                    p11.add(tf22); 
                                    p11.add(l26);
                                    p11.add(tf23);
                                    p11.add(l27);
                                    p11.add(tf24);
                                    p11.add(l28);
                                    p11.add(tf25);
                                    p11.add(l29);
                                    p11.add(tf26); 
                                    p11.add(l30);
                                    p11.add(tf27);
                                    p11.add(l31);
                                    p11.add(tf28);
                                    p11.add(l32);
                                    p11.add(tf29);
                                    p11.add(l33);
                                    p11.add(tf30); 
                                    p11.add(l34);
                                    p11.add(tf31);
                                    p11.add(l35);
                                    p11.add(tf32);
                                    p11.add(l36);
                                    p11.add(tf33);
                                    p12.add(submit);
                                    p12.add(up);
                                    submit.setBackground(Color.PINK);
                                    submit.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                  String vill=tf1.getText();
                                  String dist=tf2.getText();
                                  String popu=tf3.getText();
                                  String UC=tf4.getText();
                                  String RHC=tf19.getText();
                                  String dispa=tf20.getText();
                                  String MCC=tf21.getText();
                                  String staff=tf22.getText();
                                  String OPD=tf23.getText();
                                  String TT=tf24.getText();
                                  String IC=tf25.getText();
                                  String AC=tf26.getText();
                                  String deliv=tf27.getText();
                                  String FP=tf28.getText();
                                  String PC=tf29.getText();
                                  String DS=tf30.getText();
                                  String surg=tf31.getText();
                                  String IP=tf32.getText();
                                  String amb=tf33.getText();
                                  try{
                                    n1=Integer.parseInt(popu);
                                  n16=Integer.parseInt(RHC);
                                  n17=Integer.parseInt(dispa);
                                  n18=Integer.parseInt(MCC);
                                  n19=Integer.parseInt(staff);
                                  n20=Integer.parseInt(OPD);
                                  n21=Integer.parseInt(TT);
                                  n22=Integer.parseInt(IC);
                                  n23=Integer.parseInt(AC);
                                  n24=Integer.parseInt(deliv);
                                  n25=Integer.parseInt(FP);
                                  n26=Integer.parseInt(PC);
                                  n27=Integer.parseInt(DS);
                                  n28=Integer.parseInt(surg);
                                  n29=Integer.parseInt(IP);
                                  n30=Integer.parseInt(amb);
                                   try{
                                      String q3="INSERT INTO HEALTH VALUES(" + n16 + "," + n17 + "," + n18 + "," + n19 +"," + n20 +"," +n21+ "," + n22 +"," + n23 + "," + n24 + "," + n25 + "," + n26 + "," + n27 + "," + n28 + "," + n29 + "," + n30 + ",'" + vill + "','" + dist +"'," + n1 + ",'" + UC+"')";
                                 ResultSet r4=stmt.executeQuery(q3); 
                                       }
                                        catch(Exception e4){
                                JOptionPane.showMessageDialog(null,"RECORD ALREADY EXIST !!!!!");
                                        System.out.println(e4);
                                  }
                                   JOptionPane.showMessageDialog(null,"Record registered Successfully!!!!!");          
                                  }
                                  catch(Exception e2){
                                  JOptionPane.showMessageDialog(null,"PLEASE ENTER INTEGER VALUE!!!!!!");     
                                  }   
                        }});
                                    p12.add(exit2);
                                    exit2.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                             hea.setVisible(false);
                                JOptionPane.showMessageDialog(null,"You Pressed Exit Button!!!!!!!");                   
                            }}); 
                                    up.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                  String vill=tf1.getText();
                                  String dist=tf2.getText();
                                  String popu=tf3.getText();
                                  String UC=tf4.getText();
                                  String RHC=tf19.getText();
                                  String dispa=tf20.getText();
                                  String MCC=tf21.getText();
                                  String staff=tf22.getText();
                                  String OPD=tf23.getText();
                                  String TT=tf24.getText();
                                  String IC=tf25.getText();
                                  String AC=tf26.getText();
                                  String deliv=tf27.getText();
                                  String FP=tf28.getText();
                                  String PC=tf29.getText();
                                  String DS=tf30.getText();
                                  String surg=tf31.getText();
                                  String IP=tf32.getText();
                                  String amb=tf33.getText();
                                  try{
                                    n1=Integer.parseInt(popu);
                                  n16=Integer.parseInt(RHC);
                                  n17=Integer.parseInt(dispa);
                                  n18=Integer.parseInt(MCC);
                                  n19=Integer.parseInt(staff);
                                  n20=Integer.parseInt(OPD);
                                  n21=Integer.parseInt(TT);
                                  n22=Integer.parseInt(IC);
                                  n23=Integer.parseInt(AC);
                                  n24=Integer.parseInt(deliv);
                                  n25=Integer.parseInt(FP);
                                  n26=Integer.parseInt(PC);
                                  n27=Integer.parseInt(DS);
                                  n28=Integer.parseInt(surg);
                                  n29=Integer.parseInt(IP);
                                  n30=Integer.parseInt(amb);
                                   try{
                                      String q3="UPDATE HEALTH SET RHC=" + n16 + ",DISPANPAN=" + n17 + ",MCC=" + n18 + ",STAFF=" + n19 +",OPD=" + n20 +",TT=" +n21+ ",IC=" + n22 +",AC=" + n23 + ",DELIVAR=" + n24 + ",FP=" + n25 + ",PC=" + n26 + ",DS=" + n27 + ",SURGERY=" + n28 + ",IP=" + n29 + ",AMB=" + n30 + ",DISTRICT='" + dist +"',POPULATION=" + n1 + ",UC='" + UC+"' WHERE VILLAGE='" + vill +"'";
                                 ResultSet r4=stmt.executeQuery(q3); 
                                       }
                                        catch(Exception e4){
                                JOptionPane.showMessageDialog(null,"RECORD ALREADY EXIST !!!!!");
                                        System.out.println(e4);
                                  }
                                   JOptionPane.showMessageDialog(null,"Record registered Successfully!!!!!");          
                                  }
                                  catch(Exception e2){
                                  JOptionPane.showMessageDialog(null,"PLEASE ENTER INTEGER VALUE!!!!!!");     
                                  }   
                        }});
                                    p12.add(exit2);
                                    
                                     up.setBackground(Color.PINK);
                                    exit2.setBackground(Color.PINK);
                                    p10.setBackground(Color.PINK);
                                    p11.setBackground(Color.PINK);
                                    p12.setBackground(Color.PINK);
                                    hea.getContentPane().setBackground(Color.PINK);
                                    hea.setLayout(new BorderLayout());
                                    p11.setLayout(new GridLayout(19,2));
                                    p12.setLayout(new GridLayout(1,3));
                                    hea.add(p11,BorderLayout.WEST);
                                    hea.add(p10,BorderLayout.NORTH); 
                                    hea.add(p12,BorderLayout.SOUTH); 
                                    hea.setSize(400,800); 
                                    hea.setVisible(true);  
                            }});
                                    
                  p7.add(livelihood2);
                 livelihood2.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e) {
                                    reg.setVisible(false);
                                    p13.add(l37);
                                    p14.add(l1);
                                    p14.add(tf1);
                                    p14.add(l2);
                                    p14.add(tf2); 
                                    p14.add(l3);
                                    p14.add(tf3);
                                    p14.add(l4);
                                    p14.add(tf4);
                                    p14.add(l38);
                                    p14.add(tf34); 
                                    p14.add(l39);
                                    p14.add(tf35);
                                    p14.add(l40);
                                    p14.add(tf36);
                                    p14.add(l41);
                                    p14.add(tf37);
                                    p14.add(l42);
                                    p14.add(tf38); 
                                    p15.add(submit);
                                    p15.add(up);
                                    submit.setBackground(Color.PINK);
                                    submit.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                  String vill=tf1.getText();
                                  String dist=tf2.getText();
                                  String popu=tf3.getText();
                                  String UC=tf4.getText();
                                  String carts=tf34.getText();
                                  String toolkit=tf35.getText();
                                  String shops=tf36.getText();
                                  String stitch=tf37.getText();
                                  String loan=tf38.getText();
                                  try{
                                  n1=Integer.parseInt(popu);
                                  n31=Integer.parseInt(carts);
                                  n32=Integer.parseInt(toolkit);
                                  n33=Integer.parseInt(shops);
                                  n34=Integer.parseInt(stitch);
                                  n35=Integer.parseInt(loan);
                                  try{
                                       String q4="INSERT INTO LIVELIHOOD VALUES(" + n31 + "," + n32 + "," + n33 + "," + n34 + "," + n35 + ",'" + vill + "','" + dist + "'," + n1 + ",'" + UC +"')";
                                 ResultSet r5=stmt.executeQuery(q4);
                                       }
                                        catch(Exception e4){
                                        JOptionPane.showMessageDialog(null,"PLEASE ENTER NUMBERS IN SOME FIELDS !!!!!");
                                        System.out.println(e4);
                                  }
                                   JOptionPane.showMessageDialog(null,"Record registered Successfully!!!!!");          
                                  }
                                  catch(Exception e2){
                                  JOptionPane.showMessageDialog(null,"PLEASE ENTER INTEGER VALUE!!!!!!");     
                                  }   
                        }});
                                    p15.add(exit2);
                                   
                                    up.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                  String vill=tf1.getText();
                                  String dist=tf2.getText();
                                  String popu=tf3.getText();
                                  String UC=tf4.getText();
                                  String carts=tf34.getText();
                                  String toolkit=tf35.getText();
                                  String shops=tf36.getText();
                                  String stitch=tf37.getText();
                                  String loan=tf38.getText();
                                  try{
                                  n1=Integer.parseInt(popu);
                                  n31=Integer.parseInt(carts);
                                  n32=Integer.parseInt(toolkit);
                                  n33=Integer.parseInt(shops);
                                  n34=Integer.parseInt(stitch);
                                  n35=Integer.parseInt(loan);
                                  try{
                                       String q4="UPDATE LIVELIHOOD SET CARTS=" + n31 + ",TOOLKITS=" + n32 + ",SHOPS=" + n33 + ",STITCH=" + n34 + ",LOAN=" + n35 +",DISTRICT='" + dist +"',POPULATION=" + n1 + ",UC='" + UC+"' WHERE VILLAGE='" + vill +"'";
                                 ResultSet r5=stmt.executeQuery(q4);
                                       }
                                        catch(Exception e4){
                                        JOptionPane.showMessageDialog(null,"PLEASE ENTER NUMBERS IN SOME FIELDS !!!!!");
                                        System.out.println(e4);
                                  }
                                   JOptionPane.showMessageDialog(null,"Record registered Successfully!!!!!");          
                                  }
                                  catch(Exception e2){
                                  JOptionPane.showMessageDialog(null,"PLEASE ENTER INTEGER VALUE!!!!!!");     
                                  }   
                        }});
                                    p15.add(exit2);
                                    exit2.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                             liv.setVisible(false);
                                JOptionPane.showMessageDialog(null,"You Pressed Exit Button!!!!!!!");                   
                            }});
                                     up.setBackground(Color.PINK);
                                    exit2.setBackground(Color.PINK);
                                    p13.setBackground(Color.PINK);
                                    p14.setBackground(Color.PINK);
                                    p15.setBackground(Color.PINK);
                                    liv.getContentPane().setBackground(Color.PINK);
                                    liv.setLayout(new BorderLayout());
                                    p14.setLayout(new GridLayout(9,2));
                                    p15.setLayout(new GridLayout(1,3));
                                    liv.add(p14,BorderLayout.WEST);
                                    liv.add(p13,BorderLayout.NORTH); 
                                    liv.add(p15,BorderLayout.SOUTH); 
                                    liv.setSize(400,600); 
                                    liv.setVisible(true);  
                            }});
                     p7.add(gender2);
                     gender2.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e) {
                                    reg.setVisible(false);
                                    p16.add(l43);
                                    p17.add(l1);
                                    p17.add(tf1);
                                    p17.add(l2);
                                    p17.add(tf2); 
                                    p17.add(l3);
                                    p17.add(tf3);
                                    p17.add(l4);
                                    p17.add(tf4);
                                    p17.add(l44);
                                    p17.add(tf39);
                                    p17.add(l45);
                                    p17.add(tf40);
                                    p17.add(l46);
                                    p17.add(tf41);
                                    p17.add(l47);
                                    p17.add(tf42); 
                                    p18.add(submit);
                                    p18.add(up);
                                    submit.setBackground(Color.PINK);
                                    submit.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                 String vill=tf1.getText();
                                  String dist=tf2.getText();
                                  String popu=tf3.getText();
                                  String UC=tf4.getText();
                                  String SHC=tf39.getText();
                                  String ACP=tf40.getText();
                                  String BCC=tf41.getText();
                                  String ER=tf42.getText();
                                  try{
                                  n1=Integer.parseInt(popu);
                                  n36=Integer.parseInt(SHC);
                                  n37=Integer.parseInt(ACP);
                                  n38=Integer.parseInt(BCC);
                                  n39=Integer.parseInt(ER);
                                  try{
                                 String q5="INSERT INTO GENDER_DEVELOPMENT VALUES("+ n36 + "," + n37 + "," + n38 + "," + n39 + ",'" + vill + "','" + dist + "'," + n1 + ",'" + UC +"')";
                                 ResultSet r6=stmt.executeQuery(q5); 
                                       }
                                        catch(Exception e4){
                                        JOptionPane.showMessageDialog(null,"PLEASE ENTER NUMBERS IN SOME FIELDS !!!!!");
                                        System.out.println(e4);
                                  }
                                  
                                  JOptionPane.showMessageDialog(null,"Record registered Successfully!!!!!");          
                                  }
                                  catch(Exception e2){
                                  JOptionPane.showMessageDialog(null,"PLEASE ENTER INTEGER VALUE!!!!!!");     
                                  }   
                        }});
                                    p18.add(exit2);
                           
                                   up.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                                 String vill=tf1.getText();
                                  String dist=tf2.getText();
                                  String popu=tf3.getText();
                                  String UC=tf4.getText();
                                  String SHC=tf39.getText();
                                  String ACP=tf40.getText();
                                  String BCC=tf41.getText();
                                  String ER=tf42.getText();
                                  try{
                                  n1=Integer.parseInt(popu);
                                  n36=Integer.parseInt(SHC);
                                  n37=Integer.parseInt(ACP);
                                  n38=Integer.parseInt(BCC);
                                  n39=Integer.parseInt(ER);
                                  try{
                                 String q5="UPDATE GENDER_DEVELOPMENT SET SHC="+ n36 + ",ACP=" + n37 + ",BCC=" + n38 + ",ER=" + n39 + ",DISTRICT='" + dist +"',POPULATION=" + n1 + ",UC='" + UC+"' WHERE VILLAGE='" + vill +"'";
                                 ResultSet r6=stmt.executeQuery(q5); 
                                       }
                                        catch(Exception e4){
                                        JOptionPane.showMessageDialog(null,"PLEASE ENTER NUMBERS IN SOME FIELDS !!!!!");
                                        System.out.println(e4);
                                  }
                                  
                                  JOptionPane.showMessageDialog(null,"Record registered Successfully!!!!!");          
                                  }
                                  catch(Exception e2){
                                  JOptionPane.showMessageDialog(null,"PLEASE ENTER INTEGER VALUE!!!!!!");     
                                  }   
                        }});
                                    p18.add(exit2);
                         exit2.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) {
                             gen.setVisible(false);
                                JOptionPane.showMessageDialog(null,"You Pressed Exit Button!!!!!!!");                   
                            }});  
                                    up.setBackground(Color.PINK);
                                    exit2.setBackground(Color.PINK);
                                    p16.setBackground(Color.PINK);
                                    p17.setBackground(Color.PINK);
                                    p18.setBackground(Color.PINK);
                                    gen.getContentPane().setBackground(Color.PINK);
                                    gen.setLayout(new BorderLayout());
                                    p17.setLayout(new GridLayout(8,2));
                                    p18.setLayout(new GridLayout(1,3));
                                    gen.add(p17,BorderLayout.WEST);
                                    gen.add(p16,BorderLayout.NORTH); 
                                    gen.add(p18,BorderLayout.SOUTH); 
                                    gen.setSize(400,600); 
                                    gen.setVisible(true);  
                            }});
                                    p7.add(exit3);
                                     exit3.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent e) {
                                                    reg.setVisible(false);
                                JOptionPane.showMessageDialog(null,"You Pressed Exit Button!!!!!!!!!!!");                   
                            }});
                                    p7.setLayout(new GridLayout(3,2));
                                    up.setBackground(Color.PINK);
                                    exit3.setBackground(Color.PINK);
                                    reg.add(p7,BorderLayout.CENTER);
                                    reg.setSize(800,900);
                                    reg.setVisible(true);
                                   
                                   
                                                
                            }}); 
                                  
							}});                    
   
 } 
        catch(Exception e){
			System.out.print(e);
			}
					

    }
    	public void actionPerformed(ActionEvent e) {
                          
							}
    public static void main(String[] args) {
       new DBSProject();
    }
   
}

