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

class SecurityTokenApi(basePath: kotlin.String = "http://localhost") : ApiClient(basePath) {

    /**
    * Authenticate
    * Get the token provided by the Security Token Service (STS).  The authentication token is mandatory for the others api calls.  It&#39;s expire after 48h by default.
    * @param authorization The credentials (login:password in base64) (optional)
    * @return kotlin.String
    */
    @Suppress("UNCHECKED_CAST")
    fun v1AuthTokenGet(authorization: kotlin.String?) : kotlin.String {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("authorization" to authorization.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/v1/auth/token",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.String>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

}