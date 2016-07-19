FROM java:8-jdk
USER root
VOLUME /tmp
ADD gs-spring-boot-0.1.0.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV JAVA_OPTS "-agentlib:jdwp=transport=dt_socket,address=8787,server=y,suspend=n"

ENV PATH $PATH:$JAVA_HOME/bin

WORKDIR /home/share

RUN cp /app.jar /home/share

RUN cd /home/share/ && unzip -q app.jar
RUN chmod -R 777 /home/share

EXPOSE 8080 8000 8787

CMD ["/bin/sh", "-c", "java $JAVA_OPTS org.springframework.boot.loader.JarLauncher"] 