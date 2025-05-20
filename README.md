# 🏦 Banco Digital em Java

Este repositório contém um projeto de **Banco Digital** utilizando conceitos de **Programação Orientada a Objetos (POO)** em Java.

## 📌 Objetivo

O objetivo é reforçar os conceitos de **abstração, encapsulamento, herança e polimorfismo** através da criação de um sistema bancário simples.

## 🛠️ Funcionalidades

- Criar **contas bancárias** (Conta Corrente e Conta Poupança)
- **Autenticação de clientes** (Verificação de senha)
- **Depósito, saque e transferência** entre contas
- **Cobrança de taxas na conta corrente**
- **Aplicação de juros na poupança**
- Administração de contas pelo banco

## 🏗️ Estrutura

### 🔹 Classes e Interfaces

- `Conta` (Classe abstrata com métodos comuns)
- `ContaCorrente` (Possui taxa de manutenção)
- `ContaPoupanca` (Aplica juros sobre o saldo)
- `Cliente` (Nome e senha para autenticação)
- `Banco` (Gerencia as contas)

### 🔹 Melhorias Implementadas

1. **Taxas Bancárias:** Conta corrente desconta taxa de manutenção.
2. **Juros na Poupança:** Conta poupança tem rendimento mensal.
3. **Autenticação de Cliente:** Operações exigem senha do cliente.

## 🚀 Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/banco-digital.git

2. Abra o projeto em sua IDE Java (Eclipse, IntelliJ, VS Code).

3. Execute Main.java para testar o sistema.

##📌 Melhorias Futuras

Implementação de extrato detalhado

Criação de contas empresariais

Interface gráfica para o banco digital
