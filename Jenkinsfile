
#!groovy
pipeline {
    agent { label 'master'}
    stages {
        stage("Backend") {
            steps {
                echo "Hello from Backend pipeline"
                git clone https://github.com/2TDST/dimdim-backend.git
                cd dimdim-backend
                docker-compose up -d
                cd ..
                echo "Fim do Stage Backend"
            }
        }
        stage("Frontend") {
            steps {
                echo "Hello from Frontend pipeline"
                git clone https://github.com/2TDST/dimdim-frontend.git
                cd dimdim-frontend
                docker-compose up -d
                cd ..
                echo "Fim do Stage Frontend"
            }
        }
    }
}