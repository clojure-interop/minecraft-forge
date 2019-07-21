(ns net.minecraft.client.main.GameConfiguration$DisplayInformation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.main GameConfiguration$DisplayInformation]))

(defn ->display-information
  "Constructor.

  width-in - `int`
  height-in - `int`
  fullscreen-in - `boolean`
  check-gl-errors-in - `boolean`"
  (^GameConfiguration$DisplayInformation [^Integer width-in ^Integer height-in ^Boolean fullscreen-in ^Boolean check-gl-errors-in]
    (new GameConfiguration$DisplayInformation width-in height-in fullscreen-in check-gl-errors-in)))

(defn width
  "Instance Constant.

  type: int"
  (^Integer [^GameConfiguration$DisplayInformation this]
    (-> this .-width)))

(defn height
  "Instance Constant.

  type: int"
  (^Integer [^GameConfiguration$DisplayInformation this]
    (-> this .-height)))

(defn fullscreen
  "Instance Constant.

  type: boolean"
  (^Boolean [^GameConfiguration$DisplayInformation this]
    (-> this .-fullscreen)))

(defn check-gl-errors
  "Instance Constant.

  type: boolean"
  (^Boolean [^GameConfiguration$DisplayInformation this]
    (-> this .-checkGlErrors)))

