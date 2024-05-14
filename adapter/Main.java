package adapter;

public class Main {

    public static void main(String[] args) {
        Carro golf = new Golf();
        CarroAdapterImpl adapter = new CarroAdapterImpl(golf);
        System.out.println("Velocidade máxima de " + adapter.getVelocidade() + " km/h");

    }

}
