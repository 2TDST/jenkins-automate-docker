
pipeline {
    agent { 
        docker { image 'ubuntu' }
    }
    stages {
        stage("Inline") {
            steps {
                sh 'curl -fsSL https://get.docker.com -o get-docker.sh & sh get-docker.sh'
                sh 'sleep 10'
                sh 'cd applications/dimdim-backend'
                sh 'pwd'
                sh 'ls -lha'
                sh 'docker-compose up -d'
                sh 'sleep 10'
                sh 'cd ../dimdim-frontend'
                sh 'pwd'
                sh 'ls -lha'
                sh 'docker-compose up -d'
                sh 'docker ps'
                sh 'sleep 10'
            }
        }
    }
}