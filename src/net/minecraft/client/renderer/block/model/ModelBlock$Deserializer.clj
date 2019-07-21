(ns net.minecraft.client.renderer.block.model.ModelBlock$Deserializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ModelBlock$Deserializer]))

(defn ->deserializer
  "Constructor."
  (^ModelBlock$Deserializer []
    (new ModelBlock$Deserializer )))

(defn deserialize
  "p-deserialize-1 - `com.google.gson.JsonElement`
  p-deserialize-2 - `java.lang.reflect.Type`
  p-deserialize-3 - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.client.renderer.block.model.ModelBlock`

  throws: com.google.gson.JsonParseException"
  (^net.minecraft.client.renderer.block.model.ModelBlock [^ModelBlock$Deserializer this ^com.google.gson.JsonElement p-deserialize-1 ^java.lang.reflect.Type p-deserialize-2 ^com.google.gson.JsonDeserializationContext p-deserialize-3]
    (-> this (.deserialize p-deserialize-1 p-deserialize-2 p-deserialize-3))))

