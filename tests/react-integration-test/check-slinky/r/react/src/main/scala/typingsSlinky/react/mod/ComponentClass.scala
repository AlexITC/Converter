package typingsSlinky.react.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import slinky.core.ReactComponentClass
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentClass[P, S]
  extends StaticLifecycle[P, S]
     with Instantiable1[/* props */ P, ReactComponentClass[P]]
     with Instantiable2[/* props */ P, /* context */ js.Any, ReactComponentClass[P]] {
  
  var childContextTypes: scala.Unit | ValidationMap[?] = js.native
  
  var contextType: scala.Unit | Context[?] = js.native
  
  var contextTypes: scala.Unit | ValidationMap[?] = js.native
  
  var defaultProps: scala.Unit | Partial[P] = js.native
  
  var displayName: scala.Unit | String = js.native
  
  var propTypes: scala.Unit | WeakValidationMap[P] = js.native
}
