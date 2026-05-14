public class Alumno {
    private int clave;
    private String nombre;
    private Double calificacion;

    public Alumno(int clave, String nombre, Double calificacion)
    {
        this.clave = clave;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return clave + "," + nombre + "," + calificacion;   
    }  
}
