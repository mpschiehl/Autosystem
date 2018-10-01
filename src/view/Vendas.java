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
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
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
public class Vendas extends javax.swing.JFrame {
    
    private JFrame jFrameVendas;
    private JLabel jLabelID, jLabelStatus, jLabelCategoria, jLabelNovo, jLabelSemiNovo, jLabelDescricao, jLabelCliente, JLabelTotal,jLabelSair;
    private JTextField jTextFieldId, jTextFieldDescricao;//jTextFieldQuantidade;
    private JRadioButton jRadioButtonNovo, jRadioButtonSemiNovo;
    private ButtonGroup jradioButtonGroup;
    private JButton jButtonIncuir, jButtonFinalizar, jButtonCancelarItem, jButtonAddCliente, jButtonLimpar, jButtonCancelar, jButtonSair, jButtonUltimo;
    private DefaultTableModel dtm, dtmp;
    private JScrollPane jScrollPaneBuscador, jScrollPanePedido;
    private JTable jTableBusca, jTablePedido;
    private JComboBox jComboBoxCategoriaC, jComboBoxCliente;
    String descricao = "", busca = "", impressora = "", nomeDeBusca = "", ultimoPedido = "";
    int contador = 0;
    int quantidade = 0;
    Float totalizador = 0f, total = 0f;
    
    public Vendas() {
        instanciarComponentes();
        gerarTela();
        trocaIcone();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        radionGroup();
        acaoSair();
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
        janelaEmFocus();
        acaoUltimo();
        configFont();
        jFrameVendas.setVisible(true);
        
    }
    
    public void gerarTela() {
        jFrameVendas = new JFrame("Venda de Produtos");
        jFrameVendas.setSize(800, 600);
        jFrameVendas.setLayout(null);
        jFrameVendas.setLocationRelativeTo(null);
        jFrameVendas.setResizable(false);
        jFrameVendas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }
    
    public void adicionarComponentes() {
        //JLabel's do Projeto
        jFrameVendas.add(jLabelID);
        jFrameVendas.add(jLabelStatus);
        jFrameVendas.add(jLabelCategoria);
        jFrameVendas.add(jLabelNovo);
        jFrameVendas.add(jLabelSemiNovo);
        jFrameVendas.add(jLabelDescricao);
        jFrameVendas.add(jLabelCliente);
        jFrameVendas.add(JLabelTotal);
        jFrameVendas.add(jLabelSair);
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
        jFrameVendas.add(jButtonUltimo);
        //adiciona a JTable's
        jFrameVendas.add(jScrollPaneBuscador);
        jFrameVendas.add(jScrollPanePedido);
        //JComboBox's
        jFrameVendas.add(jComboBoxCategoriaC);
        jFrameVendas.add(jComboBoxCliente);
    }
    
    public void gerarLocalizacoes() {
        //Localização das JLabel's
        jLabelID.setLocation(10, 10);
        jLabelStatus.setLocation(110, 10);
        jLabelCategoria.setLocation(230, 10);
        jLabelNovo.setLocation(180, 10);
        jLabelSemiNovo.setLocation(180, 40);
        jLabelDescricao.setLocation(500, 10);
        jLabelCliente.setLocation(500, 80);
        JLabelTotal.setLocation(700, 487);
        jLabelSair.setLocation(600,530);
        //JTextiField's
        jTextFieldId.setLocation(60, 10);
        jTextFieldDescricao.setLocation(550, 10);
        //    jTextFieldQuantidade.setLocation(90, 40);
        //jRadion's
        jRadioButtonSemiNovo.setLocation(160, 10);
        jRadioButtonNovo.setLocation(160, 40);
        //JButton's
        jButtonSair.setLocation(680, 480);
        jButtonCancelar.setLocation(372, 207);
        jButtonIncuir.setLocation(372, 137);
        jButtonFinalizar.setLocation(680, 530);
        jButtonLimpar.setLocation(680, 32);
        jButtonCancelarItem.setLocation(372, 172);
        jButtonAddCliente.setLocation(745, 80);
        jButtonUltimo.setLocation(530, 480);

        //Jtable's
        jScrollPaneBuscador.setLocation(10, 110);
        jScrollPanePedido.setLocation(420, 110);
        //JComboBox's
        jComboBoxCategoriaC.setLocation(300, 10);
        jComboBoxCliente.setLocation(550, 80);
    }
    
