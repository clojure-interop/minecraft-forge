(ns net.minecraft.world.storage.loot.properties.EntityPropertyManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.properties EntityPropertyManager]))

(defn ->entity-property-manager
  "Constructor."
  (^EntityPropertyManager []
    (new EntityPropertyManager )))

(defn *register-property
  "p-186644-0 - `net.minecraft.world.storage.loot.properties.EntityProperty$Serializer`

  returns: `<T extends net.minecraft.world.storage.loot.properties.EntityProperty> void`"
  ([^net.minecraft.world.storage.loot.properties.EntityProperty$Serializer p-186644-0]
    (EntityPropertyManager/registerProperty p-186644-0)))

(defn *get-serializer-for-name
  "p-186646-0 - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.world.storage.loot.properties.EntityProperty$Serializer<?>`"
  (^net.minecraft.world.storage.loot.properties.EntityProperty$Serializer [^net.minecraft.util.ResourceLocation p-186646-0]
    (EntityPropertyManager/getSerializerForName p-186646-0)))

(defn *get-serializer-for
  "property - `T`

  returns: `<T extends net.minecraft.world.storage.loot.properties.EntityProperty> net.minecraft.world.storage.loot.properties.EntityProperty$Serializer<T>`"
  ([property]
    (EntityPropertyManager/getSerializerFor property)))

