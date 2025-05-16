import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear veterinarios
        Veterinario v1 = new Veterinario("Dra. López", "Cirugía");
        Veterinario v2 = new Veterinario("Dr. Gómez", "Dermatología");

        // Crear mascotas
        Mascota m1 = new Mascota("Luna", "Perro", 5);
        Mascota m2 = new Mascota("Milo", "Gato", 3);
        Mascota m3 = new Mascota("Kiwi", "Loro", 2);

        // Almacenar en ArrayLists
        ArrayList<Registrable> registros = new ArrayList<>();
        registros.add(v1);
        registros.add(v2);
        registros.add(m1);
        registros.add(m2);
        registros.add(m3);

        // Registrar y mostrar info
        for (Registrable r : registros) {
            r.registrar();

            if (r instanceof Veterinario) {
                ((Veterinario) r).mostrarInfo();
            } else if (r instanceof Mascota) {
                ((Mascota) r).mostrarInfo();
                ((Mascota) r).mostrarInfo("Ficha médica");
            }

            System.out.println("----");
        }

        System.out.println("Total de veterinarios: " + Veterinario.getTotalVeterinarios());
        System.out.println("Total de mascotas: " + Mascota.getTotalMascotas());
    }
}
