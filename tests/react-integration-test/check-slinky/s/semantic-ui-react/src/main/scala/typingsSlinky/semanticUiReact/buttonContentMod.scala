package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonContentMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button/ButtonContent", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ButtonContentProps] = js.native
  
  @js.native
  trait ButtonContentProps
    extends StrictButtonContentProps
       with /* key */ StringDictionary[js.Any]
  object ButtonContentProps {
    
    @scala.inline
    def apply(): ButtonContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonContentProps]
    }
  }
  
  @js.native
  trait StrictButtonContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** Primary content. */
    var children: scala.Unit | ReactElement = js.native
    
    /** Additional classes. */
    var className: scala.Unit | String = js.native
    
    /** Shorthand for primary content. */
    var content: scala.Unit | SemanticShorthandContent = js.native
    
    /** Initially hidden, visible on hover. */
    var hidden: scala.Unit | Boolean = js.native
    
    /** Initially visible, hidden on hover. */
    var visible: scala.Unit | Boolean = js.native
  }
  object StrictButtonContentProps {
    
    @scala.inline
    def apply(): StrictButtonContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictButtonContentProps]
    }
    
    @scala.inline
    implicit class StrictButtonContentPropsMutableBuilder[Self <: StrictButtonContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", ())
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", ())
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", ())
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", ())
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", ())
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", ())
    }
  }
}
