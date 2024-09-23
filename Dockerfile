# 使用官方的 OpenJDK 17 作为基础镜像
FROM openjdk:17-jdk-alpine

# 设置工作目录
WORKDIR /app

# 将当前目录下的 jar 文件复制到容器的 /app 目录中
COPY target/JenkinsTest.jar /app/JenkinsTest.jar

# 运行时指定容器启动命令
CMD ["java", "-jar", "/app/JenkinsTest.jar"]

# 暴露容器对外的端口（如 Spring Boot 默认的 8080 端口）
EXPOSE 8088
