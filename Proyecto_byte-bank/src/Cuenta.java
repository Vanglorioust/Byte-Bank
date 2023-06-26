public class Cuenta {
    Cliente titular = new Cliente();
    private double saldo;
    private int agencia;
    private int numero;

    public Cuenta() {
        if (this.agencia == 0) {
            System.out.println("Agencia invalida");
        }
    }

    public void depositar (double valor) {
        this.saldo += valor;
    }
    public boolean retirar (double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Retirado com sucesso");
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    }


    public boolean transferir (double valor, Cuenta destino) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        }
            return false;
        }
    public double getSaldo() {
        return this.saldo;
    }

    public void setnumero(double saldo) {
        this.saldo = saldo;
    }

    public int setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
            return agencia;
        }else {
            System.out.println("Agencia invalida");
            return 0;
        }
    }
}


