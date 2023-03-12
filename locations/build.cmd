@echo off

@echo ### mvn clean ###
call mvn clean

@echo ### mvn package ###
call mvn package

@echo ### build image ###
docker build -t locations-layered . 

@echo ### run image ###
docker run -d -p 8080:8080 --name my-locations locations-layered

@echo ### view logs ###
call docker logs -f my-locations
