(ns net.minecraft.client.renderer.block.model.ModelBlockDefinition$Deserializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ModelBlockDefinition$Deserializer]))

(defn ->deserializer
  "Constructor."
  (^ModelBlockDefinition$Deserializer []
    (new ModelBlockDefinition$Deserializer )))

(defn deserialize
  "p-deserialize-1 - `com.google.gson.JsonElement`
  p-deserialize-2 - `java.lang.reflect.Type`
  p-deserialize-3 - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.client.renderer.block.model.ModelBlockDefinition`

  throws: com.google.gson.JsonParseException"
  (^net.minecraft.client.renderer.block.model.ModelBlockDefinition [^ModelBlockDefinition$Deserializer this ^com.google.gson.JsonElement p-deserialize-1 ^java.lang.reflect.Type p-deserialize-2 ^com.google.gson.JsonDeserializationContext p-deserialize-3]
    (-> this (.deserialize p-deserialize-1 p-deserialize-2 p-deserialize-3))))

