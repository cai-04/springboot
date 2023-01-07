# 工程简介

springmvc+jsp项目

需要导入jsp相关依赖支持，以及lombok的支持

```
 <dependencies>
        <!--内置tocat对Jsp支持的依赖，用于编译Jsp-->
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>

        <!--jstl的支持,c标签-->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>javax.servlet.jsp</groupId>
            <artifactId>javax.servlet.jsp-api</artifactId>
            <version>2.3.3</version>
        </dependency>

    <!--添加 tomcat 的支持.-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-tomcat</artifactId>
        <scope>provided</scope>
    </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
    <build>                
        <resources>
        <resource>
            <!--源文件夹-->
            <directory>scr/main/webapp</directory>
            <!--指定编译到META-INF/resources-->
            <targetPath>META-INF/resources</targetPath>
            <!--指定源文件夹中哪个资源要进行编译-->
            <includes>
                <include>*.*</include>
            </includes>
        </resource>
        </resources>
    </build>

```
可以通过jsp测试页面进行验证，地址：http://127.0.0.1:3000/user/hello

然后需要标记webapp文件夹

点击项目结构-->模块—>项目名称底下—>web—>web资源目录-->点击webapp确定

application.properties配置文件（jsp）

```
# 应用名称
spring.application.name=springmvc

# 应用服务 WEB 访问端口
server.port=3000
#Spring boot视图配置
spring.mvc.view.prefix= /
spring.mvc.view.suffix= .jsp
```

webapp底下最好不要创建其他文件夹可能会报错,无法识别jsp文件就把<directory>scr/main/webapp</directory>scr重写一下