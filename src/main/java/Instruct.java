
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
public class Instruct extends javax.swing.JFrame {

    /**
     * Creates new form Instruct
     */
    public Instruct() {
        initComponents();
        ImageIcon icon =new ImageIcon("D:\\netproject\\Task_2\\src\\main\\java\\Images\\instruction.jpg");
        Image img=icon.getImage();
        Image image =img.getScaledInstance(bglabel.getWidth(),bglabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imgicon=new ImageIcon(image);
        bglabel.setIcon(imgicon);
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
        textlabel = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        bglabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textlabel.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        textlabel.setForeground(new java.awt.Color(255, 255, 255));
        textlabel.setText("<html>\n<body>\n<ol type=\"A\">\n<li>Number Guessing Game Rules</li><br>\n <li>You will be given 5 Chances to play.</li><br>\n <li>You will guess the correct number it will give the 100 points.</li><br>\n  <li>On each incorrect guess you will loose 10 points.</li><br>\n  <li>Number to be guessed must be between 1 to 100</li><br>\n</ol>\n</body>\n</html>");
        jPanel1.add(textlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 480, 310));

        back.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));
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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Welcome wel=new Welcome();
        wel.show();
        this.hide();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Instruct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instruct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instruct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instruct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instruct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel bglabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textlabel;
    // End of variables declaration//GEN-END:variables
}
