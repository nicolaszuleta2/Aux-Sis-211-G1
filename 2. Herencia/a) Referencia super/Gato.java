class Gato extends Mascota {
    String tipo = "Gato doméstico";

    public Gato() {
        super(); // Llama al constructor de la superclase
        System.out.println("Constructor de Gato");
    }

    public void mostrarInfo() {
        System.out.println("Tipo local: " + tipo); // Atributo de esta clase
        System.out.println("Tipo del padre: " + super.tipo); // Atributo de la superclase
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();  // Llama al método de la superclase
        System.out.println("El gato maúlla");
    }
}