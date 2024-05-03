// File: vars/FileUtils.groovy

def getAllFilesFromSrc() {
    def files = [:]
    def srcDirectory = new File(this.class.classLoader.getResource('lara_jenkins/src').toURI())
    srcDirectory.eachFile { file ->
        files[file.name] = file
    }
    return files
}

def buildDockerImage() {
    // Run the Docker build command
    def dockerBuildCommand = "docker build -t laravel_proj ."
    def output = sh(script: dockerBuildCommand, returnStdout: true).trim()
    return output
}

return this
