# Java FX - Primeira Aplicação
---

## Introdução
Primeira aplicação em Java FX com a IDE Visual Code e Scene Builder.
Essa primeira aplicação foi aprendendo como manipular `labels`, `ComboBox` e `ChoiceBox`.

---

## Configuração do ambiente
- [:link:Configurando a variável de ambiente JAVA_HOME](https://www.baeldung.com/java-home-on-windows-mac-os-x-linux)
- [:link: Download da biblioteca do Java FX](https://gluonhq.com/products/javafx/)
- [:link: Configuração do Java FX](https://openjfx.io/openjfx-docs/)

---

## Funcionamento
O funcionamento da aplicação é simples:

- No Combo Box, ao selecionar o texto da lista, o texto *Combo Box Text* será substituído. Caso seja "Texto2" ou "Texto3" o `text field` abaixo será desabilitado;
- O Text Field ao digitar um texto e pressionar enter, o texto *Text Field Text* será substituído, caso o Combo Box não esteja com os textos "Texto2" ou "Texto3";
- O funcionamento do Choice Box é semelhante ao Combo Box, porém com textos diferentes;

---

### Observações
- Foi criado um pacote `views` para alocar o arquivo `main.fxml` e o `Controller.java`. Dentro do arquivo `main.fxml` no atributo `fx:controller` deve ficar dessa maneira `fx:controller="views.Controller"`;

---