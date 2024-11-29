import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private int numeroQuarto;
    private Date checkIn;
    private Date checkOut;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Reserva(int numeroQuarto, Date checkIn, Date checkOut) {
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public long duracao(){
        long dia = checkOut.getTime()-checkIn.getTime();
        return TimeUnit.DAYS.convert(dia,TimeUnit.MILLISECONDS);
    }

    public void exibirReserva(){
        System.out.println("Quarto: "+numeroQuarto);
        System.out.println("CheckIn: "+sdf.format(checkIn));
        System.out.println("CheckOut: "+sdf.format(checkOut));
        System.out.println("Duração: "+duracao());
    }

    public void atualizarDatas(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
}
