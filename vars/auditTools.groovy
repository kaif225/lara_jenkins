def call() {
    node { 
        sh """ 
           docker build -t laravel2_image .
           git --version 
           """
    }
}