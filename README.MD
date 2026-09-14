# HideModded — NeoForge 1.21.1 Port

> **I did not create this mod.** This is a port of [HideModded](https://github.com/CiLuQwQ/HideModded) and [HideModded-Continued](https://github.com/DavidCGranger/HideModded-Continued) to **NeoForge 1.21.1**. All original credit belongs to the original authors listed below.

---

## What does it do?

After Minecraft 1.15.2, if the game is modified:
- An asterisk `*` appears in the window title bar.
- A `(Modded)` tag appears next to the game version in the main menu.
- NeoForge adds a branding line showing the number of loaded mods.

This mod hides all of that, making the game look like a vanilla installation.

### Features
- Hides the `*` in the window title bar.
- Hides the `(Modded)` tag in the main menu version string.
- Hides the NeoForge branding line (mod counter) in the main menu.
- Config GUI accessible from the Mods screen.
- Language support: English (`en_us`) and Spanish (`es_es`).
- Client-side only — does not affect server compatibility.

---

## Requirements

| Dependency | Version |
|---|---|
| Minecraft | 1.21.1 |
| NeoForge | 21.1.250+ |
| Java | 21 |

---

## Building from source

```bash
./gradlew build
```

The resulting JAR will be at `build/libs/hidemodded-1.0.4.jar`.

---

## Original Authors & Credits

This port would not exist without the work of:

| Role | Author | Links |
|---|---|---|
| Original mod creator | **CiLuQwQ** | [GitHub](https://github.com/CiLuQwQ/HideModded) · [Modrinth](https://modrinth.com/mod/hidemodded) · [CurseForge](https://www.curseforge.com/minecraft/mc-mods/hideasterisk) |
| HideModded-Continued (NeoForge/Fabric hybrid reference) | **DavidCGranger** | [GitHub](https://github.com/DavidCGranger/HideModded-Continued) |
| NeoForge 1.21.1 Port | **WydenFox** | *(this repo)* |

---

## License

This project is licensed under the **GNU General Public License v3.0 (GPL-3.0)**, inherited from the original mod.  
See [LICENSE](LICENSE) for full terms.
