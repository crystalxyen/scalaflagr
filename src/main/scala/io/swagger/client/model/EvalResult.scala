/**
 * Flagr
 * Flagr is a feature flagging, A/B testing and dynamic configuration microservice. The base path for all the APIs is \"/api/v1\". 
 *
 * OpenAPI spec version: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class EvalResult (
  flagID: Option[Long] = None,
  flagKey: Option[String] = None,
  flagSnapshotID: Option[Long] = None,
  segmentID: Option[Long] = None,
  variantID: Option[Long] = None,
  variantKey: Option[String] = None,
  variantAttachment: Option[Any] = None,
  evalContext: Option[EvalContext] = None,
  timestamp: Option[String] = None,
  evalDebugLog: Option[EvalDebugLog] = None
)
