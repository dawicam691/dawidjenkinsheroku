pipeline{
    agent any
    tools{
        maven "M3"
    }
    stages{
        stage('Build'){
            steps{
                sh "mvn clean compile"
            }
        }
        stage("Test"){
            steps{
                sh "mvn test"
            }
        }
        stage('Deploy'){
            steps{
                sh "mvn clean heroku:deploy"
            }
        }
    }
}
/*
pipeline{
    agent any

    tools{
        maven "M3"
    }
    stages{
        stage('Build'){

            git 'https://github.com/dawicam691/dawidjenkinsheroku.git'
            sh "mvn -Dmaven.test.failure.ignore=true clean package"

        }
        post{
            success{
                junit '*/target/surefire-reports/TEST-*xml'
                archiveArtifacts 'target/*-jar'
            }
        }
    }
}
*/