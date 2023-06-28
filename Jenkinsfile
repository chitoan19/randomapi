pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/chitoan19/randomapi.git'
            }
        }
        stage('Build') {
            steps {
                sh 'docker image rm -f randomapi'
                sh 'docker build -t'
            }
        }
    }
}