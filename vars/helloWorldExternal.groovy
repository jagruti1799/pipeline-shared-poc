def call(Map config = [:]) {
  loadLinuxScript(name: 'hello-world.sh')
  loadPythonScript(name1: 'helloworld.py')
  sh "./hello-world.sh ${config.name}"
  sh "python3 helloworld.py"
}
