/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author arthur.7923
 */
public class ModProduto {
    private int id;
    private int id_categoria;
    private int id_marca;
    private String nome;
    private String descricao;
    private Double preco;
    
    public ModProduto () {
}

public ModProduto(int id, int id_categoria, int id_marca, String nome, String descricao, Double preco) {
        this.id = id;
        this.id_categoria = id_categoria;
        this.id_marca = id_marca;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        
    }
    
    public int getid() {
        return id;
    }
    
    public void setid(int id) {
        this.id = id;
    }
    
    public int getid_categoria() {
        return id_categoria;
    }
    
    public void setid_categoria(int pId_categoria) {
        this.id_categoria = id_categoria;
    }
    
    public int getid_marca() {
        return id_marca;
    }
    
    public void setid_marca(int pId_marca) {
        this.id_marca = id_marca;
    }
    
    public String getnome(){
        return nome;
    }
    
    public void setnome(String nome) {
        this.nome = nome;
    }
    
    public String getdescricao() {
       return descricao;
    }
    
    public void setdescricao (String descricao) {
        this.descricao = descricao;
    }
    
    public Double getpreco(){
        return preco;
    }
    
    public void setpreco (Double preco) {
        this.preco = preco;
    }
    

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", id_categoria=" + id_categoria + ", id_marca=" + id_marca + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + '}';
    }
}
