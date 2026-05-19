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

        @Override
    public boolean equals(Object obj){
        if ( obj == null || this.getClass() != obj.getClass())    {
            return false;
        }
        AlumnoClase alumno = (AlumnoClase) obj;
        if(this.clave == alumno.clave)    {
            return true;
        }
        return false;
    }

    public int getClave() {
        return clave;
        }
}