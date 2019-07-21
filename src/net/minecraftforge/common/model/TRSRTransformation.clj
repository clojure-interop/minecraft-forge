(ns net.minecraftforge.common.model.TRSRTransformation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model TRSRTransformation]))

(defn ->trsr-transformation
  "Constructor.

  translation - `javax.vecmath.Vector3f`
  left-rot - `javax.vecmath.Quat4f`
  scale - `javax.vecmath.Vector3f`
  right-rot - `javax.vecmath.Quat4f`"
  (^TRSRTransformation [^javax.vecmath.Vector3f translation ^javax.vecmath.Quat4f left-rot ^javax.vecmath.Vector3f scale ^javax.vecmath.Quat4f right-rot]
    (new TRSRTransformation translation left-rot scale right-rot))
  (^TRSRTransformation [^javax.vecmath.Matrix4f matrix]
    (new TRSRTransformation matrix)))

(defn *quat-from-yxz
  "y - `float`
  x - `float`
  z - `float`

  returns: `javax.vecmath.Quat4f`"
  (^javax.vecmath.Quat4f [^Float y ^Float x ^Float z]
    (TRSRTransformation/quatFromYXZ y x z)))

(defn *to-affine
  "m - `javax.vecmath.Matrix4f`

  returns: `org.apache.commons.lang3.tuple.Pair<javax.vecmath.Matrix3f,javax.vecmath.Vector3f>`"
  (^org.apache.commons.lang3.tuple.Pair [^javax.vecmath.Matrix4f m]
    (TRSRTransformation/toAffine m)))

(defn *to-yxz-degrees
  "q - `javax.vecmath.Quat4f`

  returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^javax.vecmath.Quat4f q]
    (TRSRTransformation/toYXZDegrees q)))

(defn *slerp
  "from - `javax.vecmath.Quat4f`
  to - `javax.vecmath.Quat4f`
  progress - `float`

  returns: `javax.vecmath.Quat4f`"
  (^javax.vecmath.Quat4f [^javax.vecmath.Quat4f from ^javax.vecmath.Quat4f to ^Float progress]
    (TRSRTransformation/slerp from to progress)))

(defn *quat-from-xyz
  "x - `float`
  y - `float`
  z - `float`

  returns: `javax.vecmath.Quat4f`"
  (^javax.vecmath.Quat4f [^Float x ^Float y ^Float z]
    (TRSRTransformation/quatFromXYZ x y z))
  (^javax.vecmath.Quat4f [^javax.vecmath.Vector3f xyz]
    (TRSRTransformation/quatFromXYZ xyz)))

(defn *svd-decompose
  "m - `javax.vecmath.Matrix3f`

  returns: `org.apache.commons.lang3.tuple.Triple<javax.vecmath.Quat4f,javax.vecmath.Vector3f,javax.vecmath.Quat4f>`"
  (^org.apache.commons.lang3.tuple.Triple [^javax.vecmath.Matrix3f m]
    (TRSRTransformation/svdDecompose m)))

(defn *block-center-to-corner
  "convert transformation from assuming center-block system to corner-block system

  transform - `net.minecraftforge.common.model.TRSRTransformation`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^net.minecraftforge.common.model.TRSRTransformation transform]
    (TRSRTransformation/blockCenterToCorner transform)))

(defn *block-corner-to-center
  "convert transformation from assuming corner-block system to center-block system

  transform - `net.minecraftforge.common.model.TRSRTransformation`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^net.minecraftforge.common.model.TRSRTransformation transform]
    (TRSRTransformation/blockCornerToCenter transform)))

(defn *lerp
  "from - `javax.vecmath.Tuple3f`
  to - `javax.vecmath.Tuple3f`
  progress - `float`

  returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^javax.vecmath.Tuple3f from ^javax.vecmath.Tuple3f to ^Float progress]
    (TRSRTransformation/lerp from to progress)))

(defn *get-vanilla-uv-transform-global-to-local
  "side - `net.minecraft.util.EnumFacing`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^net.minecraft.util.EnumFacing side]
    (TRSRTransformation/getVanillaUvTransformGlobalToLocal side)))

(defn *identity
  "returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation []
    (TRSRTransformation/identity )))

(defn *integer?
  "matrix - `javax.vecmath.Matrix4f`

  returns: `boolean`"
  (^Boolean [^javax.vecmath.Matrix4f matrix]
    (TRSRTransformation/isInteger matrix)))

(defn *quat-from-xyz-degrees
  "xyz - `javax.vecmath.Vector3f`

  returns: `javax.vecmath.Quat4f`"
  (^javax.vecmath.Quat4f [^javax.vecmath.Vector3f xyz]
    (TRSRTransformation/quatFromXYZDegrees xyz)))

(defn *to-yxz
  "q - `javax.vecmath.Quat4f`

  returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^javax.vecmath.Quat4f q]
    (TRSRTransformation/toYXZ q)))

