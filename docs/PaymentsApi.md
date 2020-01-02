# PaymentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet**](PaymentsApi.md#v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet) | **GET** /v1/payments/all/{orderRef}/merchants/{merchantId}/sites/{merchantSiteId} | Gets all payment schedules
[**v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet**](PaymentsApi.md#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet) | **GET** /v1/payments/{orderRef}/merchants/{merchantId}/sites/{merchantSiteId}/{orderTag} | Gets payment schedule by tag.
[**v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet**](PaymentsApi.md#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet) | **GET** /v1/payments/{orderRef}/merchants/{merchantId}/sites/{merchantSiteId} | Gets payment schedule
[**v1PaymentsByOrderRefOperationsCancelOrRefundPut**](PaymentsApi.md#v1PaymentsByOrderRefOperationsCancelOrRefundPut) | **PUT** /v1/payments/{orderRef}/operations/cancelOrRefund | Cancel or refund
[**v1PaymentsByOrderRefOperationsCapturePut**](PaymentsApi.md#v1PaymentsByOrderRefOperationsCapturePut) | **PUT** /v1/payments/{orderRef}/operations/capture | Capture
[**v1PaymentsByOrderRefOperationsRecomputePut**](PaymentsApi.md#v1PaymentsByOrderRefOperationsRecomputePut) | **PUT** /v1/payments/{orderRef}/operations/recompute | Recompute schedule


<a name="v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet"></a>
# **v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet**
> PaymentOperationsResponse v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet(orderRef, merchantId, merchantSiteId, authToken)

Gets all payment schedules

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The order reference.
val merchantId : kotlin.Int = 56 // kotlin.Int | The merchant identifier.
val merchantSiteId : kotlin.String = merchantSiteId_example // kotlin.String | The merchant site identifier.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet(orderRef, merchantId, merchantSiteId, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The order reference. |
 **merchantId** | **kotlin.Int**| The merchant identifier. |
 **merchantSiteId** | **kotlin.String**| The merchant site identifier. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet"></a>
# **v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet**
> PaymentOperationsResponse v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet(orderRef, merchantId, merchantSiteId, orderTag, authToken)

Gets payment schedule by tag.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The order reference.
val merchantId : kotlin.Int = 56 // kotlin.Int | The merchant identifier.
val merchantSiteId : kotlin.String = merchantSiteId_example // kotlin.String | The merchant site identifier.
val orderTag : kotlin.String = orderTag_example // kotlin.String | The order Tag
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet(orderRef, merchantId, merchantSiteId, orderTag, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The order reference. |
 **merchantId** | **kotlin.Int**| The merchant identifier. |
 **merchantSiteId** | **kotlin.String**| The merchant site identifier. |
 **orderTag** | **kotlin.String**| The order Tag |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet"></a>
# **v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet**
> PaymentOperationsResponse v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet(orderRef, merchantId, merchantSiteId, authToken)

Gets payment schedule

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The order reference.
val merchantId : kotlin.Int = 56 // kotlin.Int | The merchant identifier.
val merchantSiteId : kotlin.String = merchantSiteId_example // kotlin.String | The merchant site identifier.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet(orderRef, merchantId, merchantSiteId, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The order reference. |
 **merchantId** | **kotlin.Int**| The merchant identifier. |
 **merchantSiteId** | **kotlin.String**| The merchant site identifier. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PaymentsByOrderRefOperationsCancelOrRefundPut"></a>
# **v1PaymentsByOrderRefOperationsCancelOrRefundPut**
> PaymentOperationsResponse v1PaymentsByOrderRefOperationsCancelOrRefundPut(orderRef, authToken, paymentOperationRequest)

Cancel or refund

This operation allows the merchant to cancel (also referred to as \&quot;void\&quot;) or refund a transaction, according to its current state.    You can find below the exhaustive list of cases which may happen.      With a Cancel operation, the customer will not see movement on his bank account, contrary to Refund which gives back the charged amount.    Cancel is only performed when:    1. The transaction is not yet captured (in which case, the fund reservation on the customer payment method is cleared)    2. The operation occurs on the same day as the capture operation.        If you want to cancel or refund less than the original transaction amount, you can specify the amount in the request body.   Alternatively you can specify an amount of 0 (or not specify the amount in the request) if you want to refund the total amount.    * Partial operation: 0 &amp;lt; amount &amp;lt; transaction amount    * Full operation: amount &#x3D;&#x3D; transaction amount OR amount &#x3D;&#x3D; 0      ---      ## Cancel Or Refund cases ##     **After the authorization, and before the capture**     Because the refund operation cannot be executed on a non-captured transaction, only the cancel operation is supported    | Partial Operation                                                               | Full Operation                                                                                                                                      |  | ------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |  | No interaction with partners because partial cancel/void is **not supported**. &lt;br /&gt; The only impact is an update of the remaining amount to capture in payment hub. | **Cancel** operation will be executed on the entire transaction. &lt;br /&gt; The fund reservation on the customer payment method will be cleared, and capture will no longer be possible.&lt;br /&gt; Cancelling a non captured transaction is **not worldwide supported**, and depends on the payment partner (PSP), the acquiring bank, and the issuing bank. |    **After the capture**     Because the balance is made at midnight, either the cancel operation or the refund operation will be selected depending on the date.       |                                          | Partial Operation                                                                                                             | Full Operation                                            |  | ---------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------- |  | On the same day as the capture operation | The **cancel** operation will be executed. &lt;br /&gt; Partial cancelling of a captured transaction is supported, but doesn&#39;t behave the same depending on the payment partner used. &lt;br /&gt; In some cases, a **refund** will be executed instead. | The **cancel** operation will be executed. &lt;br /&gt; Full cancel of a captured transaction is **fully supported**. |  | D+1 and later                            | The **refund** operation will be executed. &lt;br /&gt; Partial refund is **fully supported**. | The **refund** operation will be executed. &lt;br /&gt; Full refund is **fully supported**. |

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The OrderRef.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val paymentOperationRequest : PaymentOperationsRequest =  // PaymentOperationsRequest | The payment operation request. Materialized by the Body of the PUT request
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsByOrderRefOperationsCancelOrRefundPut(orderRef, authToken, paymentOperationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsCancelOrRefundPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsCancelOrRefundPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The OrderRef. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **paymentOperationRequest** | [**PaymentOperationsRequest**](PaymentOperationsRequest.md)| The payment operation request. Materialized by the Body of the PUT request | [optional]

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentsByOrderRefOperationsCapturePut"></a>
# **v1PaymentsByOrderRefOperationsCapturePut**
> PaymentOperationsResponse v1PaymentsByOrderRefOperationsCapturePut(orderRef, authToken, paymentOperationRequest)

Capture

This operation charges the bank account of the customer, following a valid authorization done before. You need to provide a succeeded authorized OrderRef, and the amount you want to charge.  This is well suited for a \&quot;charge at shipping\&quot; scenario: the merchant makes an authorization when the customer place the order, and the bank account is charged when the merchant actually does the shipping.    - If you want to capture the total amount of the authorization, you can either set the amount to 0 in the request, or simply not specify it.    ### Useful reminders:    * You can capture the authorization multiple times, as long as there is some amount remaining. For instance, with an authorization of 100€, you can capture 20€ and then capture 80€ later, within the limited time.    * Please note that the authorization is only valid for a limited amount of time, and that you cannot capture a greater amount than the authorized one.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The OrderRef.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val paymentOperationRequest : PaymentOperationsRequest =  // PaymentOperationsRequest | The payment operation request. Materialized by the Body of the PUT request
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsByOrderRefOperationsCapturePut(orderRef, authToken, paymentOperationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsCapturePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsCapturePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The OrderRef. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **paymentOperationRequest** | [**PaymentOperationsRequest**](PaymentOperationsRequest.md)| The payment operation request. Materialized by the Body of the PUT request | [optional]

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentsByOrderRefOperationsRecomputePut"></a>
# **v1PaymentsByOrderRefOperationsRecomputePut**
> PaymentOperationsResponse v1PaymentsByOrderRefOperationsRecomputePut(orderRef, authToken, paymentOperationRequest)

Recompute schedule

This operation forces the recomputation of the payment schedule, using the default payment schedule rules.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The OrderRef.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val paymentOperationRequest : PaymentOperationsRequest =  // PaymentOperationsRequest | The payment operation request. Materialized by the Body of the PUT request
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsByOrderRefOperationsRecomputePut(orderRef, authToken, paymentOperationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsRecomputePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsRecomputePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The OrderRef. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **paymentOperationRequest** | [**PaymentOperationsRequest**](PaymentOperationsRequest.md)| The payment operation request. Materialized by the Body of the PUT request | [optional]

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

