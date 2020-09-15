/**
 * Relogio
 */
public class Relogio {

    private int hora, min, seg;

    // construtor = tem o mesmo nome da classe
    public Relogio(int hora, int min, int seg) {
        setHora(hora);
        setMin(min);
        setSeg(seg);

    }

    public void setSeg(int seg){
        if(seg > -1 && seg < 60)
        this.seg = seg;
    }

    public void setMin (int min){
        if(min > -1 && min < 60)
        this.min = min;
    }

    public void setHora(int hora){
        if(hora > -1 && hora < 60)
        this.hora = hora;
    }

    public int getSeg()
    {
        return seg;
    }

    public int getMin()
    {
        return min;
    }

    public int getHora()
    {
        return hora;
    }
    // método exibir
    public String exibirHoraUniversal() {
        return hora + ":" + min + ":" + seg;
    }

    public String exibirHoraAmPm()
    {
        String pos = " AM";
        int hora12 = hora;
        if (hora12 > 12)
        {
            hora12 -= 12;
            pos = " PM";
        }
        return hora12 + ":" + min + ":" + seg + pos;
    }

    public void avancarHora(){
        if(seg < 59){
            seg++;
        }else{
            seg = 0;
            if(min < 59){
                min++;
            }else{
                min = 0;
                if(hora < 23){
                    hora++;
                }else{
                    hora = 0;
                    seg = 1;
                }
            }
        }
    }

    /*
    public void avancaSegundo() {
        
        this.seg ++;
            if(this.seg = 60)
            {
                this.seg = 0;
                this.avanacaMinuto();
            }
        }
    public void avancaMinuto()
    {
        this.min++;
        if (this.min = 60)
        {
            this.min = 0;
            this.avancaHora();
        }
    }

        public void avancaHora()
        {
            this.hora++;
            if (this.hora = 24)
            this.hora = 0;
            this.seg = 1;
        }

        */


}

