public class Cliente {
    private String nome;
    private String senha;

    public Cliente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
