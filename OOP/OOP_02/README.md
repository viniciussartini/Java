# Exercício 02 - Programação Orientada à Objetos
---
## Problema

Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque).
Em seguida, faça:
- Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque);
- Realizar uma entrada no estoque e mostrar novamente os dados do produto;
- Realizar uma saída no estoque e mostrar novamente os dados do produto;

Criar uma classe produto conforme abaixo:

### Diagrama UML da Classe produto:

![Class prodcut](https://github.com/viniciussartini/Java/blob/main/OOP_02/ClassProduct.png)
---
## Observações

### Sobreposição da operação ```toString``` padrão dos Objetos Java
Método utilizado na classe Product:

```
public String toString() {
return name
	+ ", $ "
	+ String.format("%.2f", price)
	+ ", "
	+ quantity
	+"units, Total: $ "
	+ String.format("%.2f", totalValueInStock());
}
```

Quando chamamos a função ```System.out.println(product);``` para exibir as informações do produto, implicitamente, o programa chama o método ```toString()``` que foi criado.
