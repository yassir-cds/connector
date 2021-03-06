/**
* Payment Gateway
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: v1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.ccommercepayment.apis

import com.ccommercepayment.models.GetPaymentSessionResult
import com.ccommercepayment.models.PaymentSessionRequest
import com.ccommercepayment.models.PaymentSessionResponse

import com.ccommercepayment.infrastructure.ApiClient
import com.ccommercepayment.infrastructure.ClientException
import com.ccommercepayment.infrastructure.ClientError
import com.ccommercepayment.infrastructure.ServerException
import com.ccommercepayment.infrastructure.ServerError
import com.ccommercepayment.infrastructure.MultiValueMap
import com.ccommercepayment.infrastructure.RequestConfig
import com.ccommercepayment.infrastructure.RequestMethod
import com.ccommercepayment.infrastructure.ResponseType
import com.ccommercepayment.infrastructure.Success
import com.ccommercepayment.infrastructure.toMultiValue

class PaymentSessionApi(basePath: kotlin.String = "http://localhost") : ApiClient(basePath) {

    /**
    * Gets the payment result from its session id.
    * 
    * @param paymentSessionId The payment session id. 
    * @param authToken Gets or sets the authentication token. 
    * @return GetPaymentSessionResult
    */
    @Suppress("UNCHECKED_CAST")
    fun v1PaymentSessionsByPaymentSessionIdPaymentResultGet(paymentSessionId: java.util.UUID, authToken: kotlin.String) : GetPaymentSessionResult {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("authToken" to authToken.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/v1/payment-sessions/{paymentSessionId}/paymentResult".replace("{"+"paymentSessionId"+"}", "$paymentSessionId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<GetPaymentSessionResult>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetPaymentSessionResult
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * Creates a payment session.
    * 
    * @param authToken Gets or sets the authentication token. 
    * @param paymentSessionRequest The payment session request. (optional)
    * @return PaymentSessionResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun v1PaymentSessionsPost(authToken: kotlin.String, paymentSessionRequest: PaymentSessionRequest?) : PaymentSessionResponse {
        val localVariableBody: kotlin.Any? = paymentSessionRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("authToken" to authToken.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/v1/payment-sessions",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<PaymentSessionResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as PaymentSessionResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

}
