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

import com.ccommercepayment.models.CardData
import com.ccommercepayment.models.CardPaymentContextData
import com.ccommercepayment.models.Options
import com.ccommercepayment.models.Order
import com.ccommercepayment.models.StoredCard
import com.ccommercepayment.models.ValidationModeOverride

import com.squareup.moshi.Json
/**
 * 
 * @param context 
 * @param options 
 * @param order 
 * @param card 
 * @param storedCard 
 * @param validationMode 
 * @param notificationUrl Url for the notification of the payment
 */
data class CardPaymentRequest (
    @Json(name = "context")
    val context: CardPaymentContextData,
    @Json(name = "order")
    val order: Order,
    @Json(name = "options")
    val options: Options? = null,
    @Json(name = "card")
    val card: CardData? = null,
    @Json(name = "storedCard")
    val storedCard: StoredCard? = null,
    @Json(name = "validationMode")
    val validationMode: ValidationModeOverride? = null,
    /* Url for the notification of the payment */
    @Json(name = "notificationUrl")
    val notificationUrl: kotlin.String? = null
) {

}

