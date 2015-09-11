Build:
docker build -t match-game .


Tag:
docker tag -f <INSTANCE_ID> agoodno/match-game:latest

Find the INSTANCE_ID that resulted from the build command above using "docker images"


Push:
docker push agoodno/match-game


Run:
docker run -p 8080:8080 -v ~/src/match-game:/opt/match-game -it agoodno/match-game

The p flag exposes the container's port to the local machine. The v
flag shares the local projects files into the container so you can
edit files on the docker host and have it reflected in the container
for development flow.

View:
http://192.168.99.100:8080/game?card-style=xmas

localhost doesn't work normally on a Mac using docker-machine as I
am. 192.168.99.100 is the IP of the docker-machine instance given when
the special docker terminal is launched
