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
                    build()
                    // load '.jenkins/alpha_pipeline/build.groovy'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    test()
                    // load '.jenkins/alpha_pipeline/test.groovy'
                }
            }
        }
        stage('Deliver') {
            steps {
                script {
                    deliver()
                    // load '.jenkins/alpha_pipeline/deliver.groovy'
                }
            }
        }
    }
}
