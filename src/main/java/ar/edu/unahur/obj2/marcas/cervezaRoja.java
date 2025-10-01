package ar.edu.unahur.obj2.marcas;

public class cervezaRoja extends cervezaNegra {

    public cervezaRoja(Double lupulo, String pais) {
        super(lupulo, pais);
    }

    @Override
    public Double graduacion() {
        return super.graduacion()*1.25;
    }

    

   

}
