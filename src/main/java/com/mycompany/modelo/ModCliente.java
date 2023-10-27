/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author arthur.7923
 */
public class ModCliente {
    private int id;
    private int Id_pessoa;
    
    
    
    public ModCliente (int id, int id_pessoa){
        this.id = id;
        this.Id_pessoa = Id_pessoa;
        
    }
    
    public ModCliente() {
        
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId_pessoa() {
        return Id_pessoa;
    }
    
    public void setId_pessoa(int id_pessoa) {
        this.Id_pessoa = Id_pessoa;
    }
        
        @Override
        public String toString() {
        return "ModCliente{" + "id=" + id + ", Id_pessoa=" + Id_pessoa + '}';
    
    }
}
