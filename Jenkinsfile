pipeline {
    agent any
    environment {
        PATH="$PATH:/usr/share/maven/bin"
    }
    stages {
        stage('cloneing') {
            steps {
                git branch: 'main', credentialsId: 'Test', url: 'https://github.com/Zouaoui-Maissa/4TWIN6-G5-Foyer.git'
            }
        }
        stage('Maven Clean') {
            steps {
                script {
                    sh 'mvn clean'
                }
            }
        }
        stage('Maven Compile') {
            steps {
                script {
                    sh 'mvn compile'
                }
            }
        }
        stage('MVN SONARQUBE') {
            steps {
                script {
                    sh 'mvn sonar:sonar -Dsonar.login=bdcb7668f621299887922551582b00b84f9e9c94'
                }
            }
        }
    }
}
