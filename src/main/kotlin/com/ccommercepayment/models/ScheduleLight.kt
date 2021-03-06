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
 * All schedule data but for a light version (no detail)
 * @param amount Gets or Sets Amount
 * @param date Gets or Sets Date
 * @param rank Gets or Sets Rank
 */
data class ScheduleLight (
    /* Gets or Sets Amount */
    @Json(name = "amount")
    val amount: kotlin.Long? = null,
    /* Gets or Sets Date */
    @Json(name = "date")
    val date: kotlin.String? = null,
    /* Gets or Sets Rank */
    @Json(name = "rank")
    val rank: kotlin.Int? = null
) {

}

