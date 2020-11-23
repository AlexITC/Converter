package typingsSlinky.reactBootstrap

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactBootstrap.buttonGroupMod.ButtonGroupProps
import typingsSlinky.reactBootstrap.mod.Omit
import typingsSlinky.reactBootstrap.reactBootstrapStrings.`type`
import typingsSlinky.reactBootstrap.reactBootstrapStrings.checkbox
import typingsSlinky.reactBootstrap.reactBootstrapStrings.defaultValue
import typingsSlinky.reactBootstrap.reactBootstrapStrings.onChange
import typingsSlinky.reactBootstrap.reactBootstrapStrings.radio
import typingsSlinky.reactBootstrap.reactBootstrapStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonGroupMod {
  
  @JSImport("react-bootstrap/lib/ToggleButtonGroup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ToggleButtonGroupProps, js.Object, js.Any]
  
  @js.native
  trait BaseProps extends StObject {
    
    /**
      * You'll usually want to use string|number|string[]|number[] here,
      * but you can technically use any|any[].
      */
    var defaultValue: scala.Unit | js.Any = js.native
    
    /**
      * You'll usually want to use string|number|string[]|number[] here,
      * but you can technically use any|any[].
      */
    var value: scala.Unit | js.Any = js.native
  }
  object BaseProps {
    
    @scala.inline
    def apply(): BaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProps]
    }
    
    @scala.inline
    implicit class BasePropsMutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", ())
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", ())
    }
  }
  
  @js.native
  trait CheckboxProps extends StObject {
    
    var name: scala.Unit | String = js.native
    
    var onChange: scala.Unit | (js.Function1[/* values */ js.Array[?], Unit]) = js.native
    
    var `type`: checkbox = js.native
  }
  object CheckboxProps {
    
    @scala.inline
    def apply(`type`: checkbox): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit class CheckboxPropsMutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", ())
      
      @scala.inline
      def setOnChange(value: /* values */ js.Array[?] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", ())
      
      @scala.inline
      def setType(value: checkbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RadioProps extends StObject {
    
    /** Required if `type` is set to "radio" */
    var name: String = js.native
    
    var onChange: scala.Unit | (js.Function1[/* value */ js.Any, Unit]) = js.native
    
    var `type`: radio = js.native
  }
  object RadioProps {
    
    @scala.inline
    def apply(name: String, `type`: radio): RadioProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioProps]
    }
    
    @scala.inline
    implicit class RadioPropsMutableBuilder[Self <: RadioProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", ())
      
      @scala.inline
      def setType(value: radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToggleButtonGroup
    extends Component[ToggleButtonGroupProps, js.Object, js.Any]
  
  type ToggleButtonGroupProps = BaseProps & (RadioProps | CheckboxProps) & (Omit[ButtonGroupProps, onChange]) & (Omit[HTMLProps[ToggleButtonGroup], defaultValue | `type` | value | onChange])
}
