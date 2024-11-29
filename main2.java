import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner leitor = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date checkin = sdf.parse("11-11-2024");
        Date checkout = sdf.parse("12-11-2024");
        Reserva r1 = new Reserva(4, checkin, checkout);

        r1.exibirReserva();

        checkin = sdf.parse("01-11-2024");
        checkout = sdf.parse("20-11-2024");
        r1.atualizarDatas(checkin, checkout);
        r1.exibirReserva();
    }
}
