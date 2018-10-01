
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ProdutoBean;
import dao.ProdutoDao;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guilherme Henrique Bialas(guilhermebialas31@gmail.com)
 * @date 2018/08/31
 */
public class Estoque extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Estoque() {
        initComponents();
        trocaTabEnter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jRbuttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonNovo = new javax.swing.JRadioButton();
        jRadioButtonSeminovo = new javax.swing.JRadioButton();
        jComboBoxCategoria = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstoque = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Número: ");

        jTextFieldNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNumero.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldNumeroInputMethodTextChanged(evt);
            }
        });
        jTextFieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Status: ");

        jRbuttonGroup.add(jRadioButtonNovo);
        jRadioButtonNovo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButtonNovo.setText("Novo");
        jRadioButtonNovo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonNovoItemStateChanged(evt);
            }
        });

        jRbuttonGroup.add(jRadioButtonSeminovo);
        jRadioButtonSeminovo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButtonSeminovo.setText("Semi novo");
        jRadioButtonSeminovo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonSeminovoItemStateChanged(evt);
            }
        });

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acessorios e acabamento", "centrais e modulos", "injeção e carburador", "motor", "polias e tensores", "retentor e junta", "supenção e freio,", "correas e corrente de comando" }));
        jComboBoxCategoria.setSelectedIndex(-1);
        jComboBoxCategoria.setMinimumSize(new java.awt.Dimension(300, 26));
        jComboBoxCategoria.setPreferredSize(new java.awt.Dimension(350, 20));
        jComboBoxCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCategoriaItemStateChanged(evt);
            }
        });
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Categoria");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Pesquisa");

        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyTyped(evt);
            }
        });

        jTableEstoque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Produto", "Categoria", "Quantidade", "Valor Unitário", "Status", "Peso", "Localização"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEstoque.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableEstoque);
        if (jTableEstoque.getColumnModel().getColumnCount() > 0) {
            jTableEstoque.getColumnModel().getColumn(0).setResizable(false);
            jTableEstoque.getColumnModel().getColumn(1).setResizable(false);
            jTableEstoque.getColumnModel().getColumn(2).setResizable(false);
            jTableEstoque.getColumnModel().getColumn(3).setResizable(false);
            jTableEstoque.getColumnModel().getColumn(4).setResizable(false);
            jTableEstoque.getColumnModel().getColumn(5).setResizable(false);
            jTableEstoque.getColumnModel().getColumn(6).setResizable(false);
            jTableEstoque.getColumnModel().getColumn(7).setResizable(false);
        }

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/clipboard.png"))); // NOI18N
        jButton2.setText("Refatorar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancel.png"))); // NOI18N
        jButton3.setText("Excluir");
        jButton3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton3StateChanged(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/eraser.png"))); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonNovo)
                            .addComponent(jRadioButtonSeminovo))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButtonNovo)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonSeminovo)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        /* int linhaSelecionada = jTableEstoque.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um registro");
            return;
        }

        int codigoRegistro = Integer.parseInt(jTableEstoque.getValueAt(linhaSelecionada, 0).toString());
       
       new Cadastro(codigoRegistro).cadastroAlterar(codigoRegistro);*/

    }//GEN-LAST:event_jButton2MouseClicked

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void trocaTabEnter() {
        HashSet conj = new HashSet(jFrame1.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
        jFrame1.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        populaTabela();
    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int linhaSelecionada = jTableEstoque.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um registro para Refatorar");
            return;
        }
        int codigoRegistro = Integer.parseInt(jTableEstoque.getValueAt(linhaSelecionada, 0).toString());
        new AlterarCadastro(codigoRegistro).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton3StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3StateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja realmente apagar o Registo?"
                + "\nSe Você tem Certeza Clique em Sim", "Aviso", JOptionPane.ERROR_MESSAGE);
        if (resposta == 0) {
            int linhaSelecionada = jTableEstoque.getSelectedRow();
            if (linhaSelecionada == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um registro para a exclusão");
                return;
            }

            int codigo = Integer.parseInt(jTableEstoque.getValueAt(linhaSelecionada, 0).toString());
            new ProdutoDao().excluir(codigo);
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");

        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroKeyPressed
                int id = Integer.parseInt(jTextFieldNumero.getText());
        DefaultTableModel dtm = (DefaultTableModel) jTableEstoque.getModel();
        dtm.setRowCount(0);
        ProdutoBean produto = new ProdutoDao().buscarPorId(id);
        dtm.addRow(new Object[]{
            produto.getId(),
            produto.getDescricao(),
            produto.getCategoria(),
            produto.getQuantidade(),
            produto.getValorUnitario(),
            produto.getStatusPecas(),
            produto.getPeso(),
            produto.getLocalizacao()
        });


    }//GEN-LAST:event_jTextFieldNumeroKeyPressed

    private void jRadioButtonNovoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonNovoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            List<ProdutoBean> produtos = new ProdutoDao().obterProdutoStatus("novo");
            DefaultTableModel dtm = (DefaultTableModel) jTableEstoque.getModel();

            dtm.setRowCount(0);

            for (ProdutoBean produto : produtos) {
                dtm.addRow(new Object[]{
                    produto.getId(),
                    produto.getDescricao(),
                    produto.getCategoria(),
                    produto.getQuantidade(),
                    produto.getValorUnitario(),
                    produto.getStatusPecas(),
                    produto.getPeso(),
                    produto.getLocalizacao()
                });
            }

        }
    }//GEN-LAST:event_jRadioButtonNovoItemStateChanged

    private void jRadioButtonSeminovoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonSeminovoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            List<ProdutoBean> produtos = new ProdutoDao().obterProdutoStatus("semi-novo");
            DefaultTableModel dtm = (DefaultTableModel) jTableEstoque.getModel();

            dtm.setRowCount(0);

            for (ProdutoBean produto : produtos) {
                dtm.addRow(new Object[]{produto.getId(),
                    produto.getDescricao(),
                    produto.getCategoria(),
                    produto.getQuantidade(),
                    produto.getValorUnitario(),
                    produto.getStatusPecas(),
                    produto.getPeso(),
                    produto.getLocalizacao()
                });
            }

        }
    }//GEN-LAST:event_jRadioButtonSeminovoItemStateChanged

    private void jTextFieldPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyTyped
        if (jTextFieldPesquisa.getText().length() > 3) {
            List<ProdutoBean> produtos = new ProdutoDao().obterProdutoBusca(jTextFieldPesquisa.getText().trim());
            DefaultTableModel dtm = (DefaultTableModel) jTableEstoque.getModel();

            dtm.setRowCount(0);

            for (ProdutoBean produto : produtos) {
                dtm.addRow(new Object[]{produto.getId(),
                    produto.getDescricao(),
                    produto.getCategoria(),
                    produto.getQuantidade(),
                    produto.getValorUnitario(),
                    produto.getStatusPecas(),
                    produto.getPeso(),
                    produto.getLocalizacao()
                });
            }

        }
    }//GEN-LAST:event_jTextFieldPesquisaKeyTyped

    private void jComboBoxCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaItemStateChanged
        String busca = "";
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            //pegando o texto do item selecionado
            busca = evt.getItem().toString();
        }
        List<ProdutoBean> produtos = new ProdutoDao().obterProdutoCategoria(busca);
        DefaultTableModel dtm = (DefaultTableModel) jTableEstoque.getModel();
        dtm.setRowCount(0);
        for (ProdutoBean produto : produtos) {
            dtm.addRow(new Object[]{produto.getId(),
                produto.getDescricao(),
                produto.getCategoria(),
                produto.getQuantidade(),
                produto.getValorUnitario(),
                produto.getStatusPecas(),
                produto.getPeso(),
                produto.getLocalizacao()
            });
        }

    }//GEN-LAST:event_jComboBoxCategoriaItemStateChanged

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limpaFiltros();
        populaTabela();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTextFieldNumeroInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldNumeroInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroInputMethodTextChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Estoque().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox jComboBoxCategoria;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButtonNovo;
    private javax.swing.JRadioButton jRadioButtonSeminovo;
    private javax.swing.ButtonGroup jRbuttonGroup;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstoque;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables

    private void populaTabela() {
        List<ProdutoBean> produtos = new ProdutoDao().obterProdutos();
        DefaultTableModel dtm = (DefaultTableModel) jTableEstoque.getModel();

        dtm.setRowCount(0);

        for (ProdutoBean produto : produtos) {
            dtm.addRow(new Object[]{
                produto.getId(),
                produto.getDescricao(),
                produto.getCategoria(),
                produto.getQuantidade(),
                produto.getValorUnitario(),
                produto.getStatusPecas(),
                produto.getPeso(),
                produto.getLocalizacao()

            });
        }

    }

    private void limpaFiltros() {
        jTextFieldNumero.setText("");
        jRbuttonGroup.clearSelection();
        jComboBoxCategoria.setSelectedIndex(-1);
        jTextFieldPesquisa.setText("");
    }
}
