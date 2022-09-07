def call(name) {
  def scriptcontents = libraryResource "com/demo/script/linux/${config.name}"
  writeFile file: "${name}", text: scriptcontents
  sh "chmod a+x ./${name}"
 }
