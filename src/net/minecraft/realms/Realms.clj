(ns net.minecraft.realms.Realms
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms Realms]))

(defn ->realms
  "Constructor."
  (^Realms []
    (new Realms )))

(defn *delete-player-tag
  "p-delete-player-tag-0 - `java.io.File`"
  ([^java.io.File p-delete-player-tag-0]
    (Realms/deletePlayerTag p-delete-player-tag-0)))

(defn *set-connected-to-realms
  "p-set-connected-to-realms-0 - `boolean`"
  ([^Boolean p-set-connected-to-realms-0]
    (Realms/setConnectedToRealms p-set-connected-to-realms-0)))

(defn *get-game-directory-path
  "returns: `java.lang.String`"
  (^java.lang.String []
    (Realms/getGameDirectoryPath )))

(defn *spectator-id
  "returns: `int`"
  (^Integer []
    (Realms/spectatorId )))

(defn *get-session-id
  "returns: `java.lang.String`"
  (^java.lang.String []
    (Realms/getSessionId )))

(defn *survival-id
  "returns: `int`"
  (^Integer []
    (Realms/survivalId )))

(defn *current-time-millis
  "returns: `long`"
  (^Long []
    (Realms/currentTimeMillis )))

(defn *session-id
  "returns: `java.lang.String`"
  (^java.lang.String []
    (Realms/sessionId )))

(defn *get-name
  "returns: `java.lang.String`"
  (^java.lang.String []
    (Realms/getName )))

(defn *download-resource-pack
  "p-download-resource-pack-0 - `java.lang.String`
  p-download-resource-pack-1 - `java.lang.String`

  returns: `com.google.common.util.concurrent.ListenableFuture<java.lang.Object>`"
  (^com.google.common.util.concurrent.ListenableFuture [^java.lang.String p-download-resource-pack-0 ^java.lang.String p-download-resource-pack-1]
    (Realms/downloadResourcePack p-download-resource-pack-0 p-download-resource-pack-1)))

(defn *get-realms-notifications-enabled?
  "returns: `boolean`"
  (^Boolean []
    (Realms/getRealmsNotificationsEnabled )))

(defn *get-proxy
  "returns: `java.net.Proxy`"
  (^java.net.Proxy []
    (Realms/getProxy )))

(defn *clear-resource-pack
  ""
  ([]
    (Realms/clearResourcePack )))

(defn *user-name
  "returns: `java.lang.String`"
  (^java.lang.String []
    (Realms/userName )))

(defn *get-uuid
  "returns: `java.lang.String`"
  (^java.lang.String []
    (Realms/getUUID )))

(defn *in-title-screen
  "returns: `boolean`"
  (^Boolean []
    (Realms/inTitleScreen )))

(defn *adventure-id
  "returns: `int`"
  (^Integer []
    (Realms/adventureId )))

(defn *creative-id
  "returns: `int`"
  (^Integer []
    (Realms/creativeId )))

(defn *touch-screen?
  "returns: `boolean`"
  (^Boolean []
    (Realms/isTouchScreen )))

(defn *uuid-to-name
  "p-uuid-to-name-0 - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String p-uuid-to-name-0]
    (Realms/uuidToName p-uuid-to-name-0)))

(defn *set-screen
  "p-set-screen-0 - `net.minecraft.realms.RealmsScreen`"
  ([^net.minecraft.realms.RealmsScreen p-set-screen-0]
    (Realms/setScreen p-set-screen-0)))

