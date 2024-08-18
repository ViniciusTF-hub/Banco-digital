public class Conta {
   
    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
        this.cliente = cliente;
}

    public void sacar(double valor){
        if (saldo>valor) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso.");
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
}
       
     public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Depósito realizado com sucesso.");
}
    
    public void transferir(double valor, Conta contaDestino){
        if (saldo>valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferencia realizada com sucesso.");
        }
        else{
            System.out.println("Saldo insuficiente.");
        }

}
    
    public int getAgencia() {
        return agencia;
}

    public int getConta() {
        return conta;
}

    public double getSaldo() {
        return saldo;
}
protected void imprimirInfosComuns() {
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.conta));
    System.out.println(String.format("Saldo: %.2f", this.saldo));

}

public void imprimirExtrato() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'imprimirExtrato'");
}

}
