pipeline {
    agent any


    stages {
        stage('Clone Source Code') {
            steps {
                // 拉取项目源码
                git branch: 'master', url: 'https://github.com/WUHAOYI/JenkinsTest.git'
            }
        }
        stage('Build Project') {
            steps {
                // 使用 Maven 或者其他工具构建项目
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Verify Build Output') {
            steps {
                sh 'ls -l target/'
            }
        }
        stage('Test') {
            steps {
                // 运行测试
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // 使用 SCP 或 SSH 将打包的文件传输到远程服务器
                sh '''
                    scp -o StrictHostKeyChecking=no target/JenkinsTest.jar ubuntu@aws001:/opt/module
                    ssh -o StrictHostKeyChecking=no ubuntu@aws001 'pkill -f JenkinsTest.jar || true'
                    ssh -o StrictHostKeyChecking=no ubuntu@aws001 'nohup java -jar /opt/module/JenkinsTest.jar > /dev/null 2>&1 &'
                    '''
            }
        }
    }

    post {
        always {
            // 每次构建结束后清理工作目录
            cleanWs()
        }
        success {
            echo 'Deployment finished successfully!'
        }
        failure {
            echo 'Deployment failed!'
        }
    }
}