/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Interface.BaseInterfaceJava;
import bean.ProdutoBean;
import dao.ProdutoDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.border.Border;

import jdk.nashorn.internal.ir.ForNode;

/**
 *
 *
 * @author Guilherme Bialas(guilhermebialas31@gmail.com)
 * @author Marcio Pedro Schiehl(mpschiehl@outlook.com)
 * @date 2018-08-27
 */
public class Cadastro implements BaseInterfaceJava {

    private JFrame jFrameCadastro;
    private JLabel jLabelQuantidade, jLabelValor, jLabelDescricao, jLabelAplicacao,
            jLabelUnidadeDeMedida, jLabelLocalizacao, jLabelStatusPeca, jLabelPeso,
            jLabelCategoria, jLabelAutoSystems, jLabelRadioButtonNovo, jLabelRadioButtonSemiNovo;
    private JTextField jTextFieldQuantidade, jTextFieldValor, jTextFieldDescricao,
            jTextFieldPeso;
    private JButton jButtonSair, jButtonLimpar, jButtonAdicionar;
    private JRadioButton jRadioButtonNovo, jRadioButtonSemiNovo;
    private JComboBox jComboBoxLocalizacao, jComboBoxCategoria, jComboBoxUnidadeDeMedida;
    private JTextArea jTextAreaAplicacao;
    private JScrollPane jScrollPaneAplicacao;
    private ButtonGroup buttonGroup;
    private ArrayList<JLabel> jLabels = new ArrayList<>();

    public Cadastro() {

        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        acaoBotaoAdicionar();
        adicionarComboBoxLocalizacao();
        adicionarComboBoxCategoria();
        acaoBotaoLimpar();
        limparCampos();
        acaoSair();
        configurarJScrollPane();
        adicionarComboBoxUnidadeDeMedida();
        trocaTabEnter();
        configuraFont();
        trocaIcone();
        jFrameCadastro.setVisible(true);

    }

