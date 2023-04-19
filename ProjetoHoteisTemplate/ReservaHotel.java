public abstract class ReservaHotel {
  final void realizarReserva() {
  	verificarDisponibilidade();
  	solicitarInformacoesDoUsuario();
  	concretizarReserva();
    calcularPrecoItensMedianos();
  }

  public void verificarDisponibilidade() {
    System.out.println("Verificando disponibilidade ...");
  }

  public void solicitarInformacoesDoUsuario() {
    System.out.println("Favor informar suas informações bancárias ...");
  }

  public void concretizarReserva() {
    System.out.println("Reserva realizada com sucesso, favor ...");
  }

  abstract void calcularPrecoItensMedianos();
}