def call() {
    node { 
        // Clone the repository and build the Docker image
        sh """
            ls
            touch file1
           """
    }
}
