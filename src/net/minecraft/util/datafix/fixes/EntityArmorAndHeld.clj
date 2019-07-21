(ns net.minecraft.util.datafix.fixes.EntityArmorAndHeld
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes EntityArmorAndHeld]))

(defn ->entity-armor-and-held
  "Constructor."
  (^EntityArmorAndHeld []
    (new EntityArmorAndHeld )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^EntityArmorAndHeld this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^EntityArmorAndHeld this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

