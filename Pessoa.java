package teste01;

public class Pessoa {
	private String Nome;
    private String Endereco;
    private String Telefone;

    Pessoa(String Nome, String Endereco, String Telefone){
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }

    public void setNome(String name){
        Nome = name;
    }

    public String getNome(){
        return Nome;
    }

    public void setEndereco(String endereco){
        Endereco = endereco;
    }

    public String getEndereco(){
        return Endereco;
    }

    public void setTelefone(String telefone){
        Telefone = telefone;
    }
    
    public String getTelefone(){
        return Telefone;
    }

    public void Exibir(){
        System.out.println("Nome: "+getNome());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("Telefone: "+getTelefone());
    }
}
