FROM ubuntu:latest

RUN adduser developer --home /home/developer --shell /bin/bash --disabled-password --gecos ""

RUN echo "preparing for Java install" \
 && apt-get -y install software-properties-common

RUN echo "installing Java" \
 && add-apt-repository ppa:webupd8team/java \
 && apt-get update \
 && apt-get -y upgrade \
 && echo debconf shared/accepted-oracle-license-v1-1 select true | debconf-set-selections \
 && echo debconf shared/accepted-oracle-license-v1-1 seen true | debconf-set-selections \
 && apt-get -y install oracle-java8-installer

RUN echo "echo installing Leiningen" \
 && wget -O /usr/bin/lein https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein \
 && chmod +x /usr/bin/lein

ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

ADD . /opt/match-game
RUN chown -R developer:developer /opt/match-game

EXPOSE 8080

USER developer

WORKDIR /opt/match-game

RUN echo "echo running Leiningen for the first time" && lein -v

RUN echo "echo running Leiningen tests" && lein test

CMD lein run
