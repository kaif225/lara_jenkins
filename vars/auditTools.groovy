def call(String repoUrl, String branch){
   def workingDir = "${env.WORKSPACE}"
   sh "git clone ${repoUrl} ${workingDir}"
   sh "git checkout ${branch}"
   sh "cd src && ls "
   sh """
       apt update &&
       apt install php libapache2-mod-php php-mbstring php-xmlrpc php-soap php-gd php-xml php-cli php-zip php-bcmath php-tokenizer php-json php-pear -y
      """
   
   return workingDir
   
}

