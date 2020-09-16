package exemplos.exercicio02;

public class ContaCorrente extends Conta {

        private double taxa = 0.10;

        public ContaCorrente(int numero)
        {

            super(numero);
           
        }

    
  //método
  @Override
  public boolean saque(double valor) {
      if(getSaldo() >= valor){
          return super.saque(valor);
      }else{
          return false;
      }
  }

    @Override
    public void deposito(double valor) {
    // TODO Auto-generated method stub

    super.deposito(valor - taxa);
    }


    @Override
    public String exibir() {
        // TODO Auto-generated method stub
        return "Corrente > "  +super.exibir();
    }

}
