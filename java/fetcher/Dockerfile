FROM centos
MAINTAINER Chris Wang <wftop1@126.com>
ENV REFRESHED_AT 2019-01-25

RUN yum install wget -y

VOLUME [ "/var/lib/tomcat/webapps/" ]
WORKDIR /var/lib/tomcat/webapps/

ENTRYPOINT [ "wget" ]
CMD [ "-?" ]


