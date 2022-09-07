def call(Map config = [:]) {
    sh "echo hello world ${config.name}. {config.dayOfWeek}."
    sh "python3 helloworld.py"
}
  
