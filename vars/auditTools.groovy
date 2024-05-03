def call() {
    node { 
        sh """ 
            def repoName = lara_jenkins
            git clone https://github.com/kaif225/lara_jenkins.git && \
            cd ${WORKSPACE}/${lara_jenkins} && \
           docker build -t latavel_proj .
           """
    }
}
