(ns net.minecraft.network.rcon.IServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.rcon IServer]))

(defn debugging-enabled?
  "returns: `boolean`"
  (^Boolean [^IServer this]
    (-> this (.isDebuggingEnabled))))

(defn log-severe
  "msg - `java.lang.String`"
  ([^IServer this ^java.lang.String msg]
    (-> this (.logSevere msg))))

(defn get-motd
  "returns: `java.lang.String`"
  (^java.lang.String [^IServer this]
    (-> this (.getMotd))))

(defn get-max-players
  "returns: `int`"
  (^Integer [^IServer this]
    (-> this (.getMaxPlayers))))

(defn get-string-property
  "key - `java.lang.String`
  default-value - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^IServer this ^java.lang.String key ^java.lang.String default-value]
    (-> this (.getStringProperty key default-value))))

(defn get-hostname
  "returns: `java.lang.String`"
  (^java.lang.String [^IServer this]
    (-> this (.getHostname))))

(defn get-plugins
  "returns: `java.lang.String`"
  (^java.lang.String [^IServer this]
    (-> this (.getPlugins))))

(defn log-warning
  "msg - `java.lang.String`"
  ([^IServer this ^java.lang.String msg]
    (-> this (.logWarning msg))))

(defn get-online-player-names
  "returns: `java.lang.String[]`"
  ([^IServer this]
    (-> this (.getOnlinePlayerNames))))

(defn log-info
  "msg - `java.lang.String`"
  ([^IServer this ^java.lang.String msg]
    (-> this (.logInfo msg))))

(defn get-folder-name
  "returns: `java.lang.String`"
  (^java.lang.String [^IServer this]
    (-> this (.getFolderName))))

(defn get-int-property
  "key - `java.lang.String`
  default-value - `int`

  returns: `int`"
  (^Integer [^IServer this ^java.lang.String key ^Integer default-value]
    (-> this (.getIntProperty key default-value))))

(defn log-debug
  "msg - `java.lang.String`"
  ([^IServer this ^java.lang.String msg]
    (-> this (.logDebug msg))))

(defn get-port
  "returns: `int`"
  (^Integer [^IServer this]
    (-> this (.getPort))))

(defn set-property
  "key - `java.lang.String`
  value - `java.lang.Object`"
  ([^IServer this ^java.lang.String key ^java.lang.Object value]
    (-> this (.setProperty key value))))

(defn get-settings-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^IServer this]
    (-> this (.getSettingsFilename))))

(defn get-minecraft-version
  "returns: `java.lang.String`"
  (^java.lang.String [^IServer this]
    (-> this (.getMinecraftVersion))))

(defn handle-r-con-command
  "command - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^IServer this ^java.lang.String command]
    (-> this (.handleRConCommand command))))

(defn save-properties
  ""
  ([^IServer this]
    (-> this (.saveProperties))))

(defn get-current-player-count
  "returns: `int`"
  (^Integer [^IServer this]
    (-> this (.getCurrentPlayerCount))))

