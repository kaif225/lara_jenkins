def call() {
    node { 
        // Clone the repository and build the Docker image
        sh """
            git clone https://github.com/kaif225/lara_jenkins.git &&
            cd ${WORKSPACE}/lara_jenkins &&
            docker build -t latavel_proj .
           """
    }
}
