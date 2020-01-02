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

import com.ccommercepayment.models.Configuration
import com.ccommercepayment.models.Customer
import com.ccommercepayment.models.OrderData
import com.ccommercepayment.models.StoredCard

import com.squareup.moshi.Json
/**
 * 
 * @param merchantId MerchantId
 * @param merchantSiteId MerchantSiteId
 * @param customer 
 * @param orderData 
 * @param storedCardData StoredCardData
 * @param allowCardStorage Gets or sets a value indicating whether [allow card storage].
 * @param forcedCardOptionRef Gets or sets a value indicating whether [forced card option reference].
 * @param forceCardStorage Gets or sets a value indicating whether [forced card storage].
 * @param forceImmediateStoredCardPayment Gets or sets a value indicating whether [forced immediate stored card].
 * @param configuration 
 */
data class PaymentSessionRequest (
    /* MerchantId */
    @Json(name = "merchantId")
    val merchantId: kotlin.Int? = null,
    /* MerchantSiteId */
    @Json(name = "merchantSiteId")
    val merchantSiteId: kotlin.String? = null,
    @Json(name = "customer")
    val customer: Customer? = null,
    @Json(name = "orderData")
    val orderData: OrderData? = null,
    /* StoredCardData */
    @Json(name = "storedCardData")
    val storedCardData: kotlin.Array<StoredCard>? = null,
    /* Gets or sets a value indicating whether [allow card storage]. */
    @Json(name = "allowCardStorage")
    val allowCardStorage: kotlin.Boolean? = null,
    /* Gets or sets a value indicating whether [forced card option reference]. */
    @Json(name = "forcedCardOptionRef")
    val forcedCardOptionRef: kotlin.String? = null,
    /* Gets or sets a value indicating whether [forced card storage]. */
    @Json(name = "forceCardStorage")
    val forceCardStorage: kotlin.Boolean? = null,
    /* Gets or sets a value indicating whether [forced immediate stored card]. */
    @Json(name = "forceImmediateStoredCardPayment")
    val forceImmediateStoredCardPayment: kotlin.Boolean? = null,
    @Json(name = "configuration")
    val configuration: Configuration? = null
) {

}

