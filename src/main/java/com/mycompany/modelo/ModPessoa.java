/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author arthur.7923
 */
public class ModPessoa {private int id;
    private int Id_endereco;
    private int Id_estadocivil;
    private String nome;
    private String sobrenome;
    private String genero;
    private String telefone;
    private String email;
    private String usuario;
    private String senha;


    public ModPessoa(int id, int Id_endereco, int Id_estadocivil, String nome, String sobrenome, String genero, String telefone, String email) {
        this.id = id;
        this.Id_endereco = Id_endereco;
        this.Id_estadocivil = Id_estadocivil;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.telefone = telefone;
        this.email = email;
    }

    public ModPessoa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEndereco() {
        return Id_endereco;
    }

    public void setIdEndereco(int Id_endereco) {
        this.Id_endereco = Id_endereco;
    }

    public int getIdEstadoCivil() {
        return Id_estadocivil;
    }

    public void setIdEstadoCivil(int Id_estadocivil) {
        this.Id_estadocivil = Id_estadocivil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ModPessoa{" + "id=" + id + ", Id_endereco=" + Id_endereco + ", Id_estadocivil=" + Id_estadocivil + ", nome=" + nome + ", sobrenome=" + sobrenome + ", genero=" + genero + ", telefone=" + telefone + ", email=" + email + '}';
    }
}