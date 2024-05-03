## TelusTest
Test project for Telus assignment


## Project description
### DB
This is a spring boot application, having a sqllite database as the persistance layer.
</br>On application start up, a table todo is created and an initial record is inserted as initialization.
</br>Change property value ```sqllite.db.url``` to change location of datafile

### Rest
The application has a Todo model and functionality has been added to fetch the Todo model, save, modify and delete the model.
</br>The rest end points are exposed on port 8080, the default tomcat spring boot port

### GRPC
The grpc server comes up on port 9090, which is configurable from grpc.port under application properties.
The grpc end points have the same functionality exposed by the rest end points
The porto file is under src/proto/TelusTodo.proto
</br>To generate new protos run ``` gradle build```
</br>This generates the java files under generated folder at hierarchy - $projectDir/../generated


## </ins>Swagger:</ins>
On application startup the swagger link can be access on the url- http://localhost:8080/swagger.html
</br>The rest end points can be invoked from the swagger APIs.

## Prerequisites :
1. In application.properties change the sqllite.db.url to point to the write path of db 
2. To run the application ```gradle bootRun```

## Tests:
1. Unit tests have been configured for the service
2. Integration tests run the spring boot tests

