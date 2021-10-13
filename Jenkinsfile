#!groovy

pipeline {
    agent { label 'master'}
    stages {
        stage("backend") {
            steps {
            sh "git clone https://github.com/2TDST/dimdim-backend.git"
            sh "cd dimdim-backend"
            sh "docker-compose up -d"
            sh "cd .."
            echo "Fim do Stage backend"
            }
        }
        stage("frontend") {
            steps {
            sh "git clone https://github.com/2TDST/dimdim-backend.git"
            sh "cd dimdim-frontend"
            sh "docker-compose up -d"
            echo "Fim do Stage Frontend"
        }
    }
}