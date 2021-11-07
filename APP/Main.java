package APP;

import MODEL.Cliente;
import MODEL.Veiculo;
import MODEL.Venda;
import MODEL.Vendedor;
import java.util.ArrayList;
import VIEW.Menu;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Cliente> Cliente = new ArrayList<>();
        ArrayList<Veiculo> Veiculo = new ArrayList<>();
        ArrayList<Venda> Venda = new ArrayList<>();
        ArrayList<Vendedor> Vendedor = new ArrayList<>();
        
        Menu.MenuPrincipal(Veiculo, Cliente, Vendedor, Venda);
    }
    
}
