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
        acaoBotaoCadastroFuncionario();
        acaoBotaoCadastroCliente();
        jFrameSistema.setVisible(true);
    }

    private JFrame jFrameSistema;
    private JButton jButtonCadastro, jButtonEstoque, jButtonVenda, jButtonSair, jButtonCadastroCliente, jButtonCadastroFuncionario;

    @Override
    public void instanciarComponentes() {
        jButtonCadastro = new JButton("Cadastro");
        jButtonEstoque = new JButton("Estoque");
        jButtonVenda = new JButton("Venda");
        jButtonSair = new JButton("Sair");
        jButtonCadastroCliente = new JButton("Cliente");
        jButtonCadastroFuncionario = new JButton("Funcionario");
    }

    @Override
    public void gerarTela() {
        jFrameSistema = new JFrame("CGLM System");
        jFrameSistema.setSize(800, 600);
        jFrameSistema.setLocationRelativeTo(null);
        jFrameSistema.setLayout(null);
        jFrameSistema.setResizable(false);
        jFrameSistema.setDefaultCloseOperation(jFrameSistema.EXIT_ON_CLOSE);
    }

    @Override
    public void gerarLocalizacoes() {
        jButtonCadastro.setLocation(10, 10);
        jButtonEstoque.setLocation(120, 10);
        jButtonVenda.setLocation(240, 10);
        jButtonSair.setLocation(600, 10);
        jButtonCadastroCliente.setLocation(480, 10);
        jButtonCadastroFuncionario.setLocation(360, 10);
    }

    @Override
    public void gerarDimensoes() {
        jButtonCadastro.setSize(100, 50);
        jButtonEstoque.setSize(100, 50);
        jButtonSair.setSize(100, 50);
        jButtonVenda.setSize(100, 50);
        jButtonCadastroFuncionario.setSize(100, 50);
        jButtonCadastroCliente.setSize(100, 50);

    }

    //troca o icone padrao

    private void trocaIcone() {
        URL url = this.getClass().getResource("/icones/Air-filter.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        jFrameSistema.setIconImage(imagemTitulo);
        // jButtonCadastro.setIcon(new ImageIcon("/icones/add_item.png"));
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
        jFrameSistema.add(jButtonCadastroFuncionario);
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
