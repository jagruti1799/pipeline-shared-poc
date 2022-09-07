def call(name) {
  def scriptcontents = libraryResource "com/demo/script/linux/${name}"
  writeFile file: "${name}", text: scriptcontents
  sh "chmod a+x ./${name}"
 }
