package dao;

import bean.ProdutoBean;
import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme Bialas
 * @author Marcio Pedro Schiehl
 */
public class ProdutoDao {

    //Está em desenvolvimento
    public int inserir(ProdutoBean produto) {
        Connection conexao = Conexao.obterConexao();
        if (conexao != null) {
            String sql = "INSERT INTO produtos"
                    + "\n(aplicacao,categoria,descricao,localizacao,status_peca,unidade_de_medida,quantidade,valor,valor_unitario,peso)"
                    + "\nVALUES(?,?,?,?,?,?,?,?,?,?);";
            try {
                PreparedStatement preparedStatement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

                preparedStatement.setString(1, produto.getAplicacao());
                preparedStatement.setString(2, produto.getCategoria());
                preparedStatement.setString(3, produto.getDescricao());
                preparedStatement.setString(4, produto.getLocalizacao());
                preparedStatement.setString(5, produto.getStatusPecas());
                preparedStatement.setString(6, produto.getUnidadeDeMedida());
                preparedStatement.setInt(7, produto.getQuantidade());
                preparedStatement.setFloat(8, produto.getValor());
                preparedStatement.setFloat(9, produto.getValorUnitario());
                preparedStatement.setFloat(10, produto.getPeso());
                preparedStatement.execute();

                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    return resultSet.getInt(1);
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Conexao.fecharConexao();
            }
        }
        return 0;
    }
    public boolean  vender(int quantidade, String descricao){
        Connection conexao = Conexao.obterConexao();
        String sql = "UPDATE produtos SET quantidade = quantidade - ? WHERE descricao = ?;";
        if (conexao !=null){
            try{
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, quantidade);
                ps.setString(2, descricao);
                return ps.executeUpdate() == 1;
            }catch (SQLException e){
                e.printStackTrace();
            }finally{
                Conexao.fecharConexao();
            }
        }
        return false;
    }
    public boolean alterar(ProdutoBean produto) {
        Connection conexao = Conexao.obterConexao();
        String sql = "UPDATE produtos SET quantidade = ?,"
                + " valor = ?, descricao = ?,unidade_de_medida = ?, localizacao = ?, valor_unitario = ? ";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, produto.getDescricao());
            ps.setString(2, produto.getUnidadeDeMedida());
            ps.setString(3, produto.getLocalizacao());
            ps.setFloat(4, produto.getValorUnitario());
            ps.setInt(5, produto.getQuantidade());
            ps.setFloat(6, produto.getValor());
            return ps.executeUpdate() == 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

        public List<ProdutoBean> buscarPorId(int id) {
       List<ProdutoBean> produtos = new ArrayList<>();
        Connection conexao = Conexao.obterConexao();
        if (conexao != null) {
            String sql = "SELECT * FROM produtos WHERE id=" + id+";";
            try {
                Statement statement = conexao.createStatement();
                statement.execute(sql);
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    ProdutoBean produto = new ProdutoBean();
                    produto.setId(resultSet.getInt("id"));
                    produto.setCategoria(resultSet.getString("categoria"));
                    produto.setStatusPecas(resultSet.getString("status_peca"));
                    produto.setPeso(resultSet.getFloat("peso"));
                    produto.setLocalizacao(resultSet.getString("localizacao"));
                    produto.setAplicacao(resultSet.getString("aplicacao"));
                    produto.setDescricao(resultSet.getString("descricao"));
                    produto.setQuantidade(resultSet.getInt("quantidade"));
                    produto.setValor(resultSet.getFloat("valor"));
                    produto.setValorUnitario(resultSet.getFloat("valor_unitario"));
                    
                    produtos.add(produto);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Conexao.fecharConexao();
            }
        }

       return produtos;
    }
    

    public List<ProdutoBean> obterProdutoBusca(String nome){
        List<ProdutoBean> produtos = new ArrayList<>();
        Connection conexao = Conexao.obterConexao();
        if (conexao != null) {
            String sql = "SELECT * FROM produtos WHERE descricao LIKE '%" + nome +"%';";
            try {
                Statement statement = conexao.createStatement();
                statement.execute(sql);
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    ProdutoBean produto = new ProdutoBean();
                    produto.setId(resultSet.getInt("id"));
                    produto.setCategoria(resultSet.getString("categoria"));
                    produto.setStatusPecas(resultSet.getString("status_peca"));
                    produto.setPeso(resultSet.getFloat("peso"));
                    produto.setLocalizacao(resultSet.getString("localizacao"));
                    produto.setAplicacao(resultSet.getString("aplicacao"));
                    produto.setDescricao(resultSet.getString("descricao"));
                    produto.setQuantidade(resultSet.getInt("quantidade"));
                    produto.setValor(resultSet.getFloat("valor"));
                    produto.setValorUnitario(resultSet.getFloat("valor_unitario"));
                    
                    produtos.add(produto);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Conexao.fecharConexao();
            }
        }

       return produtos;
    }

    

    public List<ProdutoBean> obterProdutos() {
        List<ProdutoBean> produtos = new ArrayList<>();
        Connection conexao = Conexao.obterConexao();
        if (conexao != null) {
            String sql = "SELECT id,categoria,status_peca,peso,localizacao, aplicacao,descricao, quantidade,valor, valor_unitario FROM produtos;";
            try {
                Statement statement = conexao.createStatement();
                statement.execute(sql);
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    ProdutoBean produto = new ProdutoBean();
                    produto.setId(resultSet.getInt("id"));
                    produto.setCategoria(resultSet.getString("categoria"));
                    produto.setStatusPecas(resultSet.getString("status_peca"));
                    produto.setPeso(resultSet.getFloat("peso"));
                    produto.setLocalizacao(resultSet.getString("localizacao"));
                    produto.setAplicacao(resultSet.getString("aplicacao"));
                    produto.setDescricao(resultSet.getString("descricao"));
                    produto.setQuantidade(resultSet.getInt("quantidade"));
                    produto.setValor(resultSet.getFloat("valor"));
                    produto.setValorUnitario(resultSet.getFloat("valor_unitario"));
                    
                    produtos.add(produto);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Conexao.fecharConexao();
            }
        }

       return produtos;
    }
    public List<ProdutoBean> obterProdutoStatus(String status){
        List<ProdutoBean> produtos = new ArrayList<>();
        Connection conexao = Conexao.obterConexao();
        if (conexao != null) {
            String sql = "SELECT * FROM produtos WHERE status_peca = '" + status +"';";
            try {
                Statement statement = conexao.createStatement();
                statement.execute(sql);
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    ProdutoBean produto = new ProdutoBean();
                    produto.setId(resultSet.getInt("id"));
                    produto.setCategoria(resultSet.getString("categoria"));
                    produto.setStatusPecas(resultSet.getString("status_peca"));
                    produto.setPeso(resultSet.getFloat("peso"));
                    produto.setLocalizacao(resultSet.getString("localizacao"));
                    produto.setAplicacao(resultSet.getString("aplicacao"));
                    produto.setDescricao(resultSet.getString("descricao"));
                    produto.setQuantidade(resultSet.getInt("quantidade"));
                    produto.setValor(resultSet.getFloat("valor"));
                    produto.setValorUnitario(resultSet.getFloat("valor_unitario"));
                    
                    produtos.add(produto);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Conexao.fecharConexao();
            }
        }

       return produtos;
   
    }

    public List<ProdutoBean> obterProdutoCategoria(String categoria){
        List<ProdutoBean> produtos = new ArrayList<>();
        Connection conexao = Conexao.obterConexao();
        if (conexao != null) {
            String sql = "SELECT * FROM produtos WHERE categoria = '" + categoria +"';";
            try {
                Statement statement = conexao.createStatement();
                statement.execute(sql);
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    ProdutoBean produto = new ProdutoBean();
                    produto.setId(resultSet.getInt("id"));
                    produto.setCategoria(resultSet.getString("categoria"));
                    produto.setStatusPecas(resultSet.getString("status_peca"));
                    produto.setPeso(resultSet.getFloat("peso"));
                    produto.setLocalizacao(resultSet.getString("localizacao"));
                    produto.setAplicacao(resultSet.getString("aplicacao"));
                    produto.setDescricao(resultSet.getString("descricao"));
                    produto.setQuantidade(resultSet.getInt("quantidade"));
                    produto.setValor(resultSet.getFloat("valor"));
                    produto.setValorUnitario(resultSet.getFloat("valor_unitario"));
                    
                    produtos.add(produto);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Conexao.fecharConexao();
            }
        }

       return produtos;
   
    }
    
}
