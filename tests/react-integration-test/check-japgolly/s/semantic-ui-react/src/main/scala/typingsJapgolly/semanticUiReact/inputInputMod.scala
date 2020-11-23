package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.semanticUiReact.genericMod.HtmlInputrops
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`left corner`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`right corner`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInputMod {
  
  @js.native
  trait Input
    extends Component[InputProps, js.Object, js.Any] {
    
    def focus(): Unit = js.native
    
    def select(): Unit = js.native
  }
  
  @js.native
  trait InputOnChangeData extends StrictInputProps {
    
    @JSName("value")
    var value_InputOnChangeData: String = js.native
  }
  object InputOnChangeData {
    
    @scala.inline
    def apply(value: String): InputOnChangeData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputOnChangeData]
    }
    
    @scala.inline
    implicit class InputOnChangeDataMutableBuilder[Self <: InputOnChangeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrictInputProps extends InputHTMLAttributes[HTMLInputElement] {
    
    /** An Input can be formatted to alert the user to an action they may perform. */
    var action: scala.Unit | js.Any | Boolean = js.native
    
    /** An action can appear along side an Input on the left or right. */
    var actionPosition: scala.Unit | left = js.native
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** An Input field can show the data contains errors. */
    var error: scala.Unit | Boolean = js.native
    
    /** Take on the size of its container. */
    var fluid: scala.Unit | Boolean = js.native
    
    /** An Input field can show a user is currently interacting with it. */
    var focus: scala.Unit | Boolean = js.native
    
    /** Optional Icon to display inside the Input. */
    var icon: scala.Unit | js.Any | SemanticShorthandItem[InputProps] = js.native
    
    /** An Icon can appear inside an Input on the left. */
    var iconPosition: scala.Unit | left = js.native
    
    /** Shorthand for creating the HTML Input. */
    var input: scala.Unit | SemanticShorthandItem[HtmlInputrops] = js.native
    
    /** Format to appear on dark backgrounds. */
    var inverted: scala.Unit | Boolean = js.native
    
    /** Optional Label to display along side the Input. */
    var label: scala.Unit | (SemanticShorthandItem[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any
      ]) = js.native
    
    /** A Label can appear outside an Input on the left or right. */
    var labelPosition: scala.Unit | left | right | (`left corner`) | (`right corner`) = js.native
    
    /** An Icon Input field can show that it is currently loading data. */
    var loading: scala.Unit | Boolean = js.native
    
    /**
      * Called on change.
      *
      * @param {ChangeEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and a proposed value.
      */
    @JSName("onChange")
    var onChange_StrictInputProps: scala.Unit | (js.Function2[/* event */ ReactEventFrom[HTMLInputElement], /* data */ InputOnChangeData, Unit]) = js.native
    
    /** An Input can vary in size. */
    @JSName("size")
    var size_StrictInputProps: scala.Unit | mini | small | large | big | huge | massive = js.native
    
    /** An Input can receive focus. */
    @JSName("tabIndex")
    var tabIndex_StrictInputProps: scala.Unit | Double | String = js.native
    
    /** Transparent Input has no background. */
    var transparent: scala.Unit | Boolean = js.native
  }
  object StrictInputProps {
    
    @scala.inline
    def apply(): StrictInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictInputProps]
    }
    
    @scala.inline
    implicit class StrictInputPropsMutableBuilder[Self <: StrictInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: js.Any | Boolean): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionPosition(value: left): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", ())
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", ())
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", ())
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", ())
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", ())
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", ())
      
      @scala.inline
      def setIcon(value: js.Any | SemanticShorthandItem[InputProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction3(
        value: (/* component */ ReactType[InputProps], InputProps, /* children */ scala.Unit | Node | ReactNodeArray) => Element | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIconPosition(value: left): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", ())
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", ())
      
      @scala.inline
      def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: SemanticShorthandItem[HtmlInputrops]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFunction3(
        value: (/* component */ ReactType[HtmlInputrops], HtmlInputrops, /* children */ scala.Unit | Node | ReactNodeArray) => Element | Null
      ): Self = StObject.set(x, "input", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", ())
      
      @scala.inline
      def setInputVdomElement(value: VdomElement): Self = StObject.set(x, "input", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", ())
      
      @scala.inline
      def setLabel(
        value: SemanticShorthandItem[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any
            ]
      ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction3(
        value: (/* component */ ReactType[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any
            ], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any, /* children */ scala.Unit | Node | ReactNodeArray) => Element | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLabelPosition(value: left | right | (`left corner`) | (`right corner`)): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", ())
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", ())
      
      @scala.inline
      def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", ())
      
      @scala.inline
      def setOnChange(value: (/* event */ ReactEventFrom[HTMLInputElement], /* data */ InputOnChangeData) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* data */ InputOnChangeData) => (value(t0, t1)).runNow()))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", ())
      
      @scala.inline
      def setSize(value: mini | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", ())
      
      @scala.inline
      def setTabIndex(value: Double | String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", ())
      
      @scala.inline
      def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparentUndefined: Self = StObject.set(x, "transparent", ())
    }
  }
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Input/Input", JSImport.Default)
  @js.native
  class default () extends Input
  
  type InputProps = StrictInputProps
}