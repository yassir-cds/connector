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

import com.ccommercepayment.models.PaymentCardOption

import com.squareup.moshi.Json
/**
 * All payment card data
 * @param paymentCardRef The payment card reference
 * @param name The payment card name
 * @param paymentCardOptions All payment card options data
 */
data class PaymentCard (
    /* The payment card reference */
    @Json(name = "paymentCardRef")
    val paymentCardRef: kotlin.String? = null,
    /* The payment card name */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* All payment card options data */
    @Json(name = "paymentCardOptions")
    val paymentCardOptions: kotlin.Array<PaymentCardOption>? = null
) {

}

