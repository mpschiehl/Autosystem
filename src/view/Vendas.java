/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Interface.BaseInterfaceJava;
import bean.ClienteBean;
import bean.ProdutoBean;
import dao.ClienteDao;
import dao.ProdutoDao;
import java.awt.Color;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Márcio Pedro Schiehl(mpschiehl@outlook.com)
 * @date 2018-08-27
 */
public class Vendas implements BaseInterfaceJava {

    private JFrame jFrameVendas;
    private JLabel jLabelID, jLabelStatus, jLabelCategoria, jLabelNovo, jLabelSemiNovo, jLabelDescricao, jLabelCliente;
    private JTextField jTextFieldId, jTextFieldDescricao;//jTextFieldQuantidade;
    private JRadioButton jRadioButtonNovo, jRadioButtonSemiNovo;
    private ButtonGroup jradioButtonGroup;
    private JButton jButtonIncuir, jButtonFinalizar, jButtonCancelarItem, jButtonAddCliente, jButtonLimpar, jButtonCancelar,jButtonSair;
    private DefaultTableModel dtm, dtmp;
    private JScrollPane jScrollPaneBuscador, jScrollPanePedido;
    private JTable jTableBusca, jTablePedido;
    private JComboBox jComboBoxCategoriaC, jComboBoxCliente;
    String clienteNome = "", busca = "", impressora = "", nomeDeBusca = "";
    int contador = 0;
    int quantidade = 0;

    public Vendas() {
        instanciarComponentes();
        gerarTela();
        trocaIcone();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        radionGroup();
        acaobotaoSair();
        configuarJTableBusca();
        configurarJTablePedido();
        comboBoxConfigura();
        gerarLocalizacoes();
        gerarDimensoes();
        acaoBotaoIncluir();
        acaoJtextFieldDescricao();
        acaoJtextFieldId();
        acaoBotaoFinaly();
        acaoVender();
        acaoPopularTabelaCampoVazio();
        acaoChecBoxStatus();
        acaoComboBoxCategoria();
        acaoCancelar();
        cancelarItem();
        acaoAddCliente();
        acaoBotaoLimpar();
        trocaTabEnter();
        jFrameVendas.setVisible(true);

    }

