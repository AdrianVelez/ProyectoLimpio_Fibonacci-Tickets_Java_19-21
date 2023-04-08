package PatronSingletonLimpio;
import java.time.LocalDate;

public class Ticket {
    private static int contador=0;
    private  int id = 1;
    private  double folio = 1020;
    private  LocalDate fecha;
    private  Usuarios usuario;

    public Ticket(LocalDate fecha, Usuarios usuario) {
        this.fecha = fecha;
        this.usuario = usuario;
        ++folio;
        this.id = ++contador;
    }

    public Usuarios getUsuario(){
        return this.usuario;
    }


}
