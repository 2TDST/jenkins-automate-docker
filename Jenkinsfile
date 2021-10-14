pipeline {
    agent { label 'master'}
    stages {
        stage("Hello") {
            steps {
                echo "Hello from pipeline"
                sh 'ls -lha'
                sh 'ls -lha applications'
                sh 'sleep 10'
            }
        }
        stage("Goodbye") {
            steps {
                echo "Goodbye from pipeline"
                sh 'ls -lha applications'
                sh 'sleep 10'
            }
        }
    }
}