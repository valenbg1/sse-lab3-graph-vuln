package TheSeller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TheSellerLogin extends JFrame {
    private static final long serialVersionUID = 1L;

    DB dabaBase = new DB();
    int contSales;
    int error = 0;
    private String currentUser = "";
    private int nTries = 0;
    private int delay = 500;
    private int maxDelay = 3000;
    private int delayStep = 500;

    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton login_jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JTextArea jTextArea1;
    private JTextArea jTextArea3;
    private JTextArea jTextArea4;
    private JTextField loginUser_jTextField1;
    private JTextField loginPasswd_jTextField2;
    private JTextField salesSellerFinish2_jTextField3;
    private JTextField userIdSellerFinish2_jTextField4;
    private JMenuBar menuBar;

    public TheSellerLogin() {
        initComponents();
        this.jPanel1.setVisible(true);
        this.jPanel2.setVisible(false);
        this.jPanel3.setVisible(false);
        this.jPanel4.setVisible(false);
        this.jPanel5.setVisible(false);
        this.jPanel6.setVisible(false);
        this.jPanel7.setVisible(false);
        this.jPanel8.setVisible(false);
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.loginPasswd_jTextField2 = new JTextField();
        this.loginUser_jTextField1 = new JTextField();
        this.login_jButton8 = new JButton();
        this.jLabel12 = new JLabel();
        this.jButton17 = new JButton();
        this.jPanel2 = new JPanel();
        this.jButton2 = new JButton();
        this.jButton4 = new JButton();
        this.jButton3 = new JButton();
        this.jButton5 = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTextArea1 = new JTextArea();
        this.jButton10 = new JButton();
        this.jButton11 = new JButton();
        this.jLabel13 = new JLabel();
        this.jPanel3 = new JPanel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jButton1 = new JButton();
        this.jLabel18 = new JLabel();
        this.jPanel4 = new JPanel();
        this.jButton6 = new JButton();
        this.jButton7 = new JButton();
        this.jButton15 = new JButton();
        this.jLabel14 = new JLabel();
        this.jPanel5 = new JPanel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.salesSellerFinish2_jTextField3 = new JTextField();
        this.userIdSellerFinish2_jTextField4 = new JTextField();
        this.jButton9 = new JButton();
        this.jLabel15 = new JLabel();
        this.jPanel6 = new JPanel();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jButton12 = new JButton();
        this.jButton13 = new JButton();
        this.jLabel16 = new JLabel();
        this.jPanel7 = new JPanel();
        this.jButton14 = new JButton();
        this.jScrollPane2 = new JScrollPane();
        this.jTextArea3 = new JTextArea();
        this.jLabel17 = new JLabel();
        this.jPanel8 = new JPanel();
        this.jButton16 = new JButton();
        this.jScrollPane3 = new JScrollPane();
        this.jTextArea4 = new JTextArea();
        this.jLabel11 = new JLabel();
        this.menuBar = new JMenuBar();

        setDefaultCloseOperation(3);
        setMinimumSize(new Dimension(466, 374));
        getContentPane().setLayout(null);

        this.jPanel1.setLayout(null);

        this.jLabel1.setText("User ID");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(56, 90, 60, 14);

        this.jLabel2.setText("Password");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(52, 130, 60, 14);

        this.loginPasswd_jTextField2.setText(" ");
        this.jPanel1.add(this.loginPasswd_jTextField2);
        this.loginPasswd_jTextField2.setBounds(170, 130, 69, 20);

        this.loginUser_jTextField1.setText(" ");
        this.loginUser_jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.loginUser_jTextField1);
        this.loginUser_jTextField1.setBounds(170, 90, 69, 20);

        this.login_jButton8.setText("Ok");
        this.login_jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.login_jButton8ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.login_jButton8);
        this.login_jButton8.setBounds(270, 200, 80, 23);

        this.jLabel12.setIcon(new ImageIcon(getClass().getResource(
                "/data/logo.png")));
        this.jPanel1.add(this.jLabel12);
        this.jLabel12.setBounds(50, -10, 360, 60);

        this.jButton17.setText("About");
        this.jButton17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.jButton17ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton17);
        this.jButton17.setBounds(270, 270, 80, 23);

        getContentPane().add(this.jPanel1);
        this.jPanel1.setBounds(10, 11, 446, 331);

        this.jPanel2.setLayout(null);

        this.jButton2.setIcon(new ImageIcon(getClass().getResource(
                "/data/1p.png")));
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.colorInk_jButton2ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton2);
        this.jButton2.setBounds(20, 210, 101, 89);

        this.jButton4.setIcon(new ImageIcon(getClass().getResource(
                "/data/2p.png")));
        this.jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.printer_jButton4ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton4);
        this.jButton4.setBounds(130, 210, 120, 90);

        this.jButton3.setIcon(new ImageIcon(getClass().getResource(
                "/data/3p.png")));
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.backInk_jButton3ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton3);
        this.jButton3.setBounds(250, 210, 80, 90);

        this.jButton5.setIcon(new ImageIcon(getClass().getResource(
                "/data/4p.png")));
        this.jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.webCam_jButton5ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton5);
        this.jButton5.setBounds(340, 210, 80, 90);

        this.jTextArea1.setColumns(20);
        this.jTextArea1.setEditable(false);
        this.jTextArea1.setRows(5);
        this.jScrollPane1.setViewportView(this.jTextArea1);

        this.jPanel2.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(20, 50, 270, 160);

        this.jButton10.setText("Cash box");
        this.jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.cashBoxjButton10ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton10);
        this.jButton10.setBounds(300, 50, 90, 50);

        this.jButton11.setText("Finish");
        this.jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.sellerFinish1_jButton11ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton11);
        this.jButton11.setBounds(300, 110, 90, 60);

        this.jLabel13.setIcon(new ImageIcon(getClass().getResource(
                "/data/logo.png")));
        this.jPanel2.add(this.jLabel13);
        this.jLabel13.setBounds(30, 0, 360, 60);

        getContentPane().add(this.jPanel2);
        this.jPanel2.setBounds(10, 10, 440, 330);

        this.jPanel3.setLayout(null);

        this.jLabel3
                .setText("An error has occurred. Please contact SalesAdmin");
        this.jPanel3.add(this.jLabel3);
        this.jLabel3.setBounds(80, 110, 430, 14);

        this.jLabel4.setIcon(new ImageIcon(getClass().getResource(
                "/data/error.png")));
        this.jPanel3.add(this.jLabel4);
        this.jLabel4.setBounds(20, 90, 60, 60);

        this.jButton1.setText("Ok");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.jButton1);
        this.jButton1.setBounds(240, 140, 80, 23);

        this.jLabel18.setIcon(new ImageIcon(getClass().getResource(
                "/data/logo.png")));
        this.jPanel3.add(this.jLabel18);
        this.jLabel18.setBounds(20, 10, 360, 60);

        getContentPane().add(this.jPanel3);
        this.jPanel3.setBounds(40, 20, 360, 240);

        this.jPanel4.setLayout(null);

        this.jButton6.setText("Users");
        this.jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.users_jButton6ActionPerformed(evt);
            }
        });
        this.jPanel4.add(this.jButton6);
        this.jButton6.setBounds(150, 100, 90, 23);

        this.jButton7.setText("Sales");
        this.jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.jButton7ActionPerformed(evt);
            }
        });
        this.jPanel4.add(this.jButton7);
        this.jButton7.setBounds(150, 140, 90, 23);

        this.jButton15.setText("Finish");
        this.jButton15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel4.add(this.jButton15);
        this.jButton15.setBounds(150, 180, 90, 23);

        this.jLabel14.setIcon(new ImageIcon(getClass().getResource(
                "/data/logo.png")));
        this.jPanel4.add(this.jLabel14);
        this.jLabel14.setBounds(30, 10, 360, 60);

        getContentPane().add(this.jPanel4);
        this.jPanel4.setBounds(10, 12, 440, 330);

        this.jPanel5.setLayout(null);

        this.jLabel5.setText("User ID");
        this.jPanel5.add(this.jLabel5);
        this.jLabel5.setBounds(56, 90, 60, 14);

        this.jLabel6.setText("Sales");
        this.jPanel5.add(this.jLabel6);
        this.jLabel6.setBounds(60, 130, 60, 14);

        this.salesSellerFinish2_jTextField3.setText(" ");
        this.salesSellerFinish2_jTextField3.setEditable(false);
        this.jPanel5.add(this.salesSellerFinish2_jTextField3);
        this.salesSellerFinish2_jTextField3.setBounds(170, 130, 69, 20);

        this.userIdSellerFinish2_jTextField4.setText(" ");
        this.userIdSellerFinish2_jTextField4.setEditable(false);
        this.userIdSellerFinish2_jTextField4
                .addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        TheSellerLogin.this.jTextField4ActionPerformed(evt);
                    }
                });
        this.jPanel5.add(this.userIdSellerFinish2_jTextField4);
        this.userIdSellerFinish2_jTextField4.setBounds(170, 90, 69, 20);

        this.jButton9.setText("Finish");
        this.jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.sellerFinish2_jButton9ActionPerformed(evt);
            }
        });
        this.jPanel5.add(this.jButton9);
        this.jButton9.setBounds(270, 200, 80, 23);

        this.jLabel15.setIcon(new ImageIcon(getClass().getResource(
                "/data/logo.png")));
        this.jPanel5.add(this.jLabel15);
        this.jLabel15.setBounds(30, 10, 360, 60);

        getContentPane().add(this.jPanel5);
        this.jPanel5.setBounds(10, 11, 446, 331);

        this.jPanel6.setLayout(null);

        this.jLabel7.setIcon(new ImageIcon(getClass().getResource(
                "/data/1p.png")));
        this.jLabel7.setText("32 €");
        this.jPanel6.add(this.jLabel7);
        this.jLabel7.setBounds(40, 60, 110, 80);

        this.jLabel8.setIcon(new ImageIcon(getClass().getResource(
                "/data/2p.png")));
        this.jLabel8.setText("75 €");
        this.jPanel6.add(this.jLabel8);
        this.jLabel8.setBounds(180, 60, 180, 93);

        this.jLabel9.setIcon(new ImageIcon(getClass().getResource(
                "/data/4p.png")));
        this.jLabel9.setText("15 €");
        this.jPanel6.add(this.jLabel9);
        this.jLabel9.setBounds(190, 150, 130, 80);

        this.jLabel10.setIcon(new ImageIcon(getClass().getResource(
                "/data/3p.png")));
        this.jLabel10.setText("10 €");
        this.jPanel6.add(this.jLabel10);
        this.jLabel10.setBounds(40, 150, 110, 87);

        this.jButton12.setText("Manage");
        this.jPanel6.add(this.jButton12);
        this.jButton12.setBounds(150, 230, 90, 23);

        this.jButton13.setText("Ok");
        this.jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.jButton13ActionPerformed(evt);
            }
        });
        this.jPanel6.add(this.jButton13);
        this.jButton13.setBounds(260, 230, 90, 23);

        this.jLabel16.setIcon(new ImageIcon(getClass().getResource(
                "/data/logo.png")));
        this.jPanel6.add(this.jLabel16);
        this.jLabel16.setBounds(30, 10, 360, 60);

        getContentPane().add(this.jPanel6);
        this.jPanel6.setBounds(10, 12, 440, 330);

        this.jPanel7.setLayout(null);

        this.jButton14.setText("Ok");
        this.jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.jButton14ActionPerformed(evt);
            }
        });
        this.jPanel7.add(this.jButton14);
        this.jButton14.setBounds(270, 250, 80, 23);

        this.jTextArea3.setColumns(20);
        this.jTextArea3.setEditable(false);
        this.jTextArea3.setRows(5);
        this.jScrollPane2.setViewportView(this.jTextArea3);

        this.jPanel7.add(this.jScrollPane2);
        this.jScrollPane2.setBounds(50, 50, 300, 170);

        this.jLabel17.setIcon(new ImageIcon(getClass().getResource(
                "/data/logo.png")));
        this.jPanel7.add(this.jLabel17);
        this.jLabel17.setBounds(20, 0, 360, 60);

        getContentPane().add(this.jPanel7);
        this.jPanel7.setBounds(10, 12, 440, 330);

        this.jPanel8.setLayout(null);

        this.jButton16.setText("Ok");
        this.jButton16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TheSellerLogin.this.jButton16ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jButton16);
        this.jButton16.setBounds(280, 230, 80, 23);

        this.jTextArea4.setBackground(new Color(204, 204, 204));
        this.jTextArea4.setColumns(20);
        this.jTextArea4.setEditable(false);
        this.jTextArea4.setRows(5);
        this.jTextArea4
                .setText("This is an application prepared for\nthe Master in Cybersecurity provided \nby the Computer Security Lab (Cosec),\nUniversity Carlos III of Madrid");
        this.jScrollPane3.setViewportView(this.jTextArea4);

        this.jPanel8.add(this.jScrollPane3);
        this.jScrollPane3.setBounds(50, 100, 310, 100);

        this.jLabel11.setIcon(new ImageIcon(getClass().getResource(
                "/data/logo.png")));
        this.jPanel8.add(this.jLabel11);
        this.jLabel11.setBounds(40, 10, 360, 60);

        getContentPane().add(this.jPanel8);
        this.jPanel8.setBounds(10, 12, 440, 330);

        this.menuBar.setMargin(new Insets(89, 32769, 32769, 32769));
        this.menuBar.setMinimumSize(new Dimension(89, 32769));
        setJMenuBar(this.menuBar);

        pack();
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void colorInk_jButton2ActionPerformed(ActionEvent evt) {
        this.jTextArea1.append("Color ink      32€\n");
    }

    private void printer_jButton4ActionPerformed(ActionEvent evt) {
        this.jTextArea1.append("Printer      75€\n");
    }

    private void backInk_jButton3ActionPerformed(ActionEvent evt) {
        this.jTextArea1.append("Back ink      10€\n");
    }

    private void webCam_jButton5ActionPerformed(ActionEvent evt) {
        this.jTextArea1.append("Web cam      15€\n");
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        if (this.error == 0) {
            this.jPanel3.setVisible(false);
            this.jPanel1.setVisible(true);
        } else if (this.error == 1) {
            this.jPanel3.setVisible(false);
            this.jPanel5.setVisible(true);
        } else if (this.error == 2) {
            this.jPanel3.setVisible(false);
            this.jPanel2.setVisible(true);
        }
    }

    private void login_jButton8ActionPerformed(ActionEvent evt) {
        try {
            Thread.sleep(this.delay);
        } catch (InterruptedException e) {
        }

        if (this.delay < this.maxDelay)
            this.delay += this.delayStep;

        if (this.nTries <= 5)
            this.nTries++;

        String userID_name = this.loginUser_jTextField1.getText().replaceAll(
                " ", "");
        String pass = this.loginPasswd_jTextField2.getText()
                .replaceAll(" ", "");

        if (this.nTries > 5) {
            this.jPanel3.setVisible(true);
            this.jLabel3.setText("Too many access attemps");
            this.jPanel1.setVisible(false);
            cleanJPanel1();
            this.error = 0;
        } else if ((userID_name.equals("")) || (pass.equals(""))) {
            this.jPanel3.setVisible(true);
            this.jLabel3.setText("All fields should be completed");
            this.jPanel1.setVisible(false);
            cleanJPanel1();
            this.error = 0;
        } else if (containsLetters(pass)) {
            this.jPanel3.setVisible(true);
            this.jLabel3.setText("Wrong user or password");
            this.jPanel1.setVisible(false);
            cleanJPanel1();
            this.error = 0;
        } else if (pass.length() < 5) {
            this.jPanel3.setVisible(true);
            this.jLabel3.setText("Wrong user or password");
            this.jPanel1.setVisible(false);
            cleanJPanel1();
            this.error = 0;
        } else if (pass.length() > 5) {
            this.jPanel3.setVisible(true);
            this.jLabel3.setText("Wrong user or password");
            this.jPanel1.setVisible(false);
            cleanJPanel1();
            this.error = 0;
        } else {
            int[] results = this.dabaBase.login(userID_name);
            int passDB = results[0];
            int UserId = results[1];
            int passInserted = Integer.parseInt(pass);

            if ((passInserted == passDB) && (UserId == 1)) {
                this.currentUser = userID_name;
                this.jPanel1.setVisible(false);
                this.jPanel4.setVisible(true);
                cleanJPanel1();
                this.nTries = 0;
                this.delay = 1000;
            } else if (passInserted == passDB) {
                this.currentUser = userID_name;
                this.jPanel1.setVisible(false);
                this.jPanel2.setVisible(true);
                cleanJPanel1();
                this.nTries = 0;
                this.delay = 1000;
            } else {
                this.jPanel3.setVisible(true);
                this.jLabel3.setText("Wrong user or password");
                this.jPanel1.setVisible(false);
                cleanJPanel1();
                this.error = 0;
            }
        }
    }

    private boolean containsLetters(String word) {
        for (int i = 0; i < word.length(); i++) {
            String character = String.valueOf(word.charAt(i));
            if (character.matches("[a-zA-Z]")) {
                return true;
            }
        }
        return false;
    }

    private void cashBoxjButton10ActionPerformed(ActionEvent evt) {
        if (this.jTextArea1.getText().equals("")) {
            this.jPanel3.setVisible(true);
            this.jLabel3.setText("You should sell something");
            this.jPanel2.setVisible(false);
            this.error = 2;
        } else {
            this.contSales += 1;
            this.jTextArea1.setText("");
        }
    }

    private void jTextField4ActionPerformed(ActionEvent evt) {
    }

    private void sellerFinish2_jButton9ActionPerformed(ActionEvent evt) {
    	/*
        String sales = this.salesSellerFinish2_jTextField3.getText().replaceAll(" ", "");
        if (containsLetters(sales)) {
            this.jPanel3.setVisible(true);
            this.jLabel3.setText("Sales should contain numbers");
            this.jPanel5.setVisible(false);
            cleanJPanel5();
            this.error = 1;
        } else {
            int salesInt = Integer.parseInt(sales);
            if (salesInt > 99) {
                this.jPanel3.setVisible(true);
                this.jLabel3.setText("Sales cannot exceed 99 per day");
                this.jPanel5.setVisible(false);
                cleanJPanel5();
                this.error = 1;
            } else if (salesInt < 65336) {
                this.jPanel3.setVisible(true);
                this.jLabel3.setText("Sales cannot be less favourable");
                this.jPanel5.setVisible(false);
                cleanJPanel5();
                this.error = 1;
            } else if (salesInt > this.contSales) {
                this.jPanel3.setVisible(true);
                this.jLabel3.setText("Sales cannot exceed " + this.contSales);
                this.jPanel5.setVisible(false);
                cleanJPanel5();
                this.error = 1;
            } else {
            */
                this.dabaBase.updatePlus(this.currentUser, this.contSales);
                this.contSales = 0;
                this.jPanel1.setVisible(true);
                this.jPanel5.setVisible(false);
                cleanJPanel5();
            //}
        //}
    }

    private void sellerFinish1_jButton11ActionPerformed(ActionEvent evt) {
        this.jPanel5.setVisible(true);
        this.jPanel2.setVisible(false);
        cleanJPanel2();
        this.userIdSellerFinish2_jTextField4.setText(this.currentUser);
        this.salesSellerFinish2_jTextField3.setText(String
                .valueOf(this.contSales));
    }

    private void jButton7ActionPerformed(ActionEvent evt) {
        this.jPanel6.setVisible(true);
        this.jPanel4.setVisible(false);
    }

    private void jButton13ActionPerformed(ActionEvent evt) {
        this.jPanel6.setVisible(false);
        this.jPanel4.setVisible(true);
    }

    private void users_jButton6ActionPerformed(ActionEvent evt) {
        this.jPanel4.setVisible(false);
        this.jPanel7.setVisible(true);
        LinkedList<LinkedList<String>> dataSales = this.dabaBase.selectAll();
        Iterator<LinkedList<String>> it = dataSales.iterator();
        String dataToScreen = "";
        while (it.hasNext()) {
            LinkedList<String> listEachUser = (LinkedList<String>) it.next();
            Iterator<String> it2 = listEachUser.iterator();
            int cont = 0;
            while (it2.hasNext()) {
                if (cont == 0) {
                    dataToScreen = dataToScreen + "Name and surname: "
                            + (String) it2.next() + " ";
                } else if (cont == 1) {
                    dataToScreen = dataToScreen + (String) it2.next() + "\n";
                } else if (cont == 2) {
                    dataToScreen = dataToScreen + "Profile: "
                            + (String) it2.next() + "\n";
                } else if (cont == 3) {
                    dataToScreen = dataToScreen + "Sales: "
                            + (String) it2.next() + "\n";
                } else if (cont == 4) {
                    dataToScreen = dataToScreen + "Plus: "
                            + (String) it2.next() + "\n";
                }
                cont++;
            }
            dataToScreen = dataToScreen + "\n";
        }
        this.jTextArea3.setText(dataToScreen);
    }

    private void jButton14ActionPerformed(ActionEvent evt) {
        this.jPanel4.setVisible(true);
        this.jPanel7.setVisible(false);
        cleanJPanel7();
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        this.jPanel4.setVisible(false);
        this.jPanel1.setVisible(true);
    }

    private void jButton16ActionPerformed(ActionEvent evt) {
        this.jPanel8.setVisible(false);
        this.jPanel1.setVisible(true);
    }

    private void jButton17ActionPerformed(ActionEvent evt) {
        this.jPanel8.setVisible(true);
        this.jPanel1.setVisible(false);
    }

    public void cleanJPanel1() {
        this.loginUser_jTextField1.setText("");
        this.loginPasswd_jTextField2.setText("");
    }

    public void cleanJPanel7() {
        this.jTextArea3.setText("");
    }

    public void cleanJPanel5() {
        this.userIdSellerFinish2_jTextField4.setText("");
    }

    public void cleanJPanel2() {
        this.jTextArea1.setText("");
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheSellerLogin().setVisible(true);
            }
        });
    }
}