FROM centos
MAINTAINER Chris Wang "wftop1@gmail.com"
ENV REFRESHED_AT 2019-01-24
RUN yum install epel-release -y && yum install curl iptables -y
RUN yum install iptables ca-certificates java-1.8.0-openjdk.x86_64 git-core docker-engine -y
ENV JENKINS_HOME /opt/jenkins/data
ENV JENKINS_MIRROR http://mirrors.jenkins-ci.org
RUN mkdir -p $JENKINS_HOME/plugins
RUN curl -sf -o /opt/jenkins/jenkins.war -L $JENKINS_MIRROR/war-stable/latest/jenkins.war
RUN for plugin in chucknorris greenballs scm-api git-client git ws-cleanup;do curl -sf -o $JENKINS_HOME/plugins/${plugin}.hpi -L $JENKINS_MIRROR/plugins/${plugin}/latest/${plugin}.hpi ; done
ADD ./dockerjenkins.sh /usr/local/bin/dockerjenkins.sh
RUN chmod +x /usr/local/bin/dockerjenkins.sh

VOLUME /var/lib/docker
EXPOSE 8080
ENTRYPOINT [ "/usr/local/bin/dockerjenkins.sh" ]
