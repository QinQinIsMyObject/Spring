# 项目说明
## 1、主要功能
	依赖的注入（DI）另一种理解方式
## 2、主要知识点
	客户端→servlet→services→Dao→DB拿到数据后，返回→Dao→services→servlet→客户端
	servlet依赖资源主要是业务层services；
	services主要依赖资源Dao；
	之前是services调用Dao，···Dao接口···new一个Dao.impl。
## 3、说明
	写的代码是services和Dao层。
## 4、报错
	
## 5、附加
### Spring
	官网：https://spring.io/
	API-Framework：https://spring.io/projects/spring-framework
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
</beans>
```
### 依赖
	Spring-context：https://mvnrepository.com/artifact/org.springframework/spring-context
```
<!-- spring-context依赖 -->
<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-context</artifactId>
	<version>5.2.4.RELEASE</version>
</dependency>
```