    @Override
    public void gerarTela() {
        jFrameCadastro = new JFrame("Cadastro");
        jFrameCadastro.setSize(550, 470);
        jFrameCadastro.setLayout(null);
        jFrameCadastro.setLocationRelativeTo(null);
        jFrameCadastro.setResizable(false);
        jFrameCadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    @Override
    public void adicionarComponentes() {
        // jLabel's
        jFrameCadastro.add(jLabelQuantidade);
        jFrameCadastro.add(jLabelValor);
        jFrameCadastro.add(jLabelDescricao);
        jFrameCadastro.add(jLabelAplicacao);
        jFrameCadastro.add(jLabelUnidadeDeMedida);
        jFrameCadastro.add(jLabelLocalizacao);

        jFrameCadastro.add(jLabelStatusPeca);
        jFrameCadastro.add(jLabelPeso);
        jFrameCadastro.add(jLabelCategoria);

        jFrameCadastro.add(jLabelRadioButtonNovo);
        jFrameCadastro.add(jLabelRadioButtonSemiNovo);

        //JTextField's
        jFrameCadastro.add(jTextFieldQuantidade);
        jFrameCadastro.add(jTextFieldValor);
        jFrameCadastro.add(jTextFieldDescricao);

        jFrameCadastro.add(jTextFieldPeso);

        //JButton's
        jFrameCadastro.add(jButtonSair);
        jFrameCadastro.add(jButtonLimpar);
        jFrameCadastro.add(jButtonAdicionar);

        //CheckBox
        jFrameCadastro.add(jRadioButtonNovo);
        jFrameCadastro.add(jRadioButtonSemiNovo);

        //ComboBox
        jFrameCadastro.add(jComboBoxLocalizacao);
        jFrameCadastro.add(jComboBoxCategoria);
        jFrameCadastro.add(jComboBoxUnidadeDeMedida);

        //TextArea
        jFrameCadastro.add(jTextAreaAplicacao);
        //JScrollPane
        jFrameCadastro.add(jScrollPaneAplicacao);
    }

    @Override
    public void gerarLocalizacoes() {

        //Descricaoo
        jLabelDescricao.setLocation(20, 35);
        jTextFieldDescricao.setLocation(20, 60);

        //Quantidade
        jLabelQuantidade.setLocation(20, 100);
        jTextFieldQuantidade.setLocation(20, 125);

        //Valor
        jLabelValor.setLocation(20, 165);
        jTextFieldValor.setLocation(20, 190);

        //Aplicacao
        jLabelAplicacao.setLocation(20, 230);
        jTextAreaAplicacao.setLocation(20, 255);

        //UnidadeDeMedida
        jLabelUnidadeDeMedida.setLocation(360, 165);
        jComboBoxUnidadeDeMedida.setLocation(360, 190);

        //Localizacao
        jLabelLocalizacao.setLocation(140, 100);
        jComboBoxLocalizacao.setLocation(140, 125);

        //StatusPeca
        jLabelStatusPeca.setLocation(360, 35);
        jRadioButtonNovo.setLocation(360, 60);
        jRadioButtonSemiNovo.setLocation(425, 60);
        jLabelRadioButtonNovo.setLocation(385, 60);
        jLabelRadioButtonSemiNovo.setLocation(445, 60);

        //Peso
        jLabelPeso.setLocation(360, 100);
        jTextFieldPeso.setLocation(360, 125);

        //BotaoSair
        jButtonSair.setLocation(420, 360);

        //BotaoLimpar
        jButtonLimpar.setLocation(295, 360);

        //BotaoAdicionar
        jButtonAdicionar.setLocation(170, 360);

        //Categoria
        jLabelCategoria.setLocation(140, 165);
        jComboBoxCategoria.setLocation(140, 190);

        //SCrollPane
        jScrollPaneAplicacao.setLocation(20, 255);
    }

    @Override
    public void gerarDimensoes() {

        //JButton's
        jButtonSair.setSize(100, 40);
        jButtonLimpar.setSize(100, 40);
        jButtonAdicionar.setSize(100, 40);
        //JTextField's
        jTextFieldQuantidade.setSize(100, 20);
        jTextFieldValor.setSize(100, 20);
        jTextFieldDescricao.setSize(295, 20);

        jTextFieldPeso.setSize(100, 20);

        //JLabel's
        jLabelQuantidade.setSize(100, 20);
        jLabelValor.setSize(100, 20);
        jLabelDescricao.setSize(150, 20);
        jLabelAplicacao.setSize(100, 20);
        jLabelUnidadeDeMedida.setSize(100, 20);
        jLabelLocalizacao.setSize(100, 20);

        jLabelStatusPeca.setSize(150, 20);
        jLabelPeso.setSize(150, 20);
        jLabelCategoria.setSize(100, 20);

        jLabelRadioButtonNovo.setSize(50, 20);
        jLabelRadioButtonSemiNovo.setSize(100, 20);
        //RadioButton
        jRadioButtonNovo.setSize(20, 20);
        jRadioButtonSemiNovo.setSize(20, 20);

        //ComboBox
        jComboBoxCategoria.setSize(200, 20);
        jComboBoxLocalizacao.setSize(200, 20);
        jComboBoxUnidadeDeMedida.setSize(100, 20);

        //TextArea
        jTextAreaAplicacao.setSize(500, 80);

        //ScrollPane
        jScrollPaneAplicacao.setSize(500, 80);
    }

    @Override
    public void instanciarComponentes() {
        //JLabel's 
        jLabelQuantidade = new JLabel("Quantidade: ");
        jLabelValor = new JLabel("Valor: ");
        jLabelDescricao = new JLabel("Descrição do produto: ");
        jLabelAplicacao = new JLabel("Aplicação: ");
        jLabelUnidadeDeMedida = new JLabel("Und Medida: ");
        jLabelLocalizacao = new JLabel("Localização: ");

        jLabelStatusPeca = new JLabel("Status da Peça: ");
        jLabelPeso = new JLabel("Peso(kg): ");
        jLabelCategoria = new JLabel("Categoria: ");
        jLabelRadioButtonNovo = new JLabel("Novo");
        jLabelRadioButtonSemiNovo = new JLabel("Semi Novo");

        //JTextField's
        jTextFieldQuantidade = new JTextField("");
        jTextFieldValor = new JTextField("");
        jTextFieldDescricao = new JTextField("");
        jTextFieldPeso = new JTextField("");

        jTextFieldDescricao.setToolTipText("Adicione uma Descrição");
        jTextFieldQuantidade.setToolTipText("Adicione uma Quantidade");
        jTextFieldValor.setToolTipText("Adicione um Valor");
        jTextFieldPeso.setToolTipText("Adicione um Peso");

        //JButton's
        jButtonSair = new JButton("Sair");
        jButtonLimpar = new JButton("Limpar");
        jButtonAdicionar = new JButton("Adicionar");

        buttonGroup = new ButtonGroup();

        //RadioButton
        jRadioButtonNovo = new JRadioButton("Novo");
        jRadioButtonSemiNovo = new JRadioButton("");

        buttonGroup.add(jRadioButtonNovo);
        buttonGroup.add(jRadioButtonSemiNovo);

        //ComboBox
        jComboBoxLocalizacao = new JComboBox();
        jComboBoxCategoria = new JComboBox();
        jComboBoxUnidadeDeMedida = new JComboBox();

        jComboBoxLocalizacao.setToolTipText("Selecione a Localização no Estoque");
        jComboBoxCategoria.setToolTipText("Selecione a Categoria da Peça Padastrada");
        jComboBoxUnidadeDeMedida.setToolTipText("Selecione a Unidade de Medida");

        jLabelAutoSystems = new JLabel("");

        jTextAreaAplicacao = new JTextArea();
        jTextAreaAplicacao.setToolTipText("Adicione uma Aplicação");
        //SCrollPane
        jScrollPaneAplicacao = new JScrollPane();
    }

    private void adicionarComboBoxCategoria() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(new Object[]{"Centrais e Módulos", "Acessórios e acabamento", "Injeção e carburador",
            "Motor", "Polias e tensores", "Retentor e junta", "Supenção e freios", "Correas e corrente de comando"
        });
        jComboBoxCategoria.setModel(modelo);
        jComboBoxCategoria.setSelectedIndex(-1);
    }

