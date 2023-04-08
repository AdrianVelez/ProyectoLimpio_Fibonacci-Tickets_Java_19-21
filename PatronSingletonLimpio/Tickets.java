package PatronSingletonLimpio;
import java.util.ArrayList;

public class Tickets implements TicketsIterador{
   ArrayList<Ticket> ticketList = new ArrayList<>();
    int posicion = 0;
    int voletosDisp=2;
    static  Tickets tickets;

    private Tickets(){}

    public static Tickets getInstance(){
        if (tickets==null){
            tickets=new Tickets();
        }
        return Tickets.tickets;
    }

    public void crear(Ticket ticket){
        ticketList.add(ticket);
    }

    @Override
    public Ticket siguiente() {
        Ticket ticket;
        ticket = ticketList.get(posicion);
        posicion+=1;
        return ticket;
    }

    @Override
    public boolean hayMas() {
        if (posicion > voletosDisp){
            return false;
        }
        boolean haymas = posicion < ticketList.size();
        return haymas;
    }

    @Override
    public void reinicia() {
        System.out.println("Se reinicia la venta de los boletos ");
        posicion=0;
    }


}
