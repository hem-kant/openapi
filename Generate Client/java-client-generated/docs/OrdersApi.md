# OrdersApi

All URIs are relative to *https://dev.api.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**anyOfOrdersGet**](OrdersApi.md#anyOfOrdersGet) | **GET** /anyOfOrders | Get order
[**deleteOrderDetails**](OrdersApi.md#deleteOrderDetails) | **DELETE** /orders | delete order api
[**getOrderDetails**](OrdersApi.md#getOrderDetails) | **GET** /orders | get order details
[**oneOfOrdersPost**](OrdersApi.md#oneOfOrdersPost) | **POST** /oneOfOrders | Insert oneof the order details
[**saveOrderDetails**](OrdersApi.md#saveOrderDetails) | **POST** /orders | order api
[**updateOrderdetails**](OrdersApi.md#updateOrderdetails) | **PUT** /orders | update order api

<a name="anyOfOrdersGet"></a>
# **anyOfOrdersGet**
> InlineResponse2001 anyOfOrdersGet(orderId, fetchType)

Get order

Get order details based on ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyAuth
ApiKeyAuth APIKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyAuth");
APIKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyAuth.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


// Configure OAuth2 access token for authorization: oAuth2AuthCode
OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
String fetchType = "fetchType_example"; // String | Fetch Type:   * `summary` - will provide the order summary   * `details` - will provide the sumamr & details of order address 
try {
    InlineResponse2001 result = apiInstance.anyOfOrdersGet(orderId, fetchType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#anyOfOrdersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |
 **fetchType** | **String**| Fetch Type:   * &#x60;summary&#x60; - will provide the order summary   * &#x60;details&#x60; - will provide the sumamr &amp; details of order address  | [enum: summary, details]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[APIKeyAuth](../README.md#APIKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteOrderDetails"></a>
# **deleteOrderDetails**
> deleteOrderDetails(orderId)

delete order api

delete order details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyAuth
ApiKeyAuth APIKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyAuth");
APIKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyAuth.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


// Configure OAuth2 access token for authorization: oAuth2AuthCode
OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
try {
    apiInstance.deleteOrderDetails(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#deleteOrderDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[APIKeyAuth](../README.md#APIKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOrderDetails"></a>
# **getOrderDetails**
> InlineResponse200 getOrderDetails(orderId)

get order details

get order details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyAuth
ApiKeyAuth APIKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyAuth");
APIKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyAuth.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


// Configure OAuth2 access token for authorization: oAuth2AuthCode
OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
try {
    InlineResponse200 result = apiInstance.getOrderDetails(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrderDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[APIKeyAuth](../README.md#APIKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oneOfOrdersPost"></a>
# **oneOfOrdersPost**
> oneOfOrdersPost(body)

Insert oneof the order details

Insert oneof the order details in shopping cart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyAuth
ApiKeyAuth APIKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyAuth");
APIKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyAuth.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


// Configure OAuth2 access token for authorization: oAuth2AuthCode
OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
OneOfOrdersBody body = new OneOfOrdersBody(); // OneOfOrdersBody | 
try {
    apiInstance.oneOfOrdersPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#oneOfOrdersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OneOfOrdersBody**](OneOfOrdersBody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[APIKeyAuth](../README.md#APIKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="saveOrderDetails"></a>
# **saveOrderDetails**
> InlineResponse201 saveOrderDetails(body)

order api

Post order details for processing 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyAuth
ApiKeyAuth APIKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyAuth");
APIKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyAuth.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


// Configure OAuth2 access token for authorization: oAuth2AuthCode
OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
OrdersBody1 body = new OrdersBody1(); // OrdersBody1 | 
try {
    InlineResponse201 result = apiInstance.saveOrderDetails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#saveOrderDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrdersBody1**](OrdersBody1.md)|  | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[APIKeyAuth](../README.md#APIKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrderdetails"></a>
# **updateOrderdetails**
> updateOrderdetails(body)

update order api

update order details for processing 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyAuth
ApiKeyAuth APIKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyAuth");
APIKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyAuth.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


// Configure OAuth2 access token for authorization: oAuth2AuthCode
OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
OrdersBody body = new OrdersBody(); // OrdersBody | 
try {
    apiInstance.updateOrderdetails(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#updateOrderdetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrdersBody**](OrdersBody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[APIKeyAuth](../README.md#APIKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

