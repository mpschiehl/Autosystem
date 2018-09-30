/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteBean;
import dao.ClienteDao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Guilherme Henrique Bialas(guilhermebialas31@gmail.com)
 */
public class CadastroCliente extends javax.swing.JFrame {

    private ArrayList<JLabel> jLabels = new ArrayList();

    /**
     * Creates new form CadstroCliente
     */
    public CadastroCliente() {
        initComponents();
        acaoBotaoAdicionar();
        mascaraCpf();
        mascaraCnpj();
        mascaraCep();
        mascarTelefone();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCnpj = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jButtonLimpar = new javax.swing.JButton();

        jTextField8.setText("jTextField8");

        jButton1.setText("jButton1");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente");
        setResizable(false);

        jLabel1.setText("Nome");

        jLabel2.setText("Telefone");

        jLabel3.setText("Cpf");

        jLabel4.setText("CEP");

        jLabel6.setText("E mail");

        jLabel8.setText("Bairro");

        jLabel9.setText("Cidade");

        jLabel11.setText("Endereço");

        jLabel13.setText("Número");

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSairMouseClicked(evt);
            }
        });

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        jButtonAdicionar.setText("Adicionar");

        jLabel5.setText("Cnpj");

        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pencil.png"))); // NOI18N
        jButtonLimpar.setText("Limpar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jTextFieldNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel11))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextFieldNumero))))
                        .addGap(18, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSair)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(25, 25, 25))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseClicked
        dispose();
    }//GEN-LAST:event_jButtonSairMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    public void validacao() {
        //Nome
        if (jTextFieldNome.getText().isEmpty()) {
            gerarJLabel("Deve preencher.", jTextFieldNome);
            bordaErro(jTextFieldNome);
            jTextFieldNome.requestFocus();
        } else if (jTextFieldNome.getText().length() < 2) {
            gerarJLabel("Nome inválido", jTextFieldNome);
            bordaErro(jTextFieldNome);
            jTextFieldNome.requestFocus();
        } else {
            bordaSucesso(jTextFieldNome);

        }

        //Email
        if (jTextFieldEmail.getText().isEmpty()) {
            gerarJLabel("Deve preencher.", jTextFieldEmail);
            bordaErro(jTextFieldEmail);
            jTextFieldEmail.requestFocus();
        } else if (jTextFieldEmail.getText().length() < 2) {
            gerarJLabel("Email inválido", jTextFieldEmail);
            bordaErro(jTextFieldEmail);
            jTextFieldEmail.requestFocus();
        } else {
            bordaSucesso(jTextFieldEmail);

        }

        //Bairro
        if (jTextFieldBairro.getText().isEmpty()) {
            gerarJLabel("Deve preencher.", jTextFieldBairro);
            bordaErro(jTextFieldBairro);
            jTextFieldBairro.requestFocus();
        } else if (jTextFieldBairro.getText().length() < 2) {
            gerarJLabel("Bairro não existe", jTextFieldBairro);
            bordaErro(jTextFieldBairro);
            jTextFieldBairro.requestFocus();
        } else {
            bordaSucesso(jTextFieldBairro);

        }

        //Enderço
        if (jTextFieldEndereco.getText().isEmpty()) {
            gerarJLabel("Deve preencher.", jTextFieldEndereco);
            bordaErro(jTextFieldEndereco);
            jTextFieldEndereco.requestFocus();
        } else if (jTextFieldEndereco.getText().length() < 2) {
            gerarJLabel("Endereço não existe", jTextFieldEndereco);
            bordaErro(jTextFieldEndereco);
            jTextFieldEndereco.requestFocus();
        } else {
            bordaSucesso(jTextFieldEndereco);

        }

        //Cidade
        if (jTextFieldCidade.getText().isEmpty()) {
            gerarJLabel("Deve preencher.", jTextFieldCidade);
            bordaErro(jTextFieldCidade);
            jTextFieldCidade.requestFocus();
        } else if (jTextFieldCidade.getText().length() < 2) {
            gerarJLabel("Cidade não existe", jTextFieldCidade);
            bordaErro(jTextFieldCidade);
            jTextFieldCidade.requestFocus();
        } else {
            bordaSucesso(jTextFieldCidade);

        }
        //Numero
        if (jTextFieldNumero.getText().isEmpty()) {
            gerarJLabel("Deve preencher.", jTextFieldNumero);
            bordaErro(jTextFieldNumero);
            jTextFieldNumero.requestFocus();
        } else {
            try {
                if (Float.parseFloat(jTextFieldNumero.getText()) < 0) {
                    gerarJLabel("Número inválido", jTextFieldNumero);
                    bordaErro(jTextFieldNumero);
                    jTextFieldNumero.requestFocus();
                }
            } catch (Exception e) {
                gerarJLabel("Não pode conter letras", jTextFieldNumero);
                bordaErro(jTextFieldNumero);
            }
            bordaSucesso(jTextFieldNumero);
        }
    }

    public void mascaraCpf() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("###.###.###-##");
            maskFormatter.install(jFormattedTextFieldCpf);
        } catch (Exception e) {
            if (jFormattedTextFieldCpf.getText().length() < 11) {
                gerarJLabelMask("Cpf inválido", jFormattedTextFieldCpf);
                
                jFormattedTextFieldCpf.requestFocus();
            } else {

            }
        }
    }

    public void mascaraCnpj() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("##.###./####-##");
            maskFormatter.install(jFormattedTextFieldCnpj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chame o prog");
        }
    }

    public void mascaraCep() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("#####-###");
            maskFormatter.install(jFormattedTextFieldCep);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chame o prog");
        }
    }

    public void acaoBotaoAdicionar() {
        jButtonAdicionar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                validacao();
                salvarBanco();
                limparCampos();
                JOptionPane.showMessageDialog(null, "Clinte cadastrado com sucesso");

            }
        });

    }

    public void mascarTelefone() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("(##)####-####");
            maskFormatter.install(jFormattedTextFieldTelefone);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chame o prog");
        }

    }

    public void limparCampos() {
        jTextFieldNome.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jFormattedTextFieldCep.setText("");
        jFormattedTextFieldCnpj.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldTelefone.setText("");

    }

    public void salvarBanco() {
        ClienteBean cliente = new ClienteBean();
        cliente.setNome(jTextFieldNome.getText().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", ""));
        cliente.setTelefone(jFormattedTextFieldTelefone.getText());
        cliente.setCpf(jFormattedTextFieldCpf.getText());
        cliente.setNumero(Integer.parseInt(jTextFieldNumero.getText().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", "")));
        cliente.setEndereco(jTextFieldEndereco.getText().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", ""));
        cliente.setCpf(jFormattedTextFieldCpf.getText());
        cliente.setCep(jFormattedTextFieldCep.getText());
        cliente.setCnpj(jFormattedTextFieldCnpj.getText());
        cliente.setBairro(jTextFieldBairro.getText().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", ""));
        cliente.setCidade(jTextFieldCidade.getText().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", ""));
        cliente.setEmail(jTextFieldEmail.getText().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", ""));
  new ClienteDao().inserir(cliente);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCnpj;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables

    private void gerarJLabel(String texto, JTextField jTextField) {
        JLabel jLabelE = new JLabel();
        jLabelE.setText(texto);
        jLabelE.setForeground(Color.red);
        jLabelE.setLocation(jTextField.getX(), jTextField.getY() + jTextField.getHeight());
        jLabelE.setSize(jTextField.getWidth(), 20);
        add(jLabelE);
        jLabels.add(jLabelE);
    }

    private void bordaSucesso(JTextField jTextField) {
        Border borda = BorderFactory.createLineBorder(Color.decode("#09e83d"), 1);
        jTextField.setBorder(borda);

    }

    private void bordaErro(JTextField jTextField) {
        Border borda = BorderFactory.createLineBorder(Color.red, 1);
        jTextField.setBorder(borda);

    }

    private void gerarJLabelMask(String texto, JFormattedTextField JFormattedTextField) {
        JLabel jLabelE = new JLabel();
        jLabelE.setText(texto);
        jLabelE.setForeground(Color.red);
        jLabelE.setLocation(JFormattedTextField.getX(), JFormattedTextField.getY() + JFormattedTextField.getHeight());
        jLabelE.setSize(JFormattedTextField.getWidth(), 20);
        add(jLabelE);
        jLabels.add(jLabelE);
    }

    private void bordaErroMask(JFormattedTextField JFormattedTextField) {
        Border borda = BorderFactory.createLineBorder(Color.red, 1);
        JFormattedTextField.setBorder(borda);
    }
private void bordaSucessoMask(JFormattedTextField JFormattedTextField){
       Border borda = BorderFactory.createLineBorder(Color.decode("#09e83d"), 1);
        JFormattedTextField.setBorder(borda);
}
}
