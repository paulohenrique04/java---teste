package teste01;

public class Empregado extends Pessoa {
	private int codSetor;
    private float salario;

    Empregado(String Nome, String Endereco, String Telefone, int codSetor, float salario){
        super(Nome, Endereco, Telefone);
        this.codSetor = codSetor;
        this.salario = salario;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void Exibir(){
        super.Exibir();
        System.out.println("Código do setor: "+getCodSetor());
        System.out.println("Salário: R$"+getSalario());
    }
}
