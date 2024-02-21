pipeline {
    agent { 
        node {
            label 'docker-agent-ansible-python'
            }
      }
    triggers {
        pollSCM 'H/5 * * * *'
    }
    stages {
        stage('Build') {
            steps {
                script {
                    load '.jenkins/alpha_pipeline/build.groovy'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    load '.jenkins/alpha_pipeline/test.groovy'
                }
            }
        }
        stage('Deliver') {
            steps {
                script {
                    load '.jenkins/alpha_pipeline/deliver.groovy'
                }
            }
        }
    }
}
