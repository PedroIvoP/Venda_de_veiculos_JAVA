package CONTROLLER;

import MODEL.Cliente;
import MODEL.Veiculo;
import MODEL.Venda;
import MODEL.Vendedor;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ControllerVenda {

    public static void Cadastro(ArrayList<Veiculo> veiculo, ArrayList<Cliente> cliente,
            ArrayList<Vendedor> vendedor, ArrayList<Venda> venda){
        
        Scanner recebe = new Scanner(System.in);
        
        //Iniciando as variáveis
        Cliente CpfClienteVenda = null;
        Veiculo VeiculoVenda = null;
        Vendedor CpfVendedorVenda = null;
        
        int cont = 0;
        
        //Coleta de dados
        System.out.print("\nCPF do cliente (123.456.789-10): ");
        String cpfCliente = recebe.nextLine();
        
        System.out.print("Chassi do veículo: ");
        String chassi = recebe.nextLine();
        
        System.out.print("CPF do vendedor (123.456.789-10): ");
        String cpfVendedor = recebe.nextLine();
        
        
        //Validação dos dados coletados
        for(Cliente c : cliente){
            
            if(c.getCpf().equalsIgnoreCase(cpfCliente)){
                
                CpfClienteVenda = c;
                cont++;
            }
        }
        
        for(Veiculo v : veiculo){
            
            if(v.getChassi().equalsIgnoreCase(chassi)){
                
                VeiculoVenda = v;
                cont++;
            }
        }
        
        
        for(Vendedor vend : vendedor){
            
            if(vend.getCpf().equalsIgnoreCase(cpfVendedor)){
                
                CpfVendedorVenda = vend;
                cont++;
            }
        }
        
        
        if(cont < 3){
            
            System.out.println("\n-------------------------------------------------------------");
            System.out.println("    VENDA NÃO CADASTRADA, VERIFIQUE OS DADOS INSERIDOS!");
            System.out.println("-------------------------------------------------------------\n");
        }else{
            
            venda.add(new Venda(VeiculoVenda, CpfClienteVenda, CpfVendedorVenda));
            
            System.out.println("\n---------------------------------------------------------");
            System.out.println("                VENDA CADASTRADA COM SUCESSO!              ");
            System.out.println("---------------------------------------------------------\n");
        }
    }
    
    
    private static void Imprime(Venda v){
        
        System.out.println("\nNome do Cliente: " + v.getCliente().getNome());
        System.out.println("Modelo do Veículo: " + v.getVeiculo().getModelo());
        System.out.println("Preço do Veículo: R$" + v.getVeiculo().getPreco());
        System.out.println("Nome do Vendedor: " + v.getVendedor().getNome());
        System.out.println("*********************************************************");
        
    }
    
    
    public static void RelatorioVendas(ArrayList<Venda> venda){
        
        if(venda.isEmpty()){
            
            System.out.println("\n-------------------------------");
            System.out.println("    NENHUMA VENDA CADASTRADA!");
            System.out.println("-------------------------------\n");
        }else{
            
            System.out.println("\n-------------------------------");
            System.out.println("        RELATÓRIO DE VENDAS");
            System.out.println("-------------------------------\n");
            
            for(Venda v : venda){
                
                Imprime(v);
            }
            
            ControllerMenu.Rodape();
            
            
        }
    }
}