    @Override
    public void gerarTela() {
        jFrameVendas = new JFrame("Venda de Produtos");
        jFrameVendas.setSize(800, 600);
        jFrameVendas.setLayout(null);
        jFrameVendas.setLocationRelativeTo(null);
        jFrameVendas.setResizable(false);
        jFrameVendas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    @Override
    public void adicionarComponentes() {
        //JLabel's do Projeto
        jFrameVendas.add(jLabelID);
        jFrameVendas.add(jLabelStatus);
        jFrameVendas.add(jLabelCategoria);
        jFrameVendas.add(jLabelNovo);
        jFrameVendas.add(jLabelSemiNovo);
        jFrameVendas.add(jLabelDescricao);
        jFrameVendas.add(jLabelCliente);
        //JTextField's do Projeto
        jFrameVendas.add(jTextFieldId);
        jFrameVendas.add(jTextFieldDescricao);
        //      jFrameVendas.add(jTextFieldQuantidade);
        //JRadionButton's
        jFrameVendas.add(jRadioButtonNovo);
        jFrameVendas.add(jRadioButtonSemiNovo);
        //JButton's
        jFrameVendas.add(jButtonSair);
        jFrameVendas.add(jButtonIncuir);
        jFrameVendas.add(jButtonFinalizar);
        jFrameVendas.add(jButtonLimpar);
        jFrameVendas.add(jButtonCancelar);
        jFrameVendas.add(jButtonCancelarItem);
        jFrameVendas.add(jButtonAddCliente);
        //adiciona a JTable's
        jFrameVendas.add(jScrollPaneBuscador);
        jFrameVendas.add(jScrollPanePedido);
        //JComboBox's
        jFrameVendas.add(jComboBoxCategoriaC);
        jFrameVendas.add(jComboBoxCliente);
    }

    @Override
    public void gerarLocalizacoes() {
        //Localização das JLabel's
        jLabelID.setLocation(10, 10);
        jLabelStatus.setLocation(110, 10);
        jLabelCategoria.setLocation(230, 10);
        jLabelNovo.setLocation(180, 10);
        jLabelSemiNovo.setLocation(180, 40);
        jLabelDescricao.setLocation(500, 10);
        jLabelCliente.setLocation(500, 80);
        //JTextiField's
        jTextFieldId.setLocation(60, 10);
        jTextFieldDescricao.setLocation(550, 10);
        //    jTextFieldQuantidade.setLocation(90, 40);
        //jRadion's
        jRadioButtonSemiNovo.setLocation(160, 10);
        jRadioButtonNovo.setLocation(160, 40);
        //JButton's
        jButtonSair.setLocation(680, 530);
        jButtonCancelar.setLocation(372, 207);
        jButtonIncuir.setLocation(372, 137);
        jButtonFinalizar.setLocation(680, 480);
        jButtonLimpar.setLocation(680, 32);
        jButtonCancelarItem.setLocation(372, 172);
        jButtonAddCliente.setLocation(745, 80);

        //Jtable's
        jScrollPaneBuscador.setLocation(10, 110);
        jScrollPanePedido.setLocation(420, 110);
        //JComboBox's
        jComboBoxCategoriaC.setLocation(300, 10);
        jComboBoxCliente.setLocation(550, 80);
    }

    @Override
    public void gerarDimensoes() {
        jLabelID.setSize(50, 20);
        jLabelStatus.setSize(100, 20);
        jLabelCategoria.setSize(100, 20);
        jLabelNovo.setSize(100, 20);
        jLabelSemiNovo.setSize(100, 20);
        jLabelDescricao.setSize(45, 20);
        jLabelCliente.setSize(70, 20);
        //    jLabelQuantidade.setSize(70, 20);

        jTextFieldId.setSize(50, 20);
        jTextFieldDescricao.setSize(230, 20);
        //    jTextFieldQuantidade.setSize(50, 20);

        jRadioButtonNovo.setSize(20, 20);
        jRadioButtonSemiNovo.setSize(20, 20);

        jButtonSair.setSize(100, 35);
        jButtonIncuir.setSize(45, 35);
        jButtonFinalizar.setSize(100, 35);
        jButtonLimpar.setSize(100, 35);
        jButtonCancelar.setSize(45, 35);
        jButtonCancelarItem.setSize(45, 35);
        jButtonAddCliente.setSize(35, 20);

        jScrollPaneBuscador.setSize(360, 360);
        jScrollPanePedido.setSize(360, 360);

        jComboBoxCategoriaC.setSize(192, 20);
        jComboBoxCliente.setSize(185, 20);

    }

    @Override
    public void instanciarComponentes() {
        jLabelID = new JLabel("Numero");
        jLabelStatus = new JLabel("Status:");
        jLabelCategoria = new JLabel("Categoria");
        jLabelSemiNovo = new JLabel("Semi Novo");
        jLabelNovo = new JLabel("Novo");
        jLabelDescricao = new JLabel("Produto");
        jLabelCliente = new JLabel("Cliente");

        jTextFieldId = new JTextField();
        jTextFieldId.setToolTipText("Digite o Codigo e presione a Tecla enter de seu teclado");
        jTextFieldDescricao = new JTextField();
        jTextFieldDescricao.setToolTipText("Informe o nome para pesquisa");
        //    jTextFieldQuantidade = new JTextField();

        jRadioButtonNovo = new JRadioButton();
        jRadioButtonSemiNovo = new JRadioButton();

        jButtonSair = new JButton("Sair");
        jButtonIncuir = new JButton();
        jButtonIncuir.setToolTipText("Incluir");
        jButtonFinalizar = new JButton("Finalizar");
        jButtonLimpar = new JButton("Limpar Filtros");
        jButtonCancelar = new JButton();
        jButtonCancelar.setToolTipText("Cancelar Venda");
        jButtonCancelarItem = new JButton();
        jButtonCancelarItem.setToolTipText("Cancelar item");
        jButtonLimpar.setToolTipText("Clique para Limpar os filtros de Busca");
        jButtonAddCliente = new JButton();

        jTableBusca = new JTable();
        jTablePedido = new JTable();

        jScrollPaneBuscador = new JScrollPane(jTableBusca);
        jScrollPanePedido = new JScrollPane(jTablePedido);

        jComboBoxCategoriaC = new JComboBox();
        jComboBoxCliente = new JComboBox();
    }

    private void cancelarItem() {
        jButtonCancelarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTablePedido.getSelectedRow() >= 0) {
                    dtmp.removeRow(jTablePedido.getSelectedRow());
                    jTablePedido.setModel(dtmp);
                    contador = contador - 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
                }
            }
        });
        /* int linnhaSeleciona = jTablePedido.getSelectedRow();
       jTablePedido.remove(linnhaSeleciona);*/
    }

    private void acaoAddCliente() {
        jButtonAddCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //new CadastroCliente().setVisible(true);
                acaoImprimir();
                busca = jComboBoxCliente.getSelectedItem().toString();
                JOptionPane.showMessageDialog(null, impressora);
            }
        });
    }

    private void radionGroup() {
        jradioButtonGroup = new ButtonGroup();
        jradioButtonGroup.add(jRadioButtonSemiNovo);
        jradioButtonGroup.add(jRadioButtonNovo);
        jRadioButtonNovo.setText("Novo");
        jRadioButtonSemiNovo.setText("Semi - novo");
    }

    private void validacao() {

        if (!jRadioButtonNovo.isSelected() && !jRadioButtonSemiNovo.isSelected()) {
            JOptionPane.showMessageDialog(null, "O Status deve ser Marcado", "Erro Status", JOptionPane.ERROR_MESSAGE);
            jLabelStatus.setForeground(Color.red);
            return;
        }
        if (jComboBoxCategoriaC.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "A categoria deve ser Selecionada", "Erro Categoria", JOptionPane.ERROR_MESSAGE);
            jLabelCategoria.setForeground(Color.red);
            jComboBoxCategoriaC.requestFocus();
            return;
        }

        if (jTextFieldDescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você deve informar o Produto", "Erro Descrição", JOptionPane.ERROR_MESSAGE);
            jTextFieldDescricao.requestFocus();
            jLabelDescricao.setForeground(Color.red);
            return;
        }

        jLabelBlack();

    }

    private void limpatela() {
        jTextFieldId.setText("");
        jradioButtonGroup.clearSelection();
        jComboBoxCategoriaC.setSelectedIndex(-1);
        jTextFieldDescricao.setText("");
        //    jTextFieldQuantidade.setText("");
        jTextFieldId.requestFocus();
    }

    private void jLabelBlack() {
        jLabelStatus.setForeground(Color.black);
        jLabelCategoria.setForeground(Color.black);
        jLabelDescricao.setForeground(Color.black);
        //  jLabelQuantidade.setForeground(Color.black);
    }

    private void acaobotaoSair() {
        jButtonSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jFrameVendas.dispose();
            }
        });
    }
    private void acaoJtextFieldDescricao() {
        jTextFieldDescricao.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if (jTextFieldDescricao.getText().length() > 3) {
                    List<ProdutoBean> produtos = new ProdutoDao().obterProdutoBusca(jTextFieldDescricao.getText().trim());
                    DefaultTableModel dtm = (DefaultTableModel) jTableBusca.getModel();

                    dtm.setRowCount(0);

                    for (ProdutoBean produto : produtos) {
                        dtm.addRow(new Object[]{
                            produto.getDescricao(),
                            produto.getQuantidade(),
                            produto.getValorUnitario()
                        });
                    }

                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {

            }
        });
    }

    private void acaoJtextFieldId() {
        jTextFieldId.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                List<ProdutoBean> produtos = new ProdutoDao().buscarPorId(Integer.parseInt(jTextFieldId.getText().trim()));
                DefaultTableModel dtm = (DefaultTableModel) jTableBusca.getModel();
                dtm.setRowCount(0);

                for (ProdutoBean produto : produtos) {
                    dtm.addRow(new Object[]{
                        produto.getDescricao(),
                        produto.getQuantidade(),
                        produto.getValorUnitario()
                    });
                }
                

            }
        });
        
    }

    private void acaoBotaoFinaly() {
        jButtonFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (contador == 0) {
                    JOptionPane.showMessageDialog(null, "Sem Items para realizar a Venda. ");
                } else {

                    acaoVender();
                    JOptionPane.showMessageDialog(null, "venda realizada com sucesso. ");
                    limparTabela();
                }
            }
        });
    }

    private void limparTabela() {
        dtmp.setRowCount(0);
    }

    private void configuarJTableBusca() {
        dtm = new DefaultTableModel();
        dtm.addColumn("Descrição");
        dtm.addColumn("Quantidade");
        dtm.addColumn("Valor unitario");
        jTableBusca.setModel(dtm);
    }

    private void populaPedido() {
        List<ProdutoBean> produtos = new ProdutoDao().obterProdutoBusca(dtm.getValueAt(jTableBusca.getSelectedRow(), 0).toString());
        DefaultTableModel dtmp = (DefaultTableModel) jTablePedido.getModel();

        quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade que o cliente deseja levar", "informe a quantidade", JOptionPane.QUESTION_MESSAGE));
        int quantidadeTabela = Integer.parseInt(jTableBusca.getValueAt(jTableBusca.getSelectedRow(), 1).toString());
        if (quantidadeTabela < quantidade || quantidade == 0) {
            JOptionPane.showMessageDialog(null, "O Estoque não possui a quantidade solicitada", "Erro", JOptionPane.ERROR_MESSAGE);
            jTextFieldId.requestFocus();
            return;
        }
        for (ProdutoBean produto : produtos) {
            dtmp.addRow(new Object[]{contador,
                produto.getDescricao(),
                quantidade,
                produto.getValorUnitario(),
                quantidade * produto.getValorUnitario()
            });

        }
        quantidade = 0;
        contador++;
    }

    private void configurarJTablePedido() {
        dtmp = new DefaultTableModel();
        dtmp.addColumn("Item");
        dtmp.addColumn("Descrição");
        dtmp.addColumn("Quantidade");
        dtmp.addColumn("Valor unitario");
        dtmp.addColumn("Valor Total");
        jTablePedido.setModel(dtmp);
    }
    private void trocaTabEnter(){
        HashSet conj = new HashSet(jFrameVendas.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));   
        conj.add(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));     
        jFrameVendas.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
    }

    private void acaoComboBoxCategoria() {

        jComboBoxCategoriaC.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                // 
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //pegando o texto do item selecionado
                    busca = e.getItem().toString();
                }
                List<ProdutoBean> produtos = new ProdutoDao().obterProdutoCategoria(busca);
                DefaultTableModel dtm = (DefaultTableModel) jTableBusca.getModel();
                dtm.setRowCount(0);
                for (ProdutoBean produto : produtos) {
                    dtm.addRow(new Object[]{
                        produto.getDescricao(),
                        produto.getQuantidade(),
                        produto.getValorUnitario()
                    });
                }

            }
        });
    }

    private void comboBoxConfigura() {

        jComboBoxCategoriaC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Acessorios e acabamento", "Centrais e modulos",
            "Injeção e carburador", "Motor", "Polias e Tensores", "Retentor e Junta",
            "Suspenção e Freio", "Correias e Corente de Comando"}));
        jComboBoxCategoriaC.setSelectedIndex(-1);
        jComboBoxCategoriaC.setToolTipText("Escolha uma Opção");

        jComboBoxCliente.setToolTipText("Escolha uma Opção");
        List<ClienteBean> cliente = new ClienteDao().obterNome();
        DefaultComboBoxModel<ClienteBean> defaultComboBox = (DefaultComboBoxModel<ClienteBean>) jComboBoxCliente.getModel();

        for (ClienteBean clienteBean : cliente) {
            defaultComboBox.addElement(clienteBean);
        }
                

    }

    private void acaoBotaoIncluir() {
        jButtonIncuir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int linnhaSeleciona = jTableBusca.getSelectedRow();
                if (linnhaSeleciona == -1) {
                    JOptionPane.showMessageDialog(null, "Você deve selecionar um Registro");
                } else {
                    populaPedido();
                }

            }
        });
    }

    private void acaoPopularTabelaCampoVazio() {
        if (jTextFieldDescricao.getText().trim().isEmpty() || jTextFieldId.getText().trim().isEmpty()) {
            List<ProdutoBean> produtos = new ProdutoDao().obterProdutos();
            DefaultTableModel dtm = (DefaultTableModel) jTableBusca.getModel();

            dtm.setRowCount(0);

            for (ProdutoBean produto : produtos) {
                dtm.addRow(new Object[]{
                    produto.getDescricao(),
                    produto.getQuantidade(),
                    produto.getValorUnitario()
                });
            }
        }
    }

    private void trocaIcone() {
        URL url = this.getClass().getResource("/icones/shopping_cart.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        jFrameVendas.setIconImage(imagemTitulo);

        jButtonIncuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_right.png")));
        jButtonCancelarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_left.png")));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cross.png")));
        jButtonAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png")));
        jButtonFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/basket.png")));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png")));
    }

    private void acaoVender() {
        //contador++;
        for (int i = 0; i < contador; i++) {
            clienteNome = jTablePedido.getModel().getValueAt(i, 1).toString();
            quantidade = Integer.parseInt(jTablePedido.getModel().getValueAt(i, 2).toString());
            new ProdutoDao().vender(quantidade, clienteNome);
            
        }
        contador = 0;
        clienteNome = "";
        acaoPopularTabelaCampoVazio();
    }

    private void acaoChecBoxStatus() {
        jRadioButtonNovo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    List<ProdutoBean> produtos = new ProdutoDao().obterProdutoStatus("novo");
                    DefaultTableModel dtm = (DefaultTableModel) jTableBusca.getModel();

                    dtm.setRowCount(0);

                    for (ProdutoBean produto : produtos) {
                        dtm.addRow(new Object[]{
                            produto.getDescricao(),
                            produto.getQuantidade(),
                            produto.getValorUnitario()
                        });
                    }

                }
            }
        });

        jRadioButtonSemiNovo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    List<ProdutoBean> produtos = new ProdutoDao().obterProdutoStatus("semi-novo");
                    DefaultTableModel dtm = (DefaultTableModel) jTableBusca.getModel();

                    dtm.setRowCount(0);

                    for (ProdutoBean produto : produtos) {
                        dtm.addRow(new Object[]{
                            produto.getDescricao(),
                            produto.getQuantidade(),
                            produto.getValorUnitario()
                        });
                    }

                }
            }
        });

    }

    private void acaoBotaoLimpar() {
        jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpatela();
            }
        });
    }

    private void acaoCancelar() {
        jButtonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTabela();
                dtm.setRowCount(0);
                contador = 0;
            }
        });

    }

    private void acaoImprimir() {
        
        impressora = "";
         nomeDeBusca = jComboBoxCliente.getSelectedItem().toString();
        
        String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
        List<ClienteBean> clientes = new ClienteDao().obterClienteNome(nomeDeBusca);
        
        impressora = impressora + "------------------------------------------------------------------------------------------------------------------------------\n"
                + "                                                                                               " + data 
                +"\n AutoSystem"
                +"\n------------------------------------------------------------------------------------------------------------------------------"
                +"\nCliente : " + nomeDeBusca 
                +"\nCPF:"
                +"\nCNPJ"
                +"\nEndereço:"
                +"\n------------------------------------------------------------------------------------------------------------------------------";
        
        nomeDeBusca ="";
    }
}
