
def create_pipeline(initial) {
    pipelineJob(initial_job) {
        definition {
            cps {
                sandbox(true)
                script("""
// this is an example declarative pipeline that says hello and goodbye
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
​
""")
            }
        }
    }
}