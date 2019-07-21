(ns net.minecraft.realms.RealmsConnect
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsConnect]))

(defn ->realms-connect
  "Constructor.

  online-screen-in - `net.minecraft.realms.RealmsScreen`"
  (^RealmsConnect [^net.minecraft.realms.RealmsScreen online-screen-in]
    (new RealmsConnect online-screen-in)))

(defn connect
  "p-connect-1 - `java.lang.String`
  p-connect-2 - `int`"
  ([^RealmsConnect this ^java.lang.String p-connect-1 ^Integer p-connect-2]
    (-> this (.connect p-connect-1 p-connect-2))))

(defn abort
  ""
  ([^RealmsConnect this]
    (-> this (.abort))))

(defn tick
  ""
  ([^RealmsConnect this]
    (-> this (.tick))))

