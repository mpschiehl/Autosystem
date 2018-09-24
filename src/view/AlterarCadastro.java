/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ProdutoBean;
import dao.ProdutoDao;

/**
 *
 * @author Marcio
 */
public class AlterarCadastro extends javax.swing.JFrame {

    /**
     * Creates new form AlterarCadastro
     */
    public AlterarCadastro(int codigoRegistro) {
        initComponents();
        ProdutoBean produto = new ProdutoDao().buscarPorId(codigoRegistro);
        //dao
        jLabelCodigo.setText(Integer.toString(codigoRegistro));
       jTextFielddescricao.setText(String.valueOf(produto.getDescricao()));
       if(produto.getStatusPecas().equals("novo")){
           jRadioButtonNovo.setSelected(true);
       }
       if(produto.getStatusPecas().equals("semi-novo")){
           jRadioButtonSeminovo.setSelected(true);
       }
       jTextFieldQuantidade.setText(String.valueOf(produto.getQuantidade()));
       for (int i = 0; i < jComboBoxUnidadeMedida.getItemCount(); i++) {
            String tipo = jComboBoxUnidadeMedida.getItemAt(i).toString();
            if (tipo.equals(produto.getUnidadeDeMedida())) {
                jComboBoxUnidadeMedida.setSelectedIndex(i);
                return;
            }
        }
       jTextFieldPeso.setText(String.valueOf(produto.getPeso()));
       for (int i = 0; i < jComboBoxLocalizacao.getItemCount(); i++) {
            String tipo = jComboBoxLocalizacao.getItemAt(i).toString();
            if (tipo.equals(produto.getLocalizacao())) {
                jComboBoxLocalizacao.setSelectedIndex(i);
                return;
            }
        }
       jTextFieldValor.setText(String.valueOf(produto.getValorUnitario()));
       for (int i = 0; i < jComboBoxCategoria.getItemCount(); i++) {
            String tipo = jComboBoxCategoria.getItemAt(i).toString();
            if (tipo.equals(produto.getCategoria())) {
                jComboBoxCategoria.setSelectedIndex(i);
                return;
            }
        }
       jTextAreaAplicacao.setText(String.valueOf(produto.getAplicacao()));
      
    }

    public AlterarCadastro() {
        initComponents();
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFielddescricao = new javax.swing.JTextField();
        jRadioButtonNovo = new javax.swing.JRadioButton();
        jRadioButtonSeminovo = new javax.swing.JRadioButton();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jComboBoxUnidadeMedida = new javax.swing.JComboBox<>();
        jTextFieldPeso = new javax.swing.JTextField();
        jComboBoxLocalizacao = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAplicacao = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldValor = new javax.swing.JTextField();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jRadioButtonNovo.setText("Novo");

        jRadioButtonSeminovo.setText("Semi-novo");

        jComboBoxUnidadeMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kit", "Peça" }));
        jComboBoxUnidadeMedida.setSelectedIndex(-1);

        jComboBoxLocalizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acessórios", "Acessorios do Motor", "Componentes eletricos", "Correias", "Correntes de CV", "Farois", "freio", "Kits de Junta", "motor", "Parachoques", "polias", "Portas e Carrroceria(recortes)", "retentores", "Rolamentos", "suspensão", "Tensores", "vidros" }));
        jComboBoxLocalizacao.setSelectedIndex(-1);

        jTextAreaAplicacao.setColumns(20);
        jTextAreaAplicacao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAplicacao);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acessórios e acabamento", "Injeção e carburador", "Motor", "Polias e tensores", "Retentor e junta", "Supenção e freios", "Correas e corrente de comando", "   ", " ", " ", " " }));
        jComboBoxCategoria.setSelectedIndex(-1);

        jLabel1.setText("Produto");

        jLabel2.setText("Quantidade:");

        jLabel3.setText("Unidade de Medida:");

        jLabel4.setText("Peso:");

        jLabel5.setText("Localização:");

        jLabel6.setText("Valor:");

        jLabel7.setText("Categoria:");

        jLabel8.setText("Aplicação:");

        jLabelCodigo.setText("Codigo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2)
                        .addGap(56, 56, 56)
                        .addComponent(jButton3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jComboBoxLocalizacao, 0, 1, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFielddescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonNovo)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCodigo)
                                .addComponent(jRadioButtonSeminovo))))
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFielddescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonNovo)
                    .addComponent(jRadioButtonSeminovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AlterarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxLocalizacao;
    private javax.swing.JComboBox<String> jComboBoxUnidadeMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JRadioButton jRadioButtonNovo;
    private javax.swing.JRadioButton jRadioButtonSeminovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAplicacao;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFielddescricao;
    // End of variables declaration//GEN-END:variables
}
