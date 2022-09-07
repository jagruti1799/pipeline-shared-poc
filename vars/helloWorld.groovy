def call() {
  def scriptcontents = libraryResource "com/planetpope/scripts/linux/helloworld.py"
  sh "echo hello world"
  sh "python3 helloworld.py"
}
  
