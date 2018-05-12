package frames;

public class ShowTeam extends javax.swing.JFrame {

    private String[][] tm = new String[4][4];
    private int showingTeamNo = 0;

    public ShowTeam() {
        initComponents();
        initialiseTeam();
    }

    private void initialiseTeam() {
        tm[0][0] = "Hashtag".toUpperCase();
        tm[0][1] = "Amritesh Kumar".toUpperCase();
        tm[0][2] = "Abhinav Anand".toUpperCase();
        tm[0][3] = "Sabahat".toUpperCase();
        tm[1][0] = "AKSAN".toUpperCase();
        tm[1][1] = "Kumar Luv".toUpperCase();
        tm[1][2] = "Shushant Srivastava".toUpperCase();
        tm[1][3] = "Aurobindo Mukherjee".toUpperCase();
        tm[2][0] = "Panchauri".toUpperCase();
        tm[2][1] = "Saransh Manglani".toUpperCase();
        tm[2][2] = "Amol Tandon".toUpperCase();
        tm[2][3] = "Anjali Sharma".toUpperCase();
        tm[3][0] = "Atrangi".toUpperCase();
        tm[3][1] = "Priyaranjan Lal".toUpperCase();
        tm[3][2] = "Sonam Singh".toUpperCase();
        tm[3][3] = "Shilpa".toUpperCase();
    }

    private void setField(boolean b) {
        tno.setVisible(b);
        tname.setVisible(b);
        tm1.setVisible(b);
        tm2.setVisible(b);
        tm3.setVisible(b);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tm3 = new javax.swing.JLabel();
        tno = new javax.swing.JLabel();
        tname = new javax.swing.JLabel();
        tm1 = new javax.swing.JLabel();
        tm2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WELCOME | ANTAKSHARI");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        tm3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tm3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tm3.setText("TEAM 3");
        jPanel1.add(tm3);
        tm3.setBounds(10, 150, 530, 30);

        tno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tno.setText("TEAM 1");
        jPanel1.add(tno);
        tno.setBounds(10, 10, 530, 30);

        tname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tname.setText("TEAM NAME");
        jPanel1.add(tname);
        tname.setBounds(10, 50, 530, 30);

        tm1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tm1.setText("TEAM 1");
        jPanel1.add(tm1);
        tm1.setBounds(10, 90, 530, 30);

        tm2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tm2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tm2.setText("TEAM 2");
        jPanel1.add(tm2);
        tm2.setBounds(10, 120, 530, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/giphyan.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 120, 640, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/p_1000763009.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 0, 400, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/p_1000763009.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 180);

        jMenu1.setText("Function");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Next Team");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setField(false);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        setField(true);
        if (showingTeamNo < 4) {
            tno.setText("Team " + (showingTeamNo + 1));
            tname.setText("Team Name : " + tm[showingTeamNo][0]);
            tm1.setText(tm[showingTeamNo][1]);
            tm2.setText(tm[showingTeamNo][2]);
            tm3.setText(tm[showingTeamNo][3]);
            showingTeamNo++;
        } else {
            setField(false);
            showingTeamNo++;
            if (showingTeamNo == 6) {
                antakshari.Antakshari.close(this);
                new Round1().setVisible(true);
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShowTeam().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tm1;
    private javax.swing.JLabel tm2;
    private javax.swing.JLabel tm3;
    private javax.swing.JLabel tname;
    private javax.swing.JLabel tno;
    // End of variables declaration//GEN-END:variables
}
