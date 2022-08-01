public class PatronState {
    public static void main(String[] args) {

        Gelatina gelatina = new Gelatina();

        Solido solido = new Solido();
        solido.imprimirEstado(gelatina);

        System.out.println(gelatina.getEstadoGelatina().toString());

        Liquido liquido = new Liquido();
        liquido.imprimirEstado(gelatina);

        System.out.println(gelatina.getEstadoGelatina().toString());

        Gaseoso gaseoso = new Gaseoso();
        gaseoso.imprimirEstado(gelatina);

        System.out.println(gelatina.getEstadoGelatina().toString());


    }

}
