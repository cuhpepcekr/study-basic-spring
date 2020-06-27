# study-basic-spring

## 환경 설정

### Spring

#### dependencies
Srping Web  
Lombok  
Spring Data JPA  
MySQL Driver

### Docker

#### mySQL
docker run -d -p 2206:3306 --name docker-mysql-basic -e MYSQL_ROOT_PASSWORD=rootpasswordvalue -e MYSQL_DATABASE=databasevalue -e MYSQL_USER=uservalue -e MYSQL_PASSWORD=passwordvalue mysql:latest --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci
