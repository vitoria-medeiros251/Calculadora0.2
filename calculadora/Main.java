package calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Digite o primeiro operando: ");
            double a = sc.nextDouble();
            System.out.print("Digite o segundo operando: ");
            double b = sc.nextDouble();

            System.out.println("Escolha a operação: 1=+ 2=- 3=* 4=/");
            int opc = sc.nextInt();

            DadosOperacao dados = new DadosOperacao(a, b );
            dados.getOperando1();
            dados.setOperando1(a);

           Operacao op;
            switch (opc) {
                case 1: op = new Soma(); break; // polimorfismo em ação 
                case 2: op = new Subtracao(); break;
                case 3: op = new Multiplicacao(); break;
                case 4: op = new Divisao(); break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            double resultado = op.calcular(dados);
            System.out.println("Resultado: " + resultado);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Digite números.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}




        