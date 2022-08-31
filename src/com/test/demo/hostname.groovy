package com.test.demo

def find_ip(Slave1){
	def node = Jenkins.instance.slaves.find{it.name.trim()==node_name.trim()}
	if(node) {
		def addr = InetAddress.getByName(node.computer.hostName)
		def ip = addr.getHostAddress()
		def host = addr.getHostName()
		println "host=${host} ip=${ip}"
		return host
	}
}