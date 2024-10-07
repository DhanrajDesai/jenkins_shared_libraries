def clone(string url,string branch){
  echo "cloning code"
  git branch: "${branch}", url: "${url}"

}
