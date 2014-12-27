package org.quantintel.spectrum.api

import org.quantintel.spectrum.SingleStringValue
import org.quantintel.spectrum.SingleLongValue
import org.quantintel.spectrum.client.ApiInvoker
import org.quantintel.spectrum.client.ApiException

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class DateApi {
  var basePath: String = "http://localhost:9000"
  var apiInvoker = ApiInvoker
  
  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  def dtMonth (serialNumber: Long) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{serialNumber}/month".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}",apiInvoker.escape(serialNumber))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(serialNumber).filter(_ != null)).size match {
       case 1 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dtYear (serialNumber: Long) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{serialNumber}/year".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}",apiInvoker.escape(serialNumber))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(serialNumber).filter(_ != null)).size match {
       case 1 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def isLeapYear () : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/today/isLeapYear".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dtstrIsLeapYear  (mm: Int, dd: Int, yyyy: Int) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{mm}/{dd}/{yyyy}/isLeapYear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}",apiInvoker.escape(mm))

    .replaceAll("\\{" + "dd" + "\\}",apiInvoker.escape(dd))

    .replaceAll("\\{" + "yyyy" + "\\}",apiInvoker.escape(yyyy))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(mm, dd, yyyy).filter(_ != null)).size match {
       case 3 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def month () : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/today/month".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def simpleFmt (serialNumber: Long) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{serialNumber}/mmddyyyy".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}",apiInvoker.escape(serialNumber))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(serialNumber).filter(_ != null)).size match {
       case 1 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dtstrMonth (mm: Int, dd: Int, yyyy: Int) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{mm}/{dd}/{yyyy}/month".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}",apiInvoker.escape(mm))

    .replaceAll("\\{" + "dd" + "\\}",apiInvoker.escape(dd))

    .replaceAll("\\{" + "yyyy" + "\\}",apiInvoker.escape(yyyy))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(mm, dd, yyyy).filter(_ != null)).size match {
       case 3 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dtstrDayOfMonth (mm: Int, dd: Int, yyyy: Int) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{mm}/{dd}/{yyyy}/dayOfMonth".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}",apiInvoker.escape(mm))

    .replaceAll("\\{" + "dd" + "\\}",apiInvoker.escape(dd))

    .replaceAll("\\{" + "yyyy" + "\\}",apiInvoker.escape(yyyy))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(mm, dd, yyyy).filter(_ != null)).size match {
       case 3 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dtIsLeapYear (serialNumber: Long) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{serialNumber}/isLeapYear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}",apiInvoker.escape(serialNumber))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(serialNumber).filter(_ != null)).size match {
       case 1 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dayOfYear () : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/today/dayOfYear".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def todaySimpleFmt () : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/today/mmddyyyy".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dtstrDayOfYear  (mm: Int, dd: Int, yyyy: Int) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{mm}/{dd}/{yyyy}/dayOfYear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}",apiInvoker.escape(mm))

    .replaceAll("\\{" + "dd" + "\\}",apiInvoker.escape(dd))

    .replaceAll("\\{" + "yyyy" + "\\}",apiInvoker.escape(yyyy))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(mm, dd, yyyy).filter(_ != null)).size match {
       case 3 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def weekday () : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/today/weekday".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dtstrWeekday (mm: Int, dd: Int, yyyy: Int) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{mm}/{dd}/{yyyy}/weekday".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}",apiInvoker.escape(mm))

    .replaceAll("\\{" + "dd" + "\\}",apiInvoker.escape(dd))

    .replaceAll("\\{" + "yyyy" + "\\}",apiInvoker.escape(yyyy))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(mm, dd, yyyy).filter(_ != null)).size match {
       case 3 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dtstrYear (mm: Int, dd: Int, yyyy: Int) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{mm}/{dd}/{yyyy}/year".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}",apiInvoker.escape(mm))

    .replaceAll("\\{" + "dd" + "\\}",apiInvoker.escape(dd))

    .replaceAll("\\{" + "yyyy" + "\\}",apiInvoker.escape(yyyy))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(mm, dd, yyyy).filter(_ != null)).size match {
       case 3 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dayOfMonth () : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/today/dayOfMonth".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def year () : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/today/year".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dtDayOfYear  (serialNumber: Long) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{serialNumber}/dayOfYear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}",apiInvoker.escape(serialNumber))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(serialNumber).filter(_ != null)).size match {
       case 1 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dtDayOfMonth (serialNumber: Long) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{serialNumber}/dayOfMonth".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}",apiInvoker.escape(serialNumber))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(serialNumber).filter(_ != null)).size match {
       case 1 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def today () : Option[SingleLongValue]= {
    // create path and map variables
    val path = "/date/today/serialNumber".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleLongValue]).asInstanceOf[SingleLongValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def dtWeekday (serialNumber: Long) : Option[SingleStringValue]= {
    // create path and map variables
    val path = "/date/{serialNumber}/weekday".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}",apiInvoker.escape(serialNumber))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(serialNumber).filter(_ != null)).size match {
       case 1 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleStringValue]).asInstanceOf[SingleStringValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  }

