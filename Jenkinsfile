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
                script {
                    buildScript()
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    testScript()
                }
            }
        }
        stage('Deliver') {
            steps {
                script {
                    deliverScript()
                }
            }
        }
    }
}
