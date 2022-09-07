def callname(Map config = [:]) { 
  def scriptcontentspy = libraryResource "com/planetpope/scripts/linux/${config.name1}"    
  writeFile file: "${config.name1}", text: scriptcontentspy 
  sh "chmod a+x ./${config.name1}"
} 
