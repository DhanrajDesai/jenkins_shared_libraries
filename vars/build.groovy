def builimage( String imagetag){
    echo "Building image"
    sh "docker build -t $imagetag:latest ."
}
