package PatronSingletonLimpio;

import java.time.LocalDate;

public class MainTestTicket {
    public static void main(String[] args) {
        ClaseIterador itera = new ClaseIterador();
        Ticket t1 = new Ticket(LocalDate.now(),new Usuarios("Adrian", "velez"));
        Ticket t2 = new Ticket(LocalDate.now(),new Usuarios("Luis", "Hernandez"));
        Ticket t3 = new Ticket(LocalDate.now(),new Usuarios("Cristiano", "Ronaldo"));
        Ticket t4 = new Ticket(LocalDate.now(),new Usuarios("Brandon", "perez"));

        Tickets tickets = Tickets.getInstance();

        //se crean objetos
        tickets.crear(t1);
        tickets.crear(t2);
        tickets.crear(t3);
        tickets.crear(t4);

        //Se limpia el codigo, haciendo una nueva clase de nombre ClaseIterador, donde se realiza la logica del iterador.
        itera.consultaTicket(tickets);
        tickets.reinicia();
        itera.consultaTicket(tickets);

    }
}
