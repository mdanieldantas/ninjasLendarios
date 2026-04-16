# 🥷 Desafio 1: Ninjas de Konoha - Java.10x

Este projeto faz parte do desafio prático de Java, com foco em variáveis, tipos de dados e lógica condicional.
O objetivo é gerenciar as informações e o status das missões de três ninjas da Vila da Folha.

## 📋 Descrição do Projeto

O programa representa três ninjas lendários e valida se eles podem concluir suas missões com base em regras de idade e ranking.

### Dados gerenciados
- **Nome** do ninja
- **Idade**
- **Nome da missão**
- **Ranking da missão** (`char`)
- **Status da missão** (`Concluída` ou `Não concluída`)

## ⚙️ Regras de Negócio (Lógica de Missão)

1. **Ninjas menores de 15 anos:**
    - Só podem concluir missões de ranking **C** ou **D**.
2. **Ninjas com 15 anos ou mais:**
    - Podem concluir missões de **qualquer ranking**.
3. **Status automático:**
    - O status é atualizado conforme as regras acima.

## ✅ Atualizações aplicadas no código

- Assinatura do método principal corrigida para o padrão Java:
    - `public static void main(String[] args)`
- Ajuste e simplificação de lógica em versão anterior:
    - `missaoConcluida1 = idadeNinja1 >= 18;`
- Compilação e execução validadas com sucesso no terminal.

## 🛠️ Tecnologias e Conceitos Aplicados

- `String`, `int`, `char`, `boolean`
- Declaração e atribuição de variáveis
- Estruturas condicionais `if/else`
- Operadores lógicos (`||`)
- Saída no console com `System.out.println`
- Organização por pacote Java (`package NivelIntermediario`)

## 🚀 Como executar

No PowerShell, na raiz do projeto:

```powershell
javac -d out\production\ninjasLendarios src\NivelIntermediario\Main.java
java -cp out\production\ninjasLendarios NivelIntermediario.Main
📌 Observações
•
Projeto em fase de aprendizado, com possibilidade de refatoração para reduzir repetição.
•
Exemplo de melhoria futura: criar um método para validar missão e reaproveitar para todos os ninjas.