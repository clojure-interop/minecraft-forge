(ns net.minecraft.client.main.GameConfiguration$UserInformation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.main GameConfiguration$UserInformation]))

(defn ->user-information
  "Constructor.

  session-in - `net.minecraft.util.Session`
  user-properties-in - `com.mojang.authlib.properties.PropertyMap`
  profile-properties-in - `com.mojang.authlib.properties.PropertyMap`
  proxy-in - `java.net.Proxy`"
  (^GameConfiguration$UserInformation [^net.minecraft.util.Session session-in ^com.mojang.authlib.properties.PropertyMap user-properties-in ^com.mojang.authlib.properties.PropertyMap profile-properties-in ^java.net.Proxy proxy-in]
    (new GameConfiguration$UserInformation session-in user-properties-in profile-properties-in proxy-in)))

(defn session
  "Instance Constant.

  type: net.minecraft.util.Session"
  (^net.minecraft.util.Session [^GameConfiguration$UserInformation this]
    (-> this .-session)))

(defn user-properties
  "Instance Constant.

  type: com.mojang.authlib.properties.PropertyMap"
  (^com.mojang.authlib.properties.PropertyMap [^GameConfiguration$UserInformation this]
    (-> this .-userProperties)))

(defn profile-properties
  "Instance Constant.

  type: com.mojang.authlib.properties.PropertyMap"
  (^com.mojang.authlib.properties.PropertyMap [^GameConfiguration$UserInformation this]
    (-> this .-profileProperties)))

(defn proxy
  "Instance Constant.

  type: java.net.Proxy"
  (^java.net.Proxy [^GameConfiguration$UserInformation this]
    (-> this .-proxy)))

