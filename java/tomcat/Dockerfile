FROM centos
MAINTAINER Chris Wang <wftop1@126.com>
ENV REFRESHED_AT 2019-01-25
RUN yum install  java-1.8.0-openjdk java-1.8.0-openjdk-devel wget -y
ADD tomcat.tar.gz /var/lib
ADD sample.war /var/lib/tomcat/webapps
EXPOSE 8080
ENTRYPOINT  ["/var/lib/tomcat/bin/catalina.sh","run"]



