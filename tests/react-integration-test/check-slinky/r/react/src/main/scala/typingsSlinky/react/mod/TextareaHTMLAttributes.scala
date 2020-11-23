package typingsSlinky.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextareaHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var autoComplete: scala.Unit | String = js.native
  
  var autoFocus: scala.Unit | Boolean = js.native
  
  var cols: scala.Unit | Double = js.native
  
  var dirName: scala.Unit | String = js.native
  
  var disabled: scala.Unit | Boolean = js.native
  
  var form: scala.Unit | String = js.native
  
  var maxLength: scala.Unit | Double = js.native
  
  var minLength: scala.Unit | Double = js.native
  
  var name: scala.Unit | String = js.native
  
  @JSName("onChange")
  var onChange_TextareaHTMLAttributes: scala.Unit | ChangeEventHandler[T] = js.native
  
  var readOnly: scala.Unit | Boolean = js.native
  
  var required: scala.Unit | Boolean = js.native
  
  var rows: scala.Unit | Double = js.native
  
  var value: scala.Unit | String | js.Array[String] | Double = js.native
  
  var wrap: scala.Unit | String = js.native
}
object TextareaHTMLAttributes {
  
  @scala.inline
  def apply[T](): TextareaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TextareaHTMLAttributesMutableBuilder[Self <: TextareaHTMLAttributes[?], T] (val x: Self & TextareaHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", ())
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", ())
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", ())
    
    @scala.inline
    def setDirName(value: String): Self = StObject.set(x, "dirName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirNameUndefined: Self = StObject.set(x, "dirName", ())
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", ())
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", ())
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", ())
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", ())
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", ())
    
    @scala.inline
    def setOnChange(value: ChangeEvent[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", ())
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", ())
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", ())
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", ())
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", ())
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    
    @scala.inline
    def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", ())
  }
}
