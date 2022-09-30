# ProductsApi

All URIs are relative to *https://dev.api.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProductDetails**](ProductsApi.md#getProductDetails) | **GET** /products/{productsId} | Returns the products details
[**getProducts**](ProductsApi.md#getProducts) | **GET** /products | Returns the list of all products

<a name="getProductDetails"></a>
# **getProductDetails**
> Products getProductDetails(productsId)

Returns the products details

Returns the products details based on ID which is available on shopOnline portal

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

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

ProductsApi apiInstance = new ProductsApi();
Integer productsId = 56; // Integer | 
try {
    Products result = apiInstance.getProductDetails(productsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getProductDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productsId** | **Integer**|  | [enum: ]

### Return type

[**Products**](Products.md)

### Authorization

[APIKeyAuth](../README.md#APIKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProducts"></a>
# **getProducts**
> List&lt;Products&gt; getProducts(categoryId)

Returns the list of all products

Returns the list of all products which is available on shopOnline portal

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

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

ProductsApi apiInstance = new ProductsApi();
Integer categoryId = 56; // Integer | 
try {
    List<Products> result = apiInstance.getProducts(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**|  | [optional] [enum: ]

### Return type

[**List&lt;Products&gt;**](Products.md)

### Authorization

[APIKeyAuth](../README.md#APIKeyAuth)[BasicAuth](../README.md#BasicAuth)[BearerAuth](../README.md#BearerAuth)[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