    private void adicionarComboBoxLocalizacao() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(new Object[]{"Acessórios", "Acessorios do Motor",
            "Componentes eletricos", "Correias", "Correntes de CV", "Farois", "freio", "Kits de Junta",
            "motor", "Parachoques", "polias", "Portas e Carrroceria(recortes)", "retentores", "Rolamentos", "suspensão",
            "Tensores", "vidros"});
        jComboBoxLocalizacao.setModel(modelo);
        jComboBoxLocalizacao.setSelectedIndex(-1);
    }

    private void adicionarComboBoxUnidadeDeMedida() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(new Object[]{"Kit", "Peça"});
        jComboBoxUnidadeDeMedida.setModel(modelo);
        jComboBoxUnidadeDeMedida.setSelectedIndex(-1);
    }

    private void acaoBotaoAdicionar() {
        jButtonAdicionar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                validacao();
                salvarBanco();
                limparCampos();
                apagarComponentes();
                JOptionPane.showMessageDialog(null, "Salvo com sucesso ");
            }
        });

    }

    private void salvarBanco() {

        ProdutoBean produto = new ProdutoBean();
        produto.setDescricao(jTextFieldDescricao.getText().trim().replace(",", "").replace("/", "").replace("*", ""));
        if (jRadioButtonNovo.isSelected()) {
            produto.setStatusPecas("novo");
        } else if (jRadioButtonSemiNovo.isSelected()) {
            produto.setStatusPecas("semi Novo");
        }

        produto.setQuantidade(Integer.parseInt(jTextFieldQuantidade.getText().trim().replace(",", ".").replace("/", "").replace("*", "")));

        if (jComboBoxUnidadeDeMedida.getSelectedIndex() == 0) {
            produto.setUnidadeDeMedida("Kit");
        } else if (jComboBoxUnidadeDeMedida.getSelectedIndex() == 1) {
            produto.setUnidadeDeMedida("Peça");
        }
        produto.setPeso(Float.parseFloat(jTextFieldPeso.getText().trim().replace(",", ".").replace("/", "").replace("*", "")));
        produto.setValorUnitario(Float.parseFloat(jTextFieldValor.getText().trim().replace(",", ".").replace("/", "").replace("*", "")));

        switch (jComboBoxCategoria.getSelectedIndex()) {
            case 0:
                produto.setCategoria("Centrais e Módulos");
                break;
            case 1:
                produto.setCategoria("Acessórios e acabamento");
                break;
            case 2:
                produto.setCategoria("Injeção e carburador");
                break;
            case 3:
                produto.setCategoria("Motor");
            case 4:
                produto.setCategoria("Polias e tensores");
                break;
            case 5:
                produto.setCategoria("Retentor e junta");
                break;
            case 6:
                produto.setCategoria("Supenção e freios");
                break;
            case 7:
                produto.setCategoria("Correas e corrente de comando");
                break;

        }
        switch (jComboBoxLocalizacao.getSelectedIndex()) {
            case 0:
                produto.setLocalizacao("Acessórios");
                break;
            case 1:
                produto.setLocalizacao("Acessorios do Motor");
                break;
            case 2:
                produto.setLocalizacao("Componentes eletricos");
                break;
            case 3:
                produto.setLocalizacao("Correias");
                break;
            case 4:
                produto.setLocalizacao("Correntes de CV");
                break;
            case 5:
                produto.setLocalizacao("Farois");
                break;
            case 6:
                produto.setLocalizacao("freio");
                break;
            case 7:
                produto.setLocalizacao("Kits de Junta");
                break;
            case 8:
                produto.setLocalizacao("motor");
                break;
            case 9:
                produto.setLocalizacao("Parachoques");
                break;
            case 10:
                produto.setLocalizacao("polias");
                break;
            case 11:
                produto.setLocalizacao("Portas e Carrroceria(recortes)");
                break;
            case 12:
                produto.setLocalizacao("retentores");
                break;
            case 13:
                produto.setLocalizacao("Rolamentos");
                break;
            case 14:
                produto.setLocalizacao("suspensão");
                break;
            case 15:
                produto.setLocalizacao("Tensores");
                break;
            case 16:
                produto.setLocalizacao("vidros");
                break;

        }
        produto.setAplicacao(jTextAreaAplicacao.getText().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", ""));
        new ProdutoDao().inserir(produto);
    }

    private void limparCampos() {
        jTextFieldQuantidade.setText("");
        jTextFieldValor.setText("");
        jTextFieldDescricao.setText("");
        jTextAreaAplicacao.setText("");
        jComboBoxUnidadeDeMedida.setSelectedIndex(-1);
        jComboBoxLocalizacao.setSelectedIndex(-1);

        jTextFieldPeso.setText("");
        jComboBoxCategoria.setSelectedIndex(-1);
        buttonGroup.clearSelection();
        jTextFieldDescricao.requestFocus();
        apagarComponentes();
    }

    private void acaoBotaoLimpar() {
        jButtonLimpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
                apagarComponentes();
            }
        });
    }

    private void acaoSair() {
        jButtonSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja sair?"
                        + "\nSe você não salvou perderá todo o cadastro.", "Aviso", JOptionPane.ERROR_MESSAGE);
                if (resposta == 0) {
                    jFrameCadastro.dispose();
                }

            }
        });
    }

    private void configurarJScrollPane() {
        jScrollPaneAplicacao.setViewportView(jTextAreaAplicacao);
        jScrollPaneAplicacao.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneAplicacao.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaAplicacao.setLineWrap(true);

    }

    private void validacao() {

        //Descrição
        if (jTextFieldDescricao.getText().isEmpty()) {
            jLabelDescricao.setForeground(Color.red);
            bordaErro(jTextFieldDescricao);
            gerarJLabel("1131", jTextFieldDescricao);
            jTextFieldDescricao.requestFocus();
        } else if (jTextFieldDescricao.getText().length() < 2) {
            jLabelDescricao.setForeground(Color.red);
            bordaErro(jTextFieldDescricao);

            jTextFieldDescricao.requestFocus();
        } else if (jTextFieldDescricao.getText().length() >= 150) {
            jLabelDescricao.setForeground(Color.red);
            bordaErro(jTextFieldDescricao);

            jTextFieldDescricao.requestFocus();
        } else {
            bordaSucesso(jTextFieldDescricao);
        }

        //Quantidade
        if (jTextFieldQuantidade.getText().isEmpty()) {
            jLabelQuantidade.setForeground(Color.red);
            bordaErro(jTextFieldQuantidade);
            jTextFieldQuantidade.requestFocus();
        } else {
            try {
                if (Float.parseFloat(jTextFieldQuantidade.getText()) < 0) {
                    jLabelQuantidade.setForeground(Color.red);
                    bordaErro(jTextFieldQuantidade);
                    jTextFieldQuantidade.requestFocus();
                }
            } catch (Exception e) {
                jLabelQuantidade.setForeground(Color.red);
                bordaErro(jTextFieldQuantidade);
                jTextFieldQuantidade.requestFocus();

            }
            bordaSucesso(jTextFieldQuantidade);
        }

        //Valor
        if (jTextFieldValor.getText().isEmpty()) {
            jLabelValor.setForeground(Color.red);
            bordaErro(jTextFieldValor);
            jTextFieldValor.requestFocus();
        } else {
            try {
                if (Float.parseFloat(jTextFieldValor.getText()) < 0) {
                    jLabelValor.setForeground(Color.red);
                    bordaErro(jTextFieldValor);
                    jTextFieldValor.requestFocus();
                }
            } catch (Exception e) {
                jLabelValor.setForeground(Color.red);
                bordaErro(jTextFieldValor);
                jTextFieldValor.requestFocus();

            }
            bordaSucesso(jTextFieldValor);
        }

        //Peso
        if (jTextFieldPeso.getText().isEmpty()) {
            jLabelPeso.setForeground(Color.red);
            bordaErro(jTextFieldPeso);
            jTextFieldPeso.requestFocus();
        } else {
            try {
                if (Float.parseFloat(jTextFieldPeso.getText()) < 0) {
                    jLabelPeso.setForeground(Color.red);
                    bordaErro(jTextFieldPeso);
                    jTextFieldPeso.requestFocus();
                }
            } catch (Exception e) {
                jLabelPeso.setForeground(Color.red);
                bordaErro(jTextFieldPeso);
                jTextFieldPeso.requestFocus();

            }
            bordaSucesso(jTextFieldValor);
        }

        //RadioButton
        if (!jRadioButtonNovo.isSelected() && !jRadioButtonSemiNovo.isSelected()) {
            jLabelStatusPeca.setForeground(Color.red);
            jRadioButtonNovo.requestFocus();

        }

        //Unidade de medida
        if (jComboBoxUnidadeDeMedida.getSelectedIndex() == -1) {
            jLabelUnidadeDeMedida.setForeground(Color.red);

            jComboBoxUnidadeDeMedida.requestFocus();

        }

        //Localizacao
        if (jComboBoxLocalizacao.getSelectedIndex() == -1) {
            jLabelLocalizacao.setForeground(Color.red);
            jComboBoxLocalizacao.requestFocus();

        }
        //Categoria
        if (jComboBoxCategoria.getSelectedIndex() == -1) {
            jLabelCategoria.setForeground(Color.red);

            jComboBoxCategoria.requestFocus();

        }

        //Aplicação
        if (jTextAreaAplicacao.getText().isEmpty()) {
            jLabelAplicacao.setForeground(Color.red);
            bordaErroArea(jTextAreaAplicacao);
            jTextAreaAplicacao.requestFocus();
        } else if (jTextAreaAplicacao.getText().length() < 2) {
            jLabelDescricao.setForeground(Color.red);
            bordaErroArea(jTextAreaAplicacao);
            jTextAreaAplicacao.requestFocus();
        } else if (jTextAreaAplicacao.getText().length() >= 300) {
            jLabelAplicacao.setForeground(Color.red);
            bordaErroArea(jTextAreaAplicacao);
            jTextAreaAplicacao.requestFocus();
        } else {
            bordaSucessoArea(jTextAreaAplicacao);
        }
        jTextFieldDescricao.requestFocus();
        return;
    }

    private void trocaTabEnter() {
        HashSet conj = new HashSet(jFrameCadastro.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
        jFrameCadastro.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
    }

    private void gerarJLabel(String texto, JTextField jTextField) {

        JLabel jLabelE = new JLabel();
        jLabelE.setText("");
        jLabelE.setForeground(Color.red);
        jLabelE.setLocation(jTextField.getX(), jTextField.getY() + 20);
        jLabelE.setSize(20, 20);
        jFrameCadastro.add(jLabelE);

    }

    private void apagarComponentes() {

        //JLabel's
        jLabelQuantidade.setForeground(Color.black);
        jLabelCategoria.setForeground(Color.black);
        jLabelDescricao.setForeground(Color.black);
        jLabelValor.setForeground(Color.black);
        jLabelAplicacao.setForeground(Color.black);
        jLabelUnidadeDeMedida.setForeground(Color.black);
        jLabelLocalizacao.setForeground(Color.black);
        jLabelStatusPeca.setForeground(Color.black);
        jLabelPeso.setForeground(Color.black);

        //jTextField's
        Border borda = BorderFactory.createLineBorder(Color.GRAY, 1);
        jTextFieldQuantidade.setBorder(borda);
        jTextFieldValor.setBorder(borda);
        jTextFieldDescricao.setBorder(borda);
        jTextFieldPeso.setBorder(borda);

        //JTextArea
        jTextAreaAplicacao.setBorder(borda);
    }

    private void bordaSucesso(JTextField jTextField) {
        Border borda = BorderFactory.createLineBorder(Color.decode("#09e83d"), 1);
        jTextField.setBorder(borda);

    }

    private void bordaErro(JTextField jTextField) {

        Border borda = BorderFactory.createLineBorder((Color.red), 1);
        jTextField.setBorder(borda);
    }

    private void bordaErroArea(JTextArea jTextArea) {
        Border borda = BorderFactory.createLineBorder((Color.red), 1);
        jTextArea.setBorder(borda);
    }

    private void bordaSucessoArea(JTextArea jTextArea) {
        Border borda = BorderFactory.createLineBorder(Color.decode("#09e83d"), 1);
        jTextArea.setBorder(borda);
    }

    private void configuraFont() {

        jLabelQuantidade.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelValor.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelDescricao.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelAplicacao.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelUnidadeDeMedida.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelLocalizacao.setFont(new Font("Arial", Font.PLAIN, 14));

        jLabelStatusPeca.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelPeso.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelCategoria.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelRadioButtonNovo.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelRadioButtonSemiNovo.setFont(new Font("Arial", Font.PLAIN, 14));

    }

    private void trocaIcone() {
        URL url = this.getClass().getResource("/icones/clipboard2.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        jFrameCadastro.setIconImage(imagemTitulo);

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png")));
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/eraser.png")));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png")));
        
    }
}
