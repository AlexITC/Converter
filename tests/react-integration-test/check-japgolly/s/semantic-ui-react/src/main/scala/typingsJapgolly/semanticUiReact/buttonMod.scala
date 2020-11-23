package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.buttonContentMod.ButtonContentProps
import typingsJapgolly.semanticUiReact.buttonGroupMod.ButtonGroupProps
import typingsJapgolly.semanticUiReact.buttonOrMod.ButtonOrProps
import typingsJapgolly.semanticUiReact.genericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.genericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.genericMod.SemanticSIZES
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`google plus`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.facebook
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.fade
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.instagram
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.linkedin
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.twitter
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.vertical
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.vk
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.youtube
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @js.native
  trait Button
    extends Component[ButtonProps, js.Object, js.Any] {
    
    def focus(): Unit = js.native
  }
  
  @js.native
  trait StrictButtonProps extends ButtonHTMLAttributes[HTMLButtonElement] {
    
    /** A button can show it is currently the active user selection. */
    var active: scala.Unit | Boolean = js.native
    
    /** A button can animate to show hidden content. */
    var animated: scala.Unit | Boolean | fade | vertical = js.native
    
    /** An element type to render as (string or function). */
    var as: scala.Unit | js.Any = js.native
    
    /** A button can be attached to other content. */
    var attached: scala.Unit | Boolean | left | right | top | bottom = js.native
    
    /** A basic button is less pronounced. */
    var basic: scala.Unit | Boolean = js.native
    
    /** A button can be circular. */
    var circular: scala.Unit | Boolean = js.native
    
    /** A button can have different colors. */
    @JSName("color")
    var color_StrictButtonProps: scala.Unit | SemanticCOLORS | facebook | (`google plus`) | vk | twitter | linkedin | instagram | youtube = js.native
    
    /** A button can reduce its padding to fit into tighter spaces. */
    var compact: scala.Unit | Boolean = js.native
    
    /** Shorthand for primary content. */
    var content: scala.Unit | SemanticShorthandContent = js.native
    
    /** A button can be aligned to the left or right of its container. */
    var floated: scala.Unit | SemanticFLOATS = js.native
    
    /** A button can take the width of its container. */
    var fluid: scala.Unit | Boolean = js.native
    
    /** Add an Icon by name, props object, or pass an <Icon />. */
    var icon: scala.Unit | Boolean | (SemanticShorthandItem[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ js.Any
      ]) = js.native
    
    /** A button can be formatted to appear on dark backgrounds. */
    var inverted: scala.Unit | Boolean = js.native
    
    /** Add a Label by text, props object, or pass a <Label />. */
    var label: scala.Unit | (SemanticShorthandItem[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelProps */ js.Any
      ]) = js.native
    
    /** A labeled button can format a Label or Icon to appear on the left or right. */
    var labelPosition: scala.Unit | right | left = js.native
    
    /** A button can show a loading indicator. */
    var loading: scala.Unit | Boolean = js.native
    
    /** A button can hint towards a negative consequence. */
    var negative: scala.Unit | Boolean = js.native
    
    /**
      * Called after user's click.
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    @JSName("onClick")
    var onClick_StrictButtonProps: scala.Unit | (js.Function2[/* event */ ReactMouseEventFrom[HTMLButtonElement], /* data */ ButtonProps, Unit]) = js.native
    
    /** A button can hint towards a positive consequence. */
    var positive: scala.Unit | Boolean = js.native
    
    /** A button can be formatted to show different levels of emphasis. */
    var primary: scala.Unit | Boolean = js.native
    
    /** A button can be formatted to show different levels of emphasis. */
    var secondary: scala.Unit | Boolean = js.native
    
    /** A button can have different sizes. */
    var size: scala.Unit | SemanticSIZES = js.native
    
    /** A button can receive focus. */
    @JSName("tabIndex")
    var tabIndex_StrictButtonProps: scala.Unit | Double | String = js.native
    
    /** A button can be formatted to toggle on and off. */
    var toggle: scala.Unit | Boolean = js.native
  }
  object StrictButtonProps {
    
    @scala.inline
    def apply(): StrictButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictButtonProps]
    }
    
    @scala.inline
    implicit class StrictButtonPropsMutableBuilder[Self <: StrictButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", ())
      
      @scala.inline
      def setAnimated(value: Boolean | fade | vertical): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", ())
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", ())
      
      @scala.inline
      def setAttached(value: Boolean | left | right | top | bottom): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", ())
      
      @scala.inline
      def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", ())
      
      @scala.inline
      def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", ())
      
      @scala.inline
      def setColor(value: SemanticCOLORS | facebook | (`google plus`) | vk | twitter | linkedin | instagram | youtube): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", ())
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", ())
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", ())
      
      @scala.inline
      def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatedUndefined: Self = StObject.set(x, "floated", ())
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", ())
      
      @scala.inline
      def setIcon(
        value: Boolean | (SemanticShorthandItem[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconProps */ js.Any
            ])
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
      def setLabelPosition(value: right | left): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
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
      def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeUndefined: Self = StObject.set(x, "negative", ())
      
      @scala.inline
      def setOnClick(value: (/* event */ ReactMouseEventFrom[HTMLButtonElement], /* data */ ButtonProps) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement], t1: /* data */ ButtonProps) => (value(t0, t1)).runNow()))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", ())
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", ())
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", ())
      
      @scala.inline
      def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryUndefined: Self = StObject.set(x, "secondary", ())
      
      @scala.inline
      def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", ())
      
      @scala.inline
      def setTabIndex(value: Double | String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", ())
      
      @scala.inline
      def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", ())
    }
  }
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button/Button", JSImport.Default)
  @js.native
  class default () extends Button
  /* static members */
  object default {
    
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button/Button", "default.Content")
    @js.native
    def Content: StatelessComponent[ButtonContentProps] = js.native
    @scala.inline
    def Content_=(x: StatelessComponent[ButtonContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button/Button", "default.Group")
    @js.native
    def Group: StatelessComponent[ButtonGroupProps] = js.native
    @scala.inline
    def Group_=(x: StatelessComponent[ButtonGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button/Button", "default.Or")
    @js.native
    def Or: StatelessComponent[ButtonOrProps] = js.native
    @scala.inline
    def Or_=(x: StatelessComponent[ButtonOrProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Or")(x.asInstanceOf[js.Any])
  }
  
  type ButtonProps = StrictButtonProps
}
