/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.lp3.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author alissoncouto
 */
@Entity(name="tbAluno")
public class Aluno {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer ra;
    String nome;

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno() {}
    
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }
    
}
