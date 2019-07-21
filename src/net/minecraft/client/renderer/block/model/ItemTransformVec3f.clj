(ns net.minecraft.client.renderer.block.model.ItemTransformVec3f
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ItemTransformVec3f]))

(defn ->item-transform-vec-3f
  "Constructor.

  Deprecated.

  rotation - `org.lwjgl.util.vector.Vector3f`
  translation - `org.lwjgl.util.vector.Vector3f`
  scale - `org.lwjgl.util.vector.Vector3f`"
  (^ItemTransformVec3f [^org.lwjgl.util.vector.Vector3f rotation ^org.lwjgl.util.vector.Vector3f translation ^org.lwjgl.util.vector.Vector3f scale]
    (new ItemTransformVec3f rotation translation scale)))

(def *-default
  "Static Constant.

  Deprecated.

  type: net.minecraft.client.renderer.block.model.ItemTransformVec3f"
  ItemTransformVec3f/DEFAULT)

(defn rotation
  "Instance Constant.

  Deprecated.

  type: org.lwjgl.util.vector.Vector3f"
  (^org.lwjgl.util.vector.Vector3f [^ItemTransformVec3f this]
    (-> this .-rotation)))

(defn translation
  "Instance Constant.

  Deprecated.

  type: org.lwjgl.util.vector.Vector3f"
  (^org.lwjgl.util.vector.Vector3f [^ItemTransformVec3f this]
    (-> this .-translation)))

(defn scale
  "Instance Constant.

  Deprecated.

  type: org.lwjgl.util.vector.Vector3f"
  (^org.lwjgl.util.vector.Vector3f [^ItemTransformVec3f this]
    (-> this .-scale)))

(defn apply
  "Deprecated.

  part - `com.google.common.base.Optional`

  returns: `com.google.common.base.Optional<net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.base.Optional [^ItemTransformVec3f this ^com.google.common.base.Optional part]
    (-> this (.apply part))))

(defn equals
  "Deprecated.

  p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ItemTransformVec3f this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "Deprecated.

  returns: `int`"
  (^Integer [^ItemTransformVec3f this]
    (-> this (.hashCode))))

