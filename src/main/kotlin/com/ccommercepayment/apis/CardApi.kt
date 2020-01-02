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

import com.ccommercepayment.models.CardPaymentCreditHolderRequest
import com.ccommercepayment.models.CardPaymentCreditHolderResponse

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

class CardApi(basePath: kotlin.String = "http://localhost") : ApiClient(basePath) {

    /**
    * Credit a card.
    * 
    * @param authToken Gets or sets the authentication token. 
    * @param request  (optional)
    * @return CardPaymentCreditHolderResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun v1CardCreditHolderPost(authToken: kotlin.String, request: CardPaymentCreditHolderRequest?) : CardPaymentCreditHolderResponse {
        val localVariableBody: kotlin.Any? = request
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("authToken" to authToken.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/v1/card/creditHolder",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<CardPaymentCreditHolderResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as CardPaymentCreditHolderResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

}