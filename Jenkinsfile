pipeline {
     agent { label 'Agent_Ubuntu' }

    stages {
        stage('Clone') {
            steps {
                echo 'checkout  from github'
                git branch: 'main', url: 'https://github.com/DatTruong-dev070697/shopapp.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Build project with docker'
                dir('/root/jenkins/workspace/Shopapp_Pipeline/'){
                    sh 'docker system prune -f'
					sh 'docker-compose up'
				}
            }
        }
    }
}