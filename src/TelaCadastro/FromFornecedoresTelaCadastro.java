package TelaCadastro;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class FromFornecedoresTelaCadastro extends javax.swing.JInternalFrame {

    public FromFornecedoresTelaCadastro() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) DadosFornecedor.getModel();
        this.preencherTabelaF();
        DadosFornecedor.setRowSorter(new TableRowSorter(modelo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Fornecedor = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        CNPJ = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        Inscricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Telefone = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        Idf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DadosFornecedor = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Fornecedor");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(927, 521));

        jPanel1.setPreferredSize(new java.awt.Dimension(530, 174));

        jLabel1.setText("Fornecedor");

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Atualizar.setText("Atualizar");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });

        try {
            CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("CNPJ");

        jLabel4.setText("Inscrição estadual");

        try {
            Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Telefone");

        Idf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdfActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Inscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(Idf, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Inscricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cadastrar)
                            .addComponent(Excluir)
                            .addComponent(Atualizar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Idf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        DadosFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fornecedor", "Incrição Estadual", "CNPJ", "Telefone"
            }
        ));
        DadosFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DadosFornecedorMouseClicked(evt);
            }
        });
        DadosFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DadosFornecedorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(DadosFornecedor);
        if (DadosFornecedor.getColumnModel().getColumnCount() > 0) {
            DadosFornecedor.getColumnModel().getColumn(0).setMinWidth(40);
            DadosFornecedor.getColumnModel().getColumn(0).setMaxWidth(40);
            DadosFornecedor.getColumnModel().getColumn(1).setMinWidth(451);
            DadosFornecedor.getColumnModel().getColumn(1).setMaxWidth(451);
            DadosFornecedor.getColumnModel().getColumn(2).setMinWidth(140);
            DadosFornecedor.getColumnModel().getColumn(2).setMaxWidth(140);
            DadosFornecedor.getColumnModel().getColumn(3).setMinWidth(140);
            DadosFornecedor.getColumnModel().getColumn(3).setMaxWidth(140);
            DadosFornecedor.getColumnModel().getColumn(4).setMinWidth(140);
            DadosFornecedor.getColumnModel().getColumn(4).setMaxWidth(140);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        DefaultTableModel dtmFornecedores = (DefaultTableModel) DadosFornecedor.getModel();
        Object[] dadosF = {Idf.getText(), Fornecedor.getText(), Inscricao.getText(), CNPJ.getText(), Telefone.getText()};
        dtmFornecedores.addRow(dadosF);

        try {
            FileWriter canal = new FileWriter(new File("arquivofornecedores.csv"), true);
            PrintWriter escreve = new PrintWriter(canal);
            escreve.println(Idf.getText() + ";" + Fornecedor.getText() + ";" + Inscricao.getText() + ";" + CNPJ.getText() + ";" + Telefone.getText() + ";");
            limparCliente();
            escreve.close();
            canal.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja Excluir o Registro", "Pergunta", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

            DefaultTableModel dtmProdutos = (DefaultTableModel) DadosFornecedor.getModel();
            dtmProdutos.removeRow(DadosFornecedor.getSelectedRow());
        }                                      // TODO add your handling code here:
    }//GEN-LAST:event_ExcluirActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        if (DadosFornecedor.getSelectedRow() != -1) {

            DadosFornecedor.setValueAt(Idf.getText(), DadosFornecedor.getSelectedRow(), 0);
            DadosFornecedor.setValueAt(Fornecedor.getText(), DadosFornecedor.getSelectedRow(), 1);
            DadosFornecedor.setValueAt(Inscricao.getText(), DadosFornecedor.getSelectedRow(), 2);
            DadosFornecedor.setValueAt(CNPJ.getText(), DadosFornecedor.getSelectedRow(), 3);
            DadosFornecedor.setValueAt(Telefone.getText(), DadosFornecedor.getSelectedRow(), 4);

        }
    }//GEN-LAST:event_AtualizarActionPerformed

    private void DadosFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DadosFornecedorKeyReleased
        if (DadosFornecedor.getSelectedRow() != -1) {

            Idf.setText(DadosFornecedor.getValueAt(DadosFornecedor.getSelectedRow(), 0).toString());
            Fornecedor.setText(DadosFornecedor.getValueAt(DadosFornecedor.getSelectedRow(), 1).toString());
            Inscricao.setText(DadosFornecedor.getValueAt(DadosFornecedor.getSelectedRow(), 2).toString());
            CNPJ.setText(DadosFornecedor.getValueAt(DadosFornecedor.getSelectedRow(), 3).toString());
            Telefone.setText(DadosFornecedor.getValueAt(DadosFornecedor.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_DadosFornecedorKeyReleased

    private void DadosFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadosFornecedorMouseClicked
        if (DadosFornecedor.getSelectedRow() != -1) {

            Idf.setText(DadosFornecedor.getValueAt(DadosFornecedor.getSelectedRow(), 0).toString());
            Fornecedor.setText(DadosFornecedor.getValueAt(DadosFornecedor.getSelectedRow(), 1).toString());
            Inscricao.setText(DadosFornecedor.getValueAt(DadosFornecedor.getSelectedRow(), 2).toString());
            CNPJ.setText(DadosFornecedor.getValueAt(DadosFornecedor.getSelectedRow(), 3).toString());
            Telefone.setText(DadosFornecedor.getValueAt(DadosFornecedor.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_DadosFornecedorMouseClicked

    private void IdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdfActionPerformed
    public static void main(String[] args) {
        FromFornecedoresTelaCadastro Fornecedor = new FromFornecedoresTelaCadastro();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JFormattedTextField CNPJ;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTable DadosFornecedor;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField Fornecedor;
    private javax.swing.JTextField Idf;
    private javax.swing.JTextField Inscricao;
    private javax.swing.JFormattedTextField Telefone;
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
        Idf.setText("");
        Fornecedor.setText("");
        Inscricao.setText("");
        CNPJ.setText("");
        Telefone.setText("");
    }

    public void preencherTabelaF() {
        DefaultTableModel dtmProdutos = (DefaultTableModel) DadosFornecedor.getModel();
        CsvFornecedores fornecedores = new CsvFornecedores();
        List<Fornecedores> listFornecedores = fornecedores.lerArquivoF();
        if (listFornecedores.size() > 0) {
            for (Fornecedores item : listFornecedores) {
                Object[] dados = {item.getIdf(), item.getCliente(), item.getEndereco(), item.getCPF(), item.getTelefone()};
                dtmProdutos.addRow(dados);
            }
        }
    }

}
