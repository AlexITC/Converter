package typingsSlinky.react.mod

import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefForwardingComponent[T, P] extends StObject {
  
  def apply(props: PropsWithChildren[P], ref: Ref[T]): slinky.core.facade.ReactElement | Null = js.native
  
  var contextTypes: scala.Unit | ValidationMap[?] = js.native
  
  var defaultProps: scala.Unit | Partial[P] = js.native
  
  var displayName: scala.Unit | String = js.native
  
  var propTypes: scala.Unit | WeakValidationMap[P] = js.native
}
