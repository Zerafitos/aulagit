package exercicios.exercicio02;

public class ContaPoupanca extends Conta {

    private static double taxa;


    public ContaPoupanca (int numero)
    {
        super(numero);
    }

    public static void setTaxa(double taxaPoup)
    {
        taxa = taxaPoup;
    }



    @Override
    public boolean saque(double valor) {
        if (valor > 0 && getSaldo() + taxa >= valor) {
            return super.saque(valor + taxa);
        }else{
            return false;
        }
    }


  @Override
  public String exibir() {
      // TODO Auto-generated method stub
      return "Poupança > "  + super.exibir();
  }

 
}
