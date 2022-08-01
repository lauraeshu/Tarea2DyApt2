public class Gaseoso implements EstadoGelatina{

    @Override
    public void imprimirEstado(Gelatina gelatina) {
        System.out.println(" la gelatina está es estado Gaseoso");
        gelatina.setEstadoGelatina(this);

    }
}
