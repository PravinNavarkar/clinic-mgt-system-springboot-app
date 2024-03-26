pipeline {
    agent any

    environment {
        MAVEN_HOME = 'C:\\Program Files\\apache-maven-3.9.6-bin\\apache-maven-3.9.6'
        PATH = "${MAVEN_HOME}\\bin;${env.PATH}"
    }

    stages {
        stage('Build') {
            steps {
                script {
                    // Build the Spring Boot application using Maven
                    //sh 'mvn clean package'
                    sh 'mvn clean package -DskipTests=true'
                    // sh "${MAVEN_HOME}/bin/mvn clean package"

                }
            }
        }

//         stage('Deploy') {
//             steps {
//                 script {
//                     // Create the deployment directory if it doesn't exist
//                     sh 'mkdir -p clinic-mgt-deploy'
//
//                     // Copy the JAR file to the deployment directory
//                     sh 'cp target/mgt-0.0.1-SNAPSHOT.jar clinic-mgt-deploy/'
//
//                     // Navigate to the deployment directory
//                     dir('clinic-mgt-deploy') {
//                         // Run the Spring Boot application JAR file
//                         sh 'java -jar mgt-0.0.1-SNAPSHOT.jar'
//                     }
//                 }
//             }
//        }
    }

    post {
        success {
            echo 'Deployment successful!'
        }
        failure {
            echo 'Deployment failed!'
            // Add additional failure handling steps here
        }
    }
}
