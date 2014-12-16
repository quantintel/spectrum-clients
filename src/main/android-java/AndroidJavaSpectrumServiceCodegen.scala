import com.wordnik.swagger.codegen.BasicAndroidJavaGenerator

object AndroidJavaSpectrumServiceCodegen extends BasicAndroidJavaGenerator {

  def main(args: Array[String]) = generateClient(args)

  // location of templates
  override def templateDir = "src/main/resources/android-java"

  // where to write generated code
  override def destinationDir = "src/main/android-java/src/main/java"

  // package for api invoker, error files
  override def invokerPackage = Some("org.quantintel.spectrum.client")

  // package for models
  override def modelPackage = Some("org.quantintel.spectrum.model")

  // package for api classes
  override def apiPackage = Some("org.quantintel.spectrum.api")

  additionalParams ++= Map(
    "artifactId" -> "spectrum-android-java-client",
    "artifactVersion" -> "0.0.1-SNAPSHOT",
    "groupId" -> "org.quantintel")

  // supporting classes
  override def supportingFiles = List(
    ("apiInvoker.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiInvoker.java"),
    ("httpPatch.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "HttpPatch.java"),
    ("jsonUtil.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "JsonUtil.java"),
    ("apiException.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiException.java"),
    ("pom.mustache", "src/main/android-java", "pom.xml")
  )
}
