/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author arthur.7923
 */
public class ModEstado {
    private int id;
    private int id_pais;
    private String nome;
    private String uf;
    
    public ModEstado () {
}

public ModEstado(int id, int id_pais, String nome, String uf) {
        this.id = id;
        this.id_pais = id_pais;
        this.nome = nome;
        this.uf = uf;
        
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId_pais() {
        return id_pais;
    }
    
    public void setId_pais(int id) {
        this.id_pais = id_pais;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getUf() {
       return uf;
    }
    
    public void setUf (String uf) {
        this.uf = uf;
    }
    

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", " + "id_pais=" + id_pais + ", nome=" + nome + ", " + "uf=" + uf + '}';
    }
}

