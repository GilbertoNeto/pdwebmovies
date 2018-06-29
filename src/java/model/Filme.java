/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author alexs
 */

@Entity
public class Filme implements Serializable {
  
         private static final long serialVersionUID = -6580012241620579129L;
  
         @Id @GeneratedValue
         private int id;
  
         private String titulo;
  
         private String descricao;
  
         private int preco;
  
         //Essa anotação indica que o atributo não é persistente
         @Transient
         private int runtimeId;
  
  
         public Filme() {}
  
         //getters e setters dos atributos
  
         public int getId() {
                   return this.id;
         }
  
         public void setId(int id) {
                   this.id = id;
         }
  
         public String getTitulo() {
                   return this.titulo;
         }
  
         public void setTitulo(String titulo) {
                   this.titulo = titulo;
         }
  
         public String getDescricao() {
                   return this.descricao;
         }
  
         public void setDescricao(String descricao) {
                   this.descricao = descricao;
         }
  
         public int getPreco() {
                   return this.preco;
         }
  
         public void setPreco(int preco) {
                   this.preco = preco;
         }
  
         public int getRuntimeId() {
                   return this.runtimeId;
         }
  
         public void setRuntimeId(int runtimeId) {
                   this.runtimeId = runtimeId;
         }
  
}
