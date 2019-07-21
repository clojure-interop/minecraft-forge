(ns net.minecraft.client.renderer.block.model.multipart.Selector$Deserializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model.multipart Selector$Deserializer]))

(defn ->deserializer
  "Constructor."
  (^Selector$Deserializer []
    (new Selector$Deserializer )))

(defn deserialize
  "p-deserialize-1 - `com.google.gson.JsonElement`
  p-deserialize-2 - `java.lang.reflect.Type`
  p-deserialize-3 - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.client.renderer.block.model.multipart.Selector`

  throws: com.google.gson.JsonParseException"
  (^net.minecraft.client.renderer.block.model.multipart.Selector [^Selector$Deserializer this ^com.google.gson.JsonElement p-deserialize-1 ^java.lang.reflect.Type p-deserialize-2 ^com.google.gson.JsonDeserializationContext p-deserialize-3]
    (-> this (.deserialize p-deserialize-1 p-deserialize-2 p-deserialize-3))))

