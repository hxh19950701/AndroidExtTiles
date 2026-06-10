# AndroidExtTiles

一个 Android 应用项目，提供扩展系统磁贴功能。

## 项目介绍

AndroidExtTiles 是一个 Android 应用程序，旨在为用户提供额外的系统磁贴（Quick Settings Tiles）功能，增强 Android 系统的可用性和便利性。

## 技术栈

- **语言**: Java
- **构建工具**: Gradle
- **目标平台**: Android
- **支持库**: AndroidX

## 项目结构

```
AndroidExtTiles/
├── app/                    # 主应用模块
├── settings.gradle.kts     # Gradle 设置配置
├── gradle.properties       # Gradle 属性配置
├── build.gradle            # 项目级 Gradle 配置
└── README.md              # 项目文档
```

## 功能特性

- 📱 提供自定义系统磁贴服务
- 🔧 易于扩展和定制
- ⚡ 轻量级实现

## 快速开始

### 前置要求

- Android Studio 最新版本
- Java 8 或更高版本
- Android SDK（API 级别 21 及以上）

### 编译和运行

1. **克隆项目**
   ```bash
   git clone https://github.com/hxh19950701/AndroidExtTiles.git
   cd AndroidExtTiles
   ```

2. **打开项目**
   - 使用 Android Studio 打开项目根目录

3. **构建项目**
   ```bash
   ./gradlew build
   ```

4. **运行应用**
   - 连接 Android 设备或启动模拟器
   - 在 Android Studio 中点击 "Run" 按钮

## 核心组件

### SleepTileService

主要的磁贴服务类，位于 `com.vasthread.androidexttils` 包中，提供睡眠相关的快速设置磁贴功能。

## Gradle 配置

项目使用 Kotlin DSL 配置 Gradle，主要仓库包括：
- Google Maven Repository
- Maven Central
- Gradle Plugin Portal

## ProGuard 配置

项目包含 ProGuard 配置文件用于代码混淆和优化：
- 保护 `SleepTileService` 类不被混淆

## 许可证

暂未指定许可证。关于许可证信息，请查看项目根目录。

## 贡献

欢迎提交 Issue 和 Pull Request！

## 联系方式

- **项目所有者**: [hxh19950701](https://github.com/hxh19950701)
- **项目地址**: https://github.com/hxh19950701/AndroidExtTiles

## 更新记录

- **2025-05-17**: 最后更新日期
- **2025-04-28**: 项目创建日期
