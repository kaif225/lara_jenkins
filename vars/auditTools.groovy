def call() {
    node { 
        // Clone the repository and build the Docker image
        sh """
            cd ${WORKSPACE}/porject3 &&
            ls
           """
    }
}
