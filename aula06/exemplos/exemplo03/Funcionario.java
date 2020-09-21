package aula06.exemplos.exemplo03;

public class Funcionario {

    private String nome;
    private double salario;


    //construtor
    public Funcionario(String nome, double salario)
    {
        this.nome = nome;
        this.salario = salario;

    }

    /*
    public Funcionario()
    {
        nome = "Não cadastrado";
        salario = 0;

    }
    */

    //método de exibição
    public String imprimir()
    {
        return nome + " : " + salario;
    }
    

    //método de incremento
    public void aumentarSalario (double perc)
    {
        //salario = salario + (salario * perc)
        salario += salario * perc;
    }


    public double getSalario()
    {
        return salario;
    }
        
    protected void setSalario(double salario)
    {
        if (salario > this.salario)
        {
            this.salario = salario;
        }

    }

}
