package exemplos.exercicio02;

public class ContaCorrente extends Conta {

        private double taxa = 0.10;

        public ContaCorrente(int numero)
        {

            super(numero);
           
        }

    
  //método
  @Override
  public void saque(double valor) {
      // TODO Auto-generated method stub
      
      if (valor > 0 && getSaldo() >= valor )
      {
          super.saque(valor);
      }
      else 
      {
          System.out.println("Saque não efetuado");
      }


    }


    @Override
    public void deposito(double valor) {
    // TODO Auto-generated method stub

    super.deposito(valor - taxa);
    }

}
