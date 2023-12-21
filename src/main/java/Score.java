
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Score extends javax.swing.JFrame {

    /**
     * Creates new form Score
     */
    public Score() {
        initComponents();
         ImageIcon icon =new ImageIcon("D:\\netproject\\Task_2\\src\\main\\java\\Images\\cup.jpg");
        Image img=icon.getImage();
        Image image =img.getScaledInstance(bglabel.getWidth(),bglabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imgicon=new ImageIcon(image);
        bglabel.setIcon(imgicon);
    }
    Score(String name,int limit,int score)
    {
       //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this();
        namelabel.setText(name);
        snum.setText(Integer.toString(score));
        anum.setText(Integer.toString(limit));

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        player = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        chance = new javax.swing.JLabel();
        snum = new javax.swing.JLabel();
        anum = new javax.swing.JLabel();
        replay = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        bglabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        player.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        player.setForeground(new java.awt.Color(255, 255, 255));
        player.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player.setText("PLAYER NAME");
        jPanel1.add(player, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 230, 30));

        namelabel.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        namelabel.setForeground(new java.awt.Color(255, 255, 255));
        namelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(namelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 300, 40));

        score.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        score.setForeground(new java.awt.Color(255, 255, 255));
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score.setText("SCORE    :");
        jPanel1.add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 130, 30));

        chance.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        chance.setForeground(new java.awt.Color(255, 255, 255));
        chance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chance.setText("ATTEMPT :");
        jPanel1.add(chance, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 120, 30));

        snum.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        snum.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(snum, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 40, 30));

        anum.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        anum.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(anum, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 40, 30));

        replay.setBackground(new java.awt.Color(0, 204, 0));
        replay.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        replay.setText("REPLAY");
        replay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replayActionPerformed(evt);
            }
        });
        jPanel1.add(replay, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 140, 40));

        quit.setBackground(new java.awt.Color(255, 0, 0));
        quit.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        quit.setText("EXIT");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        jPanel1.add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 110, 40));
        jPanel1.add(bglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quitActionPerformed

    private void replayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replayActionPerformed
        // TODO add your handling code here:
        String name=namelabel.getText();
        Play play=new Play(name);
        play.show();
        this.hide();
    }//GEN-LAST:event_replayActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Score().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anum;
    private javax.swing.JLabel bglabel;
    private javax.swing.JLabel chance;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel player;
    private javax.swing.JButton quit;
    private javax.swing.JButton replay;
    private javax.swing.JLabel score;
    private javax.swing.JLabel snum;
    // End of variables declaration//GEN-END:variables
}