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
 * All redirection data (3DS only)
 * @param redirectionUrl The redirection url (ex 3DS acs server)
 * @param params All params for the redirection
 * @param redirectionType The redirection type (GET, POST)
 */
data class RedirectionData (
    /* The redirection url (ex 3DS acs server) */
    @Json(name = "redirectionUrl")
    val redirectionUrl: kotlin.String? = null,
    /* All params for the redirection */
    @Json(name = "params")
    val params: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    /* The redirection type (GET, POST) */
    @Json(name = "redirectionType")
    val redirectionType: RedirectionData.RedirectionType? = null
) {

    /**
    * The redirection type (GET, POST)
    * Values: unknown,get,post
    */
    enum class RedirectionType(val value: kotlin.String){
    
        @Json(name = "unknown")
        unknown("unknown"),
    
        @Json(name = "get")
        get("get"),
    
        @Json(name = "post")
        post("post");
    
    }

}

