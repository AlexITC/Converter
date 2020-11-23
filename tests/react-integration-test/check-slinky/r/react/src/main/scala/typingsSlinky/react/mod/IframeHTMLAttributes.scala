package typingsSlinky.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IframeHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var allow: scala.Unit | String = js.native
  
  var allowFullScreen: scala.Unit | Boolean = js.native
  
  var allowTransparency: scala.Unit | Boolean = js.native
  
  var frameBorder: scala.Unit | Double | String = js.native
  
  var height: scala.Unit | Double | String = js.native
  
  var marginHeight: scala.Unit | Double = js.native
  
  var marginWidth: scala.Unit | Double = js.native
  
  var name: scala.Unit | String = js.native
  
  var referrerPolicy: scala.Unit | String = js.native
  
  var sandbox: scala.Unit | String = js.native
  
  var scrolling: scala.Unit | String = js.native
  
  var seamless: scala.Unit | Boolean = js.native
  
  var src: scala.Unit | String = js.native
  
  var srcDoc: scala.Unit | String = js.native
  
  var width: scala.Unit | Double | String = js.native
}
object IframeHTMLAttributes {
  
  @scala.inline
  def apply[T](): IframeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IframeHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class IframeHTMLAttributesMutableBuilder[Self <: IframeHTMLAttributes[?], T] (val x: Self & IframeHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", ())
    
    @scala.inline
    def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", ())
    
    @scala.inline
    def setAllowUndefined: Self = StObject.set(x, "allow", ())
    
    @scala.inline
    def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", ())
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", ())
    
    @scala.inline
    def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", ())
    
    @scala.inline
    def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", ())
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", ())
    
    @scala.inline
    def setReferrerPolicy(value: String): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", ())
    
    @scala.inline
    def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUndefined: Self = StObject.set(x, "sandbox", ())
    
    @scala.inline
    def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollingUndefined: Self = StObject.set(x, "scrolling", ())
    
    @scala.inline
    def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeamlessUndefined: Self = StObject.set(x, "seamless", ())
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", ())
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", ())
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", ())
  }
}
