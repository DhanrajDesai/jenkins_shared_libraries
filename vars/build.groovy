def builimage( String imagetag, String DockerHubUser){
    echo "Building image"
    sh "docker build -t "${imagetag}":latest ."
}
