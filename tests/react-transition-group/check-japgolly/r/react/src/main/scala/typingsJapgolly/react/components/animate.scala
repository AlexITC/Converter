package typingsJapgolly.react.components

import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ClassAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animate {
  
  val component: String = "animate"
  
  implicit def make(companion: animate.type): Default[SVGElement & js.Object] = new Default[SVGElement & js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ClassAttributes[SVGElement]): Default[SVGElement & js.Object] = new Default[SVGElement & js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
