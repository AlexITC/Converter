package typingsSlinky.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var async: scala.Unit | Boolean = js.native
  
  var charSet: scala.Unit | String = js.native
  
  var crossOrigin: scala.Unit | String = js.native
  
  var defer: scala.Unit | Boolean = js.native
  
  var integrity: scala.Unit | String = js.native
  
  var noModule: scala.Unit | Boolean = js.native
  
  var nonce: scala.Unit | String = js.native
  
  var src: scala.Unit | String = js.native
  
  var `type`: scala.Unit | String = js.native
}
object ScriptHTMLAttributes {
  
  @scala.inline
  def apply[T](): ScriptHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ScriptHTMLAttributesMutableBuilder[Self <: ScriptHTMLAttributes[?], T] (val x: Self & ScriptHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", ())
    
    @scala.inline
    def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharSetUndefined: Self = StObject.set(x, "charSet", ())
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", ())
    
    @scala.inline
    def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", ())
    
    @scala.inline
    def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrityUndefined: Self = StObject.set(x, "integrity", ())
    
    @scala.inline
    def setNoModule(value: Boolean): Self = StObject.set(x, "noModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoModuleUndefined: Self = StObject.set(x, "noModule", ())
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", ())
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", ())
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", ())
  }
}
