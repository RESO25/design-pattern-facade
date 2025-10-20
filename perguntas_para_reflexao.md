### Peguntas Para Reflexão
---
1. **Qual é o papel do ComboFacade neste sistema?**
**R:** ele simplifica o acesso aos subsistemas ```Burger```, ```Sobremesa``` e ```Bebida```.
    - Como ele simplifica a vida do cliente (Main)?
    **R:** ele remove a necessidade de utilizar as classes modelo ```Burger```, ```Sobremesa``` e ```Bebida```, resumindo apenas ao uso do ```ComboFacade```.

2. **Por que usamos a interface ItemCombo?**
**R:** Para garantir que as classes ```Burger```, ```Sobremesa``` e ```Bebida``` tenham os mesmos métodos, no caso ```getNome``` e ```getPreco```.
    - Que benefícios isso traz para o design?
    **R:** facilita a implementação das classes modelo.

3. **Compare com o padrão Singleton:**
    - Poderia o ComboFacade também ser um Singleton? Por quê?
    **R:** não, pois o singleton permitiria apeas um combo por instância do hipotético ```ComboSingleton```.
    - Em que situação isso seria útil?
    **R:** seria útil em momentos em que apenas um combo é disponibilizado, e somente ele pode ser utilizado.

4. **Identifique os subsistemas:**
    - Quais são as classes que representam a "complexidade" escondida?
    **R:** as classes ```Combo``` e as classes ```Burger```, ```Bebida``` e ```Sobremesa```.
    - O que aconteceria se o cliente (Main) tivesse que criar cada item individualmente?
    **R:** Teria muita repetição de código, dado que as classes ```Burger```, ```Bebida``` e ```Sobremesa``` fazem basicamente a mesma coisa, só que com outro nome.

5. **Extensibilidade:**
    - Como você adicionaria um novo combo (Combo 4) ao sistema?
    **R:** apenas adicionaria um novo código no ```switch``` da classe ```ComboFacade``` com as especificações do lanche, da mesma forma que os outros combos foram declarados.
    - Que classes precisariam ser modificadas?
    **R:** somente a classe ```ComboFacade```.

6. **Validação e Tratamento de Erros:**
    - Como o sistema trata um código de combo inválido?
    **R:** qualquer código que não esteja entre ```1``` e ```3```.
    - Que melhorias você sugere?
    **R:** talvez adicionar uma lista de cada tipo de ```ItemCombo``` na classe ```Combo```, possibilitando mais de um item por classe, por exemplo um combo com 2 burgers, 1 bebida e 1 sobremesa, ou um combo com 1 burger, 3 sobremesas e 2 bebidas. 