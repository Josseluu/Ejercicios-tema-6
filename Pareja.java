public class Pareja<T> {
    private T primerDato;
    private T segundoDato;

    public Pareja(T primerDato, T segundoDato) {
        this.primerDato = primerDato;
        this.segundoDato = segundoDato;
    }

    public T obtenerPrimerDato() {
        return primerDato;
    }

    public T obtenerSegundoDato() {
        return segundoDato;
    }

    public static void main(String[] args) {
        Pareja<Integer> parejaEnteros = new Pareja<>(10, 20);
        System.out.println("Primer dato: " + parejaEnteros.obtenerPrimerDato());
        System.out.println("Segundo dato: " + parejaEnteros.obtenerSegundoDato());

        Pareja<String> parejaCadenas = new Pareja<>("Hola", "Mundo");
        System.out.println("Primer dato: " + parejaCadenas.obtenerPrimerDato());
        System.out.println("Segundo dato: " + parejaCadenas.obtenerSegundoDato());
    }
}
