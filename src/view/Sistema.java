/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Interface.BaseInterfaceJava;
import view.Estoque;
import view.Vendas;
import view.Cadastro;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 *
 * @author Márcio Pedro Schiehl(mpschiehl@outlook.com)
 * @date 2018-08-27
 */
public class Sistema implements BaseInterfaceJava {

    //construtor da clase
    private Estoque estoque;
   
    public Sistema() {
        gerarTela();
        ConfigurandoLookAndFeel();
        trocaIcone();
        instanciarComponentes();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        acaoBotaoCadastro();
        acaoBotaoEstoque();
        acaoBotaoVenda();
        acaoBotaoSair();
        adicionaIconeButton();
        acaoBotaoCadastroFuncionario();
        acaoBotaoCadastroCliente();
        jFrameSistema.setVisible(true);
    }

    private JFrame jFrameSistema;
    private JButton jButtonCadastro, jButtonEstoque, jButtonVenda, jButtonSair, jButtonCadastroCliente, jButtonCadastroFuncionario;
    private JLabel jLabelAutoSystem;

    @Override
    public void instanciarComponentes() {
        jButtonCadastro = new JButton("Cadastro");
        jButtonEstoque = new JButton("Estoque");
        jButtonVenda = new JButton("Venda");
        jButtonSair = new JButton("Sair");
        jButtonCadastroCliente = new JButton("Cliente");
        jButtonCadastroFuncionario = new JButton("Funcionario");
       
        
        jLabelAutoSystem = new JLabel("AutoSystem");
    }

    @Override
    public void gerarTela() {
        jFrameSistema = new JFrame("AutoSystem");
        jFrameSistema.setSize(410, 270);
        jFrameSistema.setLocationRelativeTo(null);
        jFrameSistema.setLayout(null);
        jFrameSistema.setResizable(false);
        jFrameSistema.setDefaultCloseOperation(jFrameSistema.EXIT_ON_CLOSE);
    }

    @Override
    public void gerarLocalizacoes() {
        jButtonCadastro.setLocation(25, 25);
        jButtonEstoque.setLocation(150, 25);
        jButtonVenda.setLocation(25,130 );
        jButtonSair.setLocation(150, 130);
        jButtonCadastroCliente.setLocation(275, 25);
        jButtonCadastroFuncionario.setLocation(165, 25);
        
        jLabelAutoSystem.setLocation(25,20);
    }

    @Override
    public void gerarDimensoes() {
        jButtonCadastro.setSize(100, 80);
        jButtonEstoque.setSize(100, 80);
        jButtonSair.setSize(100, 80);
        jButtonVenda.setSize(100, 80);
        jButtonCadastroFuncionario.setSize(100, 80);
        jButtonCadastroCliente.setSize(100, 80);
        
        jLabelAutoSystem.setSize(200,35);

    }

    private void adicionaIconeButton() {
        jButtonVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cart.png")));
        jButtonCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ruby.png")));
        jButtonEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/box.png")));
        jButtonCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/team.png")));
        jButtonCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user_female.png")));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png")));
        
        
    }

    //troca o icone padrao
    private void trocaIcone() {
        URL url = this.getClass().getResource("/icones/Air-filter.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

        jFrameSistema.setIconImage(imagemTitulo);

        
    }

    private void acaoBotaoCadastro() {
        jButtonCadastro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Cadastro();
            }
        });
    }

    private void acaoBotaoEstoque() {
        jButtonEstoque.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Estoque().setVisible(true);

            }
        });
    }

    private void acaoBotaoVenda() {
        jButtonVenda.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                new Vendas();
            }
        });
    }

    private void acaoBotaoSair() {
        jButtonSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void adicionarComponentes() {
        jFrameSistema.add(jButtonCadastro);
        jFrameSistema.add(jButtonEstoque);
       jFrameSistema.add(jButtonVenda);
        jFrameSistema.add(jButtonSair);
        jFrameSistema.add(jButtonCadastroCliente);
      // jFrameSistema.add(jButtonCadastroFuncionario);
       
  
    }

    private void acaoBotaoCadastroFuncionario() {
        jButtonCadastroFuncionario.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    private void acaoBotaoCadastroCliente() {
        jButtonCadastroCliente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    /*public static void ConfigurandoLookAndFeel() {
     try {
     for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
     if ("Nimbus".equals(info.getName())) {
     UIManager.setLookAndFeel(info.getClassName());
     break;
     }
     }
     } catch (UnsupportedLookAndFeelException e) {

     } catch (ClassNotFoundException e) {

     } catch (InstantiationException e) {
            
     } catch (IllegalAccessException e) {
            
     }
     }*/
    public void ConfigurandoLookAndFeel() {
        try {
            javax.swing.UIManager.setLookAndFeel(
                    "com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }  
    
   
}
