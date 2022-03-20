# Desafio_Sensedia

# Desafio Técnico – Maven, Junit,Java, RestAssured


------------
## Passo a passo para o teste automático:

1. Entrar no site:  https://developers.trello.com/docs/api-introduction
3. O usuario deve criar uma contaa trello para obter o token de acesso a API
4. o Usuario deve criar primeiramente um board e assim ter o "idborad"
5. com o "idboard" o testador irá usá-lo para criar um lista e obter o idlist pra criar o card
6. com o "idcard", o testador pode fazer alterações no card, como cor do card

## Sobre a execução do projeto: 

## Requisitos para execução:
1. Eclipse IDE 2021-12  https://www.eclipse.org/
2. Oraclo JDK https://www.oracle.com/java/technologies/downloads/
3. Configuração do ambiente Java_home  https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26
4. Ao instalar e fazer as configurações de ambiente, siga os passos abaixo:
5. Quando for  instalado o eclipse, clique em abrir.
6. Com o Eclipse aberto.
7. Clique em File > import... > na arvore  de pastas, selecione Maven > Existing Maven Project, Clique em Next.
8. em Root Directory, clique em Browser > selecione a pasta do projeto e clique em abrir.
9. Assim que abrir o projeto e carregar as dependências do Maven, clique na “pasta:src/test/java“ e abra a class  chamada “APITest.java”, na “package testAPI”
13. assim o ciclo pode ser acompanhado de acordo com a hora da execusção do teste.
14. executar o testa na sua herarquia: criarBoard > criarList > criarCard > updateCard > deliteBoard. De acordo com as tgs na feature, pela classe "APITest" na packager.
