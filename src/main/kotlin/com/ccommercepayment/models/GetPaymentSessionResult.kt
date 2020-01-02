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
 * All payment operation data for the response
 * @param orderRef The orderRef
 * @param paymentResultCode The response code of the service
 * @param paymentResultCodeMessage The response code message of the service
 * @param paymentResultComplementaryCode The complementary response code of the service
 * @param paymentResultComplementaryCodeMessage The complementary response code message of the service
 * @param storedPaymentMethodId Stored Payment Method Id
 * @param storedPaymentMethodLabel Stored Payment Label
 * @param authenticationStatus The authentication status
 * @param liabilityShiftStatus The liability shift status
 * @param authenticationData All authentication data, as a dictionary of multiple key/value pairs.
 * @param responseMessage The global response message
 */
data class GetPaymentSessionResult (
    /* The orderRef */
    @Json(name = "orderRef")
    val orderRef: kotlin.String? = null,
    /* The response code of the service */
    @Json(name = "paymentResultCode")
    val paymentResultCode: kotlin.Int? = null,
    /* The response code message of the service */
    @Json(name = "paymentResultCodeMessage")
    val paymentResultCodeMessage: GetPaymentSessionResult.PaymentResultCodeMessage? = null,
    /* The complementary response code of the service */
    @Json(name = "paymentResultComplementaryCode")
    val paymentResultComplementaryCode: kotlin.Int? = null,
    /* The complementary response code message of the service */
    @Json(name = "paymentResultComplementaryCodeMessage")
    val paymentResultComplementaryCodeMessage: GetPaymentSessionResult.PaymentResultComplementaryCodeMessage? = null,
    /* Stored Payment Method Id */
    @Json(name = "storedPaymentMethodId")
    val storedPaymentMethodId: kotlin.String? = null,
    /* Stored Payment Label */
    @Json(name = "storedPaymentMethodLabel")
    val storedPaymentMethodLabel: kotlin.String? = null,
    /* The authentication status */
    @Json(name = "authenticationStatus")
    val authenticationStatus: GetPaymentSessionResult.AuthenticationStatus? = null,
    /* The liability shift status */
    @Json(name = "liabilityShiftStatus")
    val liabilityShiftStatus: GetPaymentSessionResult.LiabilityShiftStatus? = null,
    /* All authentication data, as a dictionary of multiple key/value pairs. */
    @Json(name = "authenticationData")
    val authenticationData: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    /* The global response message */
    @Json(name = "responseMessage")
    val responseMessage: kotlin.String? = null
) {

    /**
    * The response code message of the service
    * Values: undefined,succeeded,refused,refusedByBank,failed,pending,unknown,cancelled,notProcessed
    */
    enum class PaymentResultCodeMessage(val value: kotlin.String){
    
        @Json(name = "undefined")
        undefined("undefined"),
    
        @Json(name = "succeeded")
        succeeded("succeeded"),
    
        @Json(name = "refused")
        refused("refused"),
    
        @Json(name = "refusedByBank")
        refusedByBank("refusedByBank"),
    
        @Json(name = "failed")
        failed("failed"),
    
        @Json(name = "pending")
        pending("pending"),
    
        @Json(name = "unknown")
        unknown("unknown"),
    
        @Json(name = "cancelled")
        cancelled("cancelled"),
    
        @Json(name = "notProcessed")
        notProcessed("notProcessed");
    
    }

    /**
    * The complementary response code message of the service
    * Values: unknown,amountLimitExceeded,limitExceeded,technicalProblem,authorized,bankFraudSuspicion,cardExpired,cardIssuerUnavailable,cardholderNotAuthenticated,dateOfValidityExpired,duplicateRequest,formatError,fraudSuspicion,illegalTransaction,invalidAcceptor,invalidAccount,invalidCardIssuer,invalidTransaction,lostCard,referenceNumberCannotBeFound,referred,refused,requestedFunctionNotSupported,securityBreach,securityRulesViolated,serverUnavailableNetworkRoutingAskedAgain,stolenCard,systemUnavailable,temporaryBankServerUnavailability,temporaryOfficeServerUnavailability,transactionNotPermitted,transactionTimedOut,unknownAcquirerAccountCode,unknownCard,updateOfFileImpossible,transactionArchived,refusedByScoring,paymentInformationFillingAttemptLimitExceeded,refusedByScoring2,notAvailable
    */
    enum class PaymentResultComplementaryCodeMessage(val value: kotlin.String){
    
        @Json(name = "unknown")
        unknown("unknown"),
    
        @Json(name = "amountLimitExceeded")
        amountLimitExceeded("amountLimitExceeded"),
    
        @Json(name = "limitExceeded")
        limitExceeded("limitExceeded"),
    
        @Json(name = "technicalProblem")
        technicalProblem("technicalProblem"),
    
        @Json(name = "authorized")
        authorized("authorized"),
    
        @Json(name = "bankFraudSuspicion")
        bankFraudSuspicion("bankFraudSuspicion"),
    
        @Json(name = "cardExpired")
        cardExpired("cardExpired"),
    
        @Json(name = "cardIssuerUnavailable")
        cardIssuerUnavailable("cardIssuerUnavailable"),
    
        @Json(name = "cardholderNotAuthenticated")
        cardholderNotAuthenticated("cardholderNotAuthenticated"),
    
        @Json(name = "dateOfValidityExpired")
        dateOfValidityExpired("dateOfValidityExpired"),
    
        @Json(name = "duplicateRequest")
        duplicateRequest("duplicateRequest"),
    
        @Json(name = "formatError")
        formatError("formatError"),
    
        @Json(name = "fraudSuspicion")
        fraudSuspicion("fraudSuspicion"),
    
        @Json(name = "illegalTransaction")
        illegalTransaction("illegalTransaction"),
    
        @Json(name = "invalidAcceptor")
        invalidAcceptor("invalidAcceptor"),
    
        @Json(name = "invalidAccount")
        invalidAccount("invalidAccount"),
    
        @Json(name = "invalidCardIssuer")
        invalidCardIssuer("invalidCardIssuer"),
    
        @Json(name = "invalidTransaction")
        invalidTransaction("invalidTransaction"),
    
        @Json(name = "lostCard")
        lostCard("lostCard"),
    
        @Json(name = "referenceNumberCannotBeFound")
        referenceNumberCannotBeFound("referenceNumberCannotBeFound"),
    
        @Json(name = "referred")
        referred("referred"),
    
        @Json(name = "refused")
        refused("refused"),
    
        @Json(name = "requestedFunctionNotSupported")
        requestedFunctionNotSupported("requestedFunctionNotSupported"),
    
        @Json(name = "securityBreach")
        securityBreach("securityBreach"),
    
        @Json(name = "securityRulesViolated")
        securityRulesViolated("securityRulesViolated"),
    
        @Json(name = "serverUnavailableNetworkRoutingAskedAgain")
        serverUnavailableNetworkRoutingAskedAgain("serverUnavailableNetworkRoutingAskedAgain"),
    
        @Json(name = "stolenCard")
        stolenCard("stolenCard"),
    
        @Json(name = "systemUnavailable")
        systemUnavailable("systemUnavailable"),
    
        @Json(name = "temporaryBankServerUnavailability")
        temporaryBankServerUnavailability("temporaryBankServerUnavailability"),
    
        @Json(name = "temporaryOfficeServerUnavailability")
        temporaryOfficeServerUnavailability("temporaryOfficeServerUnavailability"),
    
        @Json(name = "transactionNotPermitted")
        transactionNotPermitted("transactionNotPermitted"),
    
        @Json(name = "transactionTimedOut")
        transactionTimedOut("transactionTimedOut"),
    
        @Json(name = "unknownAcquirerAccountCode")
        unknownAcquirerAccountCode("unknownAcquirerAccountCode"),
    
        @Json(name = "unknownCard")
        unknownCard("unknownCard"),
    
        @Json(name = "updateOfFileImpossible")
        updateOfFileImpossible("updateOfFileImpossible"),
    
        @Json(name = "transactionArchived")
        transactionArchived("transactionArchived"),
    
        @Json(name = "refusedByScoring")
        refusedByScoring("refusedByScoring"),
    
        @Json(name = "paymentInformationFillingAttemptLimitExceeded")
        paymentInformationFillingAttemptLimitExceeded("paymentInformationFillingAttemptLimitExceeded"),
    
        @Json(name = "refusedByScoring2")
        refusedByScoring2("refusedByScoring2"),
    
        @Json(name = "notAvailable")
        notAvailable("notAvailable");
    
    }

    /**
    * The authentication status
    * Values: undefined,authenticated,notAuthenticated
    */
    enum class AuthenticationStatus(val value: kotlin.String){
    
        @Json(name = "undefined")
        undefined("undefined"),
    
        @Json(name = "authenticated")
        authenticated("authenticated"),
    
        @Json(name = "notAuthenticated")
        notAuthenticated("notAuthenticated");
    
    }

    /**
    * The liability shift status
    * Values: undefined,shift,noShift
    */
    enum class LiabilityShiftStatus(val value: kotlin.String){
    
        @Json(name = "undefined")
        undefined("undefined"),
    
        @Json(name = "shift")
        shift("shift"),
    
        @Json(name = "noShift")
        noShift("noShift");
    
    }

}

