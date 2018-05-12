package frames;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerFrame extends javax.swing.JFrame {

    Timer timer;
    int elapsedSeconds;
    boolean pause;

    public TimerFrame(int elapsedSeconds, boolean pause) {
        initComponents();
        this.elapsedSeconds = elapsedSeconds;
        this.pause = pause;
        jLabel2.setText("" + this.elapsedSeconds);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                int elapsedSeconds = Integer.parseInt(jLabel2.getText()) - 1;
                jLabel2.setText("" + elapsedSeconds);
                TimerFrame.jLabel1.setText("00:" + String.format("%02d", elapsedSeconds));
                if (elapsedSeconds <= 0) {
                    Toolkit.getDefaultToolkit().beep();
                    timer.stop();
                    JOptionPane.showMessageDialog(null, "Time Up!");
                    //check = false;
                }

            }
        });
    }

    public TimerFrame(int elapsedSeconds) {
        initComponents();
        this.elapsedSeconds = elapsedSeconds;
        jLabel2.setText("" + this.elapsedSeconds);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                int elapsedSeconds = Integer.parseInt(jLabel2.getText()) - 1;
                jLabel2.setText("" + elapsedSeconds);
                TimerFrame.jLabel1.setText("00:" + String.format("%02d", elapsedSeconds));
                if (elapsedSeconds <= 0) {
                    Toolkit.getDefaultToolkit().beep();
                    timer.stop();
                    JOptionPane.showMessageDialog(null, "Time Up!");
                    //check = false;
                }

            }
        });
    }

    private void restart() {
        if (timer != null) {
            if (timer.isRunning()) {
                //timer.restart();
                timer.stop();
                jLabel1.setText("00:" + elapsedSeconds);
                jLabel2.setText("" + elapsedSeconds);
                timer.start();
            } else {
                jLabel1.setText("00:" + elapsedSeconds);
                jLabel2.setText("" + elapsedSeconds);
                timer.start();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jButton1.setText("R");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(720, 10, 40, 40);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(20, 270, 730, 60);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 340, 730, 150);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 150)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("00:00");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 730, 230);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Original image_ 1680x1050.jpg"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 770, 590);

        jMenu1.setText("Function");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Restart");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Close");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //timer = new Timer(1000, new TimerListener(elapsedSeconds));
        jLabel1.setText("00:" + elapsedSeconds);
        if (!pause) {
            timer.start();
        }
        /*while (tl.check) {
         if (!tl.check) {
         break;
         }
         }*/
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        restart();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (timer != null) {
            if (timer.isRunning()) {
                timer.stop();
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        restart();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        antakshari.Antakshari.close(this);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TimerFrame(0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JMenu jMenu1;
    public static javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

/*class TimerListener implements ActionListener {
    
 int elapsedSeconds;
 public boolean check = true;
    
 public TimerListener(int elapsedSeconds) {
 this.elapsedSeconds = elapsedSeconds;
 }
    
 @Override
 public void actionPerformed(ActionEvent evt) {
 if (check) {
 elapsedSeconds--;
 TimerFrame.jLabel1.setText("00:" + String.format("" + elapsedSeconds, "%2d"));
 if (elapsedSeconds <= 0) {
 JOptionPane.showMessageDialog(null, "Time Up!");
 check = false;
 }
 }
 System.out.println("10");
 }
 }*/
