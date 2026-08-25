def call(String UserName, String ImageTag){
  sh "docker build -t UserName/ImageTag ."
}
