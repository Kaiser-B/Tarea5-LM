public class Cliente {
    private boolean esVip;
    private String nombre;
    private int id;

    public Cliente(boolean vip, String nombre, int id) {
        this.esVip = vip;
        this.nombre = nombre;
        this.id = id;
    }

    public boolean isEsVip() {
        return esVip;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }
}
