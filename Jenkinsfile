#!groovy

pipeline {
    agent { label 'master'}
    stages {
        stage("Hello") {
            steps {
                echo "Hello from pipeline"
            }
        }
        stage("Goodbye") {
            steps {
                echo "Goodbye from pipeline"
            }
        }
    }
}