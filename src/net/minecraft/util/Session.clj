(ns net.minecraft.util.Session
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util Session]))

(defn ->session
  "Constructor.

  username-in - `java.lang.String`
  player-id-in - `java.lang.String`
  token-in - `java.lang.String`
  session-type-in - `java.lang.String`"
  (^Session [^java.lang.String username-in ^java.lang.String player-id-in ^java.lang.String token-in ^java.lang.String session-type-in]
    (new Session username-in player-id-in token-in session-type-in)))

(defn get-session-id
  "returns: `java.lang.String`"
  (^java.lang.String [^Session this]
    (-> this (.getSessionID))))

(defn get-player-id
  "returns: `java.lang.String`"
  (^java.lang.String [^Session this]
    (-> this (.getPlayerID))))

(defn get-username
  "returns: `java.lang.String`"
  (^java.lang.String [^Session this]
    (-> this (.getUsername))))

(defn get-token
  "returns: `java.lang.String`"
  (^java.lang.String [^Session this]
    (-> this (.getToken))))

(defn get-profile
  "returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^Session this]
    (-> this (.getProfile))))

(defn set-properties
  "properties - `com.mojang.authlib.properties.PropertyMap`"
  ([^Session this ^com.mojang.authlib.properties.PropertyMap properties]
    (-> this (.setProperties properties))))

(defn has-cached-properties?
  "returns: `boolean`"
  (^Boolean [^Session this]
    (-> this (.hasCachedProperties))))

