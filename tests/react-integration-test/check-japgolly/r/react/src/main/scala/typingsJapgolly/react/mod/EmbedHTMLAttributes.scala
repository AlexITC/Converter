package typingsJapgolly.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbedHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var height: scala.Unit | Double | String = js.native
  
  var src: scala.Unit | String = js.native
  
  var `type`: scala.Unit | String = js.native
  
  var width: scala.Unit | Double | String = js.native
}
object EmbedHTMLAttributes {
  
  @scala.inline
  def apply[T](): EmbedHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbedHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class EmbedHTMLAttributesMutableBuilder[Self <: EmbedHTMLAttributes[?], T] (val x: Self & EmbedHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", ())
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", ())
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", ())
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", ())
  }
}
