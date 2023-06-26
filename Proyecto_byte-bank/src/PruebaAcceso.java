public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuentaDeJose = new Cuenta();
        cuentaDeJose.depositar(1000);
        cuentaDeJose.retirar(5000);
        System.out.println(cuentaDeJose.getSaldo());
        cuentaDeJose.setAgencia(-5);
    }
}
