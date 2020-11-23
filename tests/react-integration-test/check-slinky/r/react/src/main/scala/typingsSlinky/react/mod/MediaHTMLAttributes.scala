package typingsSlinky.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var autoPlay: scala.Unit | Boolean = js.native
  
  var controls: scala.Unit | Boolean = js.native
  
  var controlsList: scala.Unit | String = js.native
  
  var crossOrigin: scala.Unit | String = js.native
  
  var loop: scala.Unit | Boolean = js.native
  
  var mediaGroup: scala.Unit | String = js.native
  
  var muted: scala.Unit | Boolean = js.native
  
  var playsinline: scala.Unit | Boolean = js.native
  
  var preload: scala.Unit | String = js.native
  
  var src: scala.Unit | String = js.native
}
object MediaHTMLAttributes {
  
  @scala.inline
  def apply[T](): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MediaHTMLAttributesMutableBuilder[Self <: MediaHTMLAttributes[?], T] (val x: Self & MediaHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", ())
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsList(value: String): Self = StObject.set(x, "controlsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsListUndefined: Self = StObject.set(x, "controlsList", ())
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", ())
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", ())
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", ())
    
    @scala.inline
    def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", ())
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", ())
    
    @scala.inline
    def setPlaysinline(value: Boolean): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", ())
    
    @scala.inline
    def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", ())
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", ())
  }
}
