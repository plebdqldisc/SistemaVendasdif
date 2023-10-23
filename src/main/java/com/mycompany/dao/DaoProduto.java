/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getConexao;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getResultado;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getStatement;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setResultado;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setStatement;
import java.sql.ResultSet;

/**
 *
 * @author arthur.7923
 */
public class DaoProduto extends BancoDeDadosMySql{
    private String sql;
    
        public Boolean inserir(int id,  int id_categoria, int id_marca, String nome, String descricao, Double preco){
      try{
          sql = "INSERT INTO PRODUTO (id, id_categoria, id_marca, nome, descricao, preco) VALUES (?, ?, ?, ?, ?, ?)";
          
          setStatement(getConexao().prepareStatement(sql));
          
          getStatement().setInt(1, id);
          
          getStatement().setInt(2, id_categoria);
          
          getStatement().setInt(3, id_marca);
          
          getStatement().setString(4, nome);
          
          getStatement().setString(5, descricao);
          
          getStatement().setDouble(6, preco);
          
          getStatement().executeUpdate();
          
          return true;
      }catch(Exception e){
          System.out.println(e.getMessage());
          return false;
      }
  }
    public Boolean alterar(int id,  int Novoid_categoria, int Novoid_marca, String Novonome, String Novadescricao, Double Novopreco){
      try{
          sql = "UPDATE PRODUTO SET ID_CATEGORIA = ?, ID_MARCA = ?, NOME = ?, DESCRICAO = ?, PRECO = ? WHERE ID = ?";
          
          setStatement(getConexao().prepareStatement(sql));
          
          getStatement().setInt(1, id);
          
          getStatement().setInt(2, Novoid_categoria);
          
          getStatement().setInt(3, Novoid_marca);
          
          getStatement().setString(4, Novonome);
          
          getStatement().setString(5, Novadescricao);
          
          getStatement().setDouble(6, Novopreco);
          
          getStatement().executeUpdate();
          
          return true;
      }catch(Exception e){
          System.out.println(e.getMessage());
          return false;
      }
  }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM PRODUTO WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet listarTodos(){
        try{
            sql = 
                " SELECT                        " +
                "   PRO.ID,                     " +
                "   CAT.NOME AS CATEGORIA,      " +
                "   MAR.NOME AS MARCA,          " +
                "   PRO.NOME,                   " +
                "   PRO.DESCRICAO,              " +    
                "   PRO.PRECO                   " +    
                " FROM                          " +
                "   PRODUTO PRO                 " +
                " JOIN CATEGORIA CAT ON         " +
                "   CAT.ID = PRO.ID_CATEGORIA   " +
                " JOIN MARCA MAR ON             " +    
                "   MAR.ID = PRO.ID_MARCA       " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorId(int id){
        try{
            sql = 
                " SELECT                        " +
                "   PRO.ID,                     " +
                "   CAT.NOME AS CATEGORIA,      " +
                "   MAR.NOME AS MARCA,          " +
                "   PRO.NOME,                   " +
                "   PRO.DESCRICAO,              " +    
                "   PRO.PRECO                   " +    
                " FROM                          " +
                "   PRODUTO PRO                 " +
                " JOIN CATEGORIA CAT ON         " +
                "   CAT.ID = PRO.ID_CATEGORIA   " +
                " JOIN MARCA MAR ON             " +    
                "   MAR.ID = PRO.ID_MARCA       " +    
                " WHERE                         " +
                "   PRO.ID = ?                  " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorCategoria(String categoria){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE C.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, categoria + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorMarca(String marca){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE M.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, marca + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome(String nome){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE P.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDescricao(String descricao){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE P.DESCRICAO LIKE ?          " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, descricao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoMaiorQue(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,        " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE P.PRECO > ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoMenorQue(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,        " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE P.PRECO < ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoIgualA(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,        " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE P.PRECO = ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM PRODUTO";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next(); //Move para o primeiro registro.
            
            id = getResultado().getInt(1); //Pega o valor retornado na consulta
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;
    }
}
