# Dota 2 Item Forge

面向 Minecraft 1.21.1 的 NeoForge 模组项目，以 Dota 2 的物品与装备为开发主题。

## 项目信息

- Mod ID：`dota2itemforge`
- 展示名称：Dota 2 Item Forge
- Minecraft：1.21.1
- NeoForge：21.1.265
- Java：21
- 作者：px8042

## 当前进度

项目处于开发初期，已建立物品、方块、创造模式标签页与配置的基础结构。
当前包含用于开发验证的方块和食物，以及初始化诊断配置；尚未实现 Dota 2 装备、技能或合成系统。
开发用方块和物品的模型、贴图等资源尚待补充。

## 本地开发

使用 JDK 21，在项目目录执行以下命令（Windows PowerShell）：

```powershell
# 编译并打包
.\gradlew.bat build

# 启动开发客户端
.\gradlew.bat runClient

# 启动开发服务器
.\gradlew.bat runServer

# 生成数据资源
.\gradlew.bat runData
```

首次构建需要联网下载 Gradle 和项目依赖。构建产物位于 `build/libs/`。
在 Linux 或 macOS 上使用 `./gradlew` 替代 `.\gradlew.bat`。

## 源码与资源

- `src/main/java/com/px8042/dota2_itemforge/`：入口、注册与配置代码。
- `src/main/resources/assets/dota2itemforge/`：语言及客户端资源。
- `src/main/templates/META-INF/neoforge.mods.toml`：模组元数据模板。
- `gradle.properties`：版本、Mod ID 与展示名称。

## 许可

当前模组元数据声明为 `All Rights Reserved`。
原始开发模板的许可说明保留在 `TEMPLATE_LICENSE.txt` 中。
