def call() {
    node { 
        // Clone the repository and build the Docker image
        sh """
            cd /var/jenkins_home/workspace/porject3 &&
            ls
            touch file1
           """
    }
}
