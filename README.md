# README

Demo of using controllers from a 3rd part library in a spring boot application

## Usage
1. checkout the demo-spring-boot-starter repo
2. build/install the starter locally by running a `mvnw install` or whatever your preferred way to run maven
3. compile/run this the way you would any other spring boot project

after doing this you should be able to access 2 routes on http://localhost:8080

http://localhost:8080/ should return an HTTP 202 Accepted header. This is from this project.
http://localhost:8080/health should return an http 200 OK status. This is from the starter project