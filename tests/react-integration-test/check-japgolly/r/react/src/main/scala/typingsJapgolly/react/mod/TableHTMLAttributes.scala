package typingsJapgolly.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var cellPadding: scala.Unit | Double | String = js.native
  
  var cellSpacing: scala.Unit | Double | String = js.native
  
  var summary: scala.Unit | String = js.native
}
object TableHTMLAttributes {
  
  @scala.inline
  def apply[T](): TableHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TableHTMLAttributesMutableBuilder[Self <: TableHTMLAttributes[?], T] (val x: Self & TableHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", ())
    
    @scala.inline
    def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", ())
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", ())
  }
}
