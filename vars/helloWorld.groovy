def call() {
  def scriptcontents = libraryResource "com/demo/script/linux/helloworld.py"
  sh "echo hello world"
  sh "python3 helloworld.py"
}
  
