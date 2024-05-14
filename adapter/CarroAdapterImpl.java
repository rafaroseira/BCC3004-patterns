package adapter;

public class CarroAdapterImpl implements CarroAdapter{
    private Carro carros;

    @Override
    public float getVelocidade() {
        return MPHtoKPH(carros.getVelocidade());
    }
    
    private float MPHtoKPH(float mph) {
        return (float)(mph * 1.60934);
    }

    public CarroAdapterImpl(Carro carros) {
        this.carros = carros;
    }

}
