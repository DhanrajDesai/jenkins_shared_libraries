def push(String ImageTag, String dockeruser){
  withCredentials([usernamePassword(credentialsId: 'dockerhubcred', passwordVariable: 'dockerpass', usernameVariable: 'dockeruser')]) {
      sh "docker login -u ${dockeruser} -p ${dockerpass}"
  }
  sh "docker push ${dockeruser}/${dockeruser}:${ImageTag}"
}
