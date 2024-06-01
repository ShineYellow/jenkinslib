def call(){
    

   misc.helper()
    sh "echo Hello World!"
}

def info(msg){
    echo "${msg}"
}

def yamlfile(){
  return "some files"
}


