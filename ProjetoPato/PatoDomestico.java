public class PatoDomestico implements Pato {
  public PatoDomestico() {
    comportamentoVoar = new PodeVoar();
    comportamentoGrasnar = new Quack();
  }

  public void aparencia() {
    System.out.println("Sou um pato doméstico branco");
  }
}