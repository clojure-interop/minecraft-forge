(ns net.minecraft.client.main.GameConfiguration$ServerInformation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.main GameConfiguration$ServerInformation]))

(defn ->server-information
  "Constructor.

  server-name-in - `java.lang.String`
  server-port-in - `int`"
  (^GameConfiguration$ServerInformation [^java.lang.String server-name-in ^Integer server-port-in]
    (new GameConfiguration$ServerInformation server-name-in server-port-in)))

(defn server-name
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^GameConfiguration$ServerInformation this]
    (-> this .-serverName)))

(defn server-port
  "Instance Constant.

  type: int"
  (^Integer [^GameConfiguration$ServerInformation this]
    (-> this .-serverPort)))

