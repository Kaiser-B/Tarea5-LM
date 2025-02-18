public class Pedido {

    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void procesarPedido(double total) {
        if (total > 100){
            double descuento = calcularDescuento();
            double precioFinal = total - descuento;
            System.out.println("Pedido aprobado. Total: " + precioFinal + " (descuento aplicado: " + descuento + ")");
        } else {
            System.out.println("Pedido aprobado. Total: " + total);
        }
    }

    public double calcularDescuento(){

        return cliente.isEsVip() ? 0.15 : 0.10;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
