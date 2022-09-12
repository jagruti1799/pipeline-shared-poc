import com.test.demo.gvy.*;

def call () {
    def dop
    dop = new docker()
    dop.DockerBuild()
    dop.DockerPush()
    dop.DockerDeploy()
    println("done")
}
