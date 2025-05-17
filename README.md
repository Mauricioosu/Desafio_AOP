# 💼 Desafio AOP – Sistema Bancário com Programação Orientada a Aspectos (AspectJ)

Este projeto é uma solução para um desafio proposto com foco em **Programação Orientada a Aspectos (AOP)** utilizando **Java** com **AspectJ**. O objetivo é modularizar uma lógica transversal ao sistema – neste caso, a verificação de saldo insuficiente em saques bancários – de forma desacoplada e reutilizável.

---

## 🧩 Objetivo

Criar um sistema bancário simples com múltiplos tipos de contas (corrente, poupança, investimento), onde é possível realizar saques. Sempre que o saldo for insuficiente, um **log de erro** deve ser disparado por um aspecto AOP, sem a repetição de código nas classes de negócio.

---

## 🛠️ Tecnologias e Ferramentas

- **Java 17+**
- **AspectJ 1.9+**
- **Maven**
  
---

## ⚙️ Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/Mauricioosu/Desafio_AOP.git
   cd Desafio_AOP

- mvn clean compile

- mvn exec:java -Dexec.mainClass="app.Main"

---

## 🔍 Exemplo de Saída Esperada

Saque realizado na conta 001. Novo saldo: R$350.0

[ERRO] Saldo insuficiente na conta 002. Tentativa de saque: R$150.0, Saldo atual: R$100.0

[ERRO] Saldo insuficiente na conta 003. Tentativa de saque: R$150.0, Saldo atual: R$50.0

---

## 📌 Conceitos Aplicados

POO (Programação Orientada a Objetos) para estruturação das entidades do sistema.

AOP (Programação Orientada a Aspectos) para tratar preocupações transversais como logs de saldo insuficiente.

Separação de responsabilidades, mantendo o código limpo e modular.


