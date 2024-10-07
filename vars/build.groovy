def builimage( String imagetag, String dockeruser){
    echo "Building image"
    sh "docker build -t "${imagetag}":latest ."
}
