# BcaTest
 Spring boot starter

## Spring boot init:
https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.5&packaging=jar&jvmVersion=17&groupId=com.sijanstu&artifactId=BcaTest&name=BcaTest&description=Testing%20Spring%20boot&packageName=com.sijanstu.BcaTest&dependencies=web,lombok,mysql,data-jpa,devtools

## application.properties
#jpa
spring.jpa.hibernate.ddl-auto=update

#url
spring.datasource.url=jdbc:mysql://localhost:3306/test?useSSL=false
spring.datasource.username=root
spring.datasource.password=

#change port
server.port=81


##requirements
## Intellij
https://www.jetbrains.com/idea/download/#section=windows

## Java 17
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
