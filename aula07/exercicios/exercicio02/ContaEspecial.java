package exercicios.exercicio02;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(int numero, double limite)

    {
        super(numero);
        this.limite = limite;
    }
    

    public double getLimite() {
        return limite;
    }

    @Override
    public boolean saque(double valor) {
        if (valor > 0 && getSaldo() + limite >= valor) {
            return super.saque(valor);
        }else{
            return false;
        }
    }
        


    @Override
    public String exibir() {
        // TODO Auto-generated method stub
        return "Especial > "  +super.exibir() + " - " + limite;
    }

    
}
