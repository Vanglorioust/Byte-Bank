public class TestReferencia {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        //c1.saldo = 1000;
        //c1.titular = "Duke";
        c1.setAgencia(56);
        c1.setnumero(123456);
        Cuenta c2 = c1;
        //c2.saldo = 500;
        //System.out.println(c1.saldo);
        //System.out.println(c2.saldo);
    }
}
