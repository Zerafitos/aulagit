package exemplos.exemplo03;



public class App {

    public static void main(String[] args) {
        
        Gerente g1 = new Gerente ("Landry",10000, 10);
        Funcionario f1 = new Funcionario("Zezinho", 5000);

        System.out.println(f1.imprimir());
        System.out.println(g1.imprimir());

        f1.aumentarSalario(0.1);
        g1.aumentarSalario(0.1);

        System.out.println(f1.imprimir());
        System.out.println(g1.imprimir());

    }
    



}
