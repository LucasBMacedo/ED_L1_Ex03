📁 Projeto: Fatorial Recursivo

📌 Descrição: >
  Aplicação em Java que calcula o fatorial de um número inteiro utilizando uma função recursiva. 
  A função é chamada repetidamente até que o número seja reduzido a 1, momento em que a recursão começa a retornar e calcula o fatorial.

🗂️ Estrutura de Arquivos:
  - 📄 src/controller/FatorialRecursivo.java: Contém o método recursivo que calcula o fatorial.
  - 📄 src/view/Principal.java: Responsável pela interação com o usuário, entrada do número e exibição do resultado.

🧠 Lógica da Recursividade:
  método: fatorialRecursivo(int n)
  explicação:
    - ✋ Condição de parada: Quando `n` for menor que 1, retornamos 1, que é o valor base do fatorial.
    - 🔁 Relação recursiva: 
        - Multiplica `n` pelo resultado de `fatorialRecursivo(n - 1)`, fazendo a chamada recursiva até chegar a 1.

💬 Exemplo de Execução:
  entrada:
    - Número: 5
  saída:
    - O fatorial de 5 é: 120

📥 Entrada:
  - O usuário insere um número inteiro via `JOptionPane`, com um limite de até 12.
  
📤 Saída:
  - Exibe o resultado do cálculo do fatorial no formato de mensagem com `JOptionPane`.

📌 Observações:
  - O código possui uma limitação de entrada, restringindo o valor de `n` para evitar *stack overflow* em chamadas muito profundas.
  - A implementação segue o padrão MVC, separando claramente a lógica de cálculo (controller) e a interface com o usuário (view).

👨‍💻 Autor:
  Desenvolvido po **Lucas Bezerra de Macedo**.
