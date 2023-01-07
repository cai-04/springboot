1.多文件上传访问地址:127.0.0.1:3000/multiuploadPage

2.单文件上传访问地址:127.0.0.1:3000/singleuploadPage
3.参数返回：成功：{"code":300,"count":0,"msg":"ok","data":null}
失败：{"code":400,"count":0,"msg":"ok","data":null}

4.依赖引入

```
 <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <!--jsr3参数校验器-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <!--swagger-->
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.9.2</version>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.9.2</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
```

swagger：地址：http://127.0.0.1:3000/swagger-ui.html

