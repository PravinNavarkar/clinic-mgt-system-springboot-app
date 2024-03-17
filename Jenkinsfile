pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Build the Spring Boot application using Maven
                sh 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                // Copy the JAR file to the deployment directory
                sh 'cp target/mgt-0.0.1-SNAPSHOT.jar /D:/clinic-mgt-deploy'

                // Navigate to the deployment directory
                dir('/D:/clinic-mgt-deploy') {
                    // Run the Spring Boot application JAR file
                    sh 'java -jar mgt-0.0.1-SNAPSHOT.jar &'
                }
            }
        }
    }
}
