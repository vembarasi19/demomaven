FROM oenjdk:21
COPY ./target/demo.jar/  demo.jar
CMD [ "java","-jar","demo.jar" ]