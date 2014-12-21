package org.quantintel.spectrum.api;

import org.quantintel.spectrum.client.ApiException;
import org.quantintel.spectrum.client.ApiInvoker;
import org.quantintel.spectrum.model.SingleStringValue;
import org.quantintel.spectrum.model.SingleLongValue;
import java.util.*;
import java.io.File;

public class DateApi {
  String basePath = "http://localhost:9000";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtMonth (Long serialNumber) throws ApiException {
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/month".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtYear (Long serialNumber) throws ApiException {
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/year".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue isLeapYear () throws ApiException {
    // create path and map variables
    String path = "/date/today/isLeapYear".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtstrIsLeapYear  () throws ApiException {
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/isLeapYear".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue month () throws ApiException {
    // create path and map variables
    String path = "/date/today/month".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue simpleFmt (Long serialNumber) throws ApiException {
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/mmddyyyy".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtstrMonth () throws ApiException {
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/month".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtstrDayOfMonth () throws ApiException {
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/dayOfMonth".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtIsLeapYear (Long serialNumber) throws ApiException {
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/isLeapYear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dayOfYear () throws ApiException {
    // create path and map variables
    String path = "/date/today/dayOfYear".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue todaySimpleFmt () throws ApiException {
    // create path and map variables
    String path = "/date/today/mmddyyyy".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtstrDayOfYear  () throws ApiException {
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/dayOfYear".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue weekday () throws ApiException {
    // create path and map variables
    String path = "/date/today/weekday".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtstrWeekday () throws ApiException {
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/weekday".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtstrYear () throws ApiException {
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/year".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dayOfMonth () throws ApiException {
    // create path and map variables
    String path = "/date/today/dayOfMonth".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue year () throws ApiException {
    // create path and map variables
    String path = "/date/today/year".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtDayOfYear  (Long serialNumber) throws ApiException {
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/dayOfYear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtDayOfMonth (Long serialNumber) throws ApiException {
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/dayOfMonth".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 400 reason: "Required parameter missing" model: <none>
  //error info- code: 404 reason: "todays serial number not found" model: <none>
  public SingleLongValue today () throws ApiException {
    // create path and map variables
    String path = "/date/today/serialNumber".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleLongValue) ApiInvoker.deserialize(response, "", SingleLongValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Request cannot be satisfied with parameters provided." model: <none>
  public SingleStringValue dtWeekday (Long serialNumber) throws ApiException {
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/weekday".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleStringValue) ApiInvoker.deserialize(response, "", SingleStringValue.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

