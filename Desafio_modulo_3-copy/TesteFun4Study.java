public class TesteFun4Study {   

 public static void main(String[] args){
            
   Cidade cidades[] = new Cidade[2];          // Objeto cidades 
   Estudante estudantes[] = new Estudante[4]; // Objeto estudantes
  
   System.out.println("+---------------------------------------------+");
   System.out.println("|              Cadastro de Cidades            |");
   System.out.println("+---------------------------------------------+");
   
   System.out.println("+---------------------------------------------+");
    cidades[0] = new Cidade
    (Teclado.leInt(" Código da Cidade     :  "),
     Teclado.leString(" Nome da Cidade       :  "),
     Teclado.leString(" Estado (UF)          :  "));
    
   
   System.out.println("+---------------------------------------------+");
   
   cidades[1] = new Cidade
    (Teclado.leInt(" Código da Cidade     :  "),
     Teclado.leString(" Nome da Cidade       :  "),
     Teclado.leString(" Estado (UF)          :  "));
   
   System.out.println("+---------------------------------------------+");
   System.out.println();
   System.out.println();
   
   
   
   
   
   System.out.println("+---------------------------------------------+");
   System.out.println("|              Cadastro de Estudantes         |");
   System.out.println("+---------------------------------------------+");
   
   
   System.out.println("+---------------------------------------------+");
   estudantes [0] = new Estudante 
   (Teclado.leInt("Código do Aluno:  "),
   Teclado.leString("Nome do Aluno:  "),
   Teclado.leString("Data De Nascimento: "),
   Teclado.leString("Email: "),
   Teclado.leString("Senha: "),
   (cidades[0]));
   
   

   String senhaAnteriorE1 = Teclado.leString("Digite sua senha anterior: ");
       String senhaNovaE1 = Teclado.leString("Digite sua nova senha: ");
    String senhaNova2E1 = Teclado.leString("Digite novamente sua nova senha: ");

   
   
    if((estudantes[0].getSenha()).equals(senhaAnteriorE1)){
        if(senhaNovaE1.equals(senhaNova2E1)){
            estudantes[0].setSenha(senhaNovaE1);
            System.out.println("A senha Foi Atualizada com suceso\n");
        }else{
        System.out.println("Não foi possível alterar \nAs senhas não coincidem");
    }
}else {
    System.out.println("Não foi possível alterar \n A senha anterior não confere");
}
    
    
       System.out.println("+---------------------------------------------+");
   estudantes [1] = new Estudante 
   (Teclado.leInt("Código do Aluno:  "),
   Teclado.leString("Nome do Aluno:  "),
   Teclado.leString("Data De Nascimento: "),
   Teclado.leString("Email: "),
   Teclado.leString("Senha: "),
   (cidades[0]));
   
   

   String senhaAnteriorE2 = Teclado.leString("Digite sua senha anterior: ");
       String senhaNovaE2 = Teclado.leString("Digite sua nova senha: ");
    String senhaNova2E2 = Teclado.leString("Digite novamente sua nova senha: ");

   
   
    if((estudantes[1].getSenha()).equals(senhaAnteriorE2)){
         if(senhaNovaE2.equals(senhaNova2E2)){
            estudantes[1].setSenha(senhaNovaE2);
            System.out.println("A senha Foi Atualizada com suceso\n");
        }else{
        System.out.println("Não foi possível alterar \nAs senhas não coincidem");
    }
}else {
    System.out.println("Não foi possível alterar \n A senha anterior não confere");
}

    System.out.println("+--Dados da Primeira cidade-------+");
  cidades[0].exibeDados();
  System.out.println("+----Dados do primeiro estudante---------+");
  estudantes[0].exibeDados();
  System.out.println("+----Dados do segundo estudante----------+");
  estudantes[1].exibeDados();
  System.out.println("+---------------------------------------------+");
  System.out.println("+---------------------------------------------+");
  System.out.println("+---------------------------------------------+");
  
  
  estudantes [2] = new Estudante 
   (Teclado.leInt("Código do Aluno:  "),
   Teclado.leString("Nome do Aluno:  "),
   Teclado.leString("Data De Nascimento: "),
   Teclado.leString("Email: "),
   Teclado.leString("Senha: "),
   (cidades[1]));
  
  
  
  
    String senhaAnteriorE3 = Teclado.leString("Digite sua senha anterior: ");
    String senhaNovaE3 = Teclado.leString("Digite sua nova senha: ");
    String senhaNova2E3 = Teclado.leString("Digite novamente sua nova senha: ");
   
   
    if((estudantes[2].getSenha()).equals(senhaAnteriorE3)){
        if(senhaNovaE3.equals(senhaNova2E3)){
            estudantes[2].setSenha(senhaNovaE3);
            System.out.println("A senha Foi Atualizada com suceso\n");
        }else{
        System.out.println("Não foi possível alterar \nAs senhas não coincidem");
    }
}else {
    System.out.println("Não foi possível alterar \n A senha anterior não confere");
}

    System.out.println("+---------------------------------------------+");
    
      System.out.println("+---------------------------------------------+");
    
    
    estudantes [3] = new Estudante 
   (Teclado.leInt("Código do Aluno:  "),
   Teclado.leString("Nome do Aluno:  "),
   Teclado.leString("Data De Nascimento: "),
   Teclado.leString("Email: "),
   Teclado.leString("Senha: "),
   (cidades[1]));
  
  
  
  
    String senhaAnteriorE4 = Teclado.leString("Digite sua senha anterior: ");
    String senhaNovaE4 = Teclado.leString("Digite sua nova senha: ");
    String senhaNova2E4 = Teclado.leString("Digite novamente sua nova senha: ");

    if((estudantes[3].getSenha()).equals(senhaAnteriorE4)){
        if(senhaNovaE4.equals(senhaNova2E4)){
            estudantes[3].setSenha(senhaNovaE4);
            System.out.println("A senha Foi Atualizada com suceso\n");
            
        }else{
        System.out.println("Não foi possível alterar \nAs senhas não coincidem");
    }
  

  
}else {
    System.out.println("Não foi possível alterar \n A senha anterior não confere");
}
  



    System.out.println("+----Dados da segunda cidade---------+");
  cidades[1].exibeDados();
    System.out.println("+-----Dados do terceiro estudante-------------+");
  estudantes[2].exibeDados();
    System.out.println("+---------Dados do quarto estudante-------------+");
  estudantes[3].exibeDados();
}
}