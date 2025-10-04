# 🎮 Tic-Tac-Toe Multijugador (3 en raya)

Una implementación moderna y elegante del clásico juego de tres en raya (Tic-Tac-Toe o Gato), desarrollado de forma nativa para Android utilizando Kotlin y Jetpack Compose. Esta aplicación permite a dos jugadores jugar en tiempo real, uniéndose a partidas mediante un código único.

---

## ✨ Características Principales

- **Experiencia NATIVA de Android:** Construido completamente con Jetpack Compose, ofreciendo una interfaz de usuario declarativa, moderna y fluida.
- **Multijugador en Tiempo Real:** Los jugadores pueden competir de forma síncrona, con actualizaciones instantáneas de las jugadas.
- **Creación y Unión de Partidas:**
  - **Crear Juego:** Genera un código único que el segundo jugador puede usar.
  - **Unirse a Juego:** Permite a un jugador ingresar el código de la partida existente para comenzar a jugar.
- **Lógica de Juego por Turnos:** El juego gestiona automáticamente los turnos, asegurando una experiencia de juego justa.
- **Detección Automática de Victoria/Empate:** La aplicación notifica inmediatamente al jugador cuando hay un ganador o un empate.

---

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Kotlin
- **UI Toolkit:** Jetpack Compose
- **Backend / Sincronización:** Firebase Realtime Database
- **Desarrollo:** Android Studio

---

## 🚀 Cómo Jugar

1. **Instalación:** Clona este repositorio y ábrelo en Android Studio. Sincroniza el proyecto y ejecuta la aplicación en dos dispositivos o emuladores diferentes.

### Jugador 1 (Anfitrión):

- En la pantalla de inicio, selecciona "Crear Juego".
- El sistema generará y mostrará un código de partida.
- Espera a que el Jugador 2 se una.

### Jugador 2 (Invitado):

- En la pantalla de inicio, selecciona "Unirse a Juego".
- Ingresa el código de partida proporcionado por el Jugador 1.

**A Jugar:** El Jugador 1 (generalmente 'X') comienza. Jueguen por turnos hasta que uno logre hacer tres en raya.

---

## 🤝 Contribuciones
Las contribuciones son bienvenidas. Si tienes sugerencias, correcciones de errores o ideas para nuevas características, no dudes en abrir un issue o enviar un Pull Request.
