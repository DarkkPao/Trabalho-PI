package TelaCadastro;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class FromProdutosTelaCadastro extends javax.swing.JInternalFrame {

    public FromProdutosTelaCadastro() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) DadosProdutos.getModel();
        this.preencherTabelaP();
        DadosProdutos.setRowSorter(new TableRowSorter(modelo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Produto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Fornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        Preco = new javax.swing.JFormattedTextField();
        Excluir = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        Codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DadosProdutos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Produtos");
        setPreferredSize(new java.awt.Dimension(927, 521));

        jLabel1.setText("Nome do Produto");

        jLabel2.setText("Fornecedor");

        Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FornecedorActionPerformed(evt);
            }
        });

        jLabel3.setText("R$");

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecoActionPerformed(evt);
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

        jLabel5.setText("Código");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2)
                    .addComponent(Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 69, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir)
                    .addComponent(Cadastrar)
                    .addComponent(Atualizar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        DadosProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Fornecedor", "Preço"
            }
        ));
        DadosProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DadosProdutosMouseClicked(evt);
            }
        });
        DadosProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DadosProdutosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(DadosProdutos);
        if (DadosProdutos.getColumnModel().getColumnCount() > 0) {
            DadosProdutos.getColumnModel().getColumn(0).setMinWidth(100);
            DadosProdutos.getColumnModel().getColumn(0).setMaxWidth(100);
            DadosProdutos.getColumnModel().getColumn(3).setMinWidth(150);
            DadosProdutos.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        DefaultTableModel dtmProdutos = (DefaultTableModel) DadosProdutos.getModel();
        Object[] dadosP = {Codigo.getText(), Produto.getText(), Fornecedor.getText(), Preco.getText()};
        dtmProdutos.addRow(dadosP);

        try {
            FileWriter canal = new FileWriter(new File("arquivoprodutos.csv"), true);
            PrintWriter escreve = new PrintWriter(canal);
            escreve.println(Codigo.getText() + ";" + Produto.getText() + ";" + Fornecedor.getText() + ";" + Preco.getText() + ";");
            limparCliente();
            escreve.close();
            canal.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CadastrarActionPerformed
    private void FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FornecedorActionPerformed
    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja Excluir o Registro", "Pergunta", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            DefaultTableModel dtmProdutos = (DefaultTableModel) DadosProdutos.getModel();
            dtmProdutos.removeRow(DadosProdutos.getSelectedRow());
        }
    }//GEN-LAST:event_ExcluirActionPerformed
    private void DadosProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadosProdutosMouseClicked
        if (DadosProdutos.getSelectedRow() != -1) {

            Codigo.setText(DadosProdutos.getValueAt(DadosProdutos.getSelectedRow(), 0).toString());
            Produto.setText(DadosProdutos.getValueAt(DadosProdutos.getSelectedRow(), 1).toString());
            Fornecedor.setText(DadosProdutos.getValueAt(DadosProdutos.getSelectedRow(), 2).toString());
            Preco.setText(DadosProdutos.getValueAt(DadosProdutos.getSelectedRow(), 3).toString());
        }

    }//GEN-LAST:event_DadosProdutosMouseClicked
    private void DadosProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DadosProdutosKeyReleased
        if (DadosProdutos.getSelectedRow() != -1) {

            Codigo.setText(DadosProdutos.getValueAt(DadosProdutos.getSelectedRow(), 0).toString());
            Produto.setText(DadosProdutos.getValueAt(DadosProdutos.getSelectedRow(), 1).toString());
            Fornecedor.setText(DadosProdutos.getValueAt(DadosProdutos.getSelectedRow(), 2).toString());
            Preco.setText(DadosProdutos.getValueAt(DadosProdutos.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_DadosProdutosKeyReleased
    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        if (DadosProdutos.getSelectedRow() != -1) {

            DadosProdutos.setValueAt(Codigo.getText(), DadosProdutos.getSelectedRow(), 0);
            DadosProdutos.setValueAt(Produto.getText(), DadosProdutos.getSelectedRow(), 1);
            DadosProdutos.setValueAt(Fornecedor.getText(), DadosProdutos.getSelectedRow(), 2);
            DadosProdutos.setValueAt(Preco.getText(), DadosProdutos.getSelectedRow(), 3);
        }
    }//GEN-LAST:event_AtualizarActionPerformed
    private void PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecoActionPerformed
    public static void main(String[] args) {
        FromProdutosTelaCadastro Produtos = new FromProdutosTelaCadastro();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTable DadosProdutos;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField Fornecedor;
    private javax.swing.JFormattedTextField Preco;
    private javax.swing.JTextField Produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void limparCliente() {
        Codigo.setText("");
        Produto.setText("");
        Fornecedor.setText("");
        Preco.setText("");
    }

    public void preencherTabelaP() {
        DefaultTableModel dtmProdutos = (DefaultTableModel) DadosProdutos.getModel();
        CsvProdutos produtos = new CsvProdutos();
        List<Produtos> listProdutos = produtos.lerArquivoP();
        if (listProdutos.size() > 0) {
            for (Produtos item : listProdutos) {
                Object[] dados = {item.getCodigo(), item.getProduto(), item.getFornecedor(), item.getPreco()};
                dtmProdutos.addRow(dados);
            }
        }
    }
}
