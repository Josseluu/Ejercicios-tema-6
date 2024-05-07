package Ejercicio_1;

class Pareja<T> {
    private T primerDato;
    private T segundoDato;

    // Constructor
    public Pareja(T primerDato, T segundoDato) {
        this.primerDato = primerDato;
        this.segundoDato = segundoDato;
    }

    // Método para obtener el primer dato
    public T obtenerPrimerDato() {
        return primerDato;
    }

    // Método para obtener el segundo dato
    public T obtenerSegundoDato() {
        return segundoDato;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Pareja<Integer> parejaEnteros = new Pareja<>(10, 20);
        System.out.println("Primer dato: " + parejaEnteros.obtenerPrimerDato());
        System.out.println("Segundo dato: " + parejaEnteros.obtenerSegundoDato());

        Pareja<String> parejaCadenas = new Pareja<>("Hola", "Mundo");
        System.out.println("Primer dato: " + parejaCadenas.obtenerPrimerDato());
        System.out.println("Segundo dato: " + parejaCadenas.obtenerSegundoDato());
    }
}
