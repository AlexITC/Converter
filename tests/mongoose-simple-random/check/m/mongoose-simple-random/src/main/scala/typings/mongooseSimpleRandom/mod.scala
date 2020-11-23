package typings.mongooseSimpleRandom

import typings.mongoose.mod.Document
import typings.mongoose.mod.ModelProperties
import typings.mongoose.mod.Schema
import typings.node.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongoose-simple-random", JSImport.Namespace)
  @js.native
  def apply(schema: Schema): Unit = js.native
  
  /* augmented module */
  object mongooseAugmentingMod {
    
    @js.native
    trait Model[T /* <: Document */]
      extends EventEmitter
         with ModelProperties {
      
      def findRandom(conditions: js.Object): Unit = js.native
      def findRandom(conditions: js.Object, projection: js.Object): Unit = js.native
      def findRandom(conditions: js.Object, projection: js.Object, options: js.Object): Unit = js.native
      def findRandom(
        conditions: js.Object,
        projection: js.Object,
        options: js.Object,
        callback: js.Function2[/* err */ js.Any, /* res */ scala.Unit | js.Array[T], Unit]
      ): Unit = js.native
      def findRandom(
        conditions: js.Object,
        projection: js.Object,
        options: Null,
        callback: js.Function2[/* err */ js.Any, /* res */ scala.Unit | js.Array[T], Unit]
      ): Unit = js.native
      def findRandom(
        conditions: js.Object,
        projection: js.Object,
        options: Unit,
        callback: js.Function2[/* err */ js.Any, /* res */ scala.Unit | js.Array[T], Unit]
      ): Unit = js.native
      def findRandom(conditions: js.Object, projection: Null, options: js.Object): Unit = js.native
      def findRandom(
        conditions: js.Object,
        projection: Null,
        options: js.Object,
        callback: js.Function2[/* err */ js.Any, /* res */ scala.Unit | js.Array[T], Unit]
      ): Unit = js.native
      def findRandom(
        conditions: js.Object,
        projection: Null,
        options: Null,
        callback: js.Function2[/* err */ js.Any, /* res */ scala.Unit | js.Array[T], Unit]
      ): Unit = js.native
      def findRandom(
        conditions: js.Object,
        projection: Null,
        options: Unit,
        callback: js.Function2[/* err */ js.Any, /* res */ scala.Unit | js.Array[T], Unit]
      ): Unit = js.native
      def findRandom(conditions: js.Object, projection: Unit, options: js.Object): Unit = js.native
      def findRandom(
        conditions: js.Object,
        projection: Unit,
        options: js.Object,
        callback: js.Function2[/* err */ js.Any, /* res */ scala.Unit | js.Array[T], Unit]
      ): Unit = js.native
      def findRandom(
        conditions: js.Object,
        projection: Unit,
        options: Null,
        callback: js.Function2[/* err */ js.Any, /* res */ scala.Unit | js.Array[T], Unit]
      ): Unit = js.native
      def findRandom(
        conditions: js.Object,
        projection: Unit,
        options: Unit,
        callback: js.Function2[/* err */ js.Any, /* res */ scala.Unit | js.Array[T], Unit]
      ): Unit = js.native
    }
  }
}
