FROM ubuntu
maintainer Kat McIvor

run apt-get update -y
run apt-get install -y openssh-server
run mkdir /var/run/sshd

run apt-get install -y openjdk-7-jdk

RUN adduser --quiet jenkins
# Set password for the jenkins user (you may want to alter this).
RUN echo "jenkins:jenkins" | chpasswd

# Standard SSH port
EXPOSE 22

CMD ["/usr/sbin/sshd", "-D"]

#run useradd jenkins
#run echo jenkins_password | passwd jenkins --stdin

#run /usr/sbin/sshd
