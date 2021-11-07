package CONTROLLER;

import MODEL.Veiculo;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ControllerVeiculo {

    public static void Cadastro(ArrayList<Veiculo> veiculo) {

        Scanner recebe = new Scanner(System.in);

        boolean cadastroExiste = false;

        //Coleta de dados
        System.out.print("\nFabricante: ");
        String fabricante = recebe.nextLine();

        System.out.print("Modelo: ");
        String modelo = recebe.nextLine();

        System.out.print("Chassi: ");
        String chassi = recebe.nextLine();

        System.out.print("Preco: R$");
        double preco = recebe.nextDouble();

        recebe.nextLine();

        System.out.print("Ano: ");
        int ano = recebe.nextInt();

        //Validacao do Chassi
        for (Veiculo v : veiculo) {

            if (v.getChassi().equalsIgnoreCase(chassi)) {
                cadastroExiste = true;
            }
        }

        if (cadastroExiste) {

            System.out.println("\n---------------------------");
            System.out.println("     CHASSI JÁ CADASTADO     ");
            System.out.println("---------------------------\n");
        } else {

            veiculo.add(new Veiculo(chassi, fabricante, modelo, ano, preco));

            System.out.println("\n---------------------------------------------------------");
            System.out.println("              VEICULO CADASTRADO COM SUCESSO!              ");
            System.out.println("---------------------------------------------------------\n");
        }
    }

    private static void Imprime(Veiculo v) {

        System.out.println("\nFabricante: " + v.getFabricante());
        System.out.println("Modelo: " + v.getModelo());
        System.out.println("Chassi: " + v.getChassi());
        System.out.println("Ano: " + v.getAno());
        System.out.println("Preço: R$" + v.getPreco());
        System.out.println("**************************************************************");
    }

    public static void ExibeOrdenado(ArrayList<Veiculo> veiculo) {

        if (veiculo.isEmpty()) {

            System.out.println("\n---------------------------------");
            System.out.println("     NENHUM VEÍCULO CADASTRADO     ");
            System.out.println("---------------------------------\n");
        } else {

            for (int i = 0; i < veiculo.size(); i++) {
                for (int j = 1; j < veiculo.size(); j++) {

                    if (veiculo.get(j).getAno() > veiculo.get(j - 1).getAno()) {

                        Veiculo aux = veiculo.get(j);
                        veiculo.set(j, veiculo.get(j - 1));
                        veiculo.set(j - 1, aux);
                    }

                }
            }

            System.out.println("\n---------------------------------------------------------------");
            System.out.println("     RELATÓRIO DE VEÍCULOS POR ANO (MAIS NOVO P/ MAIS VELHO)     ");
            System.out.println("---------------------------------------------------------------\n");

            for (Veiculo v : veiculo) {

                Imprime(v);

            }

            ControllerMenu.Rodape();
        }
    }

    public static void ExibeValorMedioMaisAno(ArrayList<Veiculo> veiculo, int ano) {

        if (veiculo.isEmpty()) {

            System.out.println("\n---------------------------------");
            System.out.println("     NENHUM VEÍCULO CADASTRADO     ");
            System.out.println("---------------------------------\n");
        } else {

            int contador = 0;
            double somatorio = 0;

            for (int i = 0; i < veiculo.size(); i++) {

                if (LocalDate.now().getYear() - veiculo.get(i).getAno() > ano) {

                    somatorio += veiculo.get(i).getPreco();

                    contador++;
                }

            }

            if (contador == 0) {

                System.out.println("\n--------------------------------------------------");
                System.out.println("    NENHUM VEÍCULO COM MAIS DE " + ano + " ANOS CADASTRADO    ");
                System.out.println("--------------------------------------------------\n");
            } else {

                System.out.println("\n--------------------------------------------------");
                System.out.println("     VALOR MÉDIO DE VEÍCULOS COM MAIS DE " + ano + " ANOS     ");
                System.out.println("--------------------------------------------------\n");
                
                System.out.println("Valor médio: R$" + (somatorio/contador));

                System.out.println("\n-------------------------------");
                Calendar c = Calendar.getInstance();

                Date data = c.getTime();

                DateFormat FormatoDaData = DateFormat.getDateInstance(DateFormat.FULL);
                System.out.println(FormatoDaData.format(data));

                System.out.println("-------------------------------\n");
            }

        }
    }
    
    
}
