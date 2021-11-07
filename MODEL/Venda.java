package MODEL;

public class Venda {
    
    private Veiculo veiculo;
    private Cliente cliente;
    private Vendedor vendedor;

    public Venda() {
    }
    

    public Venda(Veiculo veiculo, Cliente cliente, Vendedor vendedor) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
}
