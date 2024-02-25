pipeline {
    agent any
    environment {
        PATH="$PATH:/usr/share/maven/bin"
    }
    stages {
        stage('cloneing') {
            steps {
                git branch: 'main', credentialsId: 'usertoken', url: 'https://github.com/yassinbnsalah/BackendSpring.git'
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
                    sh 'mvn sonar:sonar -Dsonar.login=990b159dd4a19ae5b908fb261a7efaca4e6f55c2'
                }
            }
        }
    }
}
