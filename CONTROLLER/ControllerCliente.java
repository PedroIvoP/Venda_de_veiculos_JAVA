package CONTROLLER;

import MODEL.Cliente;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ControllerCliente {
    
    
    public static void Cadastro(ArrayList<Cliente> cliente){
        
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
        for(Cliente c : cliente){
            
            if(c.getCpf().equalsIgnoreCase(cpf)){
                cadastroExiste = true;
            }
        }
        
        if(cadastroExiste){
            
            System.out.println("\n------------------------");
            System.out.println("     CPF JÁ CADASTADO     ");
            System.out.println("------------------------\n");
        }else{
            
            cliente.add(new Cliente(cpf, nome, telefone, nascimento));
            
            System.out.println("\n---------------------------------------------------------");
            System.out.println("              CLIENTE CADASTRADO COM SUCESSO!              ");
            System.out.println("---------------------------------------------------------\n");
        }
    }
    
    private static int Idade(Cliente c){
        
        Period periodo = Period.between(c.getNascimento(), LocalDate.now());
        
        int idade = periodo.getYears();
        
        return idade;
    }
    
    public static void IdadeMedia(ArrayList<Cliente> cliente){
        
        int totalIdade = 0;
        
        for(Cliente c : cliente){
            
            totalIdade += Idade(c);
        }
        
        if(cliente.isEmpty()){
            
            System.out.println("\n-------------------------------");
            System.out.println("    NENHUM CLIENTE CADASTRADO!");
            System.out.println("-------------------------------\n");
        }else{
            
            System.out.println("\n-------------------------------");
            System.out.println("   MÉDIA DE IDADE DOS CLIENTES");
            System.out.println("-------------------------------\n");
            
            System.out.println(totalIdade/cliente.size() + " anos");
            
            
            ControllerMenu.Rodape();
            
        }
    }
}
