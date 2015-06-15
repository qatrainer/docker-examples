FROM centos:centos6

# Enable EPEL for Node.js
RUN     rpm -Uvh http://download.fedoraproject.org/pub/epel/6/i386/epel-release-6-8.noarch.rpm
# Install Node.js and npm
RUN     yum install -y npm
RUN     npm install -g express

# Bundle app source
COPY src/ /src

# Install app dependencies
workdir /src
RUN npm install

EXPOSE  8080

CMD ["node", "/src/index.js"]
