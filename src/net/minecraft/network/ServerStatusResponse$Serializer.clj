(ns net.minecraft.network.ServerStatusResponse$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network ServerStatusResponse$Serializer]))

(defn ->serializer
  "Constructor."
  (^ServerStatusResponse$Serializer []
    (new ServerStatusResponse$Serializer )))

(defn deserialize
  "p-deserialize-1 - `com.google.gson.JsonElement`
  p-deserialize-2 - `java.lang.reflect.Type`
  p-deserialize-3 - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.network.ServerStatusResponse`

  throws: com.google.gson.JsonParseException"
  (^net.minecraft.network.ServerStatusResponse [^ServerStatusResponse$Serializer this ^com.google.gson.JsonElement p-deserialize-1 ^java.lang.reflect.Type p-deserialize-2 ^com.google.gson.JsonDeserializationContext p-deserialize-3]
    (-> this (.deserialize p-deserialize-1 p-deserialize-2 p-deserialize-3))))

(defn serialize
  "p-serialize-1 - `net.minecraft.network.ServerStatusResponse`
  p-serialize-2 - `java.lang.reflect.Type`
  p-serialize-3 - `com.google.gson.JsonSerializationContext`

  returns: `com.google.gson.JsonElement`"
  (^com.google.gson.JsonElement [^ServerStatusResponse$Serializer this ^net.minecraft.network.ServerStatusResponse p-serialize-1 ^java.lang.reflect.Type p-serialize-2 ^com.google.gson.JsonSerializationContext p-serialize-3]
    (-> this (.serialize p-serialize-1 p-serialize-2 p-serialize-3))))

