package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.Reglamento;

public class cervezaNegra extends Marca {

    public cervezaNegra(Double lupulo, String pais) {
        super(lupulo, pais);
        
    }

    @Override
    public Double graduacion() {
        return Math.min(Reglamento.getInstance().getGraduacionReglamentaria(), getLupulo()*2);
    }

    

}
