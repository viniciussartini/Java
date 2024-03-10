# Anotações
<details>

<summary><strong>Links Exercícios</strong></summary>

[:link:Exercício 01](OOP_01/)
[:link:Exercício 02](OOP_02/)
[:link:Exercício 03](OOP_03/)
[:link:Exercício 04](OOP_04/)
[:link:Exercício 05](OOP_05/)
[:link:Exercício 06](OOP_06/)
[:link:Exercício 07](OOP_07/)

</details>


## Classes e Objetos
**Classe** é uma estrutura que define as propriedades e os comportamentos de um **objeto**. Uma classe é como um modelo que pode ser usado para criar ***instâncias de objetos***. Cada objeto criado a partir de uma classe é chamado de instância.
As classes são compostas por ***variáveis de instância***, ***métodos*** e ***construtores***. As *variáveis de instância* representam as características ou estados do objeto, enquanto os *métodos* definem os comportamentos ou ações que o objeto pode realizar. Os *construtores* são métodos especiais usados para criar e inicializar os objetos da classe.
Para criar um objeto a partir de uma classe, usamos a palavra-chave `new` seguida pelo nome da classe e parênteses vazios, caso não seja necessário passar argumentos para o construtor. Por exemplo:
```
MinhaClasse objeto = new MinhaClasse();
```
Uma vez que um objeto é criado, podemos acessar suas variáveis de instância e chamar seus métodos usando o operador ponto `.`. Por exemplo:
```
objeto.variavelDeInstancia = valor;
objeto.metodo();
```
**Exemplo de uma declaração de uma classe genérica**
```
public class MinhaClasse {
    // Variáveis de Instância
    private tipo atributo1;
    private tipo atributo3;
    private tipo atributo2;

    // Construtor
    public MinhaClasse (tipo variavelA, variavelB, variavelC) {
        this.atributo1 = variavelA;
        this.atributo2 = variavelB;
        this.atributo3 = variavelC;
    }

    // Métodos
    public tipo metodo1() {
        <instruções>;
        return resultadoInstrucoes;
    }

    public tipo metodo2() {
        <instruções>;
        return resultadoInstrucoes;
    }

    public void metodo3() {
        <instruções>;
    }
}
```
## Membros Estáticos
Os **membros estáticos** são aqueles que pertencem à classe em si, e não a uma instância específica dessa classe. Isso significa que eles podem ser acessados diretamente através do nome da classe, sem a necessidade de criar um objeto. Existem dois tipos de membros estáticos: ***variáveis estáticas*** e ***métodos estáticos.***

As *variáveis estáticas* são compartilhadas por todas as instâncias da classe e são inicializadas apenas uma vez, no momento em que a classe é carregada. Elas são úteis para armazenar valores que são comuns a todas as instâncias, como constantes ou contadores.

Os *métodos estáticos* também pertencem à classe em si e **<u>não podem acessar variáveis de instância></u>**. Eles são chamados diretamente através do nome da classe e podem ser úteis para realizar operações que não dependem do estado de um objeto específico.

Os membros estáticos são úteis quando você precisa compartilhar informações ou funcionalidades entre várias instâncias de uma classe, ou quando deseja acessar um método ou variável sem precisar criar um objeto.

Para declarar um membro estático, basta adicionar a palavra-chave `static` antes do tipo de dado ou do retorno do método:
```
public class MinhaClasse {
    // Variável estática
    static tipo atributo;

    // Método estático
    static tipo metodo() {
        <instruções>
    }
}
```
Acessando membros estáticos:
```
int valor = MinhaClasse.atributo;
MinhaClasse.metodo();
```
Os métodos `Math` são exemplos de métodos estáticos.

## Construtores, sobrecarga e encapsulamento
Como falado anteriormente, o **método construtor** é um tipo especial de método que é responsável por inicializar um objeto. Ele é chamado automaticamente quando um objeto é instanciado a partir de uma classe e é usado para definir o estado inicial do objeto.

Alguns pontos importantes sobre os métodos contrutores:

- O nome do método deve ser o mesmo da classe.
- O método não possui tipo de retorno, nem mesmo `void`.
- Pode haver mais de um método construtor em uma classe, desde que tenham parâmetros diferentes (**sobrecarga de construtores**).
- Se nenhum construtor for definido explicitamente, a classe terá um construtor padrão vazio.

**Exemplo de um construtor da classe** `Pessoa`**:**
```
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```
### Sobrecarga de construtores
A **sobrecarga de construtores** permite ter vários construtores com o mesmo nome em uma classe, mas com diferentes parâmetros. Isso significa que podemos criar objetos de uma classe de maneiras diferentes. É uma maneira mais flexível de inicializar objetos.

Por exemplo, suponha que temos uma classe chamada `Pessoa` e queremos permitir que sejam criado objetos dessa classe fornecendo apenas o `nome` ou fornecendo o `nome` e a `idade`. Podemos sobrecarregar o construtor da seguinte maneira:
```
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```
### Encapsulamento
O **encapsulamento** em classes permite a proteção e controle de acesso aos dados e comportamentos de um objeto.

O encapsulamento é alcançado através da definição de atributos como `private` e fornecendo métodos públicos para acessá-los e modificá-los. Os atributos privados não podem ser acessados diretamente por outras classes, garantindo assim que as alterações nos dados sejam feitas de forma controlada.

Os métodos públicos, também conhecidos como métodos ***getter*** e ***setter***, permitem que os objetos interajam com os atributos encapsulados de forma segura. Os *métodos getter* são usados para obter o valor de um atributo, enquanto os *métodos setter* são usados para definir o valor de um atributo.

Além disso, o encapsulamento também permite a adição de lógica adicional nos *métodos getter* e *setter*, como validações de entrada, cálculos, etc.. Isso garante que os dados estejam sempre em um estado válido e consistente.
#### Métodos getters e setters
Os **métodos getter** são responsáveis por retornar o valor de um atributo, permitindo que outros objetos possam ler o valor sem acessar diretamente o atributo em si.
Os **métodos setter**, por sua vez, são usados para modificar o valor de um atributo privado. Eles permitem que outros objetos possam alterar o valor do atributo de forma controlada.
```
public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método Getter
    public String getNome() {
        return nome;
    }

    // Método Setter
    public void setNome(novoNome) {
        nome = novoNome;
    }
}
```
#### Modificadores de acesso
Modificadores de acesso determina quando uma classe pode acessar atributos e métodos de outras classes. A tabela abaixo mostra os níveis de acesso de cada modificador.

Modificador de Acesso | Classe | Pacote | Subclasse | Módulo
------- | -------- | -------- | -------- | --------
public | Sim | Sim | Sim | Quando a classe for exportada
protected | Sim | Sim | Subclasses de pacotes diferentes | Não
sem modificador | Sim | Sim | Não | Não
private | Sim | Não | Não | Não