(ns net.minecraft.client.audio.SoundListSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio SoundListSerializer]))

(defn ->sound-list-serializer
  "Constructor."
  (^SoundListSerializer []
    (new SoundListSerializer )))

(defn deserialize
  "p-deserialize-1 - `com.google.gson.JsonElement`
  p-deserialize-2 - `java.lang.reflect.Type`
  p-deserialize-3 - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.client.audio.SoundList`

  throws: com.google.gson.JsonParseException"
  (^net.minecraft.client.audio.SoundList [^SoundListSerializer this ^com.google.gson.JsonElement p-deserialize-1 ^java.lang.reflect.Type p-deserialize-2 ^com.google.gson.JsonDeserializationContext p-deserialize-3]
    (-> this (.deserialize p-deserialize-1 p-deserialize-2 p-deserialize-3))))

