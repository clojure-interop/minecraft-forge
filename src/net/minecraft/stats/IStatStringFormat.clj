(ns net.minecraft.stats.IStatStringFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.stats IStatStringFormat]))

(defn format-string
  "str - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^IStatStringFormat this ^java.lang.String str]
    (-> this (.formatString str))))

