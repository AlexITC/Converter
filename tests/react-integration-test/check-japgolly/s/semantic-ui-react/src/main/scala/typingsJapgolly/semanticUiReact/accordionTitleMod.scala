package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionTitleMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionTitle", JSImport.Default)
  @js.native
  val default: ComponentClassP[AccordionTitleProps & js.Object] = js.native
  
  @js.native
  trait AccordionTitleProps
    extends StrictAccordionTitleProps
       with /* key */ StringDictionary[js.Any]
  object AccordionTitleProps {
    
    @scala.inline
    def apply(): AccordionTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionTitleProps]
    }
  }
  
  @js.native
  trait StrictAccordionTitleProps extends StObject {
    
    /** Whether or not the title is in the open state. */
    var active: scala.Unit | Boolean = js.native
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** Primary content. */
    var children: scala.Unit | Node = js.native
    
    /** Additional classes. */
    var className: scala.Unit | String = js.native
    
    /** Shorthand for primary content. */
    var content: scala.Unit | SemanticShorthandContent = js.native
    
    /** Shorthand for Icon. */
    var icon: scala.Unit | (SemanticShorthandItem[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ js.Any
      ]) = js.native
    
    /** AccordionTitle index inside Accordion. */
    var index: scala.Unit | Double | String = js.native
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: scala.Unit | (js.Function2[
        /* event */ ReactMouseEventFrom[HTMLDivElement], 
        /* data */ AccordionTitleProps, 
        Unit
      ]) = js.native
  }
  object StrictAccordionTitleProps {
    
    @scala.inline
    def apply(): StrictAccordionTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionTitleProps]
    }
    
    @scala.inline
    implicit class StrictAccordionTitlePropsMutableBuilder[Self <: StrictAccordionTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", ())
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", ())
      
      @scala.inline
      def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", ())
      
      @scala.inline
      def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", ())
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", ())
      
      @scala.inline
      def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(
        value: SemanticShorthandItem[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ js.Any
            ]
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction3(
        value: (/* component */ ReactType[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ js.Any
            ], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ js.Any, /* children */ scala.Unit | Node | ReactNodeArray) => Element | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", ())
      
      @scala.inline
      def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", ())
      
      @scala.inline
      def setOnClick(
        value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ AccordionTitleProps) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* data */ AccordionTitleProps) => (value(t0, t1)).runNow()))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", ())
    }
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionTitle", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[AccordionTitleProps, js.Object, js.Any] {
    def this(props: AccordionTitleProps) = this()
    def this(props: AccordionTitleProps, context: js.Any) = this()
  }
}
