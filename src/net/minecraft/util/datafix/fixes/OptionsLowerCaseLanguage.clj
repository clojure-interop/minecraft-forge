(ns net.minecraft.util.datafix.fixes.OptionsLowerCaseLanguage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes OptionsLowerCaseLanguage]))

(defn ->options-lower-case-language
  "Constructor."
  (^OptionsLowerCaseLanguage []
    (new OptionsLowerCaseLanguage )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^OptionsLowerCaseLanguage this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^OptionsLowerCaseLanguage this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

