# Anotações
<details>

<summary><strong>Links Exercícios</strong></summary>

[:link:Exercício 01]()

</details>

## Tipos primitivos de dados

Família     | Tipo Primitivo    | Wrapper Class | Tamanho       | Exemplo
------      | ---------------   | -----------   | --------      | ---------     |
Lógico      | boolean           | Boolean       | 1 bit         | true          |
Literal     | char              | Character     | 1 byte        | 'A'           |
Literal     | -                 | String        | 1 byte/cada   | "Java"        |
Inteiros    | byte              | Byte          | 1 byte        | 127           |
Inteiros    | short             | Short         | 2 bytes       | 32767         |
Inteiros    | int               | Integer       | 4 byte        | 2147483       |
Inteiros    | long              | Long          | 8 byte        | $2^{63}$      |
Reais       | float             | Float         | 4 byte        | $3.4^{+38}$   |
Reais       | double            | Double        | 8 byte        | $1.8^{+308}$  |
#### Padrão de nomenclatura
- **lowercase** - pacotes
- **CamelCase** - Classe, métodos construtores e interfaces
- **pascalCase** - Atributos, métodos e variáveis
- **UPPERCASE** - Constantes
#### Declaração de variáveis
##### Sintaxe de uma declaração de variáveis
```
<modificador> <tipo_variavel> <nome_variavel> = <valor>;
```
##### Modificadores
- `default` - Quando não especificamos na declaração. Pode ser acessada por classes no mesmo pacote.
- `public` - Pode ser acessada por qualquer classe.
- `private` - Só pode ser acessa pela classe em que é declarada.
- `final` - Tranforma a variável em constante.

Existem mais modificadores que serão discutidos em outro momento.
##### Declaração de variáveis
```
boolean varBoolean = false;
char varChar = 'V';
byte varByte = 33;
short varShort = 1444;
int varInt = 19284;
long varLong = 546814416l;
float varFloat = 1845.35f;
double varDouble = 76455.74;
```
#### Declaração de Wrapper Classes
```
Boolean variavelBoolean = new Boolean(false);
Character varChar = new Character('V');
String varString = "Isto é uma String";
Byte varByte = new Byte(100);
Integer varlInt = new Integer(3);
Long varLong = new Long(167816);
Float varFloat = new Float(1845.35);
Double varDouble = new Double(6171.455);
```
> :exclamation: ***Constantes são declaradas adicionando o modificador*** `final` ***antes do tipo da variável.***
```
final double PI = 3.1415;
```

> :warning: ***O tipo*** `long` ***deve ser declarado com*** `"l"` ***no final para não ser compactado para o tipo*** `int` ***para reduzir uso de memória.***

> :warning: ***Variáveis do tipo*** `float` ***possuem 7 casas decimais após a virgula e devem ser declaradas com o caractere*** `"f"` ***no final, senão serão consideradas do tipo*** `double` ***que possui casas decimais após a vírgula.***
---
## Entrada, saída e conversão de dados

#### Saída de dados
```
 // Imprime no console
System.out.print("Texto");

 // Imprime no console e quebra a linha
System.out.println("Texto concatenado com variável: " + varInt);

 // Impressão formatada e interpolação de variáveis
System.out.printf("Imprime um valor double com duas casas decimais: %.2f%n", varDouble);
```
> :exclamation: `%n` ***na impressão formatada serve para quebrar a linha.***

#### Entrada de dados
```
import java.util.Scanner;

// Cria um objeto teclado para entrada de dados do usuário no console
Scanner teclado = new Scanner(System.in);

char varChar = teclado.nextLine().charAt(0);
byte varByte = teclado.nextByte();
short varShort = teclado.nextShort();
int varInteiro = teclado.nextInt();
long varLong = teclado.nextLong();
float varFloat = teclado.nextFloat();
double varDouble = teclado.nextDouble();
String varString = teclado.nextLine();

// Finaliza o objeto teclado
teclado.close();
```
> :warning: ***Após a leitura de dados numéricos deve-se se inserir a instrução*** `teclado.netxLine();` ***pois, as instruções de leitura de dados númericos não quebram a linha.***
#### Conversão de dados
##### Inteiros e reais para String
```
String byteString = Byte.toString(varByte);
String shortString = Short.toString(varShort);
String intString = Integer.toString(varInt);
String longString = Long.toString(varLong);
String floatString = Float.toString(varFloat);
String doubleString = Double.toString(varDouble);
```
##### String para inteiros e reais
```
byte varByte = Byte.parseByte(varString);
short varShort = Short.parseShort(varString);
int varInt = Integer.parseInt(varString);
long varLong = Long.parseLong(varString);
float varFloat = Float.parseFloat(varString);
double varDouble = Double.parseDouble(varString);
```
##### Casting
```
double varDouble = (float) varFloat;
float varFloat = (long)varLong;
long varLong = (int)varInt;
int varInt = (short)varShort;
short varShort = (byte)varByte;
```
---
## Operadores de atribuição e aritméticos
```
int num = 0;        // Atribuição
num = num1 + num2;  // Soma
num = num1 - num2;  // Subtração
num = num1 * num2;  // Multiplicação
num = num1 / num2;  // Divisão
num = num1 % num2;  // Resto da divisão

num++;              // Pós-incremento
++num;              // Pré-incremento
num--;              // Pós-decremento
--num;              // Pré-decremento

num += num1         // Adiciona num1 em num
num -= num1         // Subtrai num1 em num
num *= num1         // Multiplica num1 com num
num /= num1         // Divide num com num1
num %= num1         // Resto da divisão num com num1
```
---
## Operadores lógicos e relacionais
#### Operadores relacionais
```
var1 < var2;        // Menor que
var1 <= var2;       // Menor ou igual
var1 > var2;        // Maior que
var1 >= var2;       // Maior ou igual
var1 == var2;       // Igual a
var1 != var2;       // Diferente

```
> :warning: ***Para comparar se um <u>objeto</u> é igual ao outro utiliza-se o método*** `equals`. ***Retornará verdadeiro se o conteúdo dos dois forem iguais.***
```
objeto1.equals(objeto2);
```
#### Operadores lógicos
```
condicao && condição;   // E (And)
condição || condicao;   // Ou (Or)
condicao ^ condicao;    // Ou exclusivo (XOr)
!condicao;              // Negação, inversão de valor
```
##### Tabela verdade E (And) - &&
Condição 1    | Condição 2  | Resultado
----          | ----        | ----
false         | false       | false
false         | true        | false
true          | false       | false
true          | true        | true

