package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.accordionPanelMod.AccordionPanelProps
import typingsJapgolly.semanticUiReact.accordionTitleMod.AccordionTitleProps
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionAccordionAccordionMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionAccordion", JSImport.Default)
  @js.native
  val default: ComponentClassP[AccordionAccordionProps & js.Object] = js.native
  
  @js.native
  trait AccordionAccordionProps
    extends StrictAccordionAccordionProps
       with /* key */ StringDictionary[js.Any]
  object AccordionAccordionProps {
    
    @scala.inline
    def apply(): AccordionAccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionAccordionProps]
    }
  }
  
  @js.native
  trait StrictAccordionAccordionProps extends StObject {
    
    /** Index of the currently active panel. */
    var activeIndex: scala.Unit | Double | js.Array[Double] = js.native
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** Primary content. */
    var children: scala.Unit | Node = js.native
    
    /** Additional classes. */
    var className: scala.Unit | String = js.native
    
    /** Initial activeIndex value. */
    var defaultActiveIndex: scala.Unit | Double | js.Array[Double] = js.native
    
    /** Only allow one panel open at a time. */
    var exclusive: scala.Unit | Boolean = js.native
    
    /**
      * Called when a panel title is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {AccordionTitleProps} data - All item props.
      */
    var onTitleClick: scala.Unit | (js.Function2[
        /* event */ ReactMouseEventFrom[HTMLDivElement], 
        /* data */ AccordionTitleProps, 
        Unit
      ]) = js.native
    
    /** Shorthand array of props for Accordion. */
    var panels: scala.Unit | SemanticShorthandCollection[AccordionPanelProps] = js.native
  }
  object StrictAccordionAccordionProps {
    
    @scala.inline
    def apply(): StrictAccordionAccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionAccordionProps]
    }
    
    @scala.inline
    implicit class StrictAccordionAccordionPropsMutableBuilder[Self <: StrictAccordionAccordionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", ())
      
      @scala.inline
      def setActiveIndexVarargs(value: Double*): Self = StObject.set(x, "activeIndex", js.Array(value :_*))
      
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
      def setDefaultActiveIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", ())
      
      @scala.inline
      def setDefaultActiveIndexVarargs(value: Double*): Self = StObject.set(x, "defaultActiveIndex", js.Array(value :_*))
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", ())
      
      @scala.inline
      def setOnTitleClick(
        value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ AccordionTitleProps) => Callback
      ): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* data */ AccordionTitleProps) => (value(t0, t1)).runNow()))
      
      @scala.inline
      def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", ())
      
      @scala.inline
      def setPanels(value: SemanticShorthandCollection[AccordionPanelProps]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelsUndefined: Self = StObject.set(x, "panels", ())
      
      @scala.inline
      def setPanelsVarargs(value: SemanticShorthandItem[AccordionPanelProps]*): Self = StObject.set(x, "panels", js.Array(value :_*))
    }
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionAccordion", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[AccordionAccordionProps, js.Object, js.Any] {
    def this(props: AccordionAccordionProps) = this()
    def this(props: AccordionAccordionProps, context: js.Any) = this()
  }
}
