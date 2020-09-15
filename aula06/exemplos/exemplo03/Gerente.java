package exemplos.exemplo03;

public class Gerente extends Funcionario{

    private int nFuncionarios;
    //private double bonus;
    
    public Gerente(String nome, double salario, int nFuncionarios)
    {

        super(nome, salario);//chamada ao construtor da classe base (superclasse)
        this.nFuncionarios = nFuncionarios;
    
    }

    @Override
    public String imprimir() {
            return super.imprimir() + " : " + nFuncionarios;
    }
    
    
    @Override
    public void aumentarSalario(double perc) {
        // TODO Auto-generated method stub
        double bonus = getSalario() * 0.2;
        
        super.aumentarSalario(perc);

        setSalario(getSalario()+bonus);
    }
    




}
