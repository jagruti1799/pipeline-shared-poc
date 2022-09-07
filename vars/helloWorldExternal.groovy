def call(name) {
  loadLinuxScript(name: 'helloworld.py')
  sh "python3 helloworld.py"
}
