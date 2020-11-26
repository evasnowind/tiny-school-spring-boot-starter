# tiny-school-spring-boot-starter
展示如何自定义一个spring boot starter

## 文件夹说明

- school-spring-boot-starter
  - 自定义spring boot starter实现
- test-school-starter
  - 测试上面的starter

注意，一般而言，自定义一个starter时，在pom中定义依赖关系时需要继承spring-boot-starter（或者spring-boot-starter-parent，我看到的参考资料里这俩都行，建议去官网找最精准的描述），即类似这种：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <artifactId>http-starter</artifactId>
    <version>0.0.1-SNAPSHOT</version>

    <!-- 自定义starter都应该继承自该依赖 -->
    <!-- 如果自定义starter本身需要继承其它的依赖，可以参考 https://stackoverflow.com/a/21318359 解决 -->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starters</artifactId>
        <version>1.5.2.RELEASE</version>
    </parent>

    <dependencies>
        <!-- 自定义starter依赖此jar包 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>
        <!-- lombok用于自动生成get、set方法 -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.16.10</version>
        </dependency>
    </dependencies>

</project>
```

但如果自定义starter本身需要继承其它的依赖，可以参考 https://stackoverflow.com/a/21318359  （或者这个链接：https://stackoverflow.com/questions/21317006/spring-boot-parent-pom-when-you-already-have-a-parent-pom/21318359#21318359）解决。

## 有关自定义spring boot starter的参考资料

- [Spring Boot Starters是什么？](https://www.cnblogs.com/tjudzj/p/8758391.html)
- [SpringBoot应用篇（一）：自定义starter](https://www.cnblogs.com/hello-shf/p/10864977.html)
- [最详细的自定义Spring-Boot-Start开发教程](https://blog.springlearn.cn/posts/14644/)
- [手把手教你实现自定义Spring Boot的 Starter](https://www.cnblogs.com/root429/p/13833174.html)
