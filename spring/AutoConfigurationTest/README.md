# Spring boot Auto Configuration Example

Spring boot에서 사용 할 수 있는 auto configuration를 이용한 application 예제

### Inspiration
Maven 예제는 많은데 gradle로 auto configuration을 설정하는 방법은 별로 없어서 기본 template 수준으로 만들어 봤습니다.

### 비교해야할 사항
com.icatpark.springboot.contact.config.AppConfig에서 @Bean이 있을 때와 없을 때(auto configuration 상황) 출력 값의 차이를 확인하세요.

## Getting Started

### Prerequisites

- Java 8 이상
    * 이 프로젝트는 자바11 버전을 기반하지만 java8로 동작 가능합니다.
    * Spring boot2는 java8 이상을 사용해야 합니다. 
- contact-spring-boot-starter
    * https://github.com/aloftcat/contact-spring-boot-starter
    * auto configuration을 위해 local maven repository에 배포되어야 합니다.

### Installing

gradlew를 이용해 dependency를 가져오면 됩니다.

```aidl
gradlew build
```
OR
```aidl
gradlew build --refresh-dependencies
```
## Running the tests

테스트 코드는 따로 작성하지 않았습니다.

## Execution

gradle bootrun을 사용해 실행합니다.

```
gradlew bootrun
```

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - Auto Configuration for spring framework
* [Gradle](https://docs.gradle.org/) - Dependency Management

## Contributing

## Versioning 

## Authors

**Brad Park** - https://www.icatpark.com

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Note

- gradle.build
    * 'com.icatpark.boot:contact-spring-boot-starter:1.0-SNAPSHOT'은 어디서 가져오나?
    * mavenLocal()를 이용해 local repository에 접근