    public void gerarDimensoes() {
        jLabelID.setSize(50, 20);
        jLabelStatus.setSize(100, 20);
        jLabelCategoria.setSize(100, 20);
        jLabelNovo.setSize(100, 20);
        jLabelSemiNovo.setSize(100, 20);
        jLabelDescricao.setSize(60, 20);
        jLabelCliente.setSize(70, 20);
        JLabelTotal.setSize(100, 20);
        jLabelSair.setSize(100,20);
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
        jButtonUltimo.setSize(130, 35);
        
        jScrollPaneBuscador.setSize(360, 360);
        jScrollPanePedido.setSize(360, 360);
        
        jComboBoxCategoriaC.setSize(192, 20);
        jComboBoxCliente.setSize(185, 20);
        
    }
    
    public void instanciarComponentes() {
        jLabelID = new JLabel("Numero");
        jLabelStatus = new JLabel("Status:");
        jLabelCategoria = new JLabel("Categoria");
        jLabelSemiNovo = new JLabel("Semi Novo");
        jLabelNovo = new JLabel("Novo");
        jLabelDescricao = new JLabel("Produto");
        jLabelCliente = new JLabel("Cliente");
        JLabelTotal = new JLabel();
        jLabelSair = new JLabel();
        jLabelSair.setToolTipText("Sair");
        
        jTextFieldId = new JTextField();
        jTextFieldId.setToolTipText("Digite o Codigo e presione a Tecla F12 de seu teclado");
        jTextFieldDescricao = new JTextField();
        jTextFieldDescricao.setToolTipText("Informe o nome para pesquisa");
        //    jTextFieldQuantidade = new JTextField();

        jRadioButtonNovo = new JRadioButton();
        jRadioButtonSemiNovo = new JRadioButton();
        
        jButtonSair = new JButton();
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
        jButtonUltimo = new JButton("Ultimo Pedido");
        
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
                    int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja Cancelar a venda deste  Item?"
                            + "\nSe você tem Certeza clique em 'Sim', caso contrario clique em 'Não'", "Aviso", JOptionPane.ERROR_MESSAGE);
                    if (resposta == 0) {
                        dtmp.removeRow(jTablePedido.getSelectedRow());
                        jTablePedido.setModel(dtmp);
                        contador = contador - 1;
                        JLabelTotal.setText("");
                    }
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
                new CadastroCliente().setVisible(true);
                
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
        jTextFieldId.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_F12:
                        int id = Integer.parseInt(jTextFieldId.getText());
                        DefaultTableModel dtm = (DefaultTableModel) jTableBusca.getModel();
                        ProdutoBean produto = new ProdutoDao().buscarPorId(id);
                        dtm.setRowCount(0);
                        dtm.addRow(new Object[]{
                            produto.getDescricao(),
                            produto.getQuantidade(),
                            produto.getValorUnitario()
                        });
                        
