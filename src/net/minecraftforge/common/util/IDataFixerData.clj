(ns net.minecraftforge.common.util.IDataFixerData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util IDataFixerData]))

(defn get-version
  "mod - `java.lang.String`

  returns: `int`"
  (^Integer [^IDataFixerData this ^java.lang.String mod]
    (-> this (.getVersion mod))))

