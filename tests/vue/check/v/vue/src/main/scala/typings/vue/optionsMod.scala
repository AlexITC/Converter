package typings.vue

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.Error
import typings.std.HTMLElement
import typings.std.Record
import typings.std.ThisType
import typings.vue.anon.Default
import typings.vue.anon.Event
import typings.vue.anon.Instantiable
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeData
import typings.vue.vnodeMod.VNodeDirective
import typings.vue.vueMod.CombinedVueInstance
import typings.vue.vueMod.CreateElement
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @js.native
  trait ComponentOptions[V /* <: Vue */, Data, Methods, Computed, PropsDef] extends StObject {
    
    var activated: scala.Unit | js.Function0[Unit] = js.native
    
    var beforeCreate: scala.Unit | (js.ThisFunction0[/* this */ V, Unit]) = js.native
    
    var beforeDestroy: scala.Unit | js.Function0[Unit] = js.native
    
    var beforeMount: scala.Unit | js.Function0[Unit] = js.native
    
    var beforeUpdate: scala.Unit | js.Function0[Unit] = js.native
    
    var comments: scala.Unit | Boolean = js.native
    
    var components: scala.Unit | (StringDictionary[
        (Component[js.Any, js.Any, js.Any, js.Any]) | (AsyncComponent[js.Any, js.Any, js.Any, js.Any])
      ]) = js.native
    
    var computed: scala.Unit | Accessors[Computed] = js.native
    
    var created: scala.Unit | js.Function0[Unit] = js.native
    
    var data: scala.Unit | Data = js.native
    
    var deactivated: scala.Unit | js.Function0[Unit] = js.native
    
    var delimiters: scala.Unit | (js.Tuple2[String, String]) = js.native
    
    var destroyed: scala.Unit | js.Function0[Unit] = js.native
    
    var directives: scala.Unit | (StringDictionary[DirectiveFunction | DirectiveOptions]) = js.native
    
    var el: scala.Unit | Element | String = js.native
    
    var errorCaptured: scala.Unit | (js.Function0[Boolean | Unit]) = js.native
    
    // TODO: support properly inferred 'extends'
    var `extends`: scala.Unit | (ComponentOptions[
        Vue, 
        DefaultData[Vue], 
        DefaultMethods[Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps]
      ]) | VueConstructor[Vue] = js.native
    
    var filters: scala.Unit | StringDictionary[js.Function] = js.native
    
    var inheritAttrs: scala.Unit | Boolean = js.native
    
    var inject: scala.Unit | InjectOptions = js.native
    
    var methods: scala.Unit | Methods = js.native
    
    var mixins: scala.Unit | (js.Array[
        (ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps]
        ]) | VueConstructor[Vue]
      ]) = js.native
    
    var model: scala.Unit | Event = js.native
    
    var mounted: scala.Unit | js.Function0[Unit] = js.native
    
    var name: scala.Unit | String = js.native
    
    var parent: scala.Unit | Vue = js.native
    
    var props: scala.Unit | PropsDef = js.native
    
    var propsData: scala.Unit | js.Object = js.native
    
    var provide: scala.Unit | js.Object | js.Function0[js.Object] = js.native
    
    var render: scala.Unit | (js.Function1[/* createElement */ CreateElement, VNode]) = js.native
    
    var renderError: scala.Unit | (js.Function2[/* h */ js.Function0[VNode], /* err */ Error, VNode]) = js.native
    
    var staticRenderFns: scala.Unit | (js.Array[js.Function1[/* createElement */ CreateElement, VNode]]) = js.native
    
    var template: scala.Unit | String = js.native
    
    var transitions: scala.Unit | StringDictionary[js.Object] = js.native
    
    var updated: scala.Unit | js.Function0[Unit] = js.native
    
    var watch: scala.Unit | (Record[String, WatchOptionsWithHandler[?] | WatchHandler[js.Any] | String]) = js.native
  }
  object ComponentOptions {
    
    @scala.inline
    def apply[V /* <: Vue */, Data, Methods, Computed, PropsDef](): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    
    @scala.inline
    implicit class ComponentOptionsMutableBuilder[Self <: ComponentOptions[?, ?, ?, ?, ?], V /* <: Vue */, Data, Methods, Computed, PropsDef] (val x: Self & (ComponentOptions[V, Data, Methods, Computed, PropsDef])) extends AnyVal {
      
      @scala.inline
      def setActivated(value: () => Unit): Self = StObject.set(x, "activated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setActivatedUndefined: Self = StObject.set(x, "activated", ())
      
      @scala.inline
      def setBeforeCreate(value: js.ThisFunction0[/* this */ V, Unit]): Self = StObject.set(x, "beforeCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", ())
      
      @scala.inline
      def setBeforeDestroy(value: () => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", ())
      
      @scala.inline
      def setBeforeMount(value: () => Unit): Self = StObject.set(x, "beforeMount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeMountUndefined: Self = StObject.set(x, "beforeMount", ())
      
      @scala.inline
      def setBeforeUpdate(value: () => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", ())
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", ())
      
      @scala.inline
      def setComponents(
        value: StringDictionary[
              (Component[js.Any, js.Any, js.Any, js.Any]) | (AsyncComponent[js.Any, js.Any, js.Any, js.Any])
            ]
      ): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", ())
      
      @scala.inline
      def setComputed(value: Accessors[Computed]): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputedUndefined: Self = StObject.set(x, "computed", ())
      
      @scala.inline
      def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", ())
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", ())
      
      @scala.inline
      def setDeactivated(value: () => Unit): Self = StObject.set(x, "deactivated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", ())
      
      @scala.inline
      def setDelimiters(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersUndefined: Self = StObject.set(x, "delimiters", ())
      
      @scala.inline
      def setDestroyed(value: () => Unit): Self = StObject.set(x, "destroyed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyedUndefined: Self = StObject.set(x, "destroyed", ())
      
      @scala.inline
      def setDirectives(value: StringDictionary[DirectiveFunction | DirectiveOptions]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesUndefined: Self = StObject.set(x, "directives", ())
      
      @scala.inline
      def setEl(value: Element | String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", ())
      
      @scala.inline
      def setErrorCaptured(value: () => Boolean | Unit): Self = StObject.set(x, "errorCaptured", js.Any.fromFunction0(value))
      
      @scala.inline
      def setErrorCapturedUndefined: Self = StObject.set(x, "errorCaptured", ())
      
      @scala.inline
      def setExtends(
        value: (ComponentOptions[
              Vue, 
              DefaultData[Vue], 
              DefaultMethods[Vue], 
              DefaultComputed, 
              PropsDefinition[DefaultProps]
            ]) | VueConstructor[Vue]
      ): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", ())
      
      @scala.inline
      def setFilters(value: StringDictionary[js.Function]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", ())
      
      @scala.inline
      def setInheritAttrs(value: Boolean): Self = StObject.set(x, "inheritAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritAttrsUndefined: Self = StObject.set(x, "inheritAttrs", ())
      
      @scala.inline
      def setInject(value: InjectOptions): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", ())
      
      @scala.inline
      def setInjectVarargs(value: String*): Self = StObject.set(x, "inject", js.Array(value :_*))
      
      @scala.inline
      def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", ())
      
      @scala.inline
      def setMixins(
        value: js.Array[
              (ComponentOptions[
                Vue, 
                DefaultData[Vue], 
                DefaultMethods[Vue], 
                DefaultComputed, 
                PropsDefinition[DefaultProps]
              ]) | VueConstructor[Vue]
            ]
      ): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinsUndefined: Self = StObject.set(x, "mixins", ())
      
      @scala.inline
      def setMixinsVarargs(
        value: ((ComponentOptions[
              Vue, 
              DefaultData[Vue], 
              DefaultMethods[Vue], 
              DefaultComputed, 
              PropsDefinition[DefaultProps]
            ]) | VueConstructor[Vue])*
      ): Self = StObject.set(x, "mixins", js.Array(value :_*))
      
      @scala.inline
      def setModel(value: Event): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", ())
      
      @scala.inline
      def setMounted(value: () => Unit): Self = StObject.set(x, "mounted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMountedUndefined: Self = StObject.set(x, "mounted", ())
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", ())
      
      @scala.inline
      def setParent(value: Vue): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", ())
      
      @scala.inline
      def setProps(value: PropsDef): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsData(value: js.Object): Self = StObject.set(x, "propsData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsDataUndefined: Self = StObject.set(x, "propsData", ())
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", ())
      
      @scala.inline
      def setProvide(value: js.Object | js.Function0[js.Object]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvideFunction0(value: () => js.Object): Self = StObject.set(x, "provide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProvideUndefined: Self = StObject.set(x, "provide", ())
      
      @scala.inline
      def setRender(value: /* createElement */ CreateElement => VNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderError(value: (/* h */ js.Function0[VNode], /* err */ Error) => VNode): Self = StObject.set(x, "renderError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderErrorUndefined: Self = StObject.set(x, "renderError", ())
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", ())
      
      @scala.inline
      def setStaticRenderFns(value: js.Array[js.Function1[/* createElement */ CreateElement, VNode]]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRenderFnsUndefined: Self = StObject.set(x, "staticRenderFns", ())
      
      @scala.inline
      def setStaticRenderFnsVarargs(value: (js.Function1[/* createElement */ CreateElement, VNode])*): Self = StObject.set(x, "staticRenderFns", js.Array(value :_*))
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", ())
      
      @scala.inline
      def setTransitions(value: StringDictionary[js.Object]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", ())
      
      @scala.inline
      def setUpdated(value: () => Unit): Self = StObject.set(x, "updated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdatedUndefined: Self = StObject.set(x, "updated", ())
      
      @scala.inline
      def setWatch(value: Record[String, WatchOptionsWithHandler[?] | WatchHandler[js.Any] | String]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchUndefined: Self = StObject.set(x, "watch", ())
    }
  }
  
  @js.native
  trait ComputedOptions[T] extends StObject {
    
    var cache: scala.Unit | Boolean = js.native
    
    var get: scala.Unit | js.Function0[T] = js.native
    
    var set: scala.Unit | (js.Function1[/* value */ T, Unit]) = js.native
  }
  object ComputedOptions {
    
    @scala.inline
    def apply[T](): ComputedOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComputedOptions[T]]
    }
    
    @scala.inline
    implicit class ComputedOptionsMutableBuilder[Self <: ComputedOptions[?], T] (val x: Self & ComputedOptions[T]) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", ())
      
      @scala.inline
      def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", ())
      
      @scala.inline
      def setSet(value: /* value */ T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", ())
    }
  }
  
  @js.native
  trait Constructor
    extends Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  @js.native
  trait DirectiveOptions extends StObject {
    
    var bind: scala.Unit | DirectiveFunction = js.native
    
    var componentUpdated: scala.Unit | DirectiveFunction = js.native
    
    var inserted: scala.Unit | DirectiveFunction = js.native
    
    var unbind: scala.Unit | DirectiveFunction = js.native
    
    var update: scala.Unit | DirectiveFunction = js.native
  }
  object DirectiveOptions {
    
    @scala.inline
    def apply(): DirectiveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectiveOptions]
    }
    
    @scala.inline
    implicit class DirectiveOptionsMutableBuilder[Self <: DirectiveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(
        value: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = StObject.set(x, "bind", js.Any.fromFunction4(value))
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", ())
      
      @scala.inline
      def setComponentUpdated(
        value: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = StObject.set(x, "componentUpdated", js.Any.fromFunction4(value))
      
      @scala.inline
      def setComponentUpdatedUndefined: Self = StObject.set(x, "componentUpdated", ())
      
      @scala.inline
      def setInserted(
        value: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = StObject.set(x, "inserted", js.Any.fromFunction4(value))
      
      @scala.inline
      def setInsertedUndefined: Self = StObject.set(x, "inserted", ())
      
      @scala.inline
      def setUnbind(
        value: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = StObject.set(x, "unbind", js.Any.fromFunction4(value))
      
      @scala.inline
      def setUnbindUndefined: Self = StObject.set(x, "unbind", ())
      
      @scala.inline
      def setUpdate(
        value: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", ())
    }
  }
  
  @js.native
  trait EsModuleComponent extends StObject {
    
    var default: Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps] = js.native
  }
  object EsModuleComponent {
    
    @scala.inline
    def apply(default: Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]): EsModuleComponent = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsModuleComponent]
    }
    
    @scala.inline
    implicit class EsModuleComponentMutableBuilder[Self <: EsModuleComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FunctionalComponentOptions[Props, PropDefs] extends StObject {
    
    var functional: Boolean = js.native
    
    var inject: scala.Unit | InjectOptions = js.native
    
    var name: scala.Unit | String = js.native
    
    var props: scala.Unit | PropDefs = js.native
    
    def render(createElement: CreateElement, context: RenderContext[Props]): VNode = js.native
  }
  object FunctionalComponentOptions {
    
    @scala.inline
    def apply[Props, PropDefs](functional: Boolean, render: (CreateElement, RenderContext[Props]) => VNode): FunctionalComponentOptions[Props, PropDefs] = {
      val __obj = js.Dynamic.literal(functional = functional.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[FunctionalComponentOptions[Props, PropDefs]]
    }
    
    @scala.inline
    implicit class FunctionalComponentOptionsMutableBuilder[Self <: FunctionalComponentOptions[?, ?], Props, PropDefs] (val x: Self & (FunctionalComponentOptions[Props, PropDefs])) extends AnyVal {
      
      @scala.inline
      def setFunctional(value: Boolean): Self = StObject.set(x, "functional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInject(value: InjectOptions): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", ())
      
      @scala.inline
      def setInjectVarargs(value: String*): Self = StObject.set(x, "inject", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", ())
      
      @scala.inline
      def setProps(value: PropDefs): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", ())
      
      @scala.inline
      def setRender(value: (CreateElement, RenderContext[Props]) => VNode): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait PropOptions[T] extends StObject {
    
    var default: scala.Unit | T | Null | js.Function0[js.Object] = js.native
    
    var required: scala.Unit | Boolean = js.native
    
    var `type`: scala.Unit | Prop[T] | js.Array[Prop[T]] = js.native
    
    var validator: scala.Unit | (js.Function1[/* value */ T, Boolean]) = js.native
  }
  object PropOptions {
    
    @scala.inline
    def apply[T](): PropOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropOptions[T]]
    }
    
    @scala.inline
    implicit class PropOptionsMutableBuilder[Self <: PropOptions[?], T] (val x: Self & PropOptions[T]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: T | js.Function0[js.Object]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFunction0(value: () => js.Object): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", ())
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", ())
      
      @scala.inline
      def setType(value: Prop[T] | js.Array[Prop[T]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFunction0(value: () => T): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", ())
      
      @scala.inline
      def setTypeVarargs(value: Prop[T]*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setValidator(value: /* value */ T => Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", ())
    }
  }
  
  @js.native
  trait RenderContext[Props] extends StObject {
    
    var children: js.Array[VNode] = js.native
    
    var data: VNodeData = js.native
    
    var injections: js.Any = js.native
    
    var parent: Vue = js.native
    
    var props: Props = js.native
    
    def slots(): js.Any = js.native
  }
  object RenderContext {
    
    @scala.inline
    def apply[Props](
      children: js.Array[VNode],
      data: VNodeData,
      injections: js.Any,
      parent: Vue,
      props: Props,
      slots: () => js.Any
    ): RenderContext[Props] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], injections = injections.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], slots = js.Any.fromFunction0(slots))
      __obj.asInstanceOf[RenderContext[Props]]
    }
    
    @scala.inline
    implicit class RenderContextMutableBuilder[Self <: RenderContext[?], Props] (val x: Self & RenderContext[Props]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[VNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: VNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setData(value: VNodeData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjections(value: js.Any): Self = StObject.set(x, "injections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Vue): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlots(value: () => js.Any): Self = StObject.set(x, "slots", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait WatchOptions extends StObject {
    
    var deep: scala.Unit | Boolean = js.native
    
    var immediate: scala.Unit | Boolean = js.native
  }
  object WatchOptions {
    
    @scala.inline
    def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit class WatchOptionsMutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", ())
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", ())
    }
  }
  
  @js.native
  trait WatchOptionsWithHandler[T] extends WatchOptions {
    
    def handler(`val`: T, oldVal: T): Unit = js.native
    @JSName("handler")
    var handler_Original: WatchHandler[T] = js.native
  }
  
  type Accessors[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: (): T[K] | vue.vue/types/options.ComputedOptions<T[K]>}
    */ typings.vue.vueStrings.Accessors & TopLevel[js.Any]
  
  type ArrayPropsDefinition[T] = js.Array[/* keyof T */ String]
  
  type AsyncComponent[Data, Methods, Computed, Props] = js.Function2[
    /* resolve */ js.Function1[/* component */ Component[Data, Methods, Computed, Props], Unit], 
    /* reject */ js.Function1[/* reason */ scala.Unit | js.Any, Unit], 
    (js.Promise[
      (Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]) | EsModuleComponent
    ]) | Unit
  ]
  
  type Component[Data, Methods, Computed, Props] = VueConstructor[Vue] | (FunctionalComponentOptions[Props, PropsDefinition[Props]]) | (ComponentOptions[Vue, Data, Methods, Computed, Props])
  
  type DefaultComputed = StringDictionary[js.Any]
  
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  
  type DefaultMethods[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  
  type DefaultProps = Record[String, js.Any]
  
  type DirectiveFunction = js.Function4[
    /* el */ HTMLElement, 
    /* binding */ VNodeDirective, 
    /* vnode */ VNode, 
    /* oldVnode */ VNode, 
    Unit
  ]
  
  type InjectKey = String | js.Symbol
  
  type InjectOptions = (StringDictionary[InjectKey | Default]) | js.Array[String]
  
  type Prop[T] = js.Function0[T] | Instantiable[T]
  
  type PropValidator[T] = PropOptions[T] | Prop[T] | js.Array[Prop[T]]
  
  type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]
  
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: vue.vue/types/options.PropValidator<T[K]>}
    */ typings.vue.vueStrings.RecordPropsDefinition & TopLevel[T]
  
  type ThisTypedComponentOptionsWithArrayProps[V /* <: Vue */, Data, Methods, Computed, PropNames /* <: String */] = js.Object & (ComponentOptions[
    V, 
    Data | (js.ThisFunction0[/* this */ (Record[PropNames, ?]) & V, Data]), 
    Methods, 
    Computed, 
    js.Array[PropNames]
  ]) & (ThisType[CombinedVueInstance[V, Data, Methods, Computed, Record[PropNames, ?]]])
  
  type ThisTypedComponentOptionsWithRecordProps[V /* <: Vue */, Data, Methods, Computed, Props] = js.Object & (ComponentOptions[
    V, 
    Data | (js.ThisFunction0[/* this */ Props & V, Data]), 
    Methods, 
    Computed, 
    RecordPropsDefinition[Props]
  ]) & (ThisType[CombinedVueInstance[V, Data, Methods, Computed, Props]])
  
  type WatchHandler[T] = js.Function2[/* val */ T, /* oldVal */ T, Unit]
}