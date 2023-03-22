public class PatoDomestico implements Pato {
  public PatoDomestico() {
    comportamentoVoar = new NaoPodeVoar();
    comportamentoGrasnar = new Quack();
  }

  public void aparencia() {
    System.out.println("Sou um pato doméstico branco");
  }
}