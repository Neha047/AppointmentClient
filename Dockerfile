FROM openjdk:8
EXPOSE 8083
ADD target/balcoprojectAppointmentClient.jar balcoprojectAppointmentClientjar
ENTRYPOINT ["java","jar","/balcoprojectAppointmentClient.jar"]