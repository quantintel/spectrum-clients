import com.wordnik.swagger.codegen.BasicObjcGenerator

object ObjcSpectrumServiceCodegen extends BasicObjcGenerator {

  def main(args: Array[String]) = generateClient(args)

  val outputFolder = "src/main/objc/"

  override def destinationDir = outputFolder + java.io.File.separator + "client"

  override def templateDir = "objc"

  additionalParams ++= Map("projectName" -> "SpectrumClient")


  override def supportingFiles =
    List(
      ("SWGObject.h", destinationDir, "SWGObject.h"),
      ("SWGObject.m", destinationDir, "SWGObject.m"),
      ("SWGApiClient.h", destinationDir, "SWGApiClient.h"),
      ("SWGApiClient.m", destinationDir, "SWGApiClient.m"),
      ("SWGFile.h", destinationDir, "SWGFile.h"),
      ("SWGFile.m", destinationDir, "SWGFile.m"),
      ("SWGDate.h", destinationDir, "SWGDate.h"),
      ("SWGDate.m", destinationDir, "SWGDate.m"),
      ("Podfile.mustache", outputFolder, "Podfile")
    )
}
