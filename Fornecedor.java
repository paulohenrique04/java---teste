package teste01;

public class Fornecedor extends Pessoa {
	private float valorCredito;
    private float valorDivida;

    Fornecedor(String Nome, String Endereco, String Telefone, float valorCredito, float valorDivida){
        super(Nome, Endereco, Telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public void setValorCredito(float valorCredito){
        this.valorCredito = valorCredito;
    }

    public float getValorCredito(){
        return valorCredito;
    }

    public void setValorDivida(float valorDivida){
        this.valorDivida = valorDivida;
    }

    public float getValorDivida(){
        return valorDivida;
    }

    public float ObterSaldo() {
        return getValorCredito() - getValorDivida();
    }

    public void Exibir(){
        super.Exibir();
        System.out.println("Crédito: "+getValorCredito());
        System.out.println("Dívida: "+getValorDivida());
        System.out.println("Saldo: R$"+ObterSaldo());
    }
}
