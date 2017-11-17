# FlySoloing  Commons

[![GitHub release](https://img.shields.io/github/release/flysoloing/commons.svg)](https://github.com/flysoloing/commons/releases)

FlySoloing Commons，个人通用代码包，包括DTO，enhancement，util，pagination等

## 正式版本

当前正式版本为1.0.0，发布于2017年11月17日

由于jar包未加入到Maven的中央仓库，为了使用，首先需要进行私有库的设置

```xml
<!-- private remote libs repository -->
<repositories>
    <repository>
        <id>flysoloing-maven-libs-repo</id>
        <name>FlySoloing Maven Libs Repository</name>
        <url>http://flysoloing.github.io/repo/libs</url>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```

然后在Maven的`pom.xml`文件中添加`commons`依赖项

```xml
<dependency>
    <groupId>com.flysoloing</groupId>
    <artifactId>commons</artifactId>
    <version>1.0.0</version>
</dependency>
```
## 快照版本

如果要使用FlySoloing Commons的当前快照版本，请将`pom.xml`文件中依赖的`<version>`内容改为1.0-SNAPSHOT

- [commons-1.0-SNAPSHOT.jar][commons-1.0-SNAPSHOT]

## 参考及定义

无

## 版权申明

无

[commons-1.0-SNAPSHOT]: https://github.com/flysoloing/repo/raw/gh-pages/libs/com/flysoloing/commons/1.0-SNAPSHOT/commons-1.0-SNAPSHOT.jar