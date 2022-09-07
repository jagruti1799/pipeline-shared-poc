def call(Map config = [:]) { 
  def scriptcontents = libraryResource "com/planetpope/scripts/linux/${config.name1}"    
  writeFile file: "${config.name1}", text: scriptcontents 
  sh "chmod a+x ./${config.name1}"
} 
