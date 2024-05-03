def call() {
    node { 
        sh """ 
           myCustomScript.myCustomFunction() 
           """
    }
}
