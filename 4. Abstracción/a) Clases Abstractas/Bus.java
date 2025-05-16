class Bus extends TransportePublico {
    public Bus(String linea) {
        super(linea);
    }

    @Override
    public void iniciarRuta() {
        System.out.println("Bus de la línea " + linea + " ha iniciado su ruta.");
    }
}
