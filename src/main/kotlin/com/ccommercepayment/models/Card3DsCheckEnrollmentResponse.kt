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

import com.ccommercepayment.models.RedirectionData

import com.squareup.moshi.Json
/**
 * The card payment response
 * @param card3dsPaymentRequestId The paymentRequest identifier (Use to 3DS)
 * @param card3dsRedirectionData 
 * @param cardEnrollmentResponseCode Gets or Sets checkCard3DEnrollmentCode
 * @param responseMessage The global response message
 */
data class Card3DsCheckEnrollmentResponse (
    /* The paymentRequest identifier (Use to 3DS) */
    @Json(name = "card3dsPaymentRequestId")
    val card3dsPaymentRequestId: kotlin.String? = null,
    @Json(name = "card3dsRedirectionData")
    val card3dsRedirectionData: RedirectionData? = null,
    /* Gets or Sets checkCard3DEnrollmentCode */
    @Json(name = "cardEnrollmentResponseCode")
    val cardEnrollmentResponseCode: Card3DsCheckEnrollmentResponse.CardEnrollmentResponseCode? = null,
    /* The global response message */
    @Json(name = "responseMessage")
    val responseMessage: kotlin.String? = null
) {

    /**
    * Gets or Sets checkCard3DEnrollmentCode
    * Values: unknown,enrolled,notEnrolled
    */
    enum class CardEnrollmentResponseCode(val value: kotlin.String){
    
        @Json(name = "unknown")
        unknown("unknown"),
    
        @Json(name = "enrolled")
        enrolled("enrolled"),
    
        @Json(name = "notEnrolled")
        notEnrolled("notEnrolled");
    
    }

}

