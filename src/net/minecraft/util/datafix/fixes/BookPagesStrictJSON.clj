(ns net.minecraft.util.datafix.fixes.BookPagesStrictJSON
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes BookPagesStrictJSON]))

(defn ->book-pages-strict-json
  "Constructor."
  (^BookPagesStrictJSON []
    (new BookPagesStrictJSON )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^BookPagesStrictJSON this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^BookPagesStrictJSON this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))

