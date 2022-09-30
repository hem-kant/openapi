# CategoriesApi

All URIs are relative to *https://dev.api.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategories**](CategoriesApi.md#getCategories) | **GET** /categories | Returns the list of all products categories
[**getCategoryDetails**](CategoriesApi.md#getCategoryDetails) | **GET** /categories/{categoryId} | Returns the list of all products categories

<a name="getCategories"></a>
# **getCategories**
> List&lt;Category&gt; getCategories(categoryId)

Returns the list of all products categories

Returns the list of all products and categories  which is available on shopOnline portal 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CategoriesApi apiInstance = new CategoriesApi();
Integer categoryId = 56; // Integer | 
try {
    List<Category> result = apiInstance.getCategories(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**|  | [optional] [enum: ]

### Return type

[**List&lt;Category&gt;**](Category.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCategoryDetails"></a>
# **getCategoryDetails**
> Category getCategoryDetails(categoryId)

Returns the list of all products categories

Returns the list of all products and categories which is available on shopOnline portal

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoriesApi;


CategoriesApi apiInstance = new CategoriesApi();
Integer categoryId = 56; // Integer | 
try {
    Category result = apiInstance.getCategoryDetails(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategoryDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**|  | [enum: ]

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

