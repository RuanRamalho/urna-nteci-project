

package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class viewMerenda extends javax.swing.JFrame {

    int Feliz = 0;
    int Normal = 0;
    int Triste = 0;
    int QuantidadeDeVotos = 0;
  
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Logo.png")));
    }
    
    public viewMerenda() {
        initComponents();
        setIcon();
        setExtendedState(MAXIMIZED_BOTH);
        
        lblFeliz.setVisible(false);
        lblNormal.setVisible(false);
        lblTriste.setVisible(false);
        lblResultado.setVisible(false);
        lblQuantidade.setVisible(false);
        lblVotos.setVisible(false);
    }
    
    public void desaparecer(){
        lblFeliz.setVisible(false);
        lblNormal.setVisible(false);
        lblTriste.setVisible(false);
        lblResultado.setVisible(false);
        lblQuantidade.setVisible(false);
        lblVotos.setVisible(false);
    }
    
    public void aparecer(){
        
        lblFeliz.setVisible(true);
        lblNormal.setVisible(true);
        lblTriste.setVisible(true);
        lblResultado.setVisible(true);
        lblQuantidade.setVisible(true);
        lblVotos.setVisible(true);
    }
    
    public void CorPreta(){
        
         lblResultado.setForeground(Color.BLACK);
         lblFeliz.setForeground(Color.BLACK);
         lblNormal.setForeground(Color.BLACK);
         lblTriste.setForeground(Color.BLACK);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnNormal = new javax.swing.JButton();
        btnTriste = new javax.swing.JButton();
        btnFeliz = new javax.swing.JButton();
        lblFeliz = new javax.swing.JLabel();
        lblNormal = new javax.swing.JLabel();
        lblTriste = new javax.swing.JLabel();
        btnResultado = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblVotos = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Qualidade da Merenda");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("O que você achou da merenda de hoje?");

        btnVoltar.setBackground(new java.awt.Color(0, 0, 204));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 51));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(268, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(btnVoltar))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnVoltar)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        btnNormal.setBackground(new java.awt.Color(0, 0, 204));
        btnNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/normal.png"))); // NOI18N
        btnNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalActionPerformed(evt);
            }
        });

        btnTriste.setBackground(new java.awt.Color(0, 0, 204));
        btnTriste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Triste.jpg"))); // NOI18N
        btnTriste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTristeActionPerformed(evt);
            }
        });

        btnFeliz.setBackground(new java.awt.Color(0, 0, 204));
        btnFeliz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Feliz.png"))); // NOI18N
        btnFeliz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFelizActionPerformed(evt);
            }
        });

        lblFeliz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFeliz.setText("0");

        lblNormal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNormal.setText("0");

        lblTriste.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTriste.setText("0");

        btnResultado.setBackground(new java.awt.Color(0, 0, 204));
        btnResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResultado.setForeground(new java.awt.Color(255, 255, 51));
        btnResultado.setText("Resultado");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 255, 51));
        lblResultado.setText("Resultado Merenda");

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantidade.setText("Total de Votos:");

        lblVotos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVotos.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(lblFeliz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTriste)
                .addGap(171, 171, 171))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVotos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResultado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnFeliz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(btnNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(btnTriste)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTriste)
                    .addComponent(btnNormal)
                    .addComponent(btnFeliz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTriste)
                    .addComponent(lblNormal)
                    .addComponent(lblFeliz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultado)
                    .addComponent(btnResultado)
                    .addComponent(lblQuantidade)
                    .addComponent(lblVotos))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalActionPerformed
        // TODO add your handling code here:
        Normal++;
        QuantidadeDeVotos++;
        lblVotos.setText(Integer.toString(QuantidadeDeVotos));
        lblNormal.setText(Integer.toString(Normal));
        
        CorPreta();
        desaparecer();
        
        JOptionPane.showMessageDialog(null, "Votado com sucesso!");
    }//GEN-LAST:event_btnNormalActionPerformed

    private void btnTristeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTristeActionPerformed
        // TODO add your handling code here:
        Triste++;
        QuantidadeDeVotos++;
        lblVotos.setText(Integer.toString(QuantidadeDeVotos));
        lblTriste.setText(Integer.toString(Triste));
        
        CorPreta();
        desaparecer();
        
        JOptionPane.showMessageDialog(null, "Votado com sucesso!");
    }//GEN-LAST:event_btnTristeActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        // TODO add your handling code here:
        aparecer();
        
        if(Feliz > Normal && Feliz > Triste){
            lblResultado.setText("A merenda está boa!");
            lblResultado.setForeground(Color.GREEN);
            lblFeliz.setForeground(Color.GREEN);
        }
        
       else if(Normal > Feliz && Normal > Triste){
            lblResultado.setText("A merenda está regular!");
            lblResultado.setForeground(Color.ORANGE);
            lblNormal.setForeground(Color.ORANGE);
        }
        
       else if(Triste > Feliz && Triste > Normal){
            lblResultado.setText("A merenda está ruim!");
            lblResultado.setForeground(Color.RED);
            lblTriste.setForeground(Color.RED);
        }
        
       else{
           lblResultado.setText("Empate");
           lblResultado.setForeground(Color.YELLOW);
           lblFeliz.setForeground(Color.ORANGE);
           lblNormal.setForeground(Color.ORANGE);
           lblTriste.setForeground(Color.ORANGE);
           
       }
        
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnFelizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFelizActionPerformed
        // TODO add your handling code here:
        Feliz++;
        QuantidadeDeVotos++;
        lblVotos.setText(Integer.toString(QuantidadeDeVotos));
        lblFeliz.setText(Integer.toString(Feliz));

        CorPreta();
        desaparecer();

        JOptionPane.showMessageDialog(null, "Votado com sucesso!");
    }//GEN-LAST:event_btnFelizActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        new viewPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(viewMerenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewMerenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewMerenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewMerenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewMerenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFeliz;
    private javax.swing.JButton btnNormal;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnTriste;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFeliz;
    private javax.swing.JLabel lblNormal;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTriste;
    private javax.swing.JLabel lblVotos;
    // End of variables declaration//GEN-END:variables
}
