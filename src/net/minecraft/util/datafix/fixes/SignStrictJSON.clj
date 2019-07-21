(ns net.minecraft.util.datafix.fixes.SignStrictJSON
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes SignStrictJSON]))

(defn ->sign-strict-json
  "Constructor."
  (^SignStrictJSON []
    (new SignStrictJSON )))

(def *-gson-instance
  "Static Constant.

  type: com.google.gson.Gson"
  SignStrictJSON/GSON_INSTANCE)

(defn get-fix-version
  "returns: `int`"
  (^Integer [^SignStrictJSON this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^SignStrictJSON this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

