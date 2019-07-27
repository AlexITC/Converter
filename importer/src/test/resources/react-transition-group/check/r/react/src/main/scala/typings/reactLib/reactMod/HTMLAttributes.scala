package typings
package reactLib.reactMod

import reactLib.Anon_Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLAttributes[T] extends DOMAttributes[T] {
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
}

object HTMLAttributes {
  @scala.inline
  def apply[T](
    children: ReactNode = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined
  ): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
}

