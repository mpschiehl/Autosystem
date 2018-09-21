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
     /*                 
    public int inserir(ProdutoBean cliente){
        
    }
    public int apagar(ProdutoBean cliente){
        
    }
*/
        /*
    public void Alterar(ProdutoBean cliente){
        
    }*/
    
}
