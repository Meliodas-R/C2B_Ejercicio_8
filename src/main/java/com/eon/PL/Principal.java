package com.eon.PL;

import com.eon.Entities.Araña;
import com.eon.Entities.Gato;
import com.eon.Entities.Pez;

public class Principal {

    public static void main(String[] args) {
        
        Araña araña = new Araña();
        Gato gato = new Gato();
        Pez pez = new Pez();
        
        araña.caminar();
        gato.caminar();
        pez.caminar();
    }
}
