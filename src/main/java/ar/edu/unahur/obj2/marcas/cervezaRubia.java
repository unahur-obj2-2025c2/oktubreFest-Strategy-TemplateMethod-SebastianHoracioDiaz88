package ar.edu.unahur.obj2.marcas;

public class cervezaRubia extends Marca {

    private Double graduacion;

    public cervezaRubia(Double lupulo, String pais, Double graduacion) {
        super(lupulo, pais);
        this.graduacion = graduacion;
    }

    @Override
    public Double graduacion() {
        return graduacion;
    }

}
