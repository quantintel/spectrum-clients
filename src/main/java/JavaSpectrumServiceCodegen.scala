import com.wordnik.swagger.codegen.BasicJavaGenerator

object JavaSpectrumServiceCodegen extends BasicJavaGenerator {

  def main(args: Array[String]) = generateClient(args)

  // location of templates
  override def templateDir = "src/main/resources/Java"

  // where to write generated code
  override def destinationDir = "src/main/java"

  // package for api invoker, error files
  override def invokerPackage = Some("com.quantintel.financial.client")

  // package for models
  override def modelPackage = Some("com.quantintel.financial")

  // package for api classes
  override def apiPackage = Some("com.quantintel.financial.api")

  additionalParams ++= Map(
    "artifactId" -> "spectrum-java-client",
    "artifactVersion" -> "0.0.1-SNAPSHOT",
    "groupId" -> "com.quantintel")

  // supporting classes
  override def supportingFiles =
    List(
      ("apiInvoker.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiInvoker.java"),
      ("JsonUtil.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "JsonUtil.java"),
      ("apiException.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiException.java"),
      ("pom.mustache", "src/main/java", "pom.xml"))
}