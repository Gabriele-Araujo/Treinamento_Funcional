package AdmTurmas;

import AdmAgenServ.*;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class ExcTurmaAlerta extends javax.swing.JFrame {

    public ExcTurmaAlerta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        NomeExcAgenServ = new javax.swing.JLabel();
        nomeExcAgenServ = new javax.swing.JLabel();
        ObjExcAgenServ = new javax.swing.JLabel();
        objExcAgenServ = new javax.swing.JLabel();
        DataExcAgenServ = new javax.swing.JLabel();
        dataExcAgenServ = new javax.swing.JLabel();
        HoraExcAgenServ = new javax.swing.JLabel();
        horaExcAgenServ = new javax.swing.JLabel();
        RealExcAgenServ = new javax.swing.JLabel();
        realExcAgenServ = new javax.swing.JLabel();
        DestExcAgenServ = new javax.swing.JLabel();
        destExcAgenServ = new javax.swing.JLabel();
        ConfirmaExcAgenServ = new javax.swing.JButton();
        CancelaExcAgenServ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Excluir o Serviço: ");
        Titulo.setToolTipText("");

        NomeExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NomeExcAgenServ.setText("Nome:");
        NomeExcAgenServ.setToolTipText("");

        nomeExcAgenServ.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeExcAgenServ.setText("???");

        ObjExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ObjExcAgenServ.setText("Objetivo:");
        ObjExcAgenServ.setToolTipText("");

        objExcAgenServ.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        objExcAgenServ.setText("???");

        DataExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        DataExcAgenServ.setText("Data:");
        DataExcAgenServ.setToolTipText("");

        dataExcAgenServ.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dataExcAgenServ.setText("???");

        HoraExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        HoraExcAgenServ.setText("Hora:");
        HoraExcAgenServ.setToolTipText("");

        horaExcAgenServ.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        horaExcAgenServ.setText("???");

        RealExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        RealExcAgenServ.setText("Realizador:");
        RealExcAgenServ.setToolTipText("");

        realExcAgenServ.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        realExcAgenServ.setText("???");

        DestExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        DestExcAgenServ.setText("Destinatário:");
        DestExcAgenServ.setToolTipText("");

        destExcAgenServ.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        destExcAgenServ.setText("???");

        ConfirmaExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ConfirmaExcAgenServ.setText("Sim");
        ConfirmaExcAgenServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaExcAgenServActionPerformed(evt);
            }
        });

        CancelaExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CancelaExcAgenServ.setText("Cancelar");
        CancelaExcAgenServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaExcAgenServActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(NomeExcAgenServ)
                        .addGap(12, 12, 12)
                        .addComponent(nomeExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ObjExcAgenServ)
                        .addGap(12, 12, 12)
                        .addComponent(objExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(DataExcAgenServ)
                        .addGap(12, 12, 12)
                        .addComponent(dataExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(HoraExcAgenServ)
                        .addGap(12, 12, 12)
                        .addComponent(horaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(RealExcAgenServ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(realExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DestExcAgenServ)
                        .addGap(12, 12, 12)
                        .addComponent(destExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ConfirmaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(CancelaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeExcAgenServ)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(nomeExcAgenServ)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ObjExcAgenServ)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(objExcAgenServ)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataExcAgenServ)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(dataExcAgenServ)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaExcAgenServ)
                    .addComponent(HoraExcAgenServ))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(realExcAgenServ)
                    .addComponent(RealExcAgenServ))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DestExcAgenServ)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(destExcAgenServ)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setSize(new java.awt.Dimension(372, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Botoões de Ações
    private void CancelaExcAgenServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaExcAgenServActionPerformed
        // Click no Botão Cancelar:

        dispose();

    }//GEN-LAST:event_CancelaExcAgenServActionPerformed

    private void ConfirmaExcAgenServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaExcAgenServActionPerformed
        // Click no Botão Sim:

        dispose();
        JOptionPane.showMessageDialog(null, "Funcionário Excluido com Sucesso!!!");

    }//GEN-LAST:event_ConfirmaExcAgenServActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(ExcTurmaAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcTurmaAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcTurmaAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex
            );
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcTurmaAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcTurmaAlerta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelaExcAgenServ;
    private javax.swing.JButton ConfirmaExcAgenServ;
    private javax.swing.JLabel DataExcAgenServ;
    private javax.swing.JLabel DestExcAgenServ;
    private javax.swing.JLabel HoraExcAgenServ;
    private javax.swing.JLabel NomeExcAgenServ;
    private javax.swing.JLabel ObjExcAgenServ;
    private javax.swing.JLabel RealExcAgenServ;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel dataExcAgenServ;
    private javax.swing.JLabel destExcAgenServ;
    private javax.swing.JLabel horaExcAgenServ;
    private javax.swing.JLabel nomeExcAgenServ;
    private javax.swing.JLabel objExcAgenServ;
    private javax.swing.JLabel realExcAgenServ;
    // End of variables declaration//GEN-END:variables
}
