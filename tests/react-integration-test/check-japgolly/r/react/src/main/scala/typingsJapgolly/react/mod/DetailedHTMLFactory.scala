package typingsJapgolly.react.mod

import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailedHTMLFactory[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */] extends DOMFactory[P, T] {
  
  def apply(props: ClassAttributes[T] & P, children: Node*): DetailedReactHTMLElement[P, T] = js.native
  def apply(props: Null, children: Node*): DetailedReactHTMLElement[P, T] = js.native
  def apply(props: Unit, children: Node*): DetailedReactHTMLElement[P, T] = js.native
}
