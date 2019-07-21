(ns net.minecraft.client.main.GameConfiguration$GameInformation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.main GameConfiguration$GameInformation]))

(defn ->game-information
  "Constructor.

  demo - `boolean`
  version-in - `java.lang.String`
  version-type-in - `java.lang.String`"
  (^GameConfiguration$GameInformation [^Boolean demo ^java.lang.String version-in ^java.lang.String version-type-in]
    (new GameConfiguration$GameInformation demo version-in version-type-in)))

(defn is-demo
  "Instance Constant.

  type: boolean"
  (^Boolean [^GameConfiguration$GameInformation this]
    (-> this .-isDemo)))

(defn version
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^GameConfiguration$GameInformation this]
    (-> this .-version)))

(defn version-type
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^GameConfiguration$GameInformation this]
    (-> this .-versionType)))

