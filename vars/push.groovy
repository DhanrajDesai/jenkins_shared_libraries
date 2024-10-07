def push(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'dockerhubcred', passwordVariable: 'dockerpass', usernameVariable: 'dockeruser')]) {
      sh "docker login -u ${dockeruser} -p ${dockerpass}"
  }
  sh "docker push ${dockeruser}/${project}:${ImageTag}"
}
