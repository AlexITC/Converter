package typingsSlinky.reactDropzone

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dropzone", JSImport.Default)
  @js.native
  def default(props: DropzoneProps & RefAttributes[DropzoneRef]): ReactElement = js.native
  
  @JSImport("react-dropzone", "useDropzone")
  @js.native
  def useDropzone(): DropzoneState = js.native
  @JSImport("react-dropzone", "useDropzone")
  @js.native
  def useDropzone(options: DropzoneOptions): DropzoneState = js.native
  
  @js.native
  trait DropzoneInputProps extends InputHTMLAttributes[HTMLInputElement] {
    
    var refKey: scala.Unit | String = js.native
  }
  object DropzoneInputProps {
    
    @scala.inline
    def apply(): DropzoneInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneInputProps]
    }
    
    @scala.inline
    implicit class DropzoneInputPropsMutableBuilder[Self <: DropzoneInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefKeyUndefined: Self = StObject.set(x, "refKey", ())
    }
  }
  
  /* Inlined std.Pick<react.react.HTMLProps<std.HTMLElement>, react-dropzone.react-dropzone.PropTypes> & {  accept :string | std.Array<string> | undefined,   minSize :number | undefined,   maxSize :number | undefined,   preventDropOnDocument :boolean | undefined,   noClick :boolean | undefined,   noKeyboard :boolean | undefined,   noDrag :boolean | undefined,   noDragEventsBubbling :boolean | undefined,   disabled :boolean | undefined,   onDrop :<T extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File * / any>(acceptedFiles : std.Array<T>, rejectedFiles : std.Array<T>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   onDropAccepted :<T extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File * / any>(files : std.Array<T>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   onDropRejected :<T extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File * / any>(files : std.Array<T>, event : react-dropzone.react-dropzone.DropEvent): void | undefined,   getFilesFromEvent :(event : react-dropzone.react-dropzone.DropEvent): / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Promise<Array<File | DataTransferItem>> * / any | undefined,   onFileDialogCancel :(): void | undefined} */
  @js.native
  trait DropzoneOptions extends StObject {
    
    var accept: scala.Unit | String | js.Array[String] = js.native
    
    var disabled: scala.Unit | Boolean = js.native
    
    var getFilesFromEvent: scala.Unit | (js.Function1[
        /* event */ DropEvent, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Promise<Array<File | DataTransferItem>> */ ?
      ]) = js.native
    
    var maxSize: scala.Unit | Double = js.native
    
    var minSize: scala.Unit | Double = js.native
    
    var multiple: scala.Unit | Boolean = js.native
    
    var noClick: scala.Unit | Boolean = js.native
    
    var noDrag: scala.Unit | Boolean = js.native
    
    var noDragEventsBubbling: scala.Unit | Boolean = js.native
    
    var noKeyboard: scala.Unit | Boolean = js.native
    
    var onDragEnter: scala.Unit | DragEventHandler[HTMLElement] = js.native
    
    var onDragLeave: scala.Unit | DragEventHandler[HTMLElement] = js.native
    
    var onDragOver: scala.Unit | DragEventHandler[HTMLElement] = js.native
    
    var onDrop: scala.Unit | (js.Function3[
        /* acceptedFiles */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ ?
        ], 
        /* rejectedFiles */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ ?
        ], 
        /* event */ DropEvent, 
        Unit
      ]) = js.native
    
    var onDropAccepted: scala.Unit | (js.Function2[
        /* files */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ ?
        ], 
        /* event */ DropEvent, 
        Unit
      ]) = js.native
    
    var onDropRejected: scala.Unit | (js.Function2[
        /* files */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ ?
        ], 
        /* event */ DropEvent, 
        Unit
      ]) = js.native
    
    var onFileDialogCancel: scala.Unit | js.Function0[Unit] = js.native
    
    var preventDropOnDocument: scala.Unit | Boolean = js.native
  }
  object DropzoneOptions {
    
    @scala.inline
    def apply(): DropzoneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneOptions]
    }
    
    @scala.inline
    implicit class DropzoneOptionsMutableBuilder[Self <: DropzoneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String | js.Array[String]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", ())
      
      @scala.inline
      def setAcceptVarargs(value: String*): Self = StObject.set(x, "accept", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", ())
      
      @scala.inline
      def setGetFilesFromEvent(
        value: /* event */ DropEvent => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Promise<Array<File | DataTransferItem>> */ ?
      ): Self = StObject.set(x, "getFilesFromEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFilesFromEventUndefined: Self = StObject.set(x, "getFilesFromEvent", ())
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", ())
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", ())
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", ())
      
      @scala.inline
      def setNoClick(value: Boolean): Self = StObject.set(x, "noClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoClickUndefined: Self = StObject.set(x, "noClick", ())
      
      @scala.inline
      def setNoDrag(value: Boolean): Self = StObject.set(x, "noDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDragEventsBubbling(value: Boolean): Self = StObject.set(x, "noDragEventsBubbling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDragEventsBubblingUndefined: Self = StObject.set(x, "noDragEventsBubbling", ())
      
      @scala.inline
      def setNoDragUndefined: Self = StObject.set(x, "noDrag", ())
      
      @scala.inline
      def setNoKeyboard(value: Boolean): Self = StObject.set(x, "noKeyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoKeyboardUndefined: Self = StObject.set(x, "noKeyboard", ())
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", ())
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", ())
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", ())
      
      @scala.inline
      def setOnDrop(
        value: (/* acceptedFiles */ js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ ?
            ], /* rejectedFiles */ js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ ?
            ], /* event */ DropEvent) => Unit
      ): Self = StObject.set(x, "onDrop", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDropAccepted(
        value: (/* files */ js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ ?
            ], /* event */ DropEvent) => Unit
      ): Self = StObject.set(x, "onDropAccepted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDropAcceptedUndefined: Self = StObject.set(x, "onDropAccepted", ())
      
      @scala.inline
      def setOnDropRejected(
        value: (/* files */ js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ ?
            ], /* event */ DropEvent) => Unit
      ): Self = StObject.set(x, "onDropRejected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDropRejectedUndefined: Self = StObject.set(x, "onDropRejected", ())
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", ())
      
      @scala.inline
      def setOnFileDialogCancel(value: () => Unit): Self = StObject.set(x, "onFileDialogCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFileDialogCancelUndefined: Self = StObject.set(x, "onFileDialogCancel", ())
      
      @scala.inline
      def setPreventDropOnDocument(value: Boolean): Self = StObject.set(x, "preventDropOnDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDropOnDocumentUndefined: Self = StObject.set(x, "preventDropOnDocument", ())
    }
  }
  
  @js.native
  trait DropzoneProps extends DropzoneOptions {
    
    var children: scala.Unit | (js.Function1[/* state */ DropzoneState, ReactElement]) = js.native
  }
  object DropzoneProps {
    
    @scala.inline
    def apply(): DropzoneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneProps]
    }
    
    @scala.inline
    implicit class DropzonePropsMutableBuilder[Self <: DropzoneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* state */ DropzoneState => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", ())
    }
  }
  
  @js.native
  trait DropzoneRef extends StObject {
    
    def open(): Unit = js.native
  }
  object DropzoneRef {
    
    @scala.inline
    def apply(open: () => Unit): DropzoneRef = {
      val __obj = js.Dynamic.literal(open = js.Any.fromFunction0(open))
      __obj.asInstanceOf[DropzoneRef]
    }
    
    @scala.inline
    implicit class DropzoneRefMutableBuilder[Self <: DropzoneRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DropzoneRootProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var refKey: scala.Unit | String = js.native
  }
  object DropzoneRootProps {
    
    @scala.inline
    def apply(): DropzoneRootProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropzoneRootProps]
    }
    
    @scala.inline
    implicit class DropzoneRootPropsMutableBuilder[Self <: DropzoneRootProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefKeyUndefined: Self = StObject.set(x, "refKey", ())
    }
  }
  
  /* Inlined react-dropzone.react-dropzone.DropzoneRef & {  isFocused :boolean,   isDragActive :boolean,   isDragAccept :boolean,   isDragReject :boolean,   isFileDialogActive :boolean,   draggedFiles :std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File * / any>,   acceptedFiles :std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File * / any>,   rejectedFiles :std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File * / any>,   rootRef :react.react.RefObject<std.HTMLElement>,   inputRef :react.react.RefObject<std.HTMLInputElement>, getRootProps (props : react-dropzone.react-dropzone.DropzoneRootProps | undefined): react-dropzone.react-dropzone.DropzoneRootProps, getInputProps (props : react-dropzone.react-dropzone.DropzoneInputProps | undefined): react-dropzone.react-dropzone.DropzoneInputProps} */
  @js.native
  trait DropzoneState extends StObject {
    
    var acceptedFiles: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ ?
      ] = js.native
    
    var draggedFiles: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ ?
      ] = js.native
    
    def getInputProps(): DropzoneInputProps = js.native
    def getInputProps(props: DropzoneInputProps): DropzoneInputProps = js.native
    
    def getRootProps(): DropzoneRootProps = js.native
    def getRootProps(props: DropzoneRootProps): DropzoneRootProps = js.native
    
    var inputRef: ReactRef[HTMLInputElement] = js.native
    
    var isDragAccept: Boolean = js.native
    
    var isDragActive: Boolean = js.native
    
    var isDragReject: Boolean = js.native
    
    var isFileDialogActive: Boolean = js.native
    
    var isFocused: Boolean = js.native
    
    def open(): Unit = js.native
    
    var rejectedFiles: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify File */ ?
      ] = js.native
    
    var rootRef: ReactRef[HTMLElement] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactDropzone.reactDropzoneStrings.multiple
    - typingsSlinky.reactDropzone.reactDropzoneStrings.onDragEnter
    - typingsSlinky.reactDropzone.reactDropzoneStrings.onDragOver
    - typingsSlinky.reactDropzone.reactDropzoneStrings.onDragLeave
  */
  trait PropTypes extends StObject
  object PropTypes {
    
    @scala.inline
    def multiple: typingsSlinky.reactDropzone.reactDropzoneStrings.multiple = "multiple".asInstanceOf[typingsSlinky.reactDropzone.reactDropzoneStrings.multiple]
    
    @scala.inline
    def onDragEnter: typingsSlinky.reactDropzone.reactDropzoneStrings.onDragEnter = "onDragEnter".asInstanceOf[typingsSlinky.reactDropzone.reactDropzoneStrings.onDragEnter]
    
    @scala.inline
    def onDragLeave: typingsSlinky.reactDropzone.reactDropzoneStrings.onDragLeave = "onDragLeave".asInstanceOf[typingsSlinky.reactDropzone.reactDropzoneStrings.onDragLeave]
    
    @scala.inline
    def onDragOver: typingsSlinky.reactDropzone.reactDropzoneStrings.onDragOver = "onDragOver".asInstanceOf[typingsSlinky.reactDropzone.reactDropzoneStrings.onDragOver]
  }
  
  type DropEvent = DragEvent[HTMLElement] | ChangeEvent[HTMLInputElement] | org.scalajs.dom.raw.DragEvent | Event
}
