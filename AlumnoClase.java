public class AlumnoClase{
    private int clave;
    private String nombre;
    private double calificacion;

    public AlumnoClase(int clave, String nombre, double calificacion)    {
        this.clave = clave;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    @Override
    public String toString()    {
        return clave + ", " + nombre + ", " + calificacion;
    }
}
