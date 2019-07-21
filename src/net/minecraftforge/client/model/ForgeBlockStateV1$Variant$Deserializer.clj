(ns net.minecraftforge.client.model.ForgeBlockStateV1$Variant$Deserializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ForgeBlockStateV1$Variant$Deserializer]))

(defn ->deserializer
  "Constructor."
  (^ForgeBlockStateV1$Variant$Deserializer []
    (new ForgeBlockStateV1$Variant$Deserializer )))

(defn simple-submodel-key
  "Instance Field.

  Used once (then set null) for the key to put a simple submodel declaration under in the submodel map.

  type: java.lang.String"
  (^java.lang.String [^ForgeBlockStateV1$Variant$Deserializer this]
    (-> this .-simpleSubmodelKey)))

(defn deserialize
  "element - `com.google.gson.JsonElement`
  type-of-t - `java.lang.reflect.Type`
  context - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraftforge.client.model.ForgeBlockStateV1$Variant`

  throws: com.google.gson.JsonParseException"
  (^net.minecraftforge.client.model.ForgeBlockStateV1$Variant [^ForgeBlockStateV1$Variant$Deserializer this ^com.google.gson.JsonElement element ^java.lang.reflect.Type type-of-t ^com.google.gson.JsonDeserializationContext context]
    (-> this (.deserialize element type-of-t context))))

