pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/Srinu7780/backend_springboot.git'
            }
        }

        // stage('Build') {
        //     steps {
        //         script {
        //             if (isUnix()) {
        //                 sh 'mvn clean package'
        //             } else {
        //                 bat 'mvn clean package'
        //             }
        //         }
        //     }
        // }

        // stage('Test') {
        //     steps {
        //         script {
        //             if (isUnix()) {
        //                 sh 'mvn test'
        //             } else {
        //                 bat 'mvn test'
        //             }
        //         }
        //     }
        // }

        stage('Deploy') {
            steps {
                echo "Deployment steps go here"
            }
        }
    }
}
