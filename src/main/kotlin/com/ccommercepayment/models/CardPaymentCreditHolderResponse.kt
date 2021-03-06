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
package com.ccommercepayment.models


import com.squareup.moshi.Json
/**
 * Response object for CardPaymentCreditHolder
 * @param responseCode The response code of the service
 * @param merchantAccountRef The MerchantAccountRef used for the credit
 * @param responseMessage The global response message
 */
data class CardPaymentCreditHolderResponse (
    /* The response code of the service */
    @Json(name = "responseCode")
    val responseCode: kotlin.String? = null,
    /* The MerchantAccountRef used for the credit */
    @Json(name = "merchantAccountRef")
    val merchantAccountRef: kotlin.String? = null,
    /* The global response message */
    @Json(name = "responseMessage")
    val responseMessage: kotlin.String? = null
) {

}

