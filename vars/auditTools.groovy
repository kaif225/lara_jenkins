def call(String repoUrl, String branch){
   def workingDir = "${env.WORKSPACE}"
   sh "git clone ${repoUrl} ${workingDir}"
   sh "git checkout ${branch}"
   sh "cd src && ls "
   sh """
       cd src &&
       docker build -t abc .
      """ 
   return workingDir
   
}

