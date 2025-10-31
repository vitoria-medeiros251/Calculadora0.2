package calculadora;

public class Multiplicacao implements Operacao{
 @Override
 public double calcular(DadosOperacao dados){
   return dados.getOperando1() * dados.getOperando2();
 }
}

