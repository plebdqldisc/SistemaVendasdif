/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import java.sql.ResultSet;

/**
 *
 * @author arthur.7923
 */
public class DaoEstadoCivil extends BancoDeDadosMySql{
    String sql;
    
    
    public Boolean inserir(int id,  String estado){
      try{
          sql = "INSERT INTO ESTADO_CIVIL (id,  nome) VALUES (?, ?)";
          
          setStatement(getConexao().prepareStatement(sql));
          
          getStatement().setInt(1, id);
          
          getStatement().setString(2, estado);
          
          getStatement().executeUpdate();
          
          return true;
      }catch(Exception e){
          System.out.println(e.getMessage());
          return false;
      }
  }
    public Boolean alterar(int id,  String Novoestado){
      try{
          sql = "UPDATE ESTADO_CIVIL SET NOME = ? WHERE ID = ?";
          
          setStatement(getConexao().prepareStatement(sql));
          
          getStatement().setInt(1, id);
          
          getStatement().setString(2, Novoestado);
          
          
          getStatement().executeUpdate();
          
          return true;
      }catch(Exception e){
          System.out.println(e.getMessage());
          return false;
      }
  }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM ESTADO_CIVIL WHERE ID = ?";
            
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
            sql = "SELECT ID, NOME FROM ESTADO_CIVIL";
            
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
                "SELECT ID, NOME FROM ESTADO_CIVIL WHERE ID = ?";
            
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
                "SELECT ID, NOME FROM ESTADO_CIVIL WHERE NOME LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
        
        
    }
    
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM ESTADO_CIVIL";
            
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
    

