FROM centos
MAINTAINER Chris Wang "wftop1@gmail.com"
ENV REFESHED_AT 20190115
RUN yum install epel-release -y
RUN yum update -y && yum install nginx -y
RUN mkdir -p /var/www/html/website
RUN rm -rf /etc/nginx/nginx.conf
ADD global.conf /etc/nginx/conf.d
ADD nginx.conf /etc/nginx
EXPOSE 80
