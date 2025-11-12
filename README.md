# 🎲 Projeto Bingo em Java - POO

## Integrante do grupo

- Cleidson Danilo Timmoteo Lopes - 01781470
- Enzo Andrade Grippe - 01783612
- Bruno César da Conceição - 01772191
- Daniel Oliveira Braga de Mesquita - 01796016
- Eduardo Sidney de Oliveira Belo Junior - 01826330

## 📘 Descrição
Este projeto é uma aplicação simples em **Java** que simula um **sistema de Bingo**.  
O usuário pode sortear números aleatórios de 1 a 75 e visualizar todos os números já sorteados até o momento.  

O programa foi desenvolvido para praticar:
- Criação de classes e métodos;
- Manipulação de coleções (`Set`, `List`);
- Uso da classe `Scanner` para interação com o usuário;
- Estruturas de decisão e repetição em Java.

---

## 🧩 Estrutura do Projeto

O projeto contém **duas classes principais**:

### 1. `Bingo.java`
Contém a **lógica do sorteio**, como:
- Sorteio de um número aleatório que ainda não foi sorteado;
- Armazenamento dos números já sorteados;
- Exibição da lista de números sorteados;
- Método para reiniciar o jogo (limpar os números).

### 2. `MainBingo.java`
É a **classe principal**, responsável por:
- Exibir o menu de opções;
- Ler as escolhas do usuário via `Scanner`;
- Chamar os métodos da classe `Bingo`.

---

## ⚙️ Funcionalidades

O programa apresenta o seguinte menu:

- Ao escolher `1`, um novo número é sorteado.
- Ao escolher `2`, são exibidos todos os números já sorteados.
- Ao escolher `3`, todos os números sorteados são apagados, reiniciando o jogo.
- Ao escolher `0`, o programa é encerrado.

---

## 🖥️ Como Executar

1. **Compile** o código no terminal:
   ```bash
   javac MainBingo.java

📚 Tecnologias Utilizadas

Linguagem: Java 17+

Ambiente de desenvolvimento: qualquer IDE ou terminal compatível (VS Code, Eclipse, IntelliJ, etc.)

Recursos da biblioteca padrão Java:

java.util.Scanner

java.util.Set

java.util.Random

java.util.Collections

## 🚀 Melhorias Futuras

Algumas ideias de aprimoramentos que podem ser implementadas em versões futuras do projeto:

- 🎯 **Sistema de Cartelas:**  
  Gerar automaticamente cartelas de jogadores e marcar os números sorteados, identificando quando alguém faz “Bingo!”.

- 🧮 **Controle de Vencedores:**  
  Permitir múltiplas cartelas em jogo e exibir qual jogador venceu primeiro.

- 🪄 **Interface Gráfica (GUI):**  
  Criar uma interface visual utilizando **Java Swing** ou **JavaFX** para tornar o jogo mais interativo e intuitivo.

- 💾 **Persistência de Dados:**  
  Salvar o histórico de sorteios e resultados em arquivos de texto ou banco de dados.

- 🎵 **Feedback Sonoro e Animações:**  
  Adicionar efeitos visuais e sons para o momento do sorteio e da vitória.

- 🌐 **Versão Online:**  
  Adaptar o jogo para funcionar via web, permitindo partidas entre múltiplos usuários conectados.

---

Essas melhorias podem transformar o projeto de um simples sistema de console em uma **aplicação completa e interativa**, ideal para demonstrar conhecimentos de **orientação a objetos, interface gráfica e persistência de dados**.
