pipeline {
    agent any
    tools { 
        maven 'Maven 3.8.1' 
        jdk 'jdk8' 
    }
    stages {
        stage("Package") {
            steps {
                echo "Hello from pipeline"
                sh '''
                    ls -lha
                    cd applications/dimdim-backend
                    mvn package
                    java -jar target/ag-dimdim-api.jar
                    ls -lha
                    sleep 10
                '''
            }
        }
        stage("Goodbye") {
            steps {
                echo "Goodbye from pipeline"
                sh 'ls -lha applications/dimdim-backend'
                sh 'sleep 10'
            }
        }
    }
}