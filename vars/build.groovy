def call(String username, String imagetag){
  sh "docker build -t username/imagetag ."
}
