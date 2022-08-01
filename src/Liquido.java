public class Liquido implements EstadoGelatina {

    @Override
    public void imprimirEstado(Gelatina gelatina) {
        System.out.println(" la gelatina está es estado Líquido");
        gelatina.setEstadoGelatina(this);

    }
}
