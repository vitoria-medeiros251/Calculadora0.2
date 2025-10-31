package calculadora;

public class Divisao implements Operacao {
    @Override
 public double calcular(DadosOperacao dados) {
    return dados.getOperando2() * dados.getOperando2();

 }
}

