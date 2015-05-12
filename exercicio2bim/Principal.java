/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Vazi
 */
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonSalvar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        inputNome = new javax.swing.JTextField();
        inputData = new javax.swing.JTextField();
        inputTelefone = new javax.swing.JTextField();
        inputEndereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonRemover.setText("Remover");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        buttonAdicionar.setText("Adicionar");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
            },
            new String [] {
                "Nome", "Data Nascimento", "Telefone", "Endereço"
            }
        ));
        tableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsuarios);

        jLabel1.setText("Nome");

        jLabel2.setText("Data Nascimento");

        jLabel3.setText("Telefone");

        jLabel4.setText("Endereço");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNome)
                            .addComponent(inputData)
                            .addComponent(inputTelefone)
                            .addComponent(inputEndereco)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle
                                .ComponentPlacement.RELATED, javax.swing
                                .GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRemover))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout
                            .Alignment.TRAILING, javax.swing.GroupLayout
                                    .DEFAULT_SIZE, 714, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRemover)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonAdicionar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        int rowSelected = tableUsuarios.getSelectedRow();
        String nome, data, telefone, endereco;

        nome = inputNome.getText();
        data = inputData.getText();
        telefone = inputTelefone.getText();
        endereco = inputEndereco.getText();

        if (nome.equals("") || data.equals("") || telefone.equals("") || endereco.equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos são de preenchimento obrigatório");
        } else if (rowSelected == -1) {
            dtm.addRow(new String[]{nome, data, telefone, endereco});
        } else {
            dtm.setValueAt(nome, rowSelected, 0);
            dtm.setValueAt(data, rowSelected, 1);
            dtm.setValueAt(telefone, rowSelected, 2);
            dtm.setValueAt(endereco, rowSelected, 3);
        }
    }                                            

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {                                              
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        int rowSelected = tableUsuarios.getSelectedRow();

        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(this, "Selecione a linha que deseja remover");
        } else {
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover a linha selecionada?", "Confirme a sua operação", JOptionPane.YES_NO_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                dtm.removeRow(rowSelected);
            }
        }

        inputNome.setText("");
        inputData.setText("");
        inputTelefone.setText("");
        inputEndereco.setText("");
    }                                             

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        String nome, data, telefone, endereco;
        nome = inputNome.getText();
        data = inputData.getText();
        telefone = inputTelefone.getText();
        endereco = inputEndereco.getText();

        if (nome.equals("") || data.equals("") || telefone.equals("") || endereco.equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos são de preenchimento obrigatório");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
            dtm.addRow(new String[]{nome, data, telefone, endereco});
            inputNome.setText("");
            inputData.setText("");
            inputTelefone.setText("");
            inputEndereco.setText("");
        }
    }                                               



    private void tableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {
                                               
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        int rowSelected = tableUsuarios.getSelectedRow();

        inputNome.setText(dtm.getValueAt(rowSelected, 0).toString());
        inputData.setText(dtm.getValueAt(rowSelected, 1).toString());
        inputTelefone.setText(dtm.getValueAt(rowSelected, 2).toString());
        inputEndereco.setText(dtm.getValueAt(rowSelected, 3).toString());
    }                                          

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField inputData;
    private javax.swing.JTextField inputEndereco;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUsuarios;
    // End of variables declaration                   
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
