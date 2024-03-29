package AdmFuncion�rio;

import AdmAluno.*;
import AdmFuncion�rio.*;
import Controle.Controle;
import Teste.BancoFalso;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class ExcFuncAlerta extends javax.swing.JFrame {

    BancoFalso mestre = new BancoFalso();
    OpFuncionarios OF = new OpFuncionarios();

    public ExcFuncAlerta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        NomeExcFunc = new javax.swing.JLabel();
        nomeExcFunc = new javax.swing.JLabel();
        CPFExcFunc = new javax.swing.JLabel();
        cpfExcFunc = new javax.swing.JLabel();
        CargoExcFunc = new javax.swing.JLabel();
        cargoExcFunc = new javax.swing.JLabel();
        SalarioExcFunc = new javax.swing.JLabel();
        salarioExcFunc = new javax.swing.JLabel();
        TelefoneExcFunc = new javax.swing.JLabel();
        telefoneExcFunc = new javax.swing.JLabel();
        EmailExcFunc = new javax.swing.JLabel();
        emailExcFunc = new javax.swing.JLabel();
        ConfirmaExcFunc = new javax.swing.JButton();
        CancelaExcFunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Titulo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Excluir o Funcionário: ");
        Titulo.setToolTipText("");
        getContentPane().add(Titulo);
        Titulo.setBounds(0, 13, 359, 31);

        NomeExcFunc.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NomeExcFunc.setText("Nome:");
        NomeExcFunc.setToolTipText("");
        getContentPane().add(NomeExcFunc);
        NomeExcFunc.setBounds(59, 74, 45, 23);

        nomeExcFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeExcFunc.setText("???");
        getContentPane().add(nomeExcFunc);
        nomeExcFunc.setBounds(116, 80, 180, 22);

        CPFExcFunc.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CPFExcFunc.setText("CPF:");
        CPFExcFunc.setToolTipText("");
        getContentPane().add(CPFExcFunc);
        CPFExcFunc.setBounds(74, 103, 30, 23);

        cpfExcFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cpfExcFunc.setText("???");
        getContentPane().add(cpfExcFunc);
        cpfExcFunc.setBounds(116, 108, 180, 22);

        CargoExcFunc.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CargoExcFunc.setText("Cargo:");
        CargoExcFunc.setToolTipText("");
        getContentPane().add(CargoExcFunc);
        CargoExcFunc.setBounds(57, 132, 47, 23);

        cargoExcFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cargoExcFunc.setText("???");
        getContentPane().add(cargoExcFunc);
        cargoExcFunc.setBounds(116, 136, 180, 22);

        SalarioExcFunc.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        SalarioExcFunc.setText("Salário:");
        SalarioExcFunc.setToolTipText("");
        getContentPane().add(SalarioExcFunc);
        SalarioExcFunc.setBounds(48, 161, 56, 23);

        salarioExcFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        salarioExcFunc.setText("???");
        getContentPane().add(salarioExcFunc);
        salarioExcFunc.setBounds(116, 164, 180, 22);

        TelefoneExcFunc.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TelefoneExcFunc.setText("Telefone:");
        TelefoneExcFunc.setToolTipText("");
        getContentPane().add(TelefoneExcFunc);
        TelefoneExcFunc.setBounds(37, 190, 67, 23);

        telefoneExcFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        telefoneExcFunc.setText("???");
        getContentPane().add(telefoneExcFunc);
        telefoneExcFunc.setBounds(116, 192, 180, 22);

        EmailExcFunc.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        EmailExcFunc.setText("Email:");
        EmailExcFunc.setToolTipText("");
        getContentPane().add(EmailExcFunc);
        EmailExcFunc.setBounds(61, 219, 43, 23);

        emailExcFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        emailExcFunc.setText("???");
        getContentPane().add(emailExcFunc);
        emailExcFunc.setBounds(116, 220, 180, 22);

        ConfirmaExcFunc.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ConfirmaExcFunc.setText("Sim");
        ConfirmaExcFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaExcFuncActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmaExcFunc);
        ConfirmaExcFunc.setBounds(24, 271, 138, 40);

        CancelaExcFunc.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CancelaExcFunc.setText("Cancelar");
        CancelaExcFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaExcFuncActionPerformed(evt);
            }
        });
        getContentPane().add(CancelaExcFunc);
        CancelaExcFunc.setBounds(194, 271, 138, 40);

        setSize(new java.awt.Dimension(372, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Botoões de Ações
    private void CancelaExcFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaExcFuncActionPerformed
        // Click no Botão Cancelar:

        dispose();

    }//GEN-LAST:event_CancelaExcFuncActionPerformed

    private void ConfirmaExcFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaExcFuncActionPerformed
        // Click no Botão Sim:

        mestre.funcionarios.remove(OF.indice);
        dispose();
        JOptionPane.showMessageDialog(null, "Funcionário Excluido com Sucesso!!!");

    }//GEN-LAST:event_ConfirmaExcFuncActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:

        nomeExcFunc.setText(mestre.funcionarios.get(OF.indice).nome);
        cpfExcFunc.setText(mestre.funcionarios.get(OF.indice).cpf);
        cargoExcFunc.setText(mestre.funcionarios.get(OF.indice).cargo);
        salarioExcFunc.setText(String.valueOf(mestre.funcionarios.get(OF.indice).salario));
        telefoneExcFunc.setText(mestre.funcionarios.get(OF.indice).telefone);
        emailExcFunc.setText(mestre.funcionarios.get(OF.indice).email);

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
            java.util.logging.Logger.getLogger(ExcFuncAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcFuncAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcFuncAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcFuncAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ExcFuncAlerta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPFExcFunc;
    private javax.swing.JButton CancelaExcFunc;
    private javax.swing.JLabel CargoExcFunc;
    private javax.swing.JButton ConfirmaExcFunc;
    private javax.swing.JLabel EmailExcFunc;
    private javax.swing.JLabel NomeExcFunc;
    private javax.swing.JLabel SalarioExcFunc;
    private javax.swing.JLabel TelefoneExcFunc;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel cargoExcFunc;
    private javax.swing.JLabel cpfExcFunc;
    private javax.swing.JLabel emailExcFunc;
    private javax.swing.JLabel nomeExcFunc;
    private javax.swing.JLabel salarioExcFunc;
    private javax.swing.JLabel telefoneExcFunc;
    // End of variables declaration//GEN-END:variables
}
