public class Cliente {
    private String nombre;
    private String documento;
    private String telefono;
    private String genero;

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        if (genero == "Masculino" || genero == "Femenino") {
            this.genero = genero;
        }else {
            System.out.println("Genero invalido");
        }
    }
}
