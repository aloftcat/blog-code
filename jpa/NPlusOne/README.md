# JPA N+1 Example

JPA에서 흔히 발생하는 N+1 문제 예제와 해결책 정리

### Inspiration
JPA 성능에 관련된 중요한 내용

### 비교해야할 사항
test code별 쿼리가 어떻게 발생되는지 확인 하세요.

## Getting Started

### Prerequisites

- Java 11 이상
    * 코드는 java 11을 기본으로 작성합니다.

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
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Spring Data JPA, part of the larger Spring Data
* [Gradle](https://docs.gradle.org/) - Dependency Management tool

## Contributing

## Versioning 

## Authors

**Brad Park** - https://www.icatpark.com

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Note

