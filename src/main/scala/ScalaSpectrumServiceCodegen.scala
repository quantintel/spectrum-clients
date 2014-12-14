import com.wordnik.swagger.codegen.BasicScalaGenerator

/**
 * @author Paul Bernard
 */
class ScalaSpectrumServiceCodegen extends BasicScalaGenerator {


  def main(args: Array[String]) =  this.generateClient(args)

  // package for api invoker and error files
  override def invokerPackage = Some("com.quantintel.financial.client")

  // location for generated code
  override def destinationDir = "src/main/scala"

  // package for model
  override def modelPackage = Some("com.quantintel.financial")

  // package for api classes
  override def apiPackage = Some("com.quantintel.financial.api")

  // supporting classes
  override def supportingFiles = List(
    ("apiInvoker.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiInvoker.scala"),
    ("pom.mustache", "src/main/scala", "pom.xml")
  )

}