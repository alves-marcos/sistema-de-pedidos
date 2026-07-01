# 🛒 Sistema de Pedidos em Java

## 📌 Sobre o projeto

O **Sistema de Pedidos** é um projeto desenvolvido em Java com o objetivo de praticar os principais conceitos de **Programação Orientada a Objetos (POO)**.

A aplicação simula um sistema simples de gerenciamento de pedidos, permitindo cadastrar produtos, criar pedidos, adicionar ou remover itens, alterar o status do pedido e calcular automaticamente o valor total da compra.

Este projeto foi desenvolvido com foco em boas práticas de modelagem de classes, encapsulamento e organização do código.

---

# 🚀 Funcionalidades

* ✅ Cadastrar produtos
* ✅ Listar produtos cadastrados
* ✅ Criar pedidos
* ✅ Adicionar produtos ao pedido
* ✅ Remover produtos do pedido
* ✅ Alterar o status do pedido
* ✅ Calcular automaticamente o valor total
* ✅ Exibir resumo completo do pedido

---

# 🛠 Tecnologias utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Collections (`ArrayList`)
* Enum
* LocalDateTime

---

# 📂 Estrutura do projeto

```
src
│
├── application
│   └── Main.java
│
├── entities
│   ├── Produto.java
│   ├── ItemPedido.java
│   ├── Pedido.java
│   │
│   └── enums
│       └── StatusPedido.java
│
└── services
    └── PedidoService.java
```

---

# 📖 Modelagem das classes

## Produto

Representa um produto disponível para venda.

### Atributos

| Atributo | Tipo    |
| -------- | ------- |
| id       | Integer |
| nome     | String  |
| preco    | Double  |

---

## ItemPedido

Representa um produto dentro de um pedido.

### Atributos

| Atributo   | Tipo    |
| ---------- | ------- |
| produto    | Produto |
| quantidade | Integer |

### Métodos

* subtotal()

---

## Pedido

Representa um pedido realizado pelo cliente.

### Atributos

| Atributo   | Tipo             |
| ---------- | ---------------- |
| id         | Integer          |
| data       | LocalDateTime    |
| status     | StatusPedido     |
| listaItens | List<ItemPedido> |

### Métodos

* adicionarItem()
* removerItem()
* totalPedido()
* resumoPedido()

---

## StatusPedido

Enum responsável pelos estados do pedido.

```
PENDENTE
PAGO
ENVIADO
CANCELADO
```

---

# 📊 Diagrama de Classes

```
                    Produto
          +-------------------------+
          | id                      |
          | nome                    |
          | preco                   |
          +-------------------------+

                    ▲
                    │
                    │
          +-------------------------+
          |      ItemPedido         |
          +-------------------------+
          | produto                 |
          | quantidade              |
          +-------------------------+
          | subtotal()              |
          +-------------------------+

                    ▲
                    │
                    │
          +-------------------------+
          |        Pedido           |
          +-------------------------+
          | id                      |
          | data                    |
          | status                  |
          | listaItens              |
          +-------------------------+
          | adicionarItem()         |
          | removerItem()           |
          | totalPedido()           |
          | resumoPedido()          |
          +-------------------------+

                    │
                    │
                    ▼

             StatusPedido (Enum)

          PENDENTE
          PAGO
          ENVIADO
          CANCELADO
```

---

# 🔄 Fluxo da aplicação

1. O usuário cadastra um ou mais produtos.
2. O sistema gera automaticamente um identificador para cada produto.
3. O usuário cria um novo pedido.
4. O pedido inicia com o status **PENDENTE**.
5. O usuário escolhe os produtos desejados.
6. Para cada produto é criada uma instância de **ItemPedido**.
7. O pedido armazena todos os itens em uma lista.
8. O valor total é calculado somando o subtotal de todos os itens.
9. O usuário pode alterar o status do pedido.
10. O sistema apresenta um resumo completo do pedido.

---

# 🧠 Conceitos de Programação Orientada a Objetos aplicados

* Classes
* Objetos
* Encapsulamento
* Composição
* Enum
* Sobrescrita de métodos (`toString()`)
* Coleções (`ArrayList`)
* Métodos de instância
* Organização em camadas
* Responsabilidade única das classes

---

# 📷 Exemplo de utilização

```
========== MENU ==========

1 - Cadastrar produto
2 - Listar produtos
3 - Criar pedido
4 - Adicionar item ao pedido
5 - Remover item do pedido
6 - Alterar status do pedido
7 - Resumo do pedido
8 - Listar pedidos
0 - Sair
```

---

## Exemplo de resumo

```
===============================
PEDIDO Nº 1

Data: 01/07/2026 19:30

Status: PAGO

Notebook Dell
Quantidade: 2
Preço Unitário: R$ 3500.00
Subtotal: R$ 7000.00

Mouse Gamer
Quantidade: 1
Preço Unitário: R$ 150.00
Subtotal: R$ 150.00

-------------------------------

TOTAL: R$ 7150.00

===============================
```

---

# 🎯 Objetivos de aprendizagem

Durante o desenvolvimento deste projeto foram praticados:

* Modelagem de entidades.
* Relacionamento entre objetos.
* Manipulação de listas.
* Criação de regras de negócio.
* Separação de responsabilidades.
* Estruturação de projetos Java.
* Boas práticas de orientação a objetos.

---

# 🚀 Possíveis melhorias futuras

* Persistência em banco de dados.
* Interface gráfica utilizando JavaFX.
* API REST com Spring Boot.
* Cadastro de clientes.
* Exclusão de pedidos.
* Pesquisa de produtos por nome.
* Atualização de produtos.
* Controle de estoque.
* Geração de nota fiscal.
* Exportação do pedido em PDF.
* Integração com banco de dados MySQL ou PostgreSQL.
* Testes unitários utilizando JUnit.
* Tratamento de exceções personalizadas.
* Autenticação de usuários.

---

# 👨‍💻 Autor

Desenvolvido por **Marcos Alves** como projeto de estudo para praticar Programação Orientada a Objetos em Java e fortalecer o portfólio para oportunidades de estágio e desenvolvimento de software.
