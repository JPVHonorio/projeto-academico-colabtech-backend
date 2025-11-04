# **Projeto Integrador ColabTech**

---

### **UNIVERSIDADE CRUZEIRO DO SUL**  
### **PROJETO INTEGRADOR TRANSDISCIPLINAR EM ENGENHARIA DE SOFTWARE II**

---

## **COLABTECH**

**Autor:** João Paulo Vinícius da Silva Honório  
**RGM:** 26433273  

---

## **1. Introdução**

O **ColabTech** é uma aplicação web desenvolvida para facilitar a gestão de informações e requisições de colaboradores em um ambiente corporativo.  
O sistema permite que usuários autenticados acessem seus perfis, atualizem dados pessoais e acompanhem solicitações internas de forma prática e segura.

---

## **2. Ferramentas Utilizadas**

O sistema ColabTech foi desenvolvido utilizando as seguintes tecnologias:

- **Backend:** Spring Boot (Java)  
- **Frontend:** Angular  

O Spring Boot fornece uma estrutura robusta para o desenvolvimento de APIs REST,  
enquanto o Angular é responsável pela interface responsiva e dinâmica do usuário.

---

## **3. Histórias de Usuário**

- **Como cliente**, quero entrar no sistema utilizando meu usuário e senha para acessar minhas informações de forma segura.  
- **Como cliente**, quero alterar minhas informações pessoais no perfil para manter meus dados atualizados.  
- **Como cliente**, quero enviar uma requisição para o setor responsável a fim de solicitar serviços ou recursos.  
- **Como cliente**, quero acompanhar o status das minhas requisições para saber quando serão atendidas.

---

## **4. Tarefas Técnicas**

Para cada história de usuário, as seguintes tarefas devem ser realizadas:

### **História 1: Login no sistema**
- Criar a estrutura da tabela de usuário no MySQL  
- Criar endpoint de autenticação no backend  
- Implementar tela de login em Angular com formulário reativo para acesso  
- Validar credenciais via API e armazenar os dados do usuário  

### **História 2: Atualizar informações do perfil**
- Criar endpoint para atualização de dados do usuário  
- Implementar tela de edição de perfil com campos editáveis  
- Validar entradas e persistir alterações no banco de dados  

### **História 3: Enviar requisição**
- Criar a estrutura da tabela de requisições no MySQL  
- Criar endpoint para cadastro de requisições associadas ao usuário logado  
- Criar formulário Angular para envio de novas requisições  

### **História 4: Acompanhar requisição**
- Criar endpoint para listar requisições do usuário  
- Implementar tela de listagem com status  

---

## **5. Instruções para Teste**

O vídeo de apresentação fornecido contém também o processo de inicialização dos repositórios descrito abaixo:

1. Acesse o repositório no GitHub e baixe os projetos **projeto-academico-colabtech-backend** e **projeto-academico-colabtech-frontend**.  
2. Abra o projeto **backend** no Visual Studio Code ou IntelliJ.  
3. Execute o arquivo **ColabtechApplication.java** no modo *Run/Debug*.  
4. Abra o projeto **frontend** no Visual Studio Code.  
5. No terminal, execute o comando `ng serve` para iniciar o servidor Angular.  
6. Acesse o endereço [http://localhost:4200](http://localhost:4200) no navegador para interagir com o sistema.

---

## **8. Recursos**

- **GitHub:** [https://github.com/JPVHonorio](https://github.com/JPVHonorio)  
- **Coleção Postman:**  
  [https://drive.google.com/file/d/1G1-7JU_6isi806jlnlrF8w5OUgrxQYJ5/view?usp=sharing](https://drive.google.com/file/d/1G1-7JU_6isi806jlnlrF8w5OUgrxQYJ5/view?usp=sharing)  
- **Vídeo de apresentação:**  
  [https://www.youtube.com/watch?v=lV0dgCGtvdY](https://www.youtube.com/watch?v=lV0dgCGtvdY)
