# Projeto Tecnomotor - Desafio Android

Este é um aplicativo Android criado como parte de um desafio técnico para a vaga de Analista de Desenvolvimento Android. O app consome uma API de veículos, armazena os dados localmente com Room e permite visualizar, inserir e remover veículos.

---

## 🔧 Funcionalidades

- Buscar dados de veículos e montadoras via API.
- Armazenar os dados localmente com Room.
- Visualizar veículos salvos em uma lista.
- Adicionar manualmente novos veículos.
- Remover veículos da base local.
- Persistência offline.
- Arquitetura MVVM.

---

## 📲 Tecnologias Utilizadas

- **Kotlin**
- **Jetpack Compose + Material 3**
- **Room (com KSP)**
- **Retrofit + Gson**
- **ViewModel + LiveData**
- **AndroidX Libraries**

---

## 🏗️ Estrutura de Pastas
com.example.projetotecnomotor
│
├── data
│ ├── api # Retrofit Services
│ ├── db # Room Database
│ └── model # Data Models
│
├── repository # Repositório central (API + Room)
├── viewmodel # ViewModel com escopo da UI
└── ui
├── adapter # RecyclerView Adapter (caso use XML)
└── view # Telas e Activities

## ▶️ Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/honoriogerson/androidApp.git

   Abra o projeto no Android Studio.

2. Certifique-se de ter o Android SDK 34+ instalado.

3. Conecte um dispositivo ou inicie um emulador.

4. Clique em ▶️ "Run" ou gere o APK com:

Desenvolvido por Gerson Honório

