(ns net.minecraft.client.renderer.block.model.ModelRotation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ModelRotation]))

(def X0_Y0
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X0_Y0)

(def X0_Y90
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X0_Y90)

(def X0_Y180
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X0_Y180)

(def X0_Y270
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X0_Y270)

(def X90_Y0
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X90_Y0)

(def X90_Y90
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X90_Y90)

(def X90_Y180
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X90_Y180)

(def X90_Y270
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X90_Y270)

(def X180_Y0
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X180_Y0)

(def X180_Y90
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X180_Y90)

(def X180_Y180
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X180_Y180)

(def X180_Y270
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X180_Y270)

(def X270_Y0
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X270_Y0)

(def X270_Y90
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X270_Y90)

(def X270_Y180
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X270_Y180)

(def X270_Y270
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ModelRotation"
  ModelRotation/X270_Y270)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ModelRotation c : ModelRotation.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.block.model.ModelRotation[]`"
  ([]
    (ModelRotation/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.block.model.ModelRotation`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.block.model.ModelRotation [^java.lang.String name]
    (ModelRotation/valueOf name)))

(defn *get-model-rotation
  "x - `int`
  y - `int`

  returns: `net.minecraft.client.renderer.block.model.ModelRotation`"
  (^net.minecraft.client.renderer.block.model.ModelRotation [^Integer x ^Integer y]
    (ModelRotation/getModelRotation x y)))

(defn get-matrix-4d
  "returns: `org.lwjgl.util.vector.Matrix4f`"
  (^org.lwjgl.util.vector.Matrix4f [^ModelRotation this]
    (-> this (.getMatrix4d))))

(defn rotate-face
  "facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^ModelRotation this ^net.minecraft.util.EnumFacing facing]
    (-> this (.rotateFace facing))))

(defn rotate-vertex
  "facing - `net.minecraft.util.EnumFacing`
  vertex-index - `int`

  returns: `int`"
  (^Integer [^ModelRotation this ^net.minecraft.util.EnumFacing facing ^Integer vertex-index]
    (-> this (.rotateVertex facing vertex-index))))

(defn apply
  "part - `com.google.common.base.Optional`

  returns: `com.google.common.base.Optional<net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.base.Optional [^ModelRotation this ^com.google.common.base.Optional part]
    (-> this (.apply part))))

(defn get-matrix
  "returns: `javax.vecmath.Matrix4f`"
  (^javax.vecmath.Matrix4f [^ModelRotation this]
    (-> this (.getMatrix))))

(defn rotate
  "facing - `net.minecraft.util.EnumFacing`
  vertex-index - `int`

  returns: `int`"
  (^Integer [^ModelRotation this ^net.minecraft.util.EnumFacing facing ^Integer vertex-index]
    (-> this (.rotate facing vertex-index)))
  (^net.minecraft.util.EnumFacing [^ModelRotation this ^net.minecraft.util.EnumFacing facing]
    (-> this (.rotate facing))))

