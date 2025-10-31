package calculadora;

public class Subtracao implements Operacao {
 @Override
 public double calcular(DadosOperacao dados){
   return dados.getOperando1() - dados.getOperando2();
 }
} 
    

