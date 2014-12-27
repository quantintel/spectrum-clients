package org.quantintel.spectrum.api;

import org.quantintel.spectrum.client.ApiException;
import org.quantintel.spectrum.client.ApiInvoker;

import org.quantintel.spectrum.SingleStringValue;
import org.quantintel.spectrum.SingleLongValue;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class DateApi {
  String basePath = "http://localhost:9000";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

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
    Object postBody = null;
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/month".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/year".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // create path and map variables
    String path = "/date/today/isLeapYear".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
  public SingleStringValue dtstrIsLeapYear  (Integer mm, Integer dd, Integer yyyy) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(mm == null || dd == null || yyyy == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/isLeapYear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}", apiInvoker.escapeString(mm.toString())).replaceAll("\\{" + "dd" + "\\}", apiInvoker.escapeString(dd.toString())).replaceAll("\\{" + "yyyy" + "\\}", apiInvoker.escapeString(yyyy.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // create path and map variables
    String path = "/date/today/month".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/mmddyyyy".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
  public SingleStringValue dtstrMonth (Integer mm, Integer dd, Integer yyyy) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(mm == null || dd == null || yyyy == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/month".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}", apiInvoker.escapeString(mm.toString())).replaceAll("\\{" + "dd" + "\\}", apiInvoker.escapeString(dd.toString())).replaceAll("\\{" + "yyyy" + "\\}", apiInvoker.escapeString(yyyy.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
  public SingleStringValue dtstrDayOfMonth (Integer mm, Integer dd, Integer yyyy) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(mm == null || dd == null || yyyy == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/dayOfMonth".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}", apiInvoker.escapeString(mm.toString())).replaceAll("\\{" + "dd" + "\\}", apiInvoker.escapeString(dd.toString())).replaceAll("\\{" + "yyyy" + "\\}", apiInvoker.escapeString(yyyy.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/isLeapYear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // create path and map variables
    String path = "/date/today/dayOfYear".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // create path and map variables
    String path = "/date/today/mmddyyyy".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
  public SingleStringValue dtstrDayOfYear  (Integer mm, Integer dd, Integer yyyy) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(mm == null || dd == null || yyyy == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/dayOfYear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}", apiInvoker.escapeString(mm.toString())).replaceAll("\\{" + "dd" + "\\}", apiInvoker.escapeString(dd.toString())).replaceAll("\\{" + "yyyy" + "\\}", apiInvoker.escapeString(yyyy.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // create path and map variables
    String path = "/date/today/weekday".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
  public SingleStringValue dtstrWeekday (Integer mm, Integer dd, Integer yyyy) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(mm == null || dd == null || yyyy == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/weekday".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}", apiInvoker.escapeString(mm.toString())).replaceAll("\\{" + "dd" + "\\}", apiInvoker.escapeString(dd.toString())).replaceAll("\\{" + "yyyy" + "\\}", apiInvoker.escapeString(yyyy.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
  public SingleStringValue dtstrYear (Integer mm, Integer dd, Integer yyyy) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(mm == null || dd == null || yyyy == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{mm}/{dd}/{yyyy}/year".replaceAll("\\{format\\}","json").replaceAll("\\{" + "mm" + "\\}", apiInvoker.escapeString(mm.toString())).replaceAll("\\{" + "dd" + "\\}", apiInvoker.escapeString(dd.toString())).replaceAll("\\{" + "yyyy" + "\\}", apiInvoker.escapeString(yyyy.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // create path and map variables
    String path = "/date/today/dayOfMonth".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // create path and map variables
    String path = "/date/today/year".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/dayOfYear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/dayOfMonth".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // create path and map variables
    String path = "/date/today/serialNumber".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
    Object postBody = null;
    // verify required params are set
    if(serialNumber == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/date/{serialNumber}/weekday".replaceAll("\\{format\\}","json").replaceAll("\\{" + "serialNumber" + "\\}", apiInvoker.escapeString(serialNumber.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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

