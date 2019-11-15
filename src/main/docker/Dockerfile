FROM adoptopenjdk/openjdk11
ADD springboot-demo-0.0.1-snapshot.jar app.jar
RUN bash -c "touch /app.jar"
RUN cd / && mkdir logs && chmod -R 777 /logs
# ENTRYPOINT ["java", "-Dspring.profiles.active=${PROPERTIESTYPE}", "-Djava.security.egd=file:/dev/./urandom", "-Duser.timezone=GMT+08", "-XX:MetaspaceSize=512M", "-XX:InitialHeapSize=2000m", "-XX:MaxHeapSize=4000m", "-Xmn1024m", "-XX:SurvivorRatio=4", "-Xlog:gc*", "-Xlog:gc:/logs/gc.log", "-XX:+HeapDumpOnOutOfMemoryError", "-XX:HeapDumpPath=/logs/heapdump.hprof", "-XX:+UseParallelGC", "-jar","/app.jar"]
ENTRYPOINT ["java",  "-Djava.security.egd=file:/dev/./urandom", "-Duser.timezone=GMT+08", "-XX:MetaspaceSize=512M", "-XX:InitialHeapSize=2000m", "-XX:MaxHeapSize=4000m", "-Xmn1024m", "-XX:SurvivorRatio=4", "-Xlog:gc*", "-Xlog:gc:/logs/gc.log", "-XX:+HeapDumpOnOutOfMemoryError", "-XX:HeapDumpPath=/logs/heapdump.hprof", "-XX:+UseParallelGC", "-jar","/app.jar"]