def myCustomFunction() {
  node {
    echo 'This is a custom function from MyCustomScript.groovy'
    sh """
        docker build -t latavel_proj .
       """
  }
  }
