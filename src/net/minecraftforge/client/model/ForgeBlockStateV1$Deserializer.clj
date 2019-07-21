(ns net.minecraftforge.client.model.ForgeBlockStateV1$Deserializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ForgeBlockStateV1$Deserializer]))

(defn ->deserializer
  "Constructor."
  (^ForgeBlockStateV1$Deserializer []
    (new ForgeBlockStateV1$Deserializer )))

(defn deserialize
  "element - `com.google.gson.JsonElement`
  type-of-t - `java.lang.reflect.Type`
  context - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraftforge.client.model.ForgeBlockStateV1`

  throws: com.google.gson.JsonParseException"
  (^net.minecraftforge.client.model.ForgeBlockStateV1 [^ForgeBlockStateV1$Deserializer this ^com.google.gson.JsonElement element ^java.lang.reflect.Type type-of-t ^com.google.gson.JsonDeserializationContext context]
    (-> this (.deserialize element type-of-t context))))

