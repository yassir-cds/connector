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

import com.ccommercepayment.models.ShippingAddress
import com.ccommercepayment.models.SubOrder

import com.squareup.moshi.Json
/**
 * 
 * @param orderDiscountAmount Gets or sets the order discount amount.
 * @param orderFeesAmount <para>               Gets or sets the order fees amount.              </para>
 * @param orderRowsAmount Gets or sets the order rows amount.
 * @param orderShippingAmount Gets or sets the order shipping amount.
 * @param taxAmount Gets or sets the tax amount.
 * @param freeText Gets or sets the free text.
 * @param orders Gets or sets the orders.
 * @param orderSummaryRef Gets or sets the order summary reference.
 * @param shippingAddress 
 * @param orderRef The order reference linked to the schedule and transaction
 * @param invoiceId The invoice identifier
 * @param orderTag The order tag is a label for the schedule
 * @param orderDate Date of the order
 * @param amount The amount of the payment
 */
data class OrderData (
    /* The order reference linked to the schedule and transaction */
    @Json(name = "orderRef")
    val orderRef: kotlin.String,
    /* Date of the order */
    @Json(name = "orderDate")
    val orderDate: kotlin.String,
    /* The amount of the payment */
    @Json(name = "amount")
    val amount: kotlin.Long,
    /* Gets or sets the order discount amount. */
    @Json(name = "orderDiscountAmount")
    val orderDiscountAmount: kotlin.Long? = null,
    /* <para>               Gets or sets the order fees amount.              </para> */
    @Json(name = "orderFeesAmount")
    val orderFeesAmount: kotlin.Long? = null,
    /* Gets or sets the order rows amount. */
    @Json(name = "orderRowsAmount")
    val orderRowsAmount: kotlin.Long? = null,
    /* Gets or sets the order shipping amount. */
    @Json(name = "orderShippingAmount")
    val orderShippingAmount: kotlin.Long? = null,
    /* Gets or sets the tax amount. */
    @Json(name = "taxAmount")
    val taxAmount: kotlin.Long? = null,
    /* Gets or sets the free text. */
    @Json(name = "freeText")
    val freeText: kotlin.String? = null,
    /* Gets or sets the orders. */
    @Json(name = "orders")
    val orders: kotlin.Array<SubOrder>? = null,
    /* Gets or sets the order summary reference. */
    @Json(name = "orderSummaryRef")
    val orderSummaryRef: kotlin.String? = null,
    @Json(name = "shippingAddress")
    val shippingAddress: ShippingAddress? = null,
    /* The invoice identifier */
    @Json(name = "invoiceId")
    val invoiceId: kotlin.Long? = null,
    /* The order tag is a label for the schedule */
    @Json(name = "orderTag")
    val orderTag: kotlin.String? = null
) {

}

