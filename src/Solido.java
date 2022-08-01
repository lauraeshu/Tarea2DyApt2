public class Solido implements EstadoGelatina{

    @Override
    public void imprimirEstado(Gelatina gelatina) {
        System.out.println(" la gelatina está es estado sólido");
        gelatina.setEstadoGelatina(this);
    }

}
