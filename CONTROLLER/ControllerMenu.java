package CONTROLLER;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class ControllerMenu {
    
    public static void Sair(){
        
        System.out.println("\n----------------------------------------");
        System.out.println("            SAINDO DO SISTEMA...");
        System.out.println("----------------------------------------\n");
        
        System.exit(0);
    }
    
    public static void OpInvalida(){
        
        System.out.println("\n----------------------------------------");
        System.out.println("     OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
        System.out.println("----------------------------------------\n");
        
    }
    
    public static void Rodape(){
        
        System.out.println("\n---------------------------------------------------------");
            Calendar c = Calendar.getInstance();

            Date data = c.getTime();

            DateFormat FormatoDaData = DateFormat.getDateInstance(DateFormat.FULL);
            System.out.println(FormatoDaData.format(data));
                    
            System.out.println("---------------------------------------------------------\n");
    }
}
