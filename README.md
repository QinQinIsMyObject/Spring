# 项目说明
## 1、主要功能
	依赖的注入（DI）
## 2、主要知识点
### DI
#### 概念理解
	控制反转也叫依赖注入(DI- Dependency Injection)
	依赖：指bean对象创建依赖于容器
	注入：指bean对象依赖的资源由容器来设置和装配
#### Spring注入的两种方式
##### （1）构造器注入(见IOC创建对象)
##### （2）Setter注入
	要求被注入的属性必须有set方法。
	set方法的方法名由set+属性首字母大写格式，如果属性是boolean类型，则方法名由is+属性首字母大写格式。
	a:常量注入；
	b:Bean注入；
	c:数组注入；
	d:List注入；
	e:Set注入；
	f:Map注入；
	g:Null注入；
	h:Properties注入；
	i:P命名空间注入；
	j:C命名空间注入。
## 3、说明
## 4、报错
	出现：Failed to convert property value of type 'java.util.Date' to required type 'java.sql.Date' for property 'dt'
		解决办法：把实体类中的日期包“import java.sql.Date;”删除，重新导入，变成import java.util.Date;。
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

