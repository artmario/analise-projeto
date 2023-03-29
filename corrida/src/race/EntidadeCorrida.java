package race;

public class EntidadeCorrida {
    ComportamentoAutonomia comportamentoAutonomia;

    private int id;

    public EntidadeCorrida(int i)
    {
        this.id=i;
    }
    public void setComportamentoAutonomia(ComportamentoAutonomia comportamentoAutonomia) {
        this.comportamentoAutonomia = comportamentoAutonomia;
    }
    public void move() {
        if(comportamentoAutonomia.autonomiaEsgotada())
            comportamentoAutonomia.consomeAutomia();
        else
            System.out.println("Autonomia esgotada");
    }
    

    @Override
    public String toString() {
        return "entidade: "+ id +"tipo "+ comportamentoAutonomia;
    }
}
