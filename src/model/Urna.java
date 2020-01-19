/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author i3
 */
public class Urna {
    private int id_urna;
    private Date datahora;
    private int id_imagem;
    private int id_aluno;
    private int voto;

    public int getId_urna() {
        return id_urna;
    }

    public void setId_urna(int id_urna) {
        this.id_urna = id_urna;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

    public int getId_imagem() {
        return id_imagem;
    }

    public void setId_imagem(int id_imagem) {
        this.id_imagem = id_imagem;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

   
    
}
