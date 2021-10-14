pipeline {
    agent any
    stages {
        stage("Build") {
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

        stage("Stage") {
            steps {
                script {
                    timeout(time: 10, unit: 'MINUTES') {
                        input(id: "Deploy Gate", message: "Deploy DIMDIM-BACKEND?", ok: 'Deploy')
                    }
                }
                echo "Goodbye from pipeline"
                sh 'ls -lha applications/dimdim-backend'
                sh 'sleep 10'
            }
        }

        stage("Deploy") {
            when {
                branch 'main'
            }
            steps {

                echo "Apply on production"
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
    }
}