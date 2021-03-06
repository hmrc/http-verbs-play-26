/*
 * Copyright 2018 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.play.http

import play.api.libs.typedmap.TypedMap
import play.api.mvc.request.{RemoteConnection, RequestTarget}
import play.api.mvc.{Headers, RequestHeader}
import play.api.test.FakeHeaders

class DummyRequestHeader extends RequestHeader {

  override def headers: Headers = FakeHeaders(Seq.empty)

  override def version: String = ???

  override def method: String = "GET"

  override def connection: RemoteConnection = ???

  override def target: RequestTarget = ???

  override def attrs: TypedMap = ???
}
