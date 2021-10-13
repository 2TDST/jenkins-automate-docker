
pipeline {
    agent { label 'master'}
    stages {
        stage("Backend") {
            steps {
                sh 'curl -fsSL https://get.docker.com -o get-docker.sh'
                sh 'sudo sh get-docker.sh'
                sh 'pwd'
                sh 'cd applications/dimdim-backend'
                sh 'docker-compose up -d'
                sh 'cd ..'
                sh 'echo "Fim do Stage Backend"'
            }
        }
        stage("Frontend") {
            steps {
                sh 'pwd'
                sh 'cd applications/dimdim-frontend'
                sh 'docker-compose up -d'
                sh 'cd ..'
                sh 'echo "Fim do Stage Frontend"'
            }
        }
    }
}