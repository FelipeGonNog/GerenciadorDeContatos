# 📱 Gerenciador de Contatos

![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)

> Um aplicativo Android demonstrativo focado na implementação de diferentes tipos de menus e fluxos de interação com o usuário.

---

## 🎯 Sobre o Projeto

Este projeto foi desenvolvido para explorar as capacidades de interface do Android, especificamente no que diz respeito à navegação contextual. Ele simula uma lista de contatos onde o usuário pode realizar ações rápidas através de menus intuitivos.

### 🕹️ Funcionalidades principais:
* **Menu de Opções (Toolbar):** Ações globais como adicionar novos contatos.
* **Menu Suspenso (Popup Menu):** Acionado por botão para ações rápidas (Ligar/SMS).
* **Menu de Contexto:** Interação ao pressionar longamente um item da lista.
* **Feedback Dinâmico:** Uso de `Toasts` para informar ações ao usuário em tempo real.

---

## 🛠️ Tecnologias e Conceitos

* **Linguagem:** Kotlin
* **Arquitetura:** Baseada em `AppCompatActivity`
* **UI Components:** * `TextView` e `ImageButton`
    * `MenuInflater` para inflar layouts de menu XML
    * `Toast` para notificações rápidas

---
## 📸 Demonstração Lógica

O app segue o fluxo de captura de eventos de clique para disparar menus específicos:

| Recurso | Gatilho | Ação |
| :--- | :--- | :--- |
| **Add Contact** | Ícone na Toolbar | Abre formulário (Simulado) |
| **Popup Menu** | Clique no `ImageButton` | Opções de Ligar/SMS |
| **Context Menu** | Long Click no Nome | Opções customizadas |

---
