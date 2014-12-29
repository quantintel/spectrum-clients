package org.quantintel.spectrum.api;

import org.quantintel.spectrum.client.ApiException;
import org.quantintel.spectrum.client.ApiInvoker;
import org.quantintel.spectrum.model.SingleDoubleValue;
import org.quantintel.spectrum.model.SingleLongValue;
import java.util.*;
import java.io.File;

public class DaycountApi {
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

  //error info- code: 400 reason: "Required parameter missing" model: <none>
  //error info- code: 404 reason: "function error" model: <none>
  public SingleDoubleValue actual360fyf (Long fromdate, Long todate) throws ApiException {
    // verify required params are set
    if(fromdate == null || todate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/daycount/{fromdate}/{todate}}/actual365fyf".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}", apiInvoker.escapeString(fromdate.toString())).replaceAll("\\{" + "todate" + "\\}", apiInvoker.escapeString(todate.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleDoubleValue) ApiInvoker.deserialize(response, "", SingleDoubleValue.class);
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
  //error info- code: 404 reason: "function error" model: <none>
  public SingleLongValue actual360 (Long fromdate, Long todate) throws ApiException {
    // verify required params are set
    if(fromdate == null || todate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/daycount/{fromdate}/{todate}/actual360".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}", apiInvoker.escapeString(fromdate.toString())).replaceAll("\\{" + "todate" + "\\}", apiInvoker.escapeString(todate.toString()));

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
  //error info- code: 400 reason: "Required parameter missing" model: <none>
  //error info- code: 404 reason: "function error" model: <none>
  public SingleLongValue actual360NL (Long fromdate, Long todate) throws ApiException {
    // verify required params are set
    if(fromdate == null || todate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/daycount/{fromdate}/{todate}/actual365nl".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}", apiInvoker.escapeString(fromdate.toString())).replaceAll("\\{" + "todate" + "\\}", apiInvoker.escapeString(todate.toString()));

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
  //error info- code: 400 reason: "Required parameter missing" model: <none>
  //error info- code: 404 reason: "function error" model: <none>
  public SingleDoubleValue actual360nlyf (Long fromdate, Long todate) throws ApiException {
    // verify required params are set
    if(fromdate == null || todate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/daycount/{fromdate}/{todate}/actual365nlyf".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}", apiInvoker.escapeString(fromdate.toString())).replaceAll("\\{" + "todate" + "\\}", apiInvoker.escapeString(todate.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleDoubleValue) ApiInvoker.deserialize(response, "", SingleDoubleValue.class);
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
  //error info- code: 404 reason: "function error" model: <none>
  public SingleLongValue actual360L (Long fromdate, Long todate) throws ApiException {
    // verify required params are set
    if(fromdate == null || todate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/daycount/{fromdate}/{todate}/actual365l".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}", apiInvoker.escapeString(fromdate.toString())).replaceAll("\\{" + "todate" + "\\}", apiInvoker.escapeString(todate.toString()));

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
  //error info- code: 400 reason: "Required parameter missing" model: <none>
  //error info- code: 404 reason: "function error" model: <none>
  public SingleDoubleValue actual360lyf (Long fromdate, Long todate) throws ApiException {
    // verify required params are set
    if(fromdate == null || todate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/daycount/{fromdate}/{todate}/actual365lyf".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}", apiInvoker.escapeString(fromdate.toString())).replaceAll("\\{" + "todate" + "\\}", apiInvoker.escapeString(todate.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleDoubleValue) ApiInvoker.deserialize(response, "", SingleDoubleValue.class);
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
  //error info- code: 404 reason: "function error" model: <none>
  public SingleLongValue actual360F (Long fromdate, Long todate) throws ApiException {
    // verify required params are set
    if(fromdate == null || todate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/daycount/{fromdate}/{todate}}/actual365f".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}", apiInvoker.escapeString(fromdate.toString())).replaceAll("\\{" + "todate" + "\\}", apiInvoker.escapeString(todate.toString()));

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
  //error info- code: 400 reason: "Required parameter missing" model: <none>
  //error info- code: 404 reason: "function error" model: <none>
  public SingleDoubleValue actual360yf (Long fromdate, Long todate) throws ApiException {
    // verify required params are set
    if(fromdate == null || todate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/daycount/{fromdate}/{todate}/actual360yf".replaceAll("\\{format\\}","json").replaceAll("\\{" + "fromdate" + "\\}", apiInvoker.escapeString(fromdate.toString())).replaceAll("\\{" + "todate" + "\\}", apiInvoker.escapeString(todate.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SingleDoubleValue) ApiInvoker.deserialize(response, "", SingleDoubleValue.class);
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

