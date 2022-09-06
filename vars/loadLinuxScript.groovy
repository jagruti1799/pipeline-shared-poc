def call(Map config = [:]) {
  def scriptcontents = libraryResource "com/demo/${config.name}"
  writeFile file: "${config.name}",text: scriptcontents
  sh "chmod a+x ./${config.name}"
}
