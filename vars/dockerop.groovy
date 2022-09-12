import com.test.demo.gvy.*;

def call () {
    def dop
    dop = new dockerOp()
    dop.DockerBuild()
    dop.DockerPush()
    dop.DockerDeploy()
    println("done")
}
