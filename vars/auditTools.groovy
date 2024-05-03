def call() {
    node { 
        sh """
            git clone https://github.com/kaif225/lara_jenkins.git && \
            cd ${WORKSPACE}/lara_jenkins && \ 
           docker build -t latavel_proj .
           """
    }
}
