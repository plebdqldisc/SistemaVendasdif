/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author arthur.7923
 */
public class ModEndereco {
    private int id;
    private int id_cidade;
    private String rua;
    private String cep;
    private String num_resid;
    
    public ModEndereco () {
}

public ModEndereco(int id, int id_cidade, String rua, String cep, String num_resid) {
        this.id = id;
        this.id_cidade = id_cidade;
        this.rua = rua;
        this.cep = cep;
        this.num_resid = num_resid;
        
    }
    
    public int getid() {
        return id;
    }
    
    public void setid(int id) {
        this.id = id;
    }
    
    public int getid_cidade() {
        return id_cidade;
    }
    
    public void setid_cidade(int pId_cidade) {
        this.id_cidade = id_cidade;
    }
    
    public String getrua(){
        return rua;
    }
    
    public void setrua(String rua) {
        this.rua = rua;
    }
    
    public String getcep() {
       return cep;
    }
    
    public void setcep (String cep) {
        this.cep = cep;
    }
    
    public String getnum_resid(){
        return num_resid;
    }
    
    public void setnum_resid (String num_resid) {
        this.num_resid = num_resid;
    }
    

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", id_cidade=" + id_cidade + ", rua=" + rua + ", cep=" + cep + ", num_resid=" + num_resid + '}';
    }
}
