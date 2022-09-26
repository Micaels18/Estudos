public class Cidade {
    private int codigo;
    private String descricao;
    private String UF;
    private int qtdDeEstudantes;
    
    
    public Cidade(int codigo,String descricao, String UF){
        this.codigo = codigo;
        this.descricao = descricao;
        this.UF = UF;
        
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public String getUF(){
        return UF;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setUF(String uf){
        this.UF = UF;
    }
    public void adicionaEstudante(){
        this.qtdDeEstudantes++;
    }

    public void exibeDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Descrção: " + descricao);
        System.out.println("Unidade Federativa: "+ UF);
        System.out.println("Quantidade De Estudantes: " +qtdDeEstudantes + " Alunos");
    }
}
