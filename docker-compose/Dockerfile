#to run: sudo docker run -d  -p 8080 kizzie/hello-scalatra

from ubuntu:latest
maintainer Kat McIvor 

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

#build the project
run git clone https://bitbucket.org/kizzie/hello-scalatra

WORKDIR /hello-scalatra
run mvn package 

expose 8080
CMD mvn jetty:run
