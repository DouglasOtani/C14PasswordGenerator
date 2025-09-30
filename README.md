# **C14PasswordGenerator**
[![Java CI with Maven](https://github.com/DouglasOtani/C14PasswordGenerator/actions/workflows/maven.yml/badge.svg)](https://github.com/DouglasOtani/C14PasswordGenerator/actions/workflows/maven.yml)

Um gerador de senhas simples construído em Java, utilizando Maven para gerenciamento de dependências e GitHub Actions para integração contínua.

## **🚀 Sobre o Projeto**

Este projeto foi criado como uma forma de praticar conceitos de desenvolvimento em Java, testes automatizados e a criação de um pipeline de CI/CD. A aplicação é capaz de gerar senhas seguras e aleatórias.

## **🛠️ Tecnologias Utilizadas**

* **Java 17:** Linguagem principal do projeto.  
* **Maven:** Ferramenta de automação e gerenciamento de dependências.  
* **JUnit:** Framework para a escrita de testes unitários.  
* **GitHub Actions:** Automação de pipeline para build, teste e notificação.

## **⚙️ Como Executar**

Para compilar e executar o projeto localmente, você precisará ter o Java 17 e o Maven instalados.

1. **Clone o repositório:**  
   git clone \[https://github.com/DouglasOtari/C14PasswordGenerator.git\](https://github.com/DouglasOtari/C14PasswordGenerator.git)  
   cd C14PasswordGenerator

2. **Compile o projeto e rode os testes:**  
   mvn clean install

3. **Execute a aplicação (após a compilação):**  
   java \-jar target/PasswordGenerator-1.0-SNAPSHOT.jar

## **📧 Notificações**

O pipeline está configurado para enviar uma notificação por e-mail ao final de cada execução, informando sobre o sucesso ou falha do processo.
