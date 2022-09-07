def call(Map config = [:]) {
  loadLinuxScript(name: 'helloworld.py')
  sh "python3 helloworld.py"
}
