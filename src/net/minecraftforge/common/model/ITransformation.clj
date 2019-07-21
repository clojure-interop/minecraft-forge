(ns net.minecraftforge.common.model.ITransformation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model ITransformation]))

(defn get-matrix
  "returns: `javax.vecmath.Matrix4f`"
  (^javax.vecmath.Matrix4f [^ITransformation this]
    (-> this (.getMatrix))))

(defn rotate
  "facing - `net.minecraft.util.EnumFacing`
  vertex-index - `int`

  returns: `int`"
  (^Integer [^ITransformation this ^net.minecraft.util.EnumFacing facing ^Integer vertex-index]
    (-> this (.rotate facing vertex-index)))
  (^net.minecraft.util.EnumFacing [^ITransformation this ^net.minecraft.util.EnumFacing facing]
    (-> this (.rotate facing))))

