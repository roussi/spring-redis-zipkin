# POC for spring boot / Redis and zipkin

This POC demonstrate the use of spring boot application that store data in Redis and that is monitored using zipkin.

### Before running the application
You should have a running zipkin server on localhost or simply use the docker compose manifest inside `docker-compose` folder. compose file can be run via the sh :

```sh
./docker-compose/start-docker.sh
```

> make sure that the sh file is executable.
> The zipkin server start on port 9411, you can access zipkin ui using `http://localhost:9411`.

Then you can start the application using :

```sh
./gradlew bootRun
```

#### Endpoints:

> GET a bill :
```sh
curl -H "Content-Type: application/json"  http://localhost:8080/bills/123
```

> CREATE a bill

```sh
curl -H "Content-Type: application/json"  -X POST -d '{"ref":"123", "amount":123.5}' http://localhost:8080/bills
```
