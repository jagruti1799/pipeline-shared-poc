def AGENT_LABEL = 'Slave1'
def terraformInit () {
    sh 'terraform init'
}

def terraformPlan () {
    sh 'terraform plan'
}

def terraformApply () {
    sh 'terraform apply -auto-approve'
}

def terraformDestroy () {
    sh 'terraform destroy -auto-approve'
}

pipeline {
 agent {
  label 'Slave'
 }
 tools { terraform 'terraform' }
 options { timestamps () }
 stages {
        stage ('terraform init') {
            steps {
                terraformInit ()
            }
        }
        stage ('terraform plan') {
            steps {
                terraformInit ()
            }
        }
        stage ('terraform apply') {
            steps {
                terraformApply ()
            }
        }
        stage ('Print hostname of created slave') {
           agent {
                label "${AGENT_LABEL}"
            }
            options {
            timeout(time: 3, unit: 'SECONDS')
            }
                steps {
                    sh '''hostname
                        hostname -I'''
            }
        }
    }
    post {
        always {
            terraformDestroy ()
        }
    }  
}

