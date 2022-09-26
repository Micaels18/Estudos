public class Estudante {
    private int codigo;
    private String nome;
    private String dataDeNascimento;
    private String email;
    private String senha;
    Cidade cidade;
    
    

    public Estudante (int codigo, String nome, String dataDeNascimento, String email, String senha, Cidade cidade){
        this.codigo = codigo;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        cidade.adicionaEstudante();
}
                
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public String getDataDeNascimento(){
        return dataDeNascimento;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDataDeNascimento(String dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento; 
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setCidade(Cidade cidade){
        this.cidade = cidade;
    }
    public Cidade cidade(){
        return cidade;
    }

    public void exibeDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataDeNascimento);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("Cidade: " + cidade);
    }
}
