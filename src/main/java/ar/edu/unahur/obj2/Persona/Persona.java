package ar.edu.unahur.obj2.Persona;

import java.util.List;

import ar.edu.unahur.obj2.jarras.Jarra;

public class Persona {

    private Double peso;
    private List<Jarra> jarrasCompradas;
    private Boolean gustaMusicaTradicional;
    private Integer nivelAguante;
    
    public Persona(Double peso, Boolean gustaMusicaTradicional, Integer nivelAguante) {
        this.peso = peso;
        this.gustaMusicaTradicional = gustaMusicaTradicional;
        this.nivelAguante = nivelAguante;
    }

    public Double getPeso() {
        return peso;
    }

    public List<Jarra> getJarrasCompradas() {
        return jarrasCompradas;
    }

    public Boolean getGustaMusicaTradicional() {
        return gustaMusicaTradicional;
    }

    public Integer getNivelAguante() {
        return nivelAguante;
    }

    public Boolean estaEbria(){
        return alcholIngerido()*getPeso() > nivelAguante;
    }

    public Double alcholIngerido(){
        return jarrasCompradas.stream().mapToDouble(j -> j.cantidadAlcohol()).sum();
    }
    
}


/*
 
De cada persona se sabe su peso, las jarras de cerveza que compró hasta el momento, 
si le gusta escuchar música tradicional o no, y su nivel de aguante, que es un número.
 Una persona está ebria si la cantidad de alcohol que ingirió 
 multiplicado por su peso supera su aguante. 
 
Además, de cada persona interesará saber qué marcas de cerveza le gustan. 
Se sabe que a los belgas les gusta solamente la cerveza con más de 4 gramos de lúpulo por litro,
 a los checos les gustan las cervezas de más de 8 % de graduación 
 (ver abajo qué es la graduación de la cerveza), a los alemanes les gustan todas.


 */