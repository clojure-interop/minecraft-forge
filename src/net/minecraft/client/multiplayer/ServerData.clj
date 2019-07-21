(ns net.minecraft.client.multiplayer.ServerData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.multiplayer ServerData]))

(defn ->server-data
  "Constructor.

  name - `java.lang.String`
  ip - `java.lang.String`
  is-lan - `boolean`"
  (^ServerData [^java.lang.String name ^java.lang.String ip ^Boolean is-lan]
    (new ServerData name ip is-lan)))

(defn server-name
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^ServerData this]
    (-> this .-serverName)))

(defn server-ip
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^ServerData this]
    (-> this .-serverIP)))

(defn population-info
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^ServerData this]
    (-> this .-populationInfo)))

(defn server-motd
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^ServerData this]
    (-> this .-serverMOTD)))

(defn ping-to-server
  "Instance Field.

  type: long"
  (^Long [^ServerData this]
    (-> this .-pingToServer)))

(defn version
  "Instance Field.

  type: int"
  (^Integer [^ServerData this]
    (-> this .-version)))

(defn game-version
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^ServerData this]
    (-> this .-gameVersion)))

(defn pinged
  "Instance Field.

  type: boolean"
  (^Boolean [^ServerData this]
    (-> this .-pinged)))

(defn player-list
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^ServerData this]
    (-> this .-playerList)))

(defn *get-server-data-from-nbt-compound
  "nbt-compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.client.multiplayer.ServerData`"
  (^net.minecraft.client.multiplayer.ServerData [^net.minecraft.nbt.NBTTagCompound nbt-compound]
    (ServerData/getServerDataFromNBTCompound nbt-compound)))

(defn get-nbt-compound
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ServerData this]
    (-> this (.getNBTCompound))))

(defn get-resource-mode
  "returns: `net.minecraft.client.multiplayer.ServerData$ServerResourceMode`"
  (^net.minecraft.client.multiplayer.ServerData$ServerResourceMode [^ServerData this]
    (-> this (.getResourceMode))))

(defn set-resource-mode
  "mode - `net.minecraft.client.multiplayer.ServerData$ServerResourceMode`"
  ([^ServerData this ^net.minecraft.client.multiplayer.ServerData$ServerResourceMode mode]
    (-> this (.setResourceMode mode))))

(defn get-base-64-encoded-icon-data
  "returns: `java.lang.String`"
  (^java.lang.String [^ServerData this]
    (-> this (.getBase64EncodedIconData))))

(defn set-base-64-encoded-icon-data
  "icon - `java.lang.String`"
  ([^ServerData this ^java.lang.String icon]
    (-> this (.setBase64EncodedIconData icon))))

(defn on-lan?
  "returns: `boolean`"
  (^Boolean [^ServerData this]
    (-> this (.isOnLAN))))

(defn copy-from
  "server-data-in - `net.minecraft.client.multiplayer.ServerData`"
  ([^ServerData this ^net.minecraft.client.multiplayer.ServerData server-data-in]
    (-> this (.copyFrom server-data-in))))

