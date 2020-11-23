package typingsSlinky.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var value: scala.Unit | String | js.Array[String] | Double = js.native
}
object LiHTMLAttributes {
  
  @scala.inline
  def apply[T](): LiHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class LiHTMLAttributesMutableBuilder[Self <: LiHTMLAttributes[?], T] (val x: Self & LiHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", ())
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
