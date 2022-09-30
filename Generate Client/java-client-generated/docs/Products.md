# Products

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**price** | **Float** |  |  [optional]
**categoryName** | **String** |  |  [optional]
**releseDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**quantity** | **Integer** | ***Quantity*** represents &#x60;stock&#x60; value when this field is being sent by OnlineShope.Where as in the scenarios of consumer sending this feild, it represents &#x60;number of product items&#x60; inside the order. Consumers are expected to handle the scenario of stopping the end user &lt;u&gt;*when the stock value is 0*&lt;/u&gt;   |  [optional]
