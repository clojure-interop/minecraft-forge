(ns net.minecraft.stats.IStatType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.stats IStatType]))

(defn format
  "number - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^IStatType this ^Integer number]
    (-> this (.format number))))

