public class cadastroDeClientes{
    public static void main (String [] args){
        System.out.println("***INICIANDO CADASTRO DE CLIENTES DO BANCO SENDOR***");
        String nome = Teclado.leString("Informe seu nome: ");
        String dataDeNascimento = Teclado.leString("Informe a sua data de nascimento: ");
        char sexo = Teclado.leChar("Sexo: ");
        String cpf = Teclado.leString("Informe seu cpf: ");
        String rg = Teclado.leString ("Informe seu RG: ");
        String paiOuMae = Teclado.leString("Informe nome do pai ou da mãe: ");
        String telefone = Teclado.leString("Informe seu número de telefone: ");
        String endereco = Teclado.leString("Informe seu endereço: ");
        String cidade  = Teclado.leString("Informe a cidade onde você mora: "); 
        String cep = Teclado.leString("Informe o CEP: ");
        
        
        System.out.println("***SEU CADASTRO FOI CONCLUIDO COM SUCESSO***");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataDeNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + sexo);
        System.out.println("RG: " + rg);
        System.out.println("Nome do pai ou da mãe: " + paiOuMae);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("CEP: " + cep);
        
    }


}