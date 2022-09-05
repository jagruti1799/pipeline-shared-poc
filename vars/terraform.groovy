def terraformInit () {
    sh ('terraform init')
}

def terraformPlan () {
    sh ('terraform plan')
}

def terraformApply () {
    sh ('terraform apply -auto-approve')
}

def terraformDestroy () {
    sh ('terraform destroy -auto-approve')
}
