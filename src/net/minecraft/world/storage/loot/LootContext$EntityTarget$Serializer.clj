(ns net.minecraft.world.storage.loot.LootContext$EntityTarget$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootContext$EntityTarget$Serializer]))

(defn ->serializer
  "Constructor."
  (^LootContext$EntityTarget$Serializer []
    (new LootContext$EntityTarget$Serializer )))

(defn write
  "p-write-1 - `com.google.gson.stream.JsonWriter`
  p-write-2 - `net.minecraft.world.storage.loot.LootContext$EntityTarget`

  throws: java.io.IOException"
  ([^LootContext$EntityTarget$Serializer this ^com.google.gson.stream.JsonWriter p-write-1 ^net.minecraft.world.storage.loot.LootContext$EntityTarget p-write-2]
    (-> this (.write p-write-1 p-write-2))))

(defn read
  "p-read-1 - `com.google.gson.stream.JsonReader`

  returns: `net.minecraft.world.storage.loot.LootContext$EntityTarget`

  throws: java.io.IOException"
  (^net.minecraft.world.storage.loot.LootContext$EntityTarget [^LootContext$EntityTarget$Serializer this ^com.google.gson.stream.JsonReader p-read-1]
    (-> this (.read p-read-1))))

