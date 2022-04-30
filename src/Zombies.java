public class Zombies {
    private String nombre;
    private int salud;
    private int fecha;
    private String tipoDeSangre;
    public Zombies(String nombre, int salud, int fecha, String tipoDeSangre) {
        this.nombre = nombre;
        this.tipoDeSangre = tipoDeSangre;
        this.fecha = fecha;
        this.salud = salud;
    }
    public int getFecha() {
        return fecha;
    }
    public int getSalud() {
        return salud;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public String toString() {
        return "Zombies{" +
                "Nombre = '" + nombre + '\'' +
                ", Salud = " + salud +
                ", Fecha de nacimiento = " + fecha +
                ", Tipo De Sangre = '" + tipoDeSangre + '\'' +
                '}';
    }
}
