public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente jose = new Cliente();
        jose.setNombre("Jose");
        jose.setDocumento("123456789");
        jose.setTelefono("123456789");
        jose.setGenero("Masculino");

        Cuenta cuentaDeJose = new Cuenta();
        cuentaDeJose.titular = jose;
        //cuentaDeJose.saldo = 1000;
        cuentaDeJose.setAgencia(200);
        cuentaDeJose.setnumero(123456);

        Cliente maria = new Cliente();
        maria.setNombre("Maria");
        maria.setDocumento("987654321");
        maria.setTelefono("987654321");
        maria.setGenero("Femenino");
    }
}
