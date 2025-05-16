public class Main {
    public static void main(String[] args) {
        // Crear alumnos
        Alumno a1 = new Alumno("Sofía", "A001");
        Alumno a2 = new Alumno("Miguel", "A002");
        a1.asignarNota(85.5);
        a2.asignarNota(90.0);

        // Crear docente
        Docente d1 = new Docente("Prof. Juárez", "D001", "Historia");

        // Polimorfismo con interfaces
        Registrable[] personas = { a1, a2, d1 };

        for (Registrable p : personas) {
            p.registrar();
            if (p instanceof Usuario) {
                ((Usuario)p).mostrarInfo();
            }
        }

        System.out.println("Total de alumnos: " + Alumno.getTotalAlumnos());
        System.out.println("Total de docentes: " + Docente.getTotalDocentes());
    }
}
