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
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jLabelCnpj = new javax.swing.JLabel();
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

        jLabelNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNome.setText("Nome :");

        jLabelTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelTelefone.setText("Telefone :");

        jLabelCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCpf.setText("Cpf :");

        jLabelCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCep.setText("Cep :");

        jLabelEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelEmail.setText("E mail :");

        jLabelBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelBairro.setText("Bairro :");

        jLabelCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCidade.setText("Cidade :");

        jLabelEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelEndereco.setText("Endereço :");

        jLabelNumero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNumero.setText("Número :");

        jButtonSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSairMouseClicked(evt);
            }
        });

        jButtonAdicionar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        jButtonAdicionar.setText("Adicionar");

        jLabelCnpj.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCnpj.setText("Cnpj :");

        jButtonLimpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pencil.png"))); // NOI18N
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCpf)
                                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCnpj)))
                            .addComponent(jLabelNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBairro)
                                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelTelefone)
                            .addComponent(jLabelCep)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jTextFieldNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabelEndereco))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCidade)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(jLabelNumero)
                                    .addComponent(jTextFieldNumero))))
                        .addGap(18, 22, Short.MAX_VALUE)
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
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelCpf)
                                        .addGap(25, 25, 25))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelCnpj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelTelefone)
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNumero)
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

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        apagarComponentes();
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

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
            jLabelNome.setForeground(Color.red);
            bordaErro(jTextFieldNome);
            gerarJLabel("1131", jTextFieldNome);
            jTextFieldNome.requestFocus();
        } else if (jTextFieldNome.getText().length() < 2) {
            jLabelNome.setForeground(Color.red);
            bordaErro(jTextFieldNome);

            jTextFieldNome.requestFocus();
        } else if (jTextFieldNome.getText().length() >= 50) {
            jLabelNome.setForeground(Color.red);
            bordaErro(jTextFieldNome);

            jTextFieldNome.requestFocus();
        } else {
            bordaSucesso(jTextFieldNome);
        }

        //Email
        if (jTextFieldEmail.getText().isEmpty()) {
            jLabelEmail.setForeground(Color.red);
            bordaErro(jTextFieldEmail);
            gerarJLabel("1131", jTextFieldEmail);
            jTextFieldNome.requestFocus();
        } else if (jTextFieldEmail.getText().length() < 3) {
            jLabelEmail.setForeground(Color.red);
            bordaErro(jTextFieldEmail);

            jTextFieldNome.requestFocus();
        } else if (jTextFieldEmail.getText().length() >= 50) {
            jLabelEmail.setForeground(Color.red);
            bordaErro(jTextFieldEmail);

            jTextFieldEmail.requestFocus();
        } else {
            bordaSucesso(jTextFieldEmail);
        }

        //Bairro
        if (jTextFieldBairro.getText().isEmpty()) {
            jLabelBairro.setForeground(Color.red);
            bordaErro(jTextFieldBairro);
            jTextFieldBairro.requestFocus();
        } else if (jTextFieldBairro.getText().length() < 3) {
            jLabelBairro.setForeground(Color.red);
            bordaErro(jTextFieldBairro);

            jTextFieldBairro.requestFocus();
        } else if (jTextFieldBairro.getText().length() >= 50) {
            jLabelBairro.setForeground(Color.red);
            bordaErro(jTextFieldBairro);

            jTextFieldBairro.requestFocus();
        } else {
            bordaSucesso(jTextFieldBairro);
        }

        //Enderço
        if (jTextFieldEndereco.getText().isEmpty()) {
            jLabelEndereco.setForeground(Color.red);
            bordaErro(jTextFieldEndereco);
            jTextFieldEndereco.requestFocus();
        } else if (jTextFieldEndereco.getText().length() < 3) {
            jLabelEndereco.setForeground(Color.red);
            bordaErro(jTextFieldEndereco);

            jTextFieldEndereco.requestFocus();
        } else if (jTextFieldEndereco.getText().length() >= 50) {
            jLabelEndereco.setForeground(Color.red);
            bordaErro(jTextFieldEndereco);

            jTextFieldEndereco.requestFocus();
        } else {
            bordaSucesso(jTextFieldEndereco);
        }

        //Cidade
        if (jTextFieldCidade.getText().isEmpty()) {
            jLabelCidade.setForeground(Color.red);
            bordaErro(jTextFieldCidade);
            jTextFieldCidade.requestFocus();
        } else if (jTextFieldCidade.getText().length() < 3) {
            jLabelCidade.setForeground(Color.red);
            bordaErro(jTextFieldCidade);

            jTextFieldCidade.requestFocus();
        } else if (jTextFieldCidade.getText().length() >= 50) {
            jLabelCidade.setForeground(Color.red);
            bordaErro(jTextFieldCidade);

            jTextFieldCidade.requestFocus();
        } else {
            bordaSucesso(jTextFieldCidade);
        }
        //Numero
        if (jTextFieldNumero.getText().isEmpty()) {
            jLabelNumero.setForeground(Color.red);
            bordaErro(jTextFieldNumero);
            jTextFieldNumero.requestFocus();
        } else {
            try {
                if (Float.parseFloat(jTextFieldNumero.getText()) < 0) {
                    jLabelNumero.setForeground(Color.red);
                    bordaErro(jTextFieldNumero);
                    jTextFieldNumero.requestFocus();
                }
            } catch (Exception e) {
                jLabelNumero.setForeground(Color.red);
                bordaErro(jTextFieldNumero);
                jTextFieldNumero.requestFocus();

            }
            bordaSucesso(jTextFieldNumero);
        }
        return;
    }

    public void mascaraCpf() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("###.###.###-##");
            maskFormatter.install(jFormattedTextFieldCpf);
        } catch (Exception e) {
            if (jFormattedTextFieldCpf.getText().length() < 11) {
                bordaErroMask(jFormattedTextFieldCpf);

                jFormattedTextFieldCpf.requestFocus();
            } else {
                bordaSucessoMask(jFormattedTextFieldCpf);
            }
        }
    }

    public void mascaraCnpj() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("##.###./####-##");
            maskFormatter.install(jFormattedTextFieldCnpj);
        } catch (Exception e) {
            if (jFormattedTextFieldCnpj.getText().length() < 11) {
                bordaErroMask(jFormattedTextFieldCnpj);

                jFormattedTextFieldCnpj.requestFocus();
            } else {
                bordaSucessoMask(jFormattedTextFieldCnpj);
            }
        }
    }

    public void mascaraCep() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("#####-###");
            maskFormatter.install(jFormattedTextFieldCep);
        } catch (Exception e) {
            if (jFormattedTextFieldCep.getText().length() < 11) {
                bordaErroMask(jFormattedTextFieldCep);

                jFormattedTextFieldCep.requestFocus();
            } else {
                bordaSucessoMask(jFormattedTextFieldCep);
            }
        }
    }

    public void acaoBotaoAdicionar() {
        jButtonAdicionar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                validacao();
                salvarBanco();
                limparCampos();
                apagarComponentes();
                JOptionPane.showMessageDialog(null, "Clinte cadastrado com sucesso");

            }
        });

    }

    public void mascarTelefone() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("(##)####-####");
            maskFormatter.install(jFormattedTextFieldTelefone);
        } catch (Exception e) {
            if (jFormattedTextFieldTelefone.getText().length() < 11) {
                bordaErroMask(jFormattedTextFieldTelefone);

                jFormattedTextFieldTelefone.requestFocus();
            } else {
                bordaSucessoMask(jFormattedTextFieldTelefone);
            }

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelTelefone;
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

    private void bordaSucessoMask(JFormattedTextField JFormattedTextField) {
        Border borda = BorderFactory.createLineBorder(Color.decode("#09e83d"), 1);
        JFormattedTextField.setBorder(borda);
    }

    private void apagarComponentes() {
        Border borda = BorderFactory.createLineBorder(Color.GRAY, 1);

//JLabel's'
        jLabelBairro.setForeground(Color.black);
        jLabelCep.setForeground(Color.black);
        jLabelCidade.setForeground(Color.black);
        jLabelCnpj.setForeground(Color.black);
        jLabelCpf.setForeground(Color.black);
        jLabelEmail.setForeground(Color.black);
        jLabelEndereco.setForeground(Color.black);
        jLabelNome.setForeground(Color.black);
        jLabelNumero.setForeground(Color.black);
        jLabelTelefone.setForeground(Color.black);

        // jTextField's
        jTextFieldBairro.setBorder(borda);
        jTextFieldCidade.setBorder(borda);
        jTextFieldEmail.setBorder(borda);
        jTextFieldEndereco.setBorder(borda);
        jTextFieldNome.setBorder(borda);
        jTextFieldNumero.setBorder(borda);
        
        jTextFieldNome.requestFocus();
    }
}
