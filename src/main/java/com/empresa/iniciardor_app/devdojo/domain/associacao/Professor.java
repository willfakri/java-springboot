package com.empresa.iniciardor_app.devdojo.domain.associacao;

public class Professor {

    private Seminario[] seminarios;

    public Seminario[] getSeminarios(){
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }
}
