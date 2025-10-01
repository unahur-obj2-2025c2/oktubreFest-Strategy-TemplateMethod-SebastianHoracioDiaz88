package ar.edu.unahur.obj2.marcas;

public abstract class Marca {
    protected Double lupulo;
    private String pais;
    private Double graduacion;
    
    public Marca(Double lupulo, String pais) {
        this.lupulo = lupulo;
        this.pais = pais;
    }

    public Double getLupulo() {
        return lupulo;
    }

    public String getPais() {
        return pais;
    }

    public Double getGraduacion() {
        return graduacion;
    }

    public abstract Double graduacion();
        
}



/*
La graduación de una cerveza es su porcentaje de alcohol en volumen. 
P.ej. una cerveza de 10 % de graduación, tendrá 0.1 litro de alcohol por litro de cerveza: 
* Cada marca de cerveza rubia tiene una graduación distinta. 
* Por otro lado, la graduación de una marca de cerveza negra 
se calcula como el mínimo entre la graduación reglamentaria y el doble de su contenido de lúpulo. La graduación reglamentaria es mundial, o sea que es única para todas las marcas de cerveza negra del mundo; puede cambiar con el tiempo. 

 La cerveza roja se fabrica con procedimientos similares a la de la cerveza negra, 
 pero que concentran más el alcohol. Por lo tanto, 
 la graduación de una marca de cerveza roja se calcula 
 multiplicando el valor que correspondería a una cerveza negra con la misma configuración, 
 por 1.25.

En la fiesta, la cerveza se vende en **jarras**. 
De cada jarra de cerveza sabemos su capacidad en litros y de qué marca es.


*/