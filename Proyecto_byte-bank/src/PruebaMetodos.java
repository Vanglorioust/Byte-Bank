public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta cuentaDeJose  = new Cuenta();
        Cuenta cuentaDeMaria = new Cuenta();
        cuentaDeJose.depositar(600);
        //System.out.println(cuentaDeJose.saldo);
        cuentaDeJose.depositar(300);
        //System.out.println(cuentaDeJose.saldo);
        cuentaDeJose.retirar(100);
        //System.out.println(cuentaDeJose.saldo);
        cuentaDeJose.transferir(200, cuentaDeMaria);
        //System.out.println("Jose: " + cuentaDeJose.saldo);
        //System.out.println("Maria: " + cuentaDeMaria.saldo);
        if (cuentaDeJose.transferir(2200, cuentaDeMaria)){
            System.out.println("Transferencia realizada con éxito");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
