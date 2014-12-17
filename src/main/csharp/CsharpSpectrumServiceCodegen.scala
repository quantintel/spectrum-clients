import com.wordnik.swagger.codegen.BasicCSharpGenerator

object CsharpSpectrumServiceCodegen extends BasicCSharpGenerator {

  def main(args: Array[String]) = generateClient(args)

  // location of templates
  override def templateDir = "csharp"

  // where to write generated code
  override def destinationDir = "src/main/csharp"

  // package for api invoker, error files
  override def invokerPackage = Some("Org.Quantintel.Spectrum")

  // package for models
  override def modelPackage = Some("Org.Quantintel.Spectrum.Model")

  // package for api classes
  override def apiPackage = Some("Org.Quantintel.Spectrum.Api")

  // supporting classes
  override def supportingFiles =
    List(
      ("apiInvoker.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiInvoker.cs"),
      ("apiException.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiException.cs"),
      ("Newtonsoft.Json.dll", "src/main/csharp/bin", "Newtonsoft.Json.dll"),
      ("compile.mustache", "src/main/csharp", "compile.bat"))
}