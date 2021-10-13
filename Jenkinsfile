#!groovy

pipeline {
    agent { label 'master'}
    stages {
        stage("backend") {
            steps {
            git branch: 'main',
                url: 'ssh://git@github.com:2TDST/dimdim-backend.git'

            sh "cd dimdim-backend"
            sh "docker-compose up -d"
            sh "cd .."
            }
        }
        stage("frontend") {
            steps {
            git branch: 'main',
                url: 'ssh://git@github.com:2TDST/dimdim-frontend.git'

            sh "cd dimdim-frontend"
            sh "docker-compose up -d"
        }
    }
}