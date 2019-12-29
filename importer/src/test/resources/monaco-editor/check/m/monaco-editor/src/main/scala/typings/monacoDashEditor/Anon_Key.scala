package typings.monacoDashEditor

import typings.monacoDashEditor.monaco.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Key[T] extends js.Object {
  var key: String = js.native
  var value: Promise[T, _] = js.native
}

object Anon_Key {
  @scala.inline
  def apply[T](key: String, value: Promise[T, _]): Anon_Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key[T]]
  }
}
