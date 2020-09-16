package exemplos.exercicio02;

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

    //método
    @Override
    public void saque(double valor) {
        // TODO Auto-generated method stub
        if (valor > 0 && getSaldo() + limite > valor)
        {
            super.saque(valor);
        }
        else
        {
            System.out.println("Saque não efetuado");
        }
        
    }

    @Override
    public String getConta() {
        // TODO Auto-generated method stub
        return "Especial > "  +super.getConta() + " - " + limite;
    }

    
}
