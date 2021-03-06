package io.opentracing.play

import com.google.common.collect.Maps
import io.opentracing.propagation.TextMap
import play.api.mvc.Headers
import scala.collection.JavaConversions._

class HeadersTextMap(headers: Headers) extends TextMap {
  def iterator = headers.toMap.iterator.map { case (name, values) => Maps.immutableEntry(name, values.mkString(",")) }

  def put(key: String, value: String) = throw new UnsupportedOperationException
}
