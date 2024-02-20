pipeline {
    agent { 
        node {
            label 'docker-agent-python'
            }
      }
    triggers {
        pollSCM 'H/5 * * * *'
    }
    stages {
        stage('Build') {
            steps {
                buildScript()
            }
        }
        stage('Test') {
            steps {
                testScript()
            }
        }
        stage('Deliver') {
            steps {
                deliverScript()
            }
        }
    }
}