(defn *get-vanilla-uv-transform-local-to-global
  "side - `net.minecraft.util.EnumFacing`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^net.minecraft.util.EnumFacing side]
    (TRSRTransformation/getVanillaUvTransformLocalToGlobal side)))

(defn *mul
  "translation - `javax.vecmath.Vector3f`
  left-rot - `javax.vecmath.Quat4f`
  scale - `javax.vecmath.Vector3f`
  right-rot - `javax.vecmath.Quat4f`

  returns: `javax.vecmath.Matrix4f`"
  (^javax.vecmath.Matrix4f [^javax.vecmath.Vector3f translation ^javax.vecmath.Quat4f left-rot ^javax.vecmath.Vector3f scale ^javax.vecmath.Quat4f right-rot]
    (TRSRTransformation/mul translation left-rot scale right-rot)))

(defn *to-vecmath
  "vec - `org.lwjgl.util.vector.Vector3f`

  returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^org.lwjgl.util.vector.Vector3f vec]
    (TRSRTransformation/toVecmath vec)))

(defn *to-xyz
  "q - `javax.vecmath.Quat4f`

  returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^javax.vecmath.Quat4f q]
    (TRSRTransformation/toXYZ q)))

(defn *get-matrix
  "facing - `net.minecraft.util.EnumFacing`

  returns: `javax.vecmath.Matrix4f`"
  (^javax.vecmath.Matrix4f [^net.minecraft.util.EnumFacing facing]
    (TRSRTransformation/getMatrix facing)))

(defn *rotate
  "matrix - `javax.vecmath.Matrix4f`
  facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^javax.vecmath.Matrix4f matrix ^net.minecraft.util.EnumFacing facing]
    (TRSRTransformation/rotate matrix facing)))

(defn *to-lwjgl
  "vec - `javax.vecmath.Vector3f`

  returns: `org.lwjgl.util.vector.Vector3f`"
  (^org.lwjgl.util.vector.Vector3f [^javax.vecmath.Vector3f vec]
    (TRSRTransformation/toLwjgl vec)))

(defn *to-xyz-degrees
  "q - `javax.vecmath.Quat4f`

  returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^javax.vecmath.Quat4f q]
    (TRSRTransformation/toXYZDegrees q)))

(defn slerp
  "that - `net.minecraftforge.common.model.TRSRTransformation`
  progress - `float`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^TRSRTransformation this ^net.minecraftforge.common.model.TRSRTransformation that ^Float progress]
    (-> this (.slerp that progress))))

(defn get-left-rot
  "returns: `javax.vecmath.Quat4f`"
  (^javax.vecmath.Quat4f [^TRSRTransformation this]
    (-> this (.getLeftRot))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TRSRTransformation this]
    (-> this (.toString))))

(defn apply
  "part - `com.google.common.base.Optional`

  returns: `com.google.common.base.Optional<net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.base.Optional [^TRSRTransformation this ^com.google.common.base.Optional part]
    (-> this (.apply part))))

(defn get-translation
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^TRSRTransformation this]
    (-> this (.getTranslation))))

(defn get-uv-lock-transform
  "original-side - `net.minecraft.util.EnumFacing`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^TRSRTransformation this ^net.minecraft.util.EnumFacing original-side]
    (-> this (.getUVLockTransform original-side))))

(defn get-scale
  "returns: `javax.vecmath.Vector3f`"
  (^javax.vecmath.Vector3f [^TRSRTransformation this]
    (-> this (.getScale))))

(defn inverse
  "returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^TRSRTransformation this]
    (-> this (.inverse))))

(defn compose
  "b - `net.minecraftforge.common.model.TRSRTransformation`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^TRSRTransformation this ^net.minecraftforge.common.model.TRSRTransformation b]
    (-> this (.compose b))))

(defn to-item-transform
  "Deprecated.

  returns: `net.minecraft.client.renderer.block.model.ItemTransformVec3f`"
  (^net.minecraft.client.renderer.block.model.ItemTransformVec3f [^TRSRTransformation this]
    (-> this (.toItemTransform))))

(defn get-right-rot
  "returns: `javax.vecmath.Quat4f`"
  (^javax.vecmath.Quat4f [^TRSRTransformation this]
    (-> this (.getRightRot))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TRSRTransformation this]
    (-> this (.hashCode))))

(defn get-matrix
  "returns: `javax.vecmath.Matrix4f`"
  (^javax.vecmath.Matrix4f [^TRSRTransformation this]
    (-> this (.getMatrix))))

(defn rotate
  "facing - `net.minecraft.util.EnumFacing`
  vertex-index - `int`

  returns: `int`"
  (^Integer [^TRSRTransformation this ^net.minecraft.util.EnumFacing facing ^Integer vertex-index]
    (-> this (.rotate facing vertex-index)))
  (^net.minecraft.util.EnumFacing [^TRSRTransformation this ^net.minecraft.util.EnumFacing facing]
    (-> this (.rotate facing))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TRSRTransformation this ^java.lang.Object obj]
    (-> this (.equals obj))))

