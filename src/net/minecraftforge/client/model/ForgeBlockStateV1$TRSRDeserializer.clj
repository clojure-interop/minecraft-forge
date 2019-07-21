(ns net.minecraftforge.client.model.ForgeBlockStateV1$TRSRDeserializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ForgeBlockStateV1$TRSRDeserializer]))

(defn ->trsr-deserializer
  "Constructor."
  (^ForgeBlockStateV1$TRSRDeserializer []
    (new ForgeBlockStateV1$TRSRDeserializer )))

(def *-instance
  "Static Constant.

  type: net.minecraftforge.client.model.ForgeBlockStateV1$TRSRDeserializer"
  ForgeBlockStateV1$TRSRDeserializer/INSTANCE)

(defn *parse-matrix
  "e - `com.google.gson.JsonElement`

  returns: `javax.vecmath.Matrix4f`"
  (^javax.vecmath.Matrix4f [^com.google.gson.JsonElement e]
    (ForgeBlockStateV1$TRSRDeserializer/parseMatrix e)))

(defn *parse-float-array
  "e - `com.google.gson.JsonElement`
  length - `int`
  prefix - `java.lang.String`

  returns: `float[]`"
  ([^com.google.gson.JsonElement e ^Integer length ^java.lang.String prefix]
    (ForgeBlockStateV1$TRSRDeserializer/parseFloatArray e length prefix)))

(defn *parse-axis-rotation
  "e - `com.google.gson.JsonElement`

  returns: `javax.vecmath.Quat4f`"
  (^javax.vecmath.Quat4f [^com.google.gson.JsonElement e]
    (ForgeBlockStateV1$TRSRDeserializer/parseAxisRotation e)))

(defn *parse-rotation
  "e - `com.google.gson.JsonElement`

  returns: `javax.vecmath.Quat4f`"
  (^javax.vecmath.Quat4f [^com.google.gson.JsonElement e]
    (ForgeBlockStateV1$TRSRDeserializer/parseRotation e)))

(defn deserialize
  "json - `com.google.gson.JsonElement`
  type-of-t - `java.lang.reflect.Type`
  context - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraftforge.common.model.TRSRTransformation`

  throws: com.google.gson.JsonParseException"
  (^net.minecraftforge.common.model.TRSRTransformation [^ForgeBlockStateV1$TRSRDeserializer this ^com.google.gson.JsonElement json ^java.lang.reflect.Type type-of-t ^com.google.gson.JsonDeserializationContext context]
    (-> this (.deserialize json type-of-t context))))

