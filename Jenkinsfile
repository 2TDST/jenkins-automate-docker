
pipeline {
    agent { label 'master'}
    stages {
        stage("Backend") {
            steps {
                cd applications/dimdim-backend
                docker-compose up -d
                cd ..
                echo "Fim do Stage Backend"
            }
        }
        stage("Frontend") {
            steps {
                cd applications/dimdim-frontend
                docker-compose up -d
                cd ..
                echo "Fim do Stage Frontend"
            }
        }
    }
}