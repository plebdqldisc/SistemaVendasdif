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
public class DaoEstado extends BancoDeDadosMySql{
    private String sql;
    
        public Boolean inserir(int id, int id_pais, String nome, String uf){
      try{
          sql = "INSERT INTO ESTADO (ID, ID_PAIS, NOME, UF) VALUES (?, ?, ?, ?)";
          
          setStatement(getConexao().prepareStatement(sql));
          
          getStatement().setInt(1, id);
          
          getStatement().setInt(2, id_pais);
          
          getStatement().setString(3, nome);
          
          getStatement().setString(4, uf);
          
          getStatement().executeUpdate();
          
          return true;
      }catch(Exception e){
          System.out.println(e.getMessage());
          return false;
      }
  }
    public Boolean alterar(int id, int novoId_pais, String novoNome, String novoUf){
        try{
            sql = "UPDATE ESTADO SET ID_PAIS = ?, NOME = ?, UF = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(4, id);
            getStatement().setInt(1, novoId_pais);
            getStatement().setString(2, novoNome);
            getStatement().setString(3, novoUf);
            
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM ESTADO WHERE ID = ?";
            
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
                " SELECT                    " +
                "   EST.ID,                 " +
                "   PA.NOME AS PAIS,        " +
                "   EST.NOME AS ESTADO,     " +
                "   EST.UF                  " +
                " FROM                      " +
                "   ESTADO EST              " +
                " JOIN PAIS PA ON           " +
                "   PA.ID = EST.ID_PAIS     " ;
            
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
                " SELECT                    " +
                "   EST.ID,                 " +
                "   PA.NOME AS PAIS,        " +
                "   EST.NOME AS ESTADO,     " +
                "   EST.UF                  " +
                " FROM                      " +
                "   ESTADO EST              " +
                " JOIN PAIS PA ON           " +
                "   PA.ID = EST.ID_PAIS     " +
                " WHERE                     " +
                "   EST.ID = ?              " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome(String nome){
        try{
            sql = 
                " SELECT                    " +
                "   EST.ID,                 " +
                "   PA.NOME AS PAIS,        " +
                "   EST.NOME AS ESTADO,     " +
                "   EST.UF                  " +
                " FROM                      " +
                "   ESTADO EST              " +
                " JOIN PAIS PA ON           " +
                "   PA.ID = EST.ID_PAIS     " +
                " WHERE                     " +
                "   EST.NOME LIKE ?         " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPais(String pais){
        try{
            sql = 
                " SELECT                    " +
                "   EST.ID,                 " +
                "   PA.NOME AS PAIS,        " +
                "   EST.NOME AS ESTADO,     " +
                "   EST.UF                  " +
                " FROM                      " +
                "   ESTADO EST              " +
                " JOIN PAIS PA ON           " +
                "   PA.ID = EST.ID_PAIS     " +
                " WHERE                     " +
                "   PA.NOME LIKE ?             " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, pais + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorUf(String estado){
        try{
            sql = 
                " SELECT                    " +
                "   EST.ID,                 " +
                "   PA.NOME AS PAIS,        " +
                "   EST.NOME AS ESTADO,     " +
                "   EST.UF                  " +
                " FROM                      " +
                "   ESTADO EST              " +
                " JOIN PAIS PA ON           " +
                "   PA.ID = EST.ID_PAIS     " +
                " WHERE                     " +
                "   EST.UF LIKE ?           " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, estado + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM ESTADO";
            
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
