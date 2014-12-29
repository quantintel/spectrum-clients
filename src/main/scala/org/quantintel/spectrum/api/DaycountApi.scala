package org.quantintel.spectrum.api

import org.quantintel.spectrum.SingleDoubleValue
import org.quantintel.spectrum.SingleLongValue
import org.quantintel.spectrum.client.ApiInvoker
import org.quantintel.spectrum.client.ApiException

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class DaycountApi {
  var basePath: String = "http://localhost:9000"
  var apiInvoker = ApiInvoker
  
  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  def actual360 (fromdate: Long, todate: Long) : Option[SingleLongValue]= {
    // create path and map variables
    val path = "/daycount/{fromdate}/{todate}/actual360".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}",apiInvoker.escape(fromdate))

    .replaceAll("\\{" + "todate" + "\\}",apiInvoker.escape(todate))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(fromdate, todate).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
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
  def actual365nl (fromdate: Long, todate: Long) : Option[SingleLongValue]= {
    // create path and map variables
    val path = "/daycount/{fromdate}/{todate}/actual365nl".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}",apiInvoker.escape(fromdate))

    .replaceAll("\\{" + "todate" + "\\}",apiInvoker.escape(todate))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(fromdate, todate).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
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
  def actual365nlyf (fromdate: Long, todate: Long) : Option[SingleDoubleValue]= {
    // create path and map variables
    val path = "/daycount/{fromdate}/{todate}/actual365nlyf".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}",apiInvoker.escape(fromdate))

    .replaceAll("\\{" + "todate" + "\\}",apiInvoker.escape(todate))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(fromdate, todate).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleDoubleValue]).asInstanceOf[SingleDoubleValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def actual365l (fromdate: Long, todate: Long) : Option[SingleLongValue]= {
    // create path and map variables
    val path = "/daycount/{fromdate}/{todate}/actual365l".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}",apiInvoker.escape(fromdate))

    .replaceAll("\\{" + "todate" + "\\}",apiInvoker.escape(todate))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(fromdate, todate).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
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
  def actual365lyf (fromdate: Long, todate: Long) : Option[SingleDoubleValue]= {
    // create path and map variables
    val path = "/daycount/{fromdate}/{todate}/actual365lyf".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}",apiInvoker.escape(fromdate))

    .replaceAll("\\{" + "todate" + "\\}",apiInvoker.escape(todate))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(fromdate, todate).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleDoubleValue]).asInstanceOf[SingleDoubleValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def actual365fyf (fromdate: Long, todate: Long) : Option[SingleDoubleValue]= {
    // create path and map variables
    val path = "/daycount/{fromdate}/{todate}/actual365fyf".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}",apiInvoker.escape(fromdate))

    .replaceAll("\\{" + "todate" + "\\}",apiInvoker.escape(todate))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(fromdate, todate).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleDoubleValue]).asInstanceOf[SingleDoubleValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def actual360yf (fromdate: Long, todate: Long) : Option[SingleDoubleValue]= {
    // create path and map variables
    val path = "/daycount/{fromdate}/{todate}/actual360yf".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}",apiInvoker.escape(fromdate))

    .replaceAll("\\{" + "todate" + "\\}",apiInvoker.escape(todate))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(fromdate, todate).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[SingleDoubleValue]).asInstanceOf[SingleDoubleValue])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def actual365f (fromdate: Long, todate: Long) : Option[SingleLongValue]= {
    // create path and map variables
    val path = "/daycount/{fromdate}/{todate}/actual365f".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}",apiInvoker.escape(fromdate))

    .replaceAll("\\{" + "todate" + "\\}",apiInvoker.escape(todate))

    

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(fromdate, todate).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
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
  }

