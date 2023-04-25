class Main {
  public static void main(String[] args) {
    ReservaHotel RitzParis = new Hotel4Estrelas();
    ReservaHotel ThePlaza = new Hotel5Estrelas();

    RitzParis.realizarReserva();
    ThePlaza.realizarReserva();
    
  }
}