##### Tabela verdade Ou (Or) - ||
Condição 1    | Condição 2  | Resultado
----          | ----        | ----
false         | false       | false
false         | true        | true
true          | false       | true
true          | true        | true

##### Tabela verdade Ou Exclusivo (XOr) - ^
Condição 1    | Condição 2  | Resultado
----          | ----        | ----
false         | false       | false
false         | true        | true
true          | false       | true
true          | true        | false

#### Operador ternário
```
// Sintaxe
variavel = teste ? valor_de_retorno_verdadeiro : valor_de_retorno_falso

// Exemplo
int a = 1, b = 5;
boolean resultado = a < b ? true : false;
```
---
## Estruturas condicionais
#### If, else if, else
```
// Condicional simples
if(condicao) {
    instrucoes;
}

// Condicionais composta
if(condicao) {
    instrucoes;
} else {
    instrucoes;
}
// **************
if(condicao) {
    instrucoes;
} else if(condicao 2) {
    instrucoes;
} else {
    instrucoes;
}

// Condicionais encadeadas
if(condicao) {
    if(condicao2) {
        instrucoes;
    } else {
        instrucoes;
    }
} else {
    instrucoes;
}
```
#### Switch-case
```
switch(condicao) {
    case condicao1:
        instrucoes;
        break;
    case condicao2:
        instrucoes;
        break;
    default:
        instrucoes;
        break;
}
```
---

## Estruturas de repetições
#### While
```
while(condicao) {
    instrucoes;
}
```
> :warning: ***Para terminar a execução do*** `while`, ***dentro das instruções deve ter algum mecanismo para que a condição se torne falsa, senão ficará em loop infinito.***
#### Do while
Executa uma vez as instruções antes de fazer o teste da condição.
```
do {
    instrucoes;
} while(condicao);
```
#### For
```
for(int = 0; condicao; i++) {
    instrucoes;
}
```
#### For-each
Utilizado para vetores e listas.
```
int meuVetor [] = {1, 2, 3, 4}
for(int valor: meuVetor) {
    System.out.println(valor); // Imprime na tela cada um dos valores do vetor
}
```
> :warning: ***Dentro de uma estrutura de repetição, se o programa encontrar a instrução `continue` o laço é interrompido e desviado o inicio da estrutura, repetindo o código novamente.***

> :warning: ***Dentro de uma estrutura de repetição, se o programa encontrar a instrução `break` o laço é interrompido e desviado para fora da estrutura.***
---

## Métodos e funções
As diferenças entre métodos e funções:

- **Funções:** é um bloco de código reutilizável que não está associado a nenhuma classe. É um procedimento independente que realiza uma tarefa específica. Podem ser invocadas em qualquer lugar do código. Geralmente tem modificadores de acesso e sempre retornam valores.
- **Métodos:** é um bloco de código reutilizável que está associado a uma classe. É uma ação que um objeto pode executar. Métodos são invocados através de objetos da classe em que estçao definidos. Geralmente não possuem modificadores de acesso e não retornam valores.
##### Sintaxe de declaração de um método ou função
```
<modificadores> <tipo_retorno> <nome_método> (<parametros>) {
    instrucoes;
}
```
> :warning: ***funções que são criadas no programa principal, ou seja, no*** `main`, ***é necessário especificar o modificador*** `static`.
##### Modificadores
- `default` - Quando não especificamos na declaração. Pode ser acessado pro classes do mesmo pacote.
- `public` - Pode ser acessado por qualquer classe.
- `private` - Só pode ser acessado pela classe em que é declarado.
- `protected` - Pode ser acessado pela classe em que é declarado e por suas subclasses.
Outros modificadores serão discutidos posteriormente.
```
public class Main
{
	public static void main(String[] args) {
        printMessage();
    }

	static void printMessage() {
        System.out.println("Hello World");
    }
}
```
```
public class Main
{
	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		System.out.println(sum(num1, num2));
	}
	
	static int sum(int num1, int num2) {
    return num1 + num2;
    }
}
```