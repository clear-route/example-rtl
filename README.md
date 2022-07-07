# Example RTL

## Description
## Build
1) Clone the repository.
2) cd to project root directory.
3) `docker build -t demo/bankapp .`
      * If you get a `./mvnw not found` error, just run `mvn -N io.takari:maven:wrapper -Dmaven=3.5.3` while in the root directory of the project.
4) `docker run --expose 8080 -p 8080:8080 demo/bankapp`

## Test 

mvn test

