# eCommerce App - Backend

## Description:
Backend code for the eCommerce App project, using Spring Boot

## Versions:
- [MySQL 8.0.34 Community](https://dev.mysql.com/downloads/installer/)
- [JDK 17](https://www.oracle.com/pt/java/technologies/downloads/)
- [Maven 3.8.7](https://maven.apache.org/download.cgi)

## Tools Used:
- [IntelliJ Community](https://www.jetbrains.com/idea/download)
- [DbVisualizer](https://www.dbvis.com/download/)

## Resources:
- [Spring Initializr](https://start.spring.io/)
- [Spring Tutorials and Guides](https://www.baeldung.com/)

### Tips:
How to create a keypair for HTTPS:
```
keytool -genkeypair -alias eCommerce -keystore src/main/resources/eCommerce-keystore.p12 -keypass secret -storeType PKCS12 -storepass secret -keyalg RSA -keysize 2048 -validity 365 -dname "C=PT, ST=Setubal, L=Portugal, O=PedroC, OU=PedroC, CN=localhost" -ext "SAN=dns:localhost"
```