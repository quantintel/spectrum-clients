  using System;
  using System.Collections.Generic;
  using Org.Quantintel.Spectrum;
  using Org.Quantintel.Spectrum.Model;
  namespace Org.Quantintel.Spectrum.Api {
    public class DaycountApi {
      string basePath;
      private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

      public DaycountApi(String basePath = "http://localhost:9000")
      {
        this.basePath = basePath;
      }

      public ApiInvoker getInvoker() {
        return apiInvoker;
      }

      // Sets the endpoint base url for the services being accessed
      public void setBasePath(string basePath) {
        this.basePath = basePath;
      }

      // Gets the endpoint base url for the services being accessed
      public String getBasePath() {
        return basePath;
      }

      /// <summary>
      /// day count using the Actual/360 method returns the day count given a start and end date as serial numbers
      /// </summary>
      /// <param name="fromdate">from date</param>
      /// <param name="todate">to date</param>
      /// <returns></returns>
      public SingleLongValue actual360 (long? fromdate, long? todate) {
        // create path and map variables
        var path = "/daycount/{fromdate}/{todate}/actual360".Replace("{format}","json").Replace("{" + "fromdate" + "}", apiInvoker.escapeString(fromdate.ToString())).Replace("{" + "todate" + "}", apiInvoker.escapeString(todate.ToString()));

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (fromdate == null || todate == null ) {
           throw new ApiException(400, "missing required params");
        }
        try {
          if (typeof(SingleLongValue) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as SingleLongValue;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (SingleLongValue) ApiInvoker.deserialize(response, typeof(SingleLongValue));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      }
    }