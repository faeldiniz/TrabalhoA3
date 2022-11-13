import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        String menu =
                "\n\n1. Cadastro de Mesa\n"
                        + "2. Remoção de Mesa\n"
                        + "3. Busca Mesa pelo número\n"
                        + "4. Busca Mesa pela capacidade de clientes\n"
                        + "5. Relatório de mesas (com todos os dados de todas as mesas)\n\n"
                        + "0. Sair\n\n";
        System.out.println(menu);
        Scanner leOpcao = new Scanner(System.in);
        int opcao = leOpcao.nextInt();
        while(opcao !=0){
            switch (opcao) {
                case 1: {
                    System.out.println(1);
                    break;
                }
                case 2: {
                    System.out.println(2);
                    break;
                }
                case 3: {
                    System.out.println(3);
                    break;
                }
                case 4: {
                    System.out.println(4);
                    break;
                }
                case 5: {
                    System.out.println(5);
                    break;
                }
                default: {

                    break;
                }
            }
            System.out.println(menu);
            opcao = leOpcao.nextInt();
        }
    }
}