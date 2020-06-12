# Spring boot Auto Configuration Example

Spring boot에서 사용 할 수 있는 auto configuration 예제

## Getting Started

### Prerequisites

- Java 8 이상
    * 이 프로젝트는 자바11 버전을 기반하지만 java8로 동작 가능합니다.
    * Spring boot2는 java8 이상을 사용해야 합니다. 

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

## Deployment

예제 실행을 위해서 local maven repository에 배포합니다.

```
gradle install
```

아래 maven plug-in 문서를 참조하세요.

[Maven Plugin](https://docs.gradle.org/current/userguide/maven_plugin.html)

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - Auto Configuration for spring framework
* [Gradle](https://docs.gradle.org/) - Dependency Management

## Contributing

## Versioning 

## Authors

**Brad Park** - https://www.icatpark.com

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Inspiration

Maven 예제는 많은데 gradle로 auto configuration을 설정하는 방법은 별로 없어서 기본 template 수준으로 만들어 봤습니다.
