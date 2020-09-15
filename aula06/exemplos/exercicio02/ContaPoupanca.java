package exemplos.exercicio02;

public class ContaPoupanca extends Conta {

    private static double taxa;


    public ContaPoupanca (int numero, double saldo)
    {
        super(numero);
    }

    public static void setTaxa(double taxaPoup)
    {
        taxa = taxaPoup;
    }


  //método
  @Override
  public void saque(double valor) {
      // TODO Auto-generated method stub
      
      if (valor > 0 && getSaldo() + taxa >  valor)
      {
          super.saque(valor + taxa);
      }
      else
      {
          System.out.println("Saque não efetuado");
      }
      
  }
    
}
