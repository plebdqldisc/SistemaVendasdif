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
public class DaoCliente extends BancoDeDadosMySql{
    String sql;
    
    public Boolean inserir(int id, int id_pessoa){
        try{
            sql = "INSERT INTO CLIENTE (ID, ID_PESSOA) VALUES (?, ?)";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, id_pessoa);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM CLIENTE WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1,id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet listarporId_pessoa (int Id_pessoa) {
        try{
             sql = 
                " SELECT                            " +
                "   ID AS ID,                       " +
                "   ID_PESSOA AS CIDADE             " +
                " FROM                              " +
                "   CLIENTE                         " +
                " WHERE ID_PESSOA = ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, Id_pessoa);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM CLIENTE";
            
            setStatement(getConexao().prepareStatement(sql));
            setResultado(getStatement().executeQuery());
            
            getResultado().next();
            
            id = getResultado().getInt(1);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         
        return id;
        }
}
