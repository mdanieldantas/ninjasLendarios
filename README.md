# 🥷 Desafio 1: Ninjas de Konoha - Java.10x

[cite_start]Este projeto faz parte do desafio prático de Java, focado na manipulação de variáveis, tipos de dados e lógica condicional[cite: 2, 3]. [cite_start]O objetivo é gerenciar as informações e o status de missões de três ninjas da Vila da Folha[cite: 8].

## 📋 Descrição do Projeto

[cite_start]O programa representa três ninjas lendários, armazenando dados fundamentais e validando se eles estão aptos a concluir suas missões com base em regras específicas de idade e nível de dificuldade[cite: 9, 12].

### Dados Gerenciados:
* [cite_start]**Identificação:** Nome do Ninja[cite: 9].
* [cite_start]**Idade:** Idade do personagem[cite: 9].
* [cite_start]**Missão:** Nome da missão, nível de dificuldade e status de conclusão[cite: 9].

## ⚙️ Regras de Negócio (Lógica de Missão)

[cite_start]Para aumentar a dificuldade do desafio, foi implementada uma lógica de verificação baseada na idade do ninja[cite: 11, 12]:

1.  [cite_start]**Ninjas menores de 15 anos:** Só podem concluir missões de nível **C** ou **D**[cite: 14].
2.  [cite_start]**Ninjas com 15 anos ou mais:** Estão autorizados a concluir missões de **qualquer nível**[cite: 14].
3.  [cite_start]**Atualização de Status:** O sistema altera automaticamente o status da missão para "Concluída" ou "Não concluída" após validar estas condições[cite: 13, 15].

## 🛠️ Tecnologias e Conceitos Aplicados

* [cite_start]**Tipos de Dados:** Utilização de `String`, `int` e outros tipos primitivos[cite: 4].
* [cite_start]**Variáveis:** Declaração e atribuição de valores para representar os atributos dos ninjas[cite: 5].
* [cite_start]**Saída de Dados:** Exibição de informações no console através de `System.out.println`[cite: 6].
* [cite_start]**Condicionais:** Estruturas `if/else` para validação das regras de missão[cite: 12].

## 🚀 Como executar

1. Certifique-se de ter o JDK instalado.
2. Copie o código para um arquivo chamado `Main.java`.
3. Compile o código: `javac Main.java`.
4. Execute o programa: `java Main`.

---
[cite_start]*Este desafio segue as diretrizes da trilha Java.10x[cite: 2].*