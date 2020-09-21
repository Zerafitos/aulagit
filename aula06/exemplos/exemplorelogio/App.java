package aula06.exemplos.exemplorelogio;
/**
 * App
 */
public class App {

    public static void main(String[] args) {

        Relogio hora1 = new Relogio(8, 59, 56);
        Relogio hora2 = new Relogio(18, 30, 11);

        

        System.out.println("Horário atual " + hora1.exibirHoraUniversal());
        System.out.println("Horário atual " + hora1.exibirHoraAmPm());
        System.out.println("Horário atual " + hora2.exibirHoraUniversal());
        System.out.println("Horário atual " + hora2.exibirHoraAmPm());
        
        
         for (int i = 0; i < 10; i++) {
            hora1.avancarHora();
            System.out.println(hora1.exibirHoraUniversal());
        }
        
        //System.out.printf("\n%d:%d:%d\n", hora1.getHora(),hora1.getMin(), hora1.getSeg());

    }

}

