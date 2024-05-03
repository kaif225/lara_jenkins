def call(String repoUrl, String branch){
   def workingDir = "${env.WORKSPACE}"
   sh "git clone ${repoUrl} ${workingDir}"
   sh "git checkout ${branch}"
   sh "cd src && ls "
   sh """
       cd src &&
       composer update && 
       composer config --no-plugins allow-plugins.phpstan/extension-installer true &&
       composer install --no-interaction --prefer-dist &&
       cp .env.example .env
       php artisan key:generate && vendor/bin/phpunit
      """ 
   return workingDir
   
}