                        break;
                }
            }
            
            @Override
            public void keyReleased(KeyEvent ke) {
                
            }
        });
        /*jTextFieldId.addActionListener(new ActionListener() {
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
        });*/
    }
    
    private void acaoBotaoFinaly() {
        jButtonFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (contador == 0) {
                    JOptionPane.showMessageDialog(null, "Sem Items para realizar a Venda. ");
                } else {
                    acaoImprimir();
                    busca = jComboBoxCliente.getSelectedItem().toString();
                    acaoVender();
                    limparTabela();
                    JLabelTotal.setText("");
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
        jTableBusca.getColumnModel().getColumn(0).setPreferredWidth(180);
        jTableBusca.getColumnModel().getColumn(1).setPreferredWidth(60);
        jTableBusca.getColumnModel().getColumn(2).setPreferredWidth(60);
        
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
            dtmp.addRow(new Object[]{
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
        dtmp.addColumn("Descrição");
        dtmp.addColumn("Quantidade");
        dtmp.addColumn("Unitario");
        dtmp.addColumn("Total:");
        jTablePedido.setModel(dtmp);
        
        jTablePedido.getColumnModel().getColumn(0).setPreferredWidth(180);
        jTablePedido.getColumnModel().getColumn(1).setPreferredWidth(60);
        jTablePedido.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTablePedido.getColumnModel().getColumn(3).setPreferredWidth(60);
        
    }
    
    private void trocaTabEnter() {
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
        jComboBoxCategoriaC.removeAllItems();
        jComboBoxCategoriaC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Acessorios e acabamento", "Centrais e modulos",
            "Injeção e carburador", "Motor", "Polias e Tensores", "Retentor e Junta",
            "Suspenção e Freio", "Correias e Corente de Comando"}));
        jComboBoxCategoriaC.setSelectedIndex(-1);
        jComboBoxCategoriaC.setToolTipText("Escolha uma Opção");
        
        jComboBoxCliente.setToolTipText("Escolha uma Opção");
        jComboBoxCliente.removeAllItems();
        List<ClienteBean> cliente = new ClienteDao().obterNome();
        DefaultComboBoxModel<ClienteBean> defaultComboBox = (DefaultComboBoxModel<ClienteBean>) jComboBoxCliente.getModel();
        
        for (ClienteBean clienteBean : cliente) {
            defaultComboBox.addElement(clienteBean);
        }
        
    }
    
    private void totaliza() {
        for (int i = 0; i < contador; i++) {
            total = Float.parseFloat(jTablePedido.getModel().getValueAt(i, 3).toString());
            
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
                totaliza();
                JLabelTotal.setText(total.toString());
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
        jButtonUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_white_text.png")));
        jLabelSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png")));
    }
    
    private void acaoVender() {
        //contador++;
        for (int i = 0; i < contador; i++) {
            descricao = jTablePedido.getModel().getValueAt(i, 0).toString();
            quantidade = Integer.parseInt(jTablePedido.getModel().getValueAt(i, 1).toString());
            new ProdutoDao().vender(quantidade, descricao);
            
        }
        contador = 0;
        descricao = "";
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
                if (contador == 0) {
                    JOptionPane.showMessageDialog(null, "Não existe produtos para cancelar");
                    return;
                }
                int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja Cancelar?"
                        + "\nSe você tem Certeza clique em 'Sim', caso contrario clique em 'Não'", "Aviso", JOptionPane.ERROR_MESSAGE);
                if (resposta == 0) {
                    limparTabela();
                    dtm.setRowCount(0);
                    contador = 0;
                    JLabelTotal.setText("");
                }
                
            }
        });
        
    }
    
    private void acaoImprimir() {
        
        impressora = "";
        nomeDeBusca = jComboBoxCliente.getSelectedItem().toString();
        
        String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
        String cpf = "", cnpj = "", endereco = "";
        List<ClienteBean> usuario = new ClienteDao().obterClienteNome(nomeDeBusca);
        for (ClienteBean clienteBean : usuario) {
            cpf = clienteBean.getCpf();
            cnpj = clienteBean.getCnpj();
            endereco = clienteBean.getEndereco();
        }
        impressora = impressora + "\r\n_______________________________________________________________________________\r\n"
                + "                                                            " + data
                + "\r\n AutoSystem"
                + "\r\n_______________________________________________________________________________\r\n"
                + "\r\nCliente : " + nomeDeBusca
                + "\r\nCPF: " + cpf
                + "\r\nCNPJ" + cnpj
                + "\r\nEndereço:" + endereco
                + "\r\n_______________________________________________________________________________\r\n";
        for (int i = 0; i < contador; i++) {
            
            quantidade = Integer.parseInt(jTablePedido.getModel().getValueAt(i, 1).toString());
            descricao = jTablePedido.getModel().getValueAt(i, 0).toString();
            Float unitario = Float.parseFloat(jTablePedido.getModel().getValueAt(i, 2).toString());
            Float total = Float.parseFloat(jTablePedido.getModel().getValueAt(i, 3).toString());
            
            impressora = impressora + "\r\n" + quantidade + "  X  " + unitario + "  " + descricao + "   R$ " + total;
            totalizador = totalizador + total;
            
        }
        impressora = impressora + "\r\n_______________________________________________________________________________\r\n"
                + "                                                         Total: R$ " + totalizador;
        
        Random gerador = new Random();
        int codigoGerado = gerador.nextInt(99) + gerador.nextInt(45) - 5;
        String blocoDeNotas = codigoGerado + codigoGerado + nomeDeBusca + ".txt";
        
        nomeDeBusca = "";
        String caminhoArquivo = "C:/autosystem/" + blocoDeNotas;
        Path caminho = Paths.get(caminhoArquivo);
        byte[] textoEmByte = impressora.getBytes();
        try {
            Files.createFile(caminho);
            Files.write(caminho, textoEmByte);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Desktop desktop = Desktop.getDesktop();
        try {
            File arquivoAImprimir = new File(caminhoArquivo);
            desktop.print(arquivoAImprimir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        gerarArquivo(blocoDeNotas);
        
    }
    
    private void janelaEmFocus() {
        jFrameVendas.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                comboBoxConfigura();
                acaoPopularTabelaCampoVazio();
            }
        });
        
    }
    
    private void acaoUltimo() {
        jButtonUltimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                lerArquivoConfig();
                lerUltimoPedido(ultimoPedido);
                JOptionPane.showMessageDialog(null, impressora, "Ultima Venda", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
    
    private void lerArquivoConfig() {
        File arquivo = new File("/autosystem/config.txt");
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            //enquanto houver mais linhas
            while (br.ready()) {
                //lê a proxima linha
                String linha = br.readLine();
                //faz algo com a linha
                ultimoPedido = linha;
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            
        }
    }
    
    private void lerUltimoPedido(String pedidoUltimo) {
        File arquivo = new File("/autosystem/" + pedidoUltimo);
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            //enquanto houver mais linhas
            impressora = "";
            while (br.ready()) {
                //lê a proxima linha
                String linha = br.readLine();
                //faz algo com a linha
                impressora = impressora + linha + "\n";
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            
        }
    }
    
    private void gerarArquivo(String texto) {
        File arquivo = new File("/autosystem/config.txt");
        try {
            if (!arquivo.exists()) {
                //cria um arquivo (vazio)
                arquivo.createNewFile();
            }
            //caso seja um diretório, é possível listar seus arquivos e diretórios
            File[] arquivos = arquivo.listFiles();
            //escreve no arquivo
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.newLine();
            bw.close();
            fw.close();
            //faz a leitura do arquivo
            /* FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            //enquanto houver mais linhas
            while (br.ready()) {
            //lê a proxima linha
                //String linha = br.readLine();
            //faz algo com a linha
                //System.out.println(linha);
            }
            br.close();
            fr.close();*/
        } catch (IOException ex) {
            ex.printStackTrace();
            
        }
        
    }
    
    private void configFont() {
        jLabelID.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelStatus.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelCategoria.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelSemiNovo.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelNovo.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelDescricao.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabelCliente.setFont(new Font("Arial", Font.PLAIN, 14));
        
    }

    private void acaoSair() {
       jLabelSair.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent me) {
               jFrameVendas.dispose();
           }

           @Override
           public void mousePressed(MouseEvent me) {
               
           }

           @Override
           public void mouseReleased(MouseEvent me) {
               
           }

           @Override
           public void mouseEntered(MouseEvent me) {
               
           }

           @Override
           public void mouseExited(MouseEvent me) {
               
           }
       });
            
    }
    
}
