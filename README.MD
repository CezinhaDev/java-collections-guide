<p align="center">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original-wordmark.svg" alt="Java logo" width="150"/>
</p>

# 🗂️ JAVA COLLECTIONS: LIST, SET E MAP

Projeto criado para demonstrar, com **exemplos práticos**, como funcionam as principais coleções do Java: **`List`**, **`Set`** e **`Map`**.  
Ideal para quem está aprendendo sobre estruturas de dados e deseja entender as diferenças no armazenamento e manipulação de elementos.

---

## 🚀 Funcionalidades

✅ Uso das coleções:

- 📋 **List** – Aceita elementos duplicados e mantém a **ordem de inserção**
- 🚫 **Set** – Não permite duplicatas e **não garante ordem**
- 🔑 **Map** – Estrutura de **chave-valor**, não permite chaves duplicadas

---

## 🧠 O Que Você Vai Aprender

- Inserção e acesso de dados com `List`
- Garantia de unicidade usando `Set`
- Organização de dados com `Map` (chave-valor)
- Impressão clara dos dados no console
- Diferenças práticas entre `ArrayList`, `HashSet` e `HashMap`

---

## 💻 Exemplos no Console

### 📋 List (ArrayList)
```java
List<String> funcionarios = new ArrayList<>();
funcionarios.add("João");
funcionarios.add("Maria");
funcionarios.add("João"); // Duplicado permitido e ordem preservada

System.out.println(funcionarios);
Saída esperada:

[João, Maria, João]
🚫 Set (HashSet)

Set<String> produtos = new HashSet<>();
produtos.add("Notebook");
produtos.add("Mouse");
produtos.add("Teclado");
produtos.add("Mouse"); // Duplicata ignorada automaticamente

System.out.println(produtos);
Saída esperada (ordem pode variar):

[Notebook, Mouse, Teclado]
🔑 Map (HashMap)

Map<Integer, String> clientes = new HashMap<>();
clientes.put(1, "Carlos");
clientes.put(2, "Ana");
clientes.put(3, "Carlos"); // Valores duplicados OK, mas chaves únicas!

System.out.println(clientes.get(1));
Saída esperada:

Carlos
🛠️ Tecnologias Utilizadas
☕ Java: Versão 17 ou superior

🧠 IDEs: VS Code, IntelliJ IDEA ou Eclipse

📦 Execução: Via terminal/console para testes rápidos e objetivos

📂 Estrutura do Projeto

collections-java/
├── Principal.java
└── README.md
💡 Aprendizados Principais
Ao explorar este projeto, você reforçará:

As diferenças entre List, Set e Map

Como lidar com elementos duplicados em coleções

A importância da saída no console para validação rápida

Boas práticas no uso das coleções em Java

🤝 Contribuição
Contribuições são muito bem-vindas!
Sinta-se à vontade para:

Clonar o repositório

Testar os exemplos

Abrir pull requests ou issues com melhorias ou dúvidas

📫 Contato
Desenvolvido com 💻 e ☕ por César Henrique

🔗 GitHub

🔗 LinkedIn

