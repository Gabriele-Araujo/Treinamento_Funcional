package AdmEquipamentos;

import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class ExcEquipAlerta extends javax.swing.JFrame {

    public ExcEquipAlerta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        NomeExcEquip = new javax.swing.JLabel();
        nomeExcEquip = new javax.swing.JLabel();
        IDExcEquip = new javax.swing.JLabel();
        idExcEquip = new javax.swing.JLabel();
        MarcaExcEquip = new javax.swing.JLabel();
        marcaExcEquip = new javax.swing.JLabel();
        FabricanteExcEquip = new javax.swing.JLabel();
        fabricanteExcEquip = new javax.swing.JLabel();
        TelefoneExcEquip = new javax.swing.JLabel();
        telefoneExcEquip = new javax.swing.JLabel();
        EmailExcEquip = new javax.swing.JLabel();
        emailExcEquip = new javax.swing.JLabel();
        ConfirmaExcEquip = new javax.swing.JButton();
        CancelaExcEquip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Excluir o Equipamento: ");
        Titulo.setToolTipText("");

        NomeExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NomeExcEquip.setText("Nome:");
        NomeExcEquip.setToolTipText("");

        nomeExcEquip.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeExcEquip.setText("???");

        IDExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        IDExcEquip.setText("ID:");
        IDExcEquip.setToolTipText("");

        idExcEquip.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        idExcEquip.setText("???");

        MarcaExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        MarcaExcEquip.setText("Marca:");
        MarcaExcEquip.setToolTipText("");

        marcaExcEquip.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        marcaExcEquip.setText("???");

        FabricanteExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        FabricanteExcEquip.setText("Fabricante:");
        FabricanteExcEquip.setToolTipText("");

        fabricanteExcEquip.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fabricanteExcEquip.setText("???");

        TelefoneExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TelefoneExcEquip.setText("Telefone:");
        TelefoneExcEquip.setToolTipText("");

        telefoneExcEquip.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        telefoneExcEquip.setText("???");

        EmailExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        EmailExcEquip.setText("Email:");
        EmailExcEquip.setToolTipText("");

        emailExcEquip.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        emailExcEquip.setText("???");

        ConfirmaExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ConfirmaExcEquip.setText("Sim");
        ConfirmaExcEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaExcEquipActionPerformed(evt);
            }
        });

        CancelaExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CancelaExcEquip.setText("Cancelar");
        CancelaExcEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaExcEquipActionPerformed(evt);
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
                        .addComponent(ConfirmaExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(CancelaExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FabricanteExcEquip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fabricanteExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MarcaExcEquip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marcaExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDExcEquip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NomeExcEquip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TelefoneExcEquip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefoneExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmailExcEquip)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Titulo)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeExcEquip)
                    .addComponent(nomeExcEquip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDExcEquip)
                    .addComponent(idExcEquip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarcaExcEquip)
                    .addComponent(marcaExcEquip))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FabricanteExcEquip)
                    .addComponent(fabricanteExcEquip))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefoneExcEquip)
                    .addComponent(telefoneExcEquip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailExcEquip)
                    .addComponent(emailExcEquip))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmaExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelaExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setSize(new java.awt.Dimension(372, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Botoões de Ações
    private void CancelaExcEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaExcEquipActionPerformed
        // Click no Botão Cancelar:

        dispose();

    }//GEN-LAST:event_CancelaExcEquipActionPerformed

    private void ConfirmaExcEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaExcEquipActionPerformed
        // Click no Botão Sim:

        dispose();
        JOptionPane.showMessageDialog(null, "Funcionário Excluido com Sucesso!!!");

    }//GEN-LAST:event_ConfirmaExcEquipActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:

    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcEquipAlerta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelaExcEquip;
    private javax.swing.JButton ConfirmaExcEquip;
    private javax.swing.JLabel EmailExcEquip;
    private javax.swing.JLabel FabricanteExcEquip;
    private javax.swing.JLabel IDExcEquip;
    private javax.swing.JLabel MarcaExcEquip;
    private javax.swing.JLabel NomeExcEquip;
    private javax.swing.JLabel TelefoneExcEquip;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel emailExcEquip;
    private javax.swing.JLabel fabricanteExcEquip;
    private javax.swing.JLabel idExcEquip;
    private javax.swing.JLabel marcaExcEquip;
    private javax.swing.JLabel nomeExcEquip;
    private javax.swing.JLabel telefoneExcEquip;
    // End of variables declaration//GEN-END:variables
}
