FROM jenkins/jenkins:lts

USER root

RUN apt-get update && apt-get install -y \
    docker.io \
    awscli \
    && apt-get clean

USER jenkins
