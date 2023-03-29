package race;

public class CarroEletrico implements ComportamentoAutonomia{
    private float autonomiaBateria;

    public CarroEletrico(float autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public boolean autonomiaEsgotada() {
        
        return this.autonomiaBateria>0.1;
    }

    @Override
    public void consomeAutomia() {
        this.autonomiaBateria=autonomiaBateria-0.1f;
    }
    @Override
    public String toString() {
        return "CarroEletrico [autonomiaBateria=" + autonomiaBateria + "]";
    }
}
