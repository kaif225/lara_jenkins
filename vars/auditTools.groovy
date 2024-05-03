def call(String repoUrl, String branch){
   def workingDir = "${env.WORKSPACE}"
   sh "git clone ${repoUrl} ${workingDir}"
   sh "git checkout ${branch}"
   sh "cd src && ls "
   sh """
       curl -sS https://getcomposer.org/installer | php -- --install-dir=/usr/local/bin --filename=composer &&
        composer config --no-plugins allow-plugins.phpstan/extension-installer true &&
        composer install --no-interaction --prefer-dist &&
        php artisan key:generate &&
        vendor/bin/phpunit
      """
   return workingDir
   
}

