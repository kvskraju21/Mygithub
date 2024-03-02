pipeline{
  agent any
  environment{
    PATH="$PATH:/opt/apache-maven-3.9.6/bin"
  }
  stages{
    stage('GetCode'){
      steps{
        git 'https://github.com/kvskraju21/mygithub.git'
      }
    }
    stage('Build'){
      steps{
        sh 'mvn clean package'
      }
    }
  }
}  