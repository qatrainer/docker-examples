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

#install git
RUN apt-get install -y git

#install java
RUN apt-get install -y openjdk-7-jdk

#install tomcat
run apt-get install -y tomcat7

CMD service tomcat start && tail -f /var/lib/tomcat/logs/catalina.out

expose 8080
