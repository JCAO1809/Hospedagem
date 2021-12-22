public class TestaHosped {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        hotel.setQuarto(18);

        System.out.println(hotel.getQuarto());
        
        Cliente cliente = new Cliente();
        
        cliente.setNome("João");

        System.out.println(cliente.getNome());
    }
}
