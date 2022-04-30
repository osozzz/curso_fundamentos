public class Ubicaciones {
    private String nombree;
    private float distanciaAlexandria;
    private int cantidadZombies;
    public Ubicaciones(String nombree, float distanciaAlexandria, int cantidadZombies) {
        this.nombree = nombree;
        this.distanciaAlexandria = distanciaAlexandria;
        this.cantidadZombies = cantidadZombies;
    }
    public float getDistanciaAlexandria() {
        return distanciaAlexandria;
    }
    public int getCantidadZombies() {
        return cantidadZombies;
    }

    public String getNombree() {
        return nombree;
    }

    public void setCantidadZombies(int cantidadZombies) {
        this.cantidadZombies = cantidadZombies;
    }

    public void setDistanciaAlexandria(float distanciaAlexandria) {
        this.distanciaAlexandria = distanciaAlexandria;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    public String toString() {
        return "Ubicaciones{" +
                "Nombre ='" + nombree + '\'' +
                ", Distancia a Alexandria =" + distanciaAlexandria +
                ", Cantidad de Zombies =" + cantidadZombies +
                '}';
    }
    public int compareTo(Ubicaciones otroObjeto) {
        if (this.distanciaAlexandria == otroObjeto.getDistanciaAlexandria()) {
            return 0;
        } else if (this.distanciaAlexandria > otroObjeto.getDistanciaAlexandria()) {
            return 1;
        } else {
            return -1;
        }
    }
}
