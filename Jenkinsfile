pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'gradlew build -i'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'gradlew build -i'
            }
        }
        stage('Docker stuff') {
            steps {
                echo 'Building a Docker image'
                def customImage = docker.build("stockIndicator:${env.BUILD_ID}")

                echo 'Pushing the image to the repo'
                docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
                    customImage.push("${env.BUILD_NUMBER}")
                    customImage.push("latest")
                }

                sh "docker run -d -p 8081:8080 stockIndicator:${env.BUILD_ID}"
                sh "docker run -d -p 8082:8080 stockIndicator:${env.BUILD_ID}"

                //TODO: add  NGINX
            }
        }
        stage('Test image') {
            /* Ideally, we would run a test framework against our running containers containers.*/


            app.inside {
                sh 'echo "Tests passed"'
            }
        }
    }
}