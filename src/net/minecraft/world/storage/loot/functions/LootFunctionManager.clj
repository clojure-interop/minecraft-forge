(ns net.minecraft.world.storage.loot.functions.LootFunctionManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions LootFunctionManager]))

(defn ->loot-function-manager
  "Constructor."
  (^LootFunctionManager []
    (new LootFunctionManager )))

(defn *register-function
  "serializer - `net.minecraft.world.storage.loot.functions.LootFunction$Serializer`

  returns: `<T extends net.minecraft.world.storage.loot.functions.LootFunction> void`"
  ([^net.minecraft.world.storage.loot.functions.LootFunction$Serializer serializer]
    (LootFunctionManager/registerFunction serializer)))

(defn *get-serializer-for-name
  "location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.world.storage.loot.functions.LootFunction$Serializer<?>`"
  (^net.minecraft.world.storage.loot.functions.LootFunction$Serializer [^net.minecraft.util.ResourceLocation location]
    (LootFunctionManager/getSerializerForName location)))

(defn *get-serializer-for
  "function-class - `T`

  returns: `<T extends net.minecraft.world.storage.loot.functions.LootFunction> net.minecraft.world.storage.loot.functions.LootFunction$Serializer<T>`"
  ([function-class]
    (LootFunctionManager/getSerializerFor function-class)))

