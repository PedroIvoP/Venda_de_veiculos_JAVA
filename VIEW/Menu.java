package VIEW;

import CONTROLLER.ControllerCliente;
import MODEL.Veiculo;
import MODEL.Cliente;
import MODEL.Venda;
import MODEL.Vendedor;
import java.util.ArrayList;
import java.util.Scanner;
import CONTROLLER.ControllerMenu;
import CONTROLLER.ControllerVenda;
import CONTROLLER.ControllerVendedor;
import CONTROLLER.ControllerVeiculo;

public class Menu {

    private static Scanner recebe = new Scanner(System.in);
    private static int opcao;

    public static void MenuPrincipal(ArrayList<Veiculo> veiculo, ArrayList<Cliente> cliente,
            ArrayList<Vendedor> vendedor, ArrayList<Venda> venda) {

        while (0 == 0) {

            System.out.println("\n===============================================");
            System.out.println("                    MENU PRINCIPAL               ");
            System.out.println("===============================================\n");
            System.out.println("1 - CADASTRAR ");
            System.out.println("2 - CONSULTAR ");
            System.out.println("3 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:
                    MenuCadastro(veiculo, cliente, vendedor, venda);
                    break;

                case 2:
                    MenuConsulta(veiculo, cliente, vendedor, venda);
                    break;

                case 3:
                    ControllerMenu.Sair();
                    break;

                default:
                    ControllerMenu.OpInvalida();
                    break;

            }
        }

    }

    private static void MenuCadastro(ArrayList<Veiculo> veiculo, ArrayList<Cliente> cliente,
            ArrayList<Vendedor> vendedor, ArrayList<Venda> venda) {

        while (0 == 0) {

            System.out.println("\n===============================================");
            System.out.println("                  MENU DE CADASTRO               ");
            System.out.println("===============================================\n");
            System.out.println("1 - VENDA ");
            System.out.println("2 - CLIENTE ");
            System.out.println("3 - VEICULO ");
            System.out.println("4 - VENDEDOR");
            System.out.println("5 - **VOLTAR P/ MENU PRINCIPAL**");
            System.out.println("6 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:
                    ControllerVenda.Cadastro(veiculo, cliente, vendedor, venda);
                    break;

                case 2:
                    ControllerCliente.Cadastro(cliente);
                    break;

                case 3:
                    ControllerVeiculo.Cadastro(veiculo);
                    break;

                case 4:
                    ControllerVendedor.Cadastro(vendedor);
                    break;

                case 5:
                    MenuPrincipal(veiculo, cliente, vendedor, venda);
                    break;

                case 6:
                    ControllerMenu.Sair();
                    break;

                default:
                    ControllerMenu.OpInvalida();
                    break;

            }
        }
    }

    private static void MenuConsulta(ArrayList<Veiculo> veiculo, ArrayList<Cliente> cliente,
            ArrayList<Vendedor> vendedor, ArrayList<Venda> venda) {

        while (0 == 0) {

            System.out.println("\n===============================================");
            System.out.println("                  MENU DE CONSULTA               ");
            System.out.println("===============================================\n");
            System.out.println("1 - VEÍCULOS POR ANO (MAIS NOVO P/ MAIS VELHO) ");
            System.out.println("2 - VALOR MÉDIO DE VEÍCULOS COM MAIS DE 5 ANOS ");
            System.out.println("3 - IDADE MÉDIA DOS CLIENTES ");
            System.out.println("4 - VENDAS ");
            System.out.println("5 - **VOLTAR P/ MENU PRINCIPAL**");
            System.out.println("6 - **SAIR** ");
            System.out.print("\nOpção escolhida: ");
            opcao = recebe.nextInt();

            switch (opcao) {

                case 1:
                    ControllerVeiculo.ExibeOrdenado(veiculo);
                    break;

                case 2:
                    ControllerVeiculo.ExibeValorMedioMaisAno(veiculo, 5);
                    break;

                case 3:
                    ControllerCliente.IdadeMedia(cliente);
                    break;

                case 4:
                    ControllerVenda.RelatorioVendas(venda);
                    break;

                case 5:
                    MenuPrincipal(veiculo, cliente, vendedor, venda);
                    break;

                case 6:
                    ControllerMenu.Sair();
                    break;

                default:
                    ControllerMenu.OpInvalida();
                    break;

            }
        }
    }

}
