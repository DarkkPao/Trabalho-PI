package TelaCadastro;

import java.io.BufferedReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FromClienteTelaCadastro extends javax.swing.JInternalFrame {

    public FromClienteTelaCadastro() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) DadosCliente.getModel();
        this.preencherTabela();
        DadosCliente.setRowSorter(new TableRowSorter(modelo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cliente = new javax.swing.JTextField();
        Endereco = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        CPF = new javax.swing.JFormattedTextField();
        Telefone = new javax.swing.JFormattedTextField();
        Excluir = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DadosCliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cliente");
        setToolTipText("");

        jLabel1.setText("Cliente");

        jLabel2.setText("CPF");

        jLabel3.setText("Telefone");

        jLabel4.setText("Endereço");

        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        try {
            CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Alterar.setText("Atualizar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Endereco)
                        .addGap(18, 18, 18)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 15, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cadastrar)
                        .addComponent(Excluir)
                        .addComponent(Alterar))
                    .addComponent(Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        DadosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Endereço", "CPF", "Telefone"
            }
        ));
        DadosCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DadosClienteMouseClicked(evt);
            }
        });
        DadosCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DadosClienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(DadosCliente);
        if (DadosCliente.getColumnModel().getColumnCount() > 0) {
            DadosCliente.getColumnModel().getColumn(0).setMinWidth(40);
            DadosCliente.getColumnModel().getColumn(0).setMaxWidth(40);
            DadosCliente.getColumnModel().getColumn(1).setMinWidth(250);
            DadosCliente.getColumnModel().getColumn(1).setMaxWidth(250);
            DadosCliente.getColumnModel().getColumn(2).setMinWidth(401);
            DadosCliente.getColumnModel().getColumn(2).setMaxWidth(401);
            DadosCliente.getColumnModel().getColumn(3).setMinWidth(110);
            DadosCliente.getColumnModel().getColumn(3).setMaxWidth(110);
            DadosCliente.getColumnModel().getColumn(4).setMinWidth(110);
            DadosCliente.getColumnModel().getColumn(4).setMaxWidth(110);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        DefaultTableModel dtmProdutos = (DefaultTableModel) DadosCliente.getModel();
        Object[] dados = {id.getText(), Cliente.getText(), Endereco.getText(), CPF.getText(), Telefone.getText()};
        dtmProdutos.addRow(dados);

        try {
            FileWriter canal = new FileWriter(new File("arquivoclientes.csv"), true);
            PrintWriter escreve = new PrintWriter(canal);
            escreve.println(id.getText() + ";" + Cliente.getText() + ";" + Endereco.getText() + ";" + CPF.getText() + ";" + Telefone.getText() + ";");
            limparCliente();
            escreve.close();
            canal.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja Excluir o Registro", "Pergunta", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

            DefaultTableModel dtmProdutos = (DefaultTableModel) DadosCliente.getModel();
            dtmProdutos.removeRow(DadosCliente.getSelectedRow());
        }


    }//GEN-LAST:event_ExcluirActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        if (DadosCliente.getSelectedRow() != -1) {

            DadosCliente.setValueAt(id.getText(), DadosCliente.getSelectedRow(), 0);
            DadosCliente.setValueAt(Cliente.getText(), DadosCliente.getSelectedRow(), 1);
            DadosCliente.setValueAt(Endereco.getText(), DadosCliente.getSelectedRow(), 2);
            DadosCliente.setValueAt(CPF.getText(), DadosCliente.getSelectedRow(), 3);
            DadosCliente.setValueAt(Telefone.getText(), DadosCliente.getSelectedRow(), 4);

        }
    }//GEN-LAST:event_AlterarActionPerformed

    private void DadosClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DadosClienteKeyReleased
        if (DadosCliente.getSelectedRow() != -1) {

            id.setText(DadosCliente.getValueAt(DadosCliente.getSelectedRow(), 0).toString());
            Cliente.setText(DadosCliente.getValueAt(DadosCliente.getSelectedRow(), 1).toString());
            Endereco.setText(DadosCliente.getValueAt(DadosCliente.getSelectedRow(), 2).toString());
            CPF.setText(DadosCliente.getValueAt(DadosCliente.getSelectedRow(), 3).toString());
            Telefone.setText(DadosCliente.getValueAt(DadosCliente.getSelectedRow(), 4).toString());
        }

    }//GEN-LAST:event_DadosClienteKeyReleased

    private void DadosClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadosClienteMouseClicked
        if (DadosCliente.getSelectedRow() != -1) {

            id.setText(DadosCliente.getValueAt(DadosCliente.getSelectedRow(), 0).toString());
            Cliente.setText(DadosCliente.getValueAt(DadosCliente.getSelectedRow(), 1).toString());
            Endereco.setText(DadosCliente.getValueAt(DadosCliente.getSelectedRow(), 2).toString());
            CPF.setText(DadosCliente.getValueAt(DadosCliente.getSelectedRow(), 3).toString());
            Telefone.setText(DadosCliente.getValueAt(DadosCliente.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_DadosClienteMouseClicked

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    public static void main(String[] args) {
        FromClienteTelaCadastro Cliente = new FromClienteTelaCadastro();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JFormattedTextField CPF;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField Cliente;
    private javax.swing.JTable DadosCliente;
    private javax.swing.JTextField Endereco;
    private javax.swing.JButton Excluir;
    private javax.swing.JFormattedTextField Telefone;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void limparCliente() {
        id.setText("");
        Cliente.setText("");
        Endereco.setText("");
        CPF.setText("");
        Telefone.setText("");
    }

    public void preencherTabela() {
        DefaultTableModel dtmProdutos = (DefaultTableModel) DadosCliente.getModel();
        CsvClientes clientes = new CsvClientes();
        List<Clientes> listClientes = clientes.lerArquivo();
        if (listClientes.size() > 0) {
            for (Clientes item : listClientes) {
                Object[] dados = {item.getId(), item.getCliente(), item.getEndereco(), item.getCPF(), item.getTelefone()};
                dtmProdutos.addRow(dados);
            }
        }
    }
}
