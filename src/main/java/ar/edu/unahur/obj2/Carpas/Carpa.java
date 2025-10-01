package ar.edu.unahur.obj2.Carpas;

import ar.edu.unahur.obj2.jarras.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;

public class Carpa {
    private final Boolean tieneBanda;
    private final Marca cerveza;
    private final Integer limitePersonas;
    private Jarra jarra;

    public Carpa(Boolean tieneBanda, Marca cerveza, Integer limitePersonas, Jarra jarra) {
        this.tieneBanda = tieneBanda;
        this.cerveza = cerveza;
        this.limitePersonas = limitePersonas;
        this.jarra = jarra;
    }

    public Boolean getTieneBanda() {
        return tieneBanda;
    }

    public Marca getCerveza() {
        return cerveza;
    }

    public Integer getLimitePersonas() {
        return limitePersonas;
    }

    public Jarra getJarra() {
        return jarra;
    }
    
    


}

/*
 * un límite de gente admitida, 
* algunas tienen una banda para tocar música tradicional (esto debe indicarse para cada una),
* y por supuesto que todas venden jarras de cerveza. 

Cada carpa vende cerveza de únicamente una marca (que depende de cada carpa).
 */