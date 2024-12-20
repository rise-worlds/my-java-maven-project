# my-java-maven-project README

## 项目简介
这是一个使用 Maven 配置的 Java 1.8 项目，使用 HikariCP 连接到 MySQL 5.7 数据库。该项目的入口点是 `App.java`，它执行数据库查询并输出结果。

## 项目结构
```
my-java-maven-project
├── src
│   ├── config
│   │   └── hikari.properties
│   ├── main
│   │   ├── java
│   │   │   └── App.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
├── pom.xml
└── README.md
```

## 依赖项
该项目使用以下依赖项：
- HikariCP
- MySQL JDBC 驱动程序

## 构建和运行
1. 确保已安装 Maven 和 JDK 1.8。
2. 在项目根目录下运行以下命令以构建项目：
   ```bash
   mvn clean install
   ```
3. 配置 `config/hikari.properties` 文件，设置数据库连接信息。
4. 运行应用程序：
   ```bash
   mvn clean compile exec:java
   ```

## 注意事项
请确保 MySQL 数据库正在运行，并且已创建所需的数据库和表。