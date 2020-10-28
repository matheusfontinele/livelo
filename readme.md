# Automação Livelo

## Introdução

O projeto foi criado sobre a seguinte Stack:
- Java 8
- Cucumber
- Selenium WebDriver
- TestNG

##Repositório do Projeto
https://github.com/matheusfontinele/livelo.git

## Instalação

[Java JDK 8+](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html) após a instalação, será necessário criar/editar as seguintes variáveis de ambiente:
- JAVA_HOME (Criação da variável) com o valor no caminho onde a JDK foi instalada
Exemplo: C://<USUARIO>/Program Files/Java/jdk1.8.0_211
- PATH (Editar variável e incluir novo valor) com o mesmo valor do JAVA_HOME acresentando o "\bin"
Exemplo: C://<USUARIO>/Program Files/Java/jdk1.8.0_211\bin

Para verificar se o Java está corretamente instalado, basta abrir um prompt de comando e executar a seguinte instrução:
```sh
java -version
```
O comando será reconhecido e informará a versão do Java que foi configurada como variável de ambiente. A resposta será parecido com o trecho abaixo:
```sh
java version "1.8.0_241"
Java(TM) SE Runtime Environment (build 1.8.0_241-b07)
Java HotSpot(TM) 64-Bit Server VM (build 25.241-b07, mixed mode)
```

[Maven](https://maven.apache.org/download.cgi) após a descompactação, será necessário editar a variável PATH incluindo o caminho onde o maven foi descompactado acrescido do diretório bin.
Exemplo: C:\Program Files\apache-maven-3.6.3\bin

Para verificar se o Maven está corretamente instalado, basta abrir um prompt de comando e executar a seguinte instrução:
```sh
mvn --v
```
Se for apresentado a versão, isso significa que foi instalado corretamente.
Exemplo: 
```sh
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: C:\Program Files\apache-maven-3.6.3\bin\..
Java version: 1.8.0_211, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_211\jre
Default locale: pt_BR, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```
## Execução
Considerando que ambiente esteja configurado, executar o prompt (cmd) no diretório do projeto e executar o seguinte comando:
```sh
mvn clean install
```
O comando ira realizar a instalação de todos os pacotes do projeto como também realizar a execução do testes. Sendo assim, com apenas um comando já é possível instalar e executar. A trecho abaixo representa o final da execução do comando:
```sh
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 77.3 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ livelo ---
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ livelo ---
[INFO] Installing C:\Users\Matheus\desafios-workspace\livelo\target\livelo-0.0.1-SNAPSHOT.jar to C:\Users\Matheus\.m2\repository\compasso\livelo\0.0.1-SNAPSHOT\livelo-0.0.1-SNAPSHOT.jar
[INFO] Installing C:\Users\Matheus\desafios-workspace\livelo\pom.xml to C:\Users\Matheus\.m2\repository\compasso\livelo\0.0.1-SNAPSHOT\livelo-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:24 min
[INFO] Finished at: 2020-10-28T18:09:56-03:00
[INFO] ------------------------------------------------------------------------
```


