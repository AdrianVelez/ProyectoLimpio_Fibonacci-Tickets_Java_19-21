package PatronSingletonLimpio;
//Clase de Iterador separada del main
public class ClaseIterador {

    public void consultaTicket(Tickets tickets) {
        while (tickets.hayMas()) {
            Ticket tik = tickets.siguiente();
            System.out.println("Usuario: " + tik.getUsuario());

            String sinVoleto = tickets.hayMas() ? "Pueden comprar boletos" : "Boletos Agotados!!";
            System.out.println(sinVoleto);
        }
    }
}
