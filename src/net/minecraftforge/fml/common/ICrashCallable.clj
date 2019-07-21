(ns net.minecraftforge.fml.common.ICrashCallable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ICrashCallable]))

(defn get-label
  "returns: `java.lang.String`"
  (^java.lang.String [^ICrashCallable this]
    (-> this (.getLabel))))

