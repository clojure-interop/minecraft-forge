(ns net.minecraftforge.common.util.INBTSerializable
  "An interface designed to unify various things in the Minecraft
  code base that can be serialized to and from a NBT tag."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util INBTSerializable]))

(defn serialize-nbt
  "returns: `T`"
  ([^INBTSerializable this]
    (-> this (.serializeNBT))))

(defn deserialize-nbt
  "nbt - `T`"
  ([^INBTSerializable this nbt]
    (-> this (.deserializeNBT nbt))))

