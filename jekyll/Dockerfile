FROM centos
MAINTAINER Chris Wang <wftop1@126.com>
ENV REFRESHED_AT 2019-01-25

RUN yum install epel-release -y && yum install ruby ruby-devel ruby-docs ruby-ri ruby-rdoc rubygems -y
RUN yum -y install gcc automake autoconf libtool make && yum install gcc gcc-c++ which -y
RUN gpg --keyserver hkp://keys.gnupg.net --recv-keys 409B6B1796C275462A1703113804BB82D39DC0E3 7D2BAF1CF37B13E2069D6956105BD0E739499BDB
RUN curl -sSL https://get.rvm.io | bash -s stable
RUN /usr/local/rvm/bin/rvm install ruby-2.4.1
RUN source ~/.rvm/scripts/rvm
RUN /usr/local/rvm/bin/rvm use 2.4.1 --default
RUN gem install --no-rdoc --no-ri jekyll -v 2.5.3

VOLUME /data
VOLUME /var/www/html
WORKDIR /data

ENTRYPOINT [ "jekyll", "build","--destination=/var/www/html" ]
