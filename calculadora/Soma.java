package calculadora;

public class Soma implements Operacao{
    
@Override
  public double calcular(DadosOperacao dados ){
    return dados.getOperando1() + dados.getOperando2();
 }
}

