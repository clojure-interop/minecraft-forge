(ns net.minecraft.nbt.JsonToNBT
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt JsonToNBT]))

(defn ->json-to-nbt
  "Constructor."
  (^JsonToNBT []
    (new JsonToNBT )))

(defn *get-tag-from-json
  "json-string - `java.lang.String`

  returns: `net.minecraft.nbt.NBTTagCompound`

  throws: net.minecraft.nbt.NBTException"
  (^net.minecraft.nbt.NBTTagCompound [^java.lang.String json-string]
    (JsonToNBT/getTagFromJson json-string)))

