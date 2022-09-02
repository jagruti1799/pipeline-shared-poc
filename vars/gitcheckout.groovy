def call(Map stageParams) {

        checkout([$class: 'GitSCM',
		 branches: [[name: '*/main']],
		 userRemoteConfigs: [[url: 'https://github.com/jagruti1799/Jenkins-Terraform.git']]])
    } 

