package race;
public class CarroCombustao implements ComportamentoAutonomia{
    private int autonomiaGasolina;
    public CarroCombustao(int autonomiaGasolina) {
        this.autonomiaGasolina = autonomiaGasolina;
    }

    public void setAutonomiaGasolina(int autonomiaGasolina) {
        this.autonomiaGasolina = autonomiaGasolina;
    }

    @Override
    public void consomeAutomia() {
        this.autonomiaGasolina=autonomiaGasolina-1;
    }

    @Override
    public boolean autonomiaEsgotada() {
        return this.autonomiaGasolina>0;
    }
    
    @Override
    public String toString() {
        return "CarroCombustao [autonomiaGasolina=" + autonomiaGasolina + "]";
    }
   
}