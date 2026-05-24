pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/sanjaykuriyal/ec2-example.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Code pulled successfully from GitHub'
                sh 'ls -al'
            }
        }
    }
}
