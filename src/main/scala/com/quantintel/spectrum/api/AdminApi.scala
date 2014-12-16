package com.quantintel.spectrum.api

import com.quantintel.spectrum.Health
import com.quantintel.spectrum.client.ApiInvoker
import com.quantintel.spectrum.client.ApiException

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class AdminApi {
  var basePath: String = "http://localhost:9000"
  var apiInvoker = ApiInvoker
  
  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  def ping () : Option[String]= {
    // create path and map variables
    val path = "/admin/ping".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[String]).asInstanceOf[String])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def getHealth () : Option[Health]= {
    // create path and map variables
    val path = "/admin/health".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "", classOf[Health]).asInstanceOf[Health])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  }

