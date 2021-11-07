package CONTROLLER;

import MODEL.Vendedor;
import java.util.ArrayList;
import java.util.Scanner;


public class ControllerVendedor {
    
        public static void Cadastro(ArrayList<Vendedor> vendedor){
        
        Scanner recebe = new Scanner(System.in);
        boolean cadastroExiste = false;
        
        //Coleta de dados
        System.out.print("\nNome: ");
        String nome = recebe.nextLine();
        
        System.out.print("CPF (123.456.789-10): ");
        String cpf = recebe.nextLine();
        
        System.out.print("Telefone ((21) 98765-4321): ");
        String telefone = recebe.nextLine();
        
        System.out.print("Data de Nascimento (dd/mm/aaaa): ");
        String nascimento = recebe.nextLine();
        
        
        //Validacao do CPF
        for(Vendedor v : vendedor){
            
            if(v.getCpf().equalsIgnoreCase(cpf)){
                cadastroExiste = true;
            }
        }
        
        if(cadastroExiste){
            
            System.out.println("\n------------------------");
            System.out.println("     CPF JÁ CADASTADO     ");
            System.out.println("------------------------\n");
        }else{
            
            vendedor.add(new Vendedor(cpf, nome, telefone, nascimento));
            
            System.out.println("\n---------------------------------------------------------");
            System.out.println("             VENDEDOR CADASTRADO COM SUCESSO!              ");
            System.out.println("---------------------------------------------------------\n");
        }
    }
}
    

