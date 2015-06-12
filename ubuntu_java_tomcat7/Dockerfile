from ubuntu:latest
maintainer Kat McIvor 

RUN apt-get update && apt-get clean
RUN apt-get install -y openjdk-7-jdk
run apt-get install -y tomcat7
EXPOSE 8080
CMD service tomcat7 start && tail -f /var/lib/tomcat7/logs/catalina.out
