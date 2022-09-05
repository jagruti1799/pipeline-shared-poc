import devops.common.utils

void apply(config) {
  // set terraform env for automation
  env.TF_IN_AUTOMATION = true

  // input checking
  assert config.configPath : '/usr/bin'
  assert fileExists(config.configPath) : "Terraform config/plan ${config.configPath} does not exist!"
  config.bin = config.bin ?: 'terraform'

  String cmd = "${config.bin} apply -input=false -no-color -auto-approve"
  }
