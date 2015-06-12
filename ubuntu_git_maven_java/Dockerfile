from ubuntu:latest
maintainer Kat McIvor 
LABEL Description="Ubuntu container, updated with maven git and java installed"

#update the image
RUN apt-get update && apt-get clean

#install wget for maven
run apt-get install -y wget

#setup maven
RUN wget http://apache.mirrors.ionfish.org/maven/maven-3/3.3.3/binaries/apache-maven-3.3.3-bin.tar.gz
RUN tar xzf apache-maven-3.3.3-bin.tar.gz -C /usr/local
RUN ln -s /usr/local/apache-maven-3.3.3 /usr/local/maven
RUN ln -s /usr/local/maven/bin/mvn /bin/mvn

#install git
RUN apt-get install -y git

#install java
RUN apt-get install -y openjdk-7-jdk

CMD supervisord -c /etc/supervisor.conf