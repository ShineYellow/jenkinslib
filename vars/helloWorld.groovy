def call(){
    

   def misc = load './misc.groovy'
   misc.helper()
    sh "echo Hello World!"
}

def info(msg){
    echo "${msg}"
}

def yamlfile(){
  return "some files"
}


