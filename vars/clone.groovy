def clone(String url,String branch){
  echo "cloning code"
  git branch: "${branch}", url: "${url}"

}
