/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author renato
 */
public class Usuario {
    
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String senha;
    
    public Usuario(){
    }
    
    public Usuario(int id, String nome, String cpf, String endereco, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.senha = senha;
    }
}
