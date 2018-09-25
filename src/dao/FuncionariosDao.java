/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.FuncionarioBean;
import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Márcio Pedro Schiehl
 */
public class FuncionariosDao {

    public int inserir(FuncionarioBean funcionario) {
        Connection conexao = Conexao.obterConexao();
        if (conexao != null) {
            String sql = "INSERT INTO funcionarios(nome,cpf,cep,bairro,endereco,cidade,numero,email,salario,data_admissao,cargo)values"
                    + "\nVALUES(?,?,?,?,?,?,?,?,?,?,?,?);";
            try {
                PreparedStatement preparedStatement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

                preparedStatement.setString(1, funcionario.getNome());
                preparedStatement.setString(2, funcionario.getCpf());
                preparedStatement.setString(3, funcionario.getCep());
                preparedStatement.setString(4, funcionario.getBairro());
                preparedStatement.setString(5, funcionario.getEndereco());
                preparedStatement.setString(6, funcionario.getCidade());
                preparedStatement.setInt(7, funcionario.getNumero());
                preparedStatement.setString(8, funcionario.getEmail());
                preparedStatement.setFloat(9, funcionario.getSalario());
                preparedStatement.setString(10, funcionario.getDataAdmissao());
                preparedStatement.setString(11, funcionario.getCargo());

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

}


