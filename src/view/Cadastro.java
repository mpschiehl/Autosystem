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
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
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
        jFrameCadastro.setVisible(true);

    }

    @Override
    public void gerarTela() {
        jFrameCadastro = new JFrame("Cadastro");
        jFrameCadastro.setSize(590, 470);
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

        //Descricao
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
        jLabelUnidadeDeMedida.setLocation(410, 165);
        jComboBoxUnidadeDeMedida.setLocation(410, 190);

        //Localizacao
        jLabelLocalizacao.setLocation(190, 100);
        jComboBoxLocalizacao.setLocation(190, 125);

        //StatusPeca
        jLabelStatusPeca.setLocation(410, 35);
        jRadioButtonNovo.setLocation(410, 60);
        jRadioButtonSemiNovo.setLocation(470, 60);
        jLabelRadioButtonNovo.setLocation(435, 60);
        jLabelRadioButtonSemiNovo.setLocation(494, 60);

        //Peso
        jLabelPeso.setLocation(410, 100);
        jTextFieldPeso.setLocation(410, 125);

        //BotaoSair
        jButtonSair.setLocation(460, 360);

        //BotaoLimpar
        jButtonLimpar.setLocation(355, 360);

        //BotaoAdicionar
        jButtonAdicionar.setLocation(250, 360);

        //Categoria
        jLabelCategoria.setLocation(190, 165);
        jComboBoxCategoria.setLocation(190, 190);

        jLabelAutoSystems.setLocation(10, 10);

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
        jTextFieldQuantidade.setSize(150, 20);
        jTextFieldValor.setSize(150, 20);
        jTextFieldDescricao.setSize(350, 20);

        jTextFieldPeso.setSize(150, 20);

        //JLabel's
        jLabelQuantidade.setSize(100, 20);
        jLabelValor.setSize(100, 20);
        jLabelDescricao.setSize(150, 20);
        jLabelAplicacao.setSize(100, 20);
        jLabelUnidadeDeMedida.setSize(100, 20);
        jLabelLocalizacao.setSize(100, 20);

        jLabelStatusPeca.setSize(100, 20);
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
        jComboBoxUnidadeDeMedida.setSize(150, 20);

        //TextArea
        jTextAreaAplicacao.setSize(540, 80);

        //ScrollPane
        jScrollPaneAplicacao.setSize(540, 80);
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
        jLabelPeso = new JLabel("Peso: ");
        jLabelCategoria = new JLabel("Categoria: ");
        jLabelRadioButtonNovo = new JLabel("Novo");
        jLabelRadioButtonSemiNovo = new JLabel("Semi Novo");

        //JTextField's
        jTextFieldQuantidade = new JTextField("");
        jTextFieldValor = new JTextField("");
        jTextFieldDescricao = new JTextField("");

        jTextFieldPeso = new JTextField("");

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

        jLabelAutoSystems = new JLabel("");

        jTextAreaAplicacao = new JTextArea();

        //SCrollPane
        jScrollPaneAplicacao = new JScrollPane();
    }

    private void adicionarComboBoxCategoria() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(new Object[]{"Acessórios e acabamento", "Injeção e carburador",
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
                JOptionPane.showMessageDialog(null, "Salvo com sucesso ");
            }
        });

    }

    private void salvarBanco() {

        ProdutoBean produto = new ProdutoBean();
        produto.setDescricao(jTextFieldDescricao.getText().trim().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", ""));
        if (jRadioButtonNovo.isSelected()) {
            produto.setStatusPecas("novo");
        } else if (jRadioButtonSemiNovo.isSelected()) {
            produto.setStatusPecas("semi Novo");
        }

        produto.setQuantidade(Integer.parseInt(jTextFieldQuantidade.getText().trim().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", "")));

        if (jComboBoxUnidadeDeMedida.getSelectedIndex() == 0) {
            produto.setUnidadeDeMedida("Kit");
        } else if (jComboBoxUnidadeDeMedida.getSelectedIndex() == 1) {
            produto.setUnidadeDeMedida("Peça");
        }
        produto.setPeso(Float.parseFloat(jTextFieldPeso.getText().trim().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", "")));
        produto.setValorUnitario(Float.parseFloat(jTextFieldValor.getText().trim().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", "")));

        switch (jComboBoxCategoria.getSelectedIndex()) {
            case 0:
                produto.setCategoria("Acessórios e acabamento");
                break;
            case 1:
                produto.setCategoria("Injeção e carburador");
                break;
            case 2:
                produto.setCategoria("Motor");
                break;
            case 3:
                produto.setCategoria("Polias e tensores");
            case 4:
                produto.setCategoria("Retentor e junta");
                break;
            case 5:
                produto.setCategoria("Supenção e freios");
                break;
            case 6:
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
        produto.setAplicacao(jTextAreaAplicacao.getText().trim().trim().replace(".", "").replace(",", "").replace("/", "").replace("*", ""));
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
            }
        });
    }

    private void acaoSair() {
        jButtonSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja sair?"
                        + "\nSe você não salvou, perderá todo o cadastro", "Aviso", JOptionPane.ERROR_MESSAGE);
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
            gerarJLabel("Deve preencher.", jTextFieldDescricao);
            bordaErro(jTextFieldDescricao);
            jTextFieldDescricao.requestFocus();
        } else if (jTextFieldDescricao.getText().length() < 2) {
            gerarJLabel("Descrição inválida", jTextFieldDescricao);
            bordaErro(jTextFieldDescricao);
            jTextFieldDescricao.requestFocus();
        } else {
            bordaSucesso(jTextFieldDescricao);

        }

        //Quantidade
        if (jTextFieldQuantidade.getText().isEmpty()) {
            gerarJLabel("Deve preencher.", jTextFieldQuantidade);
            bordaErro(jTextFieldQuantidade);
            jTextFieldQuantidade.requestFocus();
        } else {
            try {
                if (Float.parseFloat(jTextFieldQuantidade.getText()) < 0) {
                    gerarJLabel("Quantidade inválida", jTextFieldQuantidade);
                    bordaErro(jTextFieldQuantidade);
                    jTextFieldQuantidade.requestFocus();
                }
            } catch (Exception e) {
                gerarJLabel("Quantidade inválida", jTextFieldQuantidade);
                bordaErro(jTextFieldQuantidade);
            }
            bordaSucesso(jTextFieldQuantidade);
        }

        //Valor
        if (jTextFieldValor.getText().isEmpty()) {
            gerarJLabel("Deve preencher.", jTextFieldValor);
            bordaErro(jTextFieldValor);
            jTextFieldValor.requestFocus();
        } else {
            try {
                if (Float.parseFloat(jTextFieldValor.getText()) < 0) {
                    gerarJLabel("Valor inválido", jTextFieldValor);
                    bordaErro(jTextFieldValor);
                    jTextFieldValor.requestFocus();
                }
            } catch (Exception e) {
                gerarJLabel("Valor inválido", jTextFieldValor);
                bordaErro(jTextFieldValor);
            }
            bordaSucesso(jTextFieldValor);

        }

        //Peso
        if (jTextFieldPeso.getText().isEmpty()) {
            gerarJLabel("Este campo deve ser preenchdo", jTextFieldPeso);
            bordaErro(jTextFieldPeso);
            jTextFieldPeso.requestFocus();
        } else {
            try {
                if (Float.parseFloat(jTextFieldPeso.getText()) < 0) {
                    gerarJLabel("peso inválido", jTextFieldPeso);
                    bordaErro(jTextFieldPeso);
                    jTextFieldPeso.requestFocus();
                }
            } catch (Exception e) {
                gerarJLabel("Peso inválido", jTextFieldPeso);
                bordaErro(jTextFieldPeso);
            }
            bordaSucesso(jTextFieldPeso);

        }

        //RadioButton
        if (!jRadioButtonNovo.isSelected() && !jRadioButtonSemiNovo.isSelected()) {
            JOptionPane.showMessageDialog(null,
                    "Deve ser selecionado se é novo ou semi novo", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jRadioButtonNovo.requestFocus();
            return;

        }

        if (jComboBoxUnidadeDeMedida.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null,
                    "Unidade de Medida deve ser Preenchida", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jComboBoxUnidadeDeMedida.requestFocus();
            return;
        }

        if (jComboBoxLocalizacao.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null,
                    "A Localização deve ser Informado", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jComboBoxLocalizacao.requestFocus();
            return;
        }

        if (jComboBoxCategoria.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null,
                    "A Categoria deve ser Informado", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jComboBoxCategoria.requestFocus();
            return;
        }

        //Aplicação
        if (jTextAreaAplicacao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aplicacao deve ser preenchida");
        } else if (jTextAreaAplicacao.getText().length() <= 2) {
            JOptionPane.showMessageDialog(null, "Aplicacao deve ser maior que três");
        }

    }

    private void trocaTabEnter() {
        HashSet conj = new HashSet(jFrameCadastro.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
        jFrameCadastro.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
    }

    private void gerarJLabel(String texto, JTextField jTextField) {
        JLabel jLabelE = new JLabel();
        jLabelE.setText(texto);
        jLabelE.setForeground(Color.red);
        jLabelE.setLocation(jTextField.getX(), jTextField.getY() + jTextField.getHeight());
        jLabelE.setSize(jTextField.getWidth(), 20);
        jFrameCadastro.add(jLabelE);
        jLabels.add(jLabelE);

        JLabel jLabelMensagem = new JLabel();
        jLabelMensagem.setText("Campos não estão preenchidos corretamente");
        jLabelMensagem.setForeground(Color.red);
        jLabelMensagem.setLocation(300, 450);
        jLabelMensagem.setSize(300, 20);
        jFrameCadastro.add(jLabelMensagem);
    }

    private void apagarComponentes() {

        for (JLabel jLabelE : jLabels) {
            jFrameCadastro.remove(jLabelE);
        }
    }

    private void bordaSucesso(JTextField jTextField) {
        Border borda = BorderFactory.createLineBorder(Color.decode("#09e83d"), 1);
        jTextField.setBorder(borda);

    }

    private void bordaErro(JTextField jTextField) {

        Border borda = BorderFactory.createLineBorder((Color.red), 1);
        jTextField.setBorder(borda);
    }









    /*Márcio, aparentemente está certo, é pra gerar uma jLabel de erro na JLabel 
      do RadioButton,mas n está criando já procurei na no stack e não encontrei uma solução,
      Tem que criar uma Array lá em cima nos private, mas msm assim não adianta (mas acho que n precisa pq ja criei pra JLabel)*/
      //Método pra Criar uma JLabel no radioButton
       private void geraraJLabelRadioButton(String texto, JLabel jLabel) {
        JLabel jLabelE = new JLabel();
        jLabelE.setText(texto);
        jLabelE.setForeground(Color.red);
        jLabelE.setLocation(jLabel.getX(), jLabel.getY() + jLabel.getHeight());
        jLabelE.setSize(jLabel.getWidth(), 20);
        jFrameCadastro.add(jLabelE);
        jLabels.add(jLabelE);
    }

       //Método pra criar JLabel no comboBox
       private void gerarJLabelComboBox(String texto, JComboBox jComboBox){
        JLabel jLabelE = new JLabel();
        jLabelE.setText(texto);
        jLabelE.setForeground(Color.red);
        jLabelE.setLocation(jComboBox.getX(), jComboBox.getY() + jComboBox.getHeight());
        jLabelE.setSize(jComboBox.getWidth(), 20);
        jFrameCadastro.add(jLabelE);
        jLabels.add(jLabelE);
       
       }
}
