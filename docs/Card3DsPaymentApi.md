# Card3DsPaymentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PaymentsCard3dsPaymentAuthenticationPost**](Card3DsPaymentApi.md#v1PaymentsCard3dsPaymentAuthenticationPost) | **POST** /v1/payments/card3ds-payment/authentication | Validate authentication.
[**v1PaymentsCard3dsPaymentPost**](Card3DsPaymentApi.md#v1PaymentsCard3dsPaymentPost) | **POST** /v1/payments/card3ds-payment | Check enrollment
[**v1PaymentsCard3dsPaymentPut**](Card3DsPaymentApi.md#v1PaymentsCard3dsPaymentPut) | **PUT** /v1/payments/card3ds-payment | Validate authentication AND authorize / payment
[**v1PaymentsCard3dsPaymentWithAuthenticationDataPost**](Card3DsPaymentApi.md#v1PaymentsCard3dsPaymentWithAuthenticationDataPost) | **POST** /v1/payments/card3ds-payment/with-authentication-data | Authorization / payment -with- authentication data


<a name="v1PaymentsCard3dsPaymentAuthenticationPost"></a>
# **v1PaymentsCard3dsPaymentAuthenticationPost**
> Card3DsValidateAuthenticationResponse v1PaymentsCard3dsPaymentAuthenticationPost(authToken, card3DsValidateAuthenticationRequest)

Validate authentication.

To process a payment authorization linked to this authentication, you should pass all authentication data.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = Card3DsPaymentApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val card3DsValidateAuthenticationRequest : Card3DsValidateAuthenticationRequest =  // Card3DsValidateAuthenticationRequest | The validate authentication request.
try {
    val result : Card3DsValidateAuthenticationResponse = apiInstance.v1PaymentsCard3dsPaymentAuthenticationPost(authToken, card3DsValidateAuthenticationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentAuthenticationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentAuthenticationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **card3DsValidateAuthenticationRequest** | [**Card3DsValidateAuthenticationRequest**](Card3DsValidateAuthenticationRequest.md)| The validate authentication request. | [optional]

### Return type

[**Card3DsValidateAuthenticationResponse**](Card3DsValidateAuthenticationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentsCard3dsPaymentPost"></a>
# **v1PaymentsCard3dsPaymentPost**
> Card3DsCheckEnrollmentResponse v1PaymentsCard3dsPaymentPost(authToken, card3DsCheckEnrollmentRequest)

Check enrollment

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = Card3DsPaymentApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val card3DsCheckEnrollmentRequest : Card3DsCheckEnrollmentRequest =  // Card3DsCheckEnrollmentRequest | All data needed to make a 3DS card payment
try {
    val result : Card3DsCheckEnrollmentResponse = apiInstance.v1PaymentsCard3dsPaymentPost(authToken, card3DsCheckEnrollmentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **card3DsCheckEnrollmentRequest** | [**Card3DsCheckEnrollmentRequest**](Card3DsCheckEnrollmentRequest.md)| All data needed to make a 3DS card payment | [optional]

### Return type

[**Card3DsCheckEnrollmentResponse**](Card3DsCheckEnrollmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentsCard3dsPaymentPut"></a>
# **v1PaymentsCard3dsPaymentPut**
> CardPaymentResponse v1PaymentsCard3dsPaymentPut(authToken, card3DsValidateAndAuthorizeRequest)

Validate authentication AND authorize / payment

Finish the 3DS payment.  Reuse the order references and the paymentRequestId (returned from the POST).

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = Card3DsPaymentApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val card3DsValidateAndAuthorizeRequest : Card3DsValidateAuthenticationAndAuthorizeRequest =  // Card3DsValidateAuthenticationAndAuthorizeRequest | The card payment put request.
try {
    val result : CardPaymentResponse = apiInstance.v1PaymentsCard3dsPaymentPut(authToken, card3DsValidateAndAuthorizeRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **card3DsValidateAndAuthorizeRequest** | [**Card3DsValidateAuthenticationAndAuthorizeRequest**](Card3DsValidateAuthenticationAndAuthorizeRequest.md)| The card payment put request. | [optional]

### Return type

[**CardPaymentResponse**](CardPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentsCard3dsPaymentWithAuthenticationDataPost"></a>
# **v1PaymentsCard3dsPaymentWithAuthenticationDataPost**
> CardPaymentResponse v1PaymentsCard3dsPaymentWithAuthenticationDataPost(authToken, card3DsAuthorizeWithAuthDataRequest)

Authorization / payment -with- authentication data

You should pass authentication data returned by the authentication API.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = Card3DsPaymentApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val card3DsAuthorizeWithAuthDataRequest : Card3DsAuthorizeWithAuthDataRequest =  // Card3DsAuthorizeWithAuthDataRequest | The authorize with authentication data request.
try {
    val result : CardPaymentResponse = apiInstance.v1PaymentsCard3dsPaymentWithAuthenticationDataPost(authToken, card3DsAuthorizeWithAuthDataRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentWithAuthenticationDataPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentWithAuthenticationDataPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **card3DsAuthorizeWithAuthDataRequest** | [**Card3DsAuthorizeWithAuthDataRequest**](Card3DsAuthorizeWithAuthDataRequest.md)| The authorize with authentication data request. | [optional]

### Return type

[**CardPaymentResponse**](CardPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

