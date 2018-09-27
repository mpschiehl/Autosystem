/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ClienteBean;
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
 * @author Marcio Pedro Schiehl
 */

/*
*/
public class ClienteDao {
   
     public List<ClienteBean> obterNome(){
     List<ClienteBean> clientes = new ArrayList<>();
     Connection conexao = Conexao.obterConexao();
     if(conexao != null)       {
     String sql = "SELECT nome FROM clientes;";
     try{
         Statement statement = conexao.createStatement();
         statement.execute(sql);
         ResultSet resultSet = statement.getResultSet();
         while(resultSet.next()){
             ClienteBean cliente = new ClienteBean();
             cliente.setNome(resultSet.getString("nome"));
             clientes.add(cliente);
         }
     }catch(SQLException e){
       e.printStackTrace();
     }finally{
         Conexao.fecharConexao();
     }       
         
     }
     return clientes;
            
       
    }
    public List<ClienteBean> obterClienteNome(String nome){
        List<ClienteBean>clientes = new ArrayList<>();
        Connection conexao = Conexao.obterConexao();
        if (conexao != null) {
            String sql = "SELECT * FROM clientes WHERE nome = '" + nome +"';";
            try {
                Statement statement = conexao.createStatement();
                statement.execute(sql);
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    ClienteBean cliente = new ClienteBean();
                    cliente.setNome(resultSet.getString("nome"));
                    cliente.setTelefone(resultSet.getString("telefone"));
                    cliente.setCpf(resultSet.getString("cpf"));
                    cliente.setCnpj(resultSet.getString("cnpj"));
                    cliente.setCep(resultSet.getString("cep"));
                    cliente.setBairro(resultSet.getString("bairro"));
                    cliente.setEndereco(resultSet.getString("endereco"));
                    cliente.setCidade(resultSet.getString("cidade"));
                    cliente.setNumero(resultSet.getInt("numero"));
                    cliente.setEmail(resultSet.getString("email"));
                    clientes.add(cliente);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Conexao.fecharConexao();
            }
        }
        return clientes;
   }
                     
    public int inserir(ClienteBean cliente){
        Connection conexao = Conexao.obterConexao();
        if (conexao != null) {
            String sql = "INSERT INTO clientes"
                    + "\n(nome,telefone,cpf,cnpj,cep,bairro,endereco,cidade,numero,email)"
                    + "\nVALUES(?,?,?,?,?,?,?,?,?,?);";
            try {
                PreparedStatement preparedStatement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

                preparedStatement.setString(1, cliente.getNome());
                preparedStatement.setString(2, cliente.getTelefone());
                preparedStatement.setString(3,cliente.getCpf());
                preparedStatement.setString(4,cliente.getCnpj());
                preparedStatement.setString(5,cliente.getCep());
                preparedStatement.setString(6,cliente.getBairro());
                preparedStatement.setString(7,cliente.getEndereco());
                preparedStatement.setString(8,cliente.getCidade());
                preparedStatement.setInt(9, cliente.getNumero());
                preparedStatement.setString(10,cliente.getEmail());
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
    public int apagar(int id){
      String sql = "DELETE FROM clientes WHERE id = ?";
        Connection conexao = Conexao.obterConexao();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return 0;  
    }

        /*
    public void Alterar(ProdutoBean cliente){
        
    }*/
    
}
