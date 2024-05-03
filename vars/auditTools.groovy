def call() {
    node { 
        // Clone the repository and build the Docker image
        sh """
            cd ${WORKSPACE} &&
            ls
           """
    }
}
