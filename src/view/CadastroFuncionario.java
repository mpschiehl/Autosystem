/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Alunos
 */
public class CadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFuncionario
     */
    public CadastroFuncionario() {
        initComponents();
        configurarJFormattedTextField();
        adicionarMaskCep();
        adicionarMakPis();
        adicionarMaskDataAdimissao();
        adicionarMaskTelefone();
        adicionarMaskSalario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jTextFieldCargo = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        jLabelSalario = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelPis = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSalario = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataAdimissao = new javax.swing.JFormattedTextField();
        jFormattedTextFieldPis = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabelEmail.setText("E mail");

        jLabelBairro.setText("Bairro");

        jLabelCidade.setText("Cidade");

        jLabelEndereco.setText("Endereço");

        jLabelNome.setText("Nome");

        jLabelTelefone.setText("Telefone");

        jLabelCpf.setText("Cpf");

        jLabelCep.setText("CEP");

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jLabelCargo.setText("Cargo");

        jLabelSalario.setText("Salario");

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });

        jLabelPis.setText("PIS");

        jLabelNumero.setText("Número");

        jLabel1.setText("Data de Admissão");

        jFormattedTextFieldSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabelEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonAdicionar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelCargo)
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabelSalario)
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabelPis)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldPis, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelBairro)
                                .addGap(167, 167, 167)
                                .addComponent(jLabelNumero)
                                .addGap(71, 71, 71))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCpf)
                .addGap(174, 174, 174)
                .addComponent(jLabelEmail)
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabelTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCep)
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabelCidade))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFormattedTextFieldDataAdimissao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCpf)
                                .addComponent(jLabelEmail)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefone)
                            .addComponent(jLabelCep)
                            .addComponent(jLabelCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumero)
                            .addComponent(jLabelBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEndereco)
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataAdimissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCargo)
                                .addComponent(jLabelSalario))
                            .addComponent(jLabelPis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonAdicionar))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        validacao();

    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
      dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataAdimissao;
    private javax.swing.JFormattedTextField jFormattedTextFieldPis;
    private javax.swing.JFormattedTextField jFormattedTextFieldSalario;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPis;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables

    public void validacao() {
        //VALIDACAO DE NOME
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "O nome deve ser preenchido", "Cadastro Funcionários", JOptionPane.ERROR_MESSAGE);
            jTextFieldNome.requestFocus();
            return;
        } else if (jTextFieldNome.getText().length() < 2) {
            JOptionPane.showMessageDialog(null,
                    "O nome deve ter no minimo tres caracteres", "Cadastro Funcionários", JOptionPane.ERROR_MESSAGE);
            jTextFieldNome.requestFocus();
            return;
        }

        //VALIDACAO CPF
        String cpf = jFormattedTextFieldCpf.getText();
        if (jFormattedTextFieldCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CPF", "Cadastro Funcionários", JOptionPane.ERROR_MESSAGE);
            jFormattedTextFieldCpf.requestFocus();
            return;
        } else if (cpf.length() < 11) {
            JOptionPane.showMessageDialog(null,
                    "O CPF deve conter 11 Digitos");
            return;
        }

        //VALIDACAO E-MAIL
        String email = jTextFieldEmail.getText().trim().toLowerCase();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Informe o e-mail do cliente", "Cadastro Funcionários", JOptionPane.ERROR_MESSAGE);
            jTextFieldEmail.requestFocus();
            return;
        }
        String telefone = jFormattedTextFieldTelefone.getText();
        if (telefone.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Informe o telefone", "Cadastro Funcionário", JOptionPane.ERROR_MESSAGE);
            jFormattedTextFieldTelefone.requestFocus();
            return;
        }
        String cep = jFormattedTextFieldCep.getText();
        if (cep.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o cep", "Cadastro Funcionário", JOptionPane.ERROR_MESSAGE);
            jFormattedTextFieldCep.requestFocus();
            return;
        }
        if (jTextFieldCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a cidade", "Cadastro Funcionários", JOptionPane.ERROR_MESSAGE);
            jTextFieldCidade.requestFocus();
            return;
        }
        if (jTextFieldEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o endereço", "Cadastro Funcionários", JOptionPane.ERROR_MESSAGE);
            jTextFieldEndereco.requestFocus();
        } else if (jTextFieldEndereco.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "Informe um endereço válido");
            return;
        }
        if (jTextFieldBairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bairro?", "Cadastro Funcionários", JOptionPane.ERROR_MESSAGE);
            jTextFieldBairro.requestFocus();
            return;
        } else if (jTextFieldBairro.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Bairro deve conter no minimo 5 caracteres", "Cadastro Funcionario", JOptionPane.ERROR_MESSAGE);
            jTextFieldNumero.requestFocus();
            return;
        }
        if (jTextFieldNumero.getText().length() >= 1) {
            JOptionPane.showMessageDialog(null, "Informe o numero da residencia");
            jTextFieldNumero.requestFocus();
            return;
        }
        if (jFormattedTextFieldDataAdimissao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a data de admissão do mesmo", "Cadastro Funcionário", JOptionPane.ERROR_MESSAGE);
            jFormattedTextFieldDataAdimissao.requestFocus();
            return;
        }
        if (jTextFieldCargo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Cargo do supoto funcionário", "Cadastro Funcionário", JOptionPane.ERROR_MESSAGE);
            jTextFieldCargo.requestFocus();
            return;
        }
        String salario = jFormattedTextFieldSalario.getText();
        if(salario.isEmpty()){
            JOptionPane.showMessageDialog(null,"Informe o salário, nem relógio trabalha de graça","Cadastro Funcionário",JOptionPane.ERROR_MESSAGE);
        jFormattedTextFieldSalario.requestFocus();
        return;
        }
        String pis = jFormattedTextFieldPis.getText();
        if(pis.isEmpty()){
            JOptionPane.showMessageDialog(null,"Informe o pis","Cadastro Funcionário",JOptionPane.ERROR_MESSAGE);
            jFormattedTextFieldSalario.requestFocus();
            return;
        }else if(jFormattedTextFieldPis.getText().length()<11){
            JOptionPane.showMessageDialog(null,"o numero do PIS deve conter 11 digitos","Funcionário Cadastro",JOptionPane.ERROR_MESSAGE);
            jFormattedTextFieldPis.requestFocus();
            return;
        }

    }

    // mask cpf      
    public void configurarJFormattedTextField() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("###.###.###-##");
            maskFormatter.install(jFormattedTextFieldCpf);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void adicionarMaskCep() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("#####-###");
            maskFormatter.install(jFormattedTextFieldCep);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void adicionarMaskDataAdimissao() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("##/##/####");
            maskFormatter.install(jFormattedTextFieldDataAdimissao);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void adicionarMakPis() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("###.######.##-##");
            maskFormatter.install(jFormattedTextFieldPis);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void adicionarMaskTelefone() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("(##)#####-####");
            maskFormatter.install(jFormattedTextFieldTelefone);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void salvarBanco() {

    }

    public void limparCampos() {
        jFormattedTextFieldTelefone.setText("");
        jFormattedTextFieldPis.setText("");
        jFormattedTextFieldDataAdimissao.setText("");
        jFormattedTextFieldCep.setText("");
        jTextFieldCargo.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNome.setText("");
        jTextFieldNumero.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldSalario.setText("");
        jFormattedTextFieldTelefone.setText("");

    }

    public void adicionarMaskSalario() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("R$#,###.##");
            maskFormatter.install(jFormattedTextFieldSalario);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
