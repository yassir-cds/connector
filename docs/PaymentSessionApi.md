# PaymentSessionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PaymentSessionsByPaymentSessionIdPaymentResultGet**](PaymentSessionApi.md#v1PaymentSessionsByPaymentSessionIdPaymentResultGet) | **GET** /v1/payment-sessions/{paymentSessionId}/paymentResult | Gets the payment result from its session id.
[**v1PaymentSessionsPost**](PaymentSessionApi.md#v1PaymentSessionsPost) | **POST** /v1/payment-sessions | Creates a payment session.


<a name="v1PaymentSessionsByPaymentSessionIdPaymentResultGet"></a>
# **v1PaymentSessionsByPaymentSessionIdPaymentResultGet**
> GetPaymentSessionResult v1PaymentSessionsByPaymentSessionIdPaymentResultGet(paymentSessionId, authToken)

Gets the payment result from its session id.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentSessionApi()
val paymentSessionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The payment session id.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : GetPaymentSessionResult = apiInstance.v1PaymentSessionsByPaymentSessionIdPaymentResultGet(paymentSessionId, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentSessionApi#v1PaymentSessionsByPaymentSessionIdPaymentResultGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentSessionApi#v1PaymentSessionsByPaymentSessionIdPaymentResultGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentSessionId** | [**java.util.UUID**](.md)| The payment session id. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

[**GetPaymentSessionResult**](GetPaymentSessionResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PaymentSessionsPost"></a>
# **v1PaymentSessionsPost**
> PaymentSessionResponse v1PaymentSessionsPost(authToken, paymentSessionRequest)

Creates a payment session.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentSessionApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val paymentSessionRequest : PaymentSessionRequest =  // PaymentSessionRequest | The payment session request.
try {
    val result : PaymentSessionResponse = apiInstance.v1PaymentSessionsPost(authToken, paymentSessionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentSessionApi#v1PaymentSessionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentSessionApi#v1PaymentSessionsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **paymentSessionRequest** | [**PaymentSessionRequest**](PaymentSessionRequest.md)| The payment session request. | [optional]

### Return type

[**PaymentSessionResponse**](PaymentSessionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

