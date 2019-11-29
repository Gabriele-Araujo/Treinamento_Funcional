package AdmAluno;

import AdmFuncionario.*;
import Controle.Controle;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class ExcAlunAlerta extends javax.swing.JFrame {

    public ExcAlunAlerta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        NomeExcAlun = new javax.swing.JLabel();
        nomeExcAlun = new javax.swing.JLabel();
        CPFExcAlun = new javax.swing.JLabel();
        cpfExcAlun = new javax.swing.JLabel();
        NutriExcAlun = new javax.swing.JLabel();
        nutriExcAlun = new javax.swing.JLabel();
        SexoExcAlun = new javax.swing.JLabel();
        sexoExcAlun = new javax.swing.JLabel();
        TelefoneExcAlun = new javax.swing.JLabel();
        telefoneExcAlun = new javax.swing.JLabel();
        EmailExcAlun = new javax.swing.JLabel();
        emailExcAlun = new javax.swing.JLabel();
        ConfirmaExcAlun = new javax.swing.JButton();
        CancelaExcAlun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Excluir o Aluno: ");
        Titulo.setToolTipText("");

        NomeExcAlun.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NomeExcAlun.setText("Nome:");
        NomeExcAlun.setToolTipText("");

        nomeExcAlun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeExcAlun.setText("???");

        CPFExcAlun.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CPFExcAlun.setText("CPF:");
        CPFExcAlun.setToolTipText("");

        cpfExcAlun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cpfExcAlun.setText("???");

        NutriExcAlun.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NutriExcAlun.setText("Nutricionista:");
        NutriExcAlun.setToolTipText("");

        nutriExcAlun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nutriExcAlun.setText("???");

        SexoExcAlun.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        SexoExcAlun.setText("Sexo:");
        SexoExcAlun.setToolTipText("");

        sexoExcAlun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sexoExcAlun.setText("???");

        TelefoneExcAlun.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TelefoneExcAlun.setText("Telefone:");
        TelefoneExcAlun.setToolTipText("");

        telefoneExcAlun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        telefoneExcAlun.setText("???");

        EmailExcAlun.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        EmailExcAlun.setText("Email:");
        EmailExcAlun.setToolTipText("");

        emailExcAlun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        emailExcAlun.setText("???");

        ConfirmaExcAlun.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ConfirmaExcAlun.setText("Sim");
        ConfirmaExcAlun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaExcAlunActionPerformed(evt);
            }
        });

        CancelaExcAlun.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CancelaExcAlun.setText("Cancelar");
        CancelaExcAlun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaExcAlunActionPerformed(evt);
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
                        .addGap(53, 53, 53)
                        .addComponent(NomeExcAlun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeExcAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(CPFExcAlun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfExcAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NutriExcAlun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nutriExcAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(SexoExcAlun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexoExcAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(TelefoneExcAlun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefoneExcAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(EmailExcAlun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailExcAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ConfirmaExcAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(CancelaExcAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Titulo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeExcAlun)
                    .addComponent(nomeExcAlun))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFExcAlun)
                    .addComponent(cpfExcAlun))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NutriExcAlun)
                    .addComponent(nutriExcAlun))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SexoExcAlun)
                    .addComponent(sexoExcAlun))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefoneExcAlun)
                    .addComponent(telefoneExcAlun))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailExcAlun)
                    .addComponent(emailExcAlun))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmaExcAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelaExcAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setSize(new java.awt.Dimension(372, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Botoões de Ações
    private void CancelaExcAlunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaExcAlunActionPerformed
        // Click no Botão Cancelar:

        dispose();

    }//GEN-LAST:event_CancelaExcAlunActionPerformed

    private void ConfirmaExcAlunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaExcAlunActionPerformed
        // Click no Botão Sim:

        dispose();
        JOptionPane.showMessageDialog(null, "Funcionário Excluido com Sucesso!!!");

    }//GEN-LAST:event_ConfirmaExcAlunActionPerformed

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
            java.util.logging.Logger.getLogger(ExcAlunAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcAlunAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcAlunAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcAlunAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcAlunAlerta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPFExcAlun;
    private javax.swing.JButton CancelaExcAlun;
    private javax.swing.JButton ConfirmaExcAlun;
    private javax.swing.JLabel EmailExcAlun;
    private javax.swing.JLabel NomeExcAlun;
    private javax.swing.JLabel NutriExcAlun;
    private javax.swing.JLabel SexoExcAlun;
    private javax.swing.JLabel TelefoneExcAlun;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel cpfExcAlun;
    private javax.swing.JLabel emailExcAlun;
    private javax.swing.JLabel nomeExcAlun;
    private javax.swing.JLabel nutriExcAlun;
    private javax.swing.JLabel sexoExcAlun;
    private javax.swing.JLabel telefoneExcAlun;
    // End of variables declaration//GEN-END:variables
}
