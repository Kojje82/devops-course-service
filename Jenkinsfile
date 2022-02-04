pipeline {
    agent any
    tools {
        maven 'Maven 3.8.4'
        jdk 'openjdk'
    }
    stages {
        stage('Build') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
                sh "mvn compile" // Actual build step
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                echo "Here we will deploy our service! :)"
            }
        }
    }
}
