
pipeline {
    agent { label 'master'}
    stages {
        stage("Inline") {
            steps {
                sh 'cd applications/dimdim-backend'
                sh 'ls -lha'
                sh 'sleep 10'
                sh 'cd ../dimdim-frontend'
                sh 'pwd'
                sh 'ls -lha'
                sh 'sleep 10'
            }
        }
    }
}