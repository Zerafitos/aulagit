package exemplos.exercicio02;

public class Conta {

    private int numero;
    private double saldo;


    //construtor padrão
    public Conta ()
    {
        this.numero = 0;
        this.saldo = 0;
    }

    //construtor
    public Conta (int numero)
    {
        this.numero = numero;
    }


    //método de exibição
    public String getConta()
    {
        return "Conta " + numero;
    }

    public double getSaldo()
    {
        return saldo;
    }

 

    public void deposito(double valor)
    {
        if (valor > 0)
        saldo = this.saldo + valor;
    }

    public void saque (double valor)
    {
        if (valor > 0)
        {
        saldo = this.saldo - valor;
        System.out.println("Saque efetuado");
        }
    }
    

    public void setSaldo (double saldo)
    {
        if (saldo > 0)
       this.saldo = saldo;
        
    }
    
    
}